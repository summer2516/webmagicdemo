package com.example.webmagicdemo;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

public class WebMagicXL implements PageProcessor {

    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);
    public static int pagenum ;

    // 这里通过page.addTargetRequests()方法来增加要抓取的URL
    // 这里抽取支持链式调用。调用结束后，toString()表示转化为单个String，all()则转化为一个String列表。
    @Override
    public void process(Page page) {

        //用于获取所有满足这个正则表达式的链接         \\d 表示识别数字  \\. 表示 .
        List<String> links = page.getHtml().links().regex("http://bolg\\.csdn\\.net/article/list/\\d+").all();
        //将这些链接加入到待抓取的队列中去
        page.addTargetRequests(links);
        //相同元素的结果加到相应的集合中去。
        List<String> titlelist = page.getHtml().xpath("//div[@class='article-list']//a/text()").all();
        List<String> readlist = page.getHtml().xpath("//span[@class='link_view']/text()").all();
        List<String> pinlunlist = page.getHtml().xpath("//span[@class='link_comments']/text()").all();
        List<String> detailurllist = page.getHtml().xpath("//span[@class='link_title']/a").links().all();

        if (titlelist.size()==0){
            //skip this page
            page.setSkip(true);
        }

        for (int i = 0; i < titlelist.size(); i++) {
            System.err.println((i+1)+"：" + titlelist.get(i)
                    +","+"阅读人数：" + readlist.get(i).replace("(", "").replace(")", "")
                    +","+"评论次数：" + pinlunlist.get(i).replace("(", "").replace(")", "")
                    +"，"+"详情地址：" + detailurllist.get(i).replace("(", "").replace(")", ""));

        }

        String pagelist = page.getHtml().xpath("//div[@class='pagelist']/span/text()").get();
        if (pagelist != null) {
            String pagenumstr = pagelist.substring(pagelist.indexOf("共") + 1, pagelist.indexOf("页"));
            pagenum = Integer.valueOf(pagenumstr);
            if (pagenum<=1){
                pagenum = 0;
            }
        }
    }


    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args)throws Exception {
        Spider.create(new WebMagicXL())
                .addUrl("http://blog.csdn.net/junoohoome/article/list")
                .run();
        System.out.print("当前是第1页");
        if (pagenum!=0){
            for (int i =2;i<pagenum+1;i++){
                System.out.print("当前是第"+i+"页");
                Thread.sleep(5000);
                Spider.create(new WebMagicXL())
                        .addUrl("http://blog.csdn.net/junoohoome/article/list/"+i)
                        .run();
            }
        }
    }

}

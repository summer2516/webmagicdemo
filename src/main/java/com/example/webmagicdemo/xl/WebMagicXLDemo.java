package com.example.webmagicdemo.xl;

import com.google.gson.Gson;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebMagicXLDemo implements PageProcessor {

    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    Map aMap = new HashMap();


    // 这里通过page.addTargetRequests()方法来增加要抓取的URL
    // 这里抽取支持链式调用。调用结束后，toString()表示转化为单个String，all()则转化为一个String列表。
    @Override
    public void process(Page page) {

        //用于获取所有满足这个正则表达式的链接         \\d 表示识别数字  \\. 表示 .
        List<String> links = page.getHtml().links().regex("https://www.6456ri.com/vod/html\\d{2,}").all();
        //将这些链接加入到待抓取的队列中去
        page.addTargetRequests(links);
        //相同元素的结果加到相应的集合中去。
        List<String> titlelist = page.getHtml().xpath("//li[@class='col-md-2 col-sm-3 col-xs-4']/div[@class='title']//a[@target='_blank']/text()").all();
        List<String> readlist = page.getHtml().xpath("//li[@class='col-md-2 col-sm-3 col-xs-4']/div[@class='title']//a[@target='_blank']/@href").all();

        if (titlelist.size()==0){
            page.setSkip(true);
        }
        if (readlist.size()==0){
            page.setSkip(true);
        }
        for(int i = 0;i < titlelist.size(); i++){
            titlelist.get(i);
            aMap.put(titlelist.get(i), readlist.get(i));
        }

        System.out.println("获取返回结果：===================================================");
        System.out.println(new Gson().toJson(aMap));
    }


    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args)throws Exception {
        Spider.create(new WebMagicXLDemo())
                .addUrl("https://www.6456ri.com/vod/html26/")
                .run();
        System.out.print("当前是第1页");
    }





































































    public static Map pareMap(){
        String mapString =  "{\"放轻鬆 先生\":\"/vod/html27/32829.html\",\"润滑液洗屌淫女 3\":\"/vod/html27/32570.html\",\"巨乳女教师的诱惑波多野结衣\":\"/vod/html23/14026.html\",\"真正超高潮8小时4上MXSPS428\":\"/vod/html20/14102.html\",\"一泊二日、美少女完全予约制。 第二章 北野望 ABP 293\":\"/vod/html41/30939.html\",\"极限马赛克必杀一撃顔射苍井空\":\"/vod/html25/2502.html\",\"RedHotJamVol98人肉便器育成所樱井莉亚AJ0360\":\"/vod/html35/30727.html\",\"明步大人吉泽明步\":\"/vod/html24/2400.html\",\"新 出租素人妹给你干 70 美咲摩耶 CHN 145\":\"/vod/html16/32423.html\",\"不伦溺爱録Venus021波多野结衣\":\"/vod/html23/14063.html\",\"浓厚热吻干翻正妹三上悠亚(蓝光版)\":\"/vod/html39/30892.html\",\"天海翼的浓厚接吻与性爱IPTD568\":\"/vod/html19/2307.html\",\"未公开性爱1681\":\"/vod/html35/30736.html\",\"痴女一手掌握肉棒打手枪4小时CJOB004\":\"/vod/html36/31468.html\",\"新出差全裸家政妇冬月枫 ABP278\":\"/vod/html38/31187.html\",\"北京巨乳模特跟男友疯狂做爱影片流出1\":\"/vod/html2/32947.html\",\"北京巨乳模特跟男友疯狂做爱影片流出2\":\"/vod/html2/32912.html\",\"义母奴隷波多野结衣\":\"/vod/html23/14031.html\",\"吉泽明步的诱惑快来吃我\":\"/vod/html24/14050.html\",\"凌辱女主角水手战士AKB029（中文）\":\"/vod/html20/14098.html\",\"激烈活塞运动小翼在高潮之前狂扭腰摆臀停不了天海翼IPZ058\":\"/vod/html19/2361.html\",\"歌德罗莉痴女玩偶2水菜丽ATFB210\":\"/vod/html20/14106.html\",\"DoctorAcky吉泽明步\":\"/vod/html24/14043.html\",\"对国民偶像大爆击颜射口交三上悠亚(蓝光版)\":\"/vod/html39/30863.html\",\"严选知名女优淫乱狂干BESTBIB049\":\"/vod/html42/31015.html\",\"新酔娘伝第一章DSUI27\":\"/vod/html37/31331.html\",\"avid5e05c8d8b8280 神待ちサナちゃん THE ANIMATION H动画\":\"/vod/html26/32892.html\",\"真想被用那诱人的马尾打手枪IP美女们用着马尾玩弄你两腿之间的玩意8小时IDBD375\":\"/vod/html37/31349.html\",\"car 1909023 3D エロアニメ Yamato\":\"/vod/html26/32743.html\",\"--吉泽明歩精选3\":\"/vod/html24/14046.html\",\"ギリギリモザイクバコバコ乱交15苍井そら\":\"/vod/html25/2510.html\",\"精子吸引真空口交 冬月枫 IPZ072\":\"/vod/html38/31217.html\",\"监禁拘束冬月枫 高潮24小时 PGD527\":\"/vod/html38/31214.html\",\"复刻天使之蕾吉泽明步MRJJ002\":\"/vod/html24/14025.html\",\"HustleAcky吉泽明步\":\"/vod/html24/14011.html\",\"高潮性感内衣女 9 北野望 ABP 417\":\"/vod/html41/30879.html\",\"公然妄想露出被干不能发出声音苍井空\":\"/vod/html25/2564.html\",\"快射之前猛烈抽插内射4小时精选MVBD140\":\"/vod/html20/14112.html\",\"car 1910153 3D 凌辱纠察官\":\"/vod/html26/32602.html\",\"成都爆乳女神萍儿大尺度私拍流出\":\"/vod/html2/32580.html\",\"梦的痴女3姊妹大桥未久MIDE031\":\"/vod/html42/31000.html\",\"RQ不穿内裤丝袜中出波多野结衣\":\"/vod/html23/13967.html\",\"热带夜波多野结衣\":\"/vod/html23/14010.html\",\"癡女教师的内射诱惑 精选 PBD313\":\"/vod/html38/31250.html\",\"高潮颤抖不停的肉棒被24根肉棒毫不留情插入大乱交特别篇三上悠亚\":\"/vod/html39/30866.html\",\"avid5c4eb6a387686 颜无月 4 H动画\":\"/vod/html26/32567.html\",\"挑战黑人大屌 2\":\"/vod/html27/32866.html\",\"没有止尽的轮姦\":\"/vod/html27/32607.html\",\"跟小翼一起进行虚拟约会今天成为你的女友天海翼IPTD613\":\"/vod/html19/2330.html\",\"野砲逆姦大吃肉棒淫女4小时BIB131\":\"/vod/html36/31458.html\",\"熟女的诱惑 47\":\"/vod/html27/32337.html\",\"可恶想揉翻的神乳玩翻J罩杯神大奶120分钟宇都宫紫苑RIONSNIS673（中文）\":\"/vod/html18/2512.html\",\"爆乳猛弹乳摇性交 JULIA MIDE 469\":\"/vod/html16/32798.html\",\"惊人的大量舌上发射全部一饮而尽大桥未久\":\"/vod/html42/31021.html\",\"avid5dd35b5de49f7 少女教育RE 第2话 白石那奈と过ごす日々 H动画\":\"/vod/html26/32817.html\",\"名叫滝泽萝拉的世界性美少女变成AV女优的内情引退作品\":\"/vod/html21/1937.html\",\"轰沈高潮脑髓为之疯狂苍井空\":\"/vod/html25/2558.html\",\"新美少女出租温泉旅行1GNE097\":\"/vod/html40/30806.html\",\"触手贯通下媚药3穴贡品性爱水菜丽MVSD228\":\"/vod/html20/14103.html\",\"曝光射淫湿\":\"/vod/html27/32754.html\",\"痴女美臀迷小川朝美松嶋玲奈BID016\":\"/vod/html36/31469.html\",\"OL痴汉电车天海翼IPTD694\":\"/vod/html19/2354.html\",\"女友巨乳姐干砲OK诱惑 北野望 ABP 400\":\"/vod/html41/30923.html\",\"宇都宫紫苑RIONS1下海1週年纪念作神乳J480分钟特别版下OFJE104\":\"/vod/html18/2550.html\",\"kirakiraBLACKGAL下流黑辣妹潜入汗臭男生宿舍痴汉强姦夜袭下将满是精力的性处理男生捕抓后用小穴搾取精液连续生姦中出波多野结衣\":\"/vod/html23/2403.html\",\"漂亮人妻小枫的痴态 在老公面前被别的男人干 冬月枫 PGD375\":\"/vod/html38/31211.html\",\"交织的体液浓密的性爱宇都宫紫苑SNIS070\":\"/vod/html18/2488.html\",\"超絶品ボディ小川あさ美MIDD437\":\"/vod/html36/31464.html\",\"avid5c4eb6a36b133 第一次池畔体验 H动画\":\"/vod/html26/32595.html\",\"浓厚热吻喷爱液干砲RION宇都宫紫苑SNIS594\":\"/vod/html18/2531.html\",\"小空大人的被虐调教苍井空\":\"/vod/html25/2508.html\",\"性感长髮小糢被色影师潜规则.后入干炮得逞\":\"/vod/html2/32651.html\",\"湿到透光癡女狂诱惑我7天 水野朝阳 JUFD 797\":\"/vod/html16/32688.html\",\"性慾旺盛接吻的癡女与我交换唾液三上悠亚\":\"/vod/html39/30878.html\",\"爆菊大解禁FUCK水菜丽DDT333\":\"/vod/html20/14100.html\",\"放学和学生妹偶像肏到爽三上悠亚(蓝光版)\":\"/vod/html39/30881.html\",\"南韩情侣自拍，小姑娘很主动想要索吻\":\"/vod/html2/32910.html\",\"打炮誓言 3\":\"/vod/html27/32977.html\",\"ギリギリモザイク苍井そら接吻スペシャル\":\"/vod/html25/2468.html\",\"浓厚干砲性感内衣女 2 GNE 164\":\"/vod/html41/30919.html\",\"avid5c4eb6a3885ad 颜无月 2 H动画\":\"/vod/html26/32780.html\",\"丑闻 偷拍被把回家干的冬月枫后卖给A片商IPZ767\":\"/vod/html38/31244.html\",\"妩媚的人妻在各式各样的地方狩猎老公以外的肉棒波多野结衣\":\"/vod/html23/14039.html\",\"极限薄码只属于我的苍井空\":\"/vod/html25/2543.html\",\"经典女优的骑乘位性爱特别版 2 PB042\":\"/vod/html38/31205.html\",\"真人版青龙老师让我生吧不仁不义女人之战春原未来水菜丽川村麻耶ZIZG010（中文）\":\"/vod/html20/14108.html\",\"超人気女优のイキまくりSEX4时间MIBD417\":\"/vod/html36/31461.html\",\"KIRARIDV02我与女友的甜蜜性生活水菜丽MKDV02（无码）\":\"/vod/html20/14097.html\",\"肉棒恶整北野望 ABP 369\":\"/vod/html41/30925.html\",\"RedHotJamVol98人肉便器育成所樱井莉亚HM026\":\"/vod/html35/30728.html\",\"紧缚解禁完全紧缚されて无理やり犯された国民的アイドル三上悠亜\":\"/vod/html39/30902.html\",\"avid5dd2649ed8e62 マスターピース THE ANIMATION 第1巻 H动画\":\"/vod/html26/32971.html\",\"柜台小姐偷拍 被公开的日常 因为淫乱的来电而忍不住湿透 冬月枫\":\"/vod/html38/31247.html\",\"猥亵痴汉4小时无法逃离的强制羞耻狂干ONSD530\":\"/vod/html37/31319.html\",\"一泊二日、美少女完全予约制。 第二章 北\":\"/vod/html41/30939.html\",\"干翻运动妹4砲！ 体育系?北野望 ABP 354\":\"/vod/html41/30876.html\",\"洗完澡后玩舒服中出2594\":\"/vod/html35/30738.html\",\"无法抗拒的淫荡美女前原友纪DV1496\":\"/vod/html40/30797.html\",\"搭上女性专用车辆后被搞上 用大胸部诱惑少年的美淑女Ver DANDY 417\":\"/vod/html16/32306.html\",\"出租系列THEBEST2CADV287\":\"/vod/html20/14095.html\",\"12位裤袜淫大姐们淫乱挑逗4小时Vol2BDSR222\":\"/vod/html20/14107.html\",\"比裸体还要淫荡湿透不穿奶罩的着衣巨乳天海翼IPZ006\":\"/vod/html19/2391.html\",\"巨乳女医与微乳护士的疗癒治疗医院PPS234\":\"/vod/html20/14114.html\",\"我的专用家政妇天海翼\":\"/vod/html19/2368.html\",\"J罩杯神奶砲夹到爆射爽翻天宇都宫紫苑RIONSNIS787\":\"/vod/html18/2536.html\",\"整根活吞真空口交不用手也让你大爆射MIZD016\":\"/vod/html42/31010.html\",\"快感漏尿潮吹女僕天海翼IPTD889\":\"/vod/html19/2358.html\",\"淫语エロい女の淫语あそび\":\"/vod/html25/2473.html\",\"白金最精选 VOL 21 主妇强姦 不能被丈夫看到的羞耻耻辱闷绝篇 CCXS 022\":\"/vod/html16/32909.html\",\"诱惑自慰RION宇都宫紫苑OAE100\":\"/vod/html18/2479.html\",\"吞肉棒的痴女4小时ONSD508\":\"/vod/html37/31313.html\",\"car 1908235 3D 被触手蹂躏的萝莉\":\"/vod/html26/32632.html\",\"巨乳女友帮我乳交.奶子又大又软忍不住射了\":\"/vod/html2/32800.html\",\"制服人形コスプレドール美女アスリート编松岛かえでDV679\":\"/vod/html37/31355.html\",\"极限马赛克近亲相姦疯狂羁绊苍井空\":\"/vod/html25/2505.html\",\"我的全套骑乘位淫技 若菜奈央 MIAE 118\":\"/vod/html16/32110.html\",\"猥亵模特儿松岛枫DV339\":\"/vod/html37/31323.html\",\"制服人形コスプレドール美女アスリート编\":\"/vod/html37/31355.html\",\"avid5c4eb6a6dd59c 横恋母 ～Immoral Mother～ 下巻\":\"/vod/html26/32676.html\",\"肏出淫乱本性理性全失极限干砲5连发三上悠亚\":\"/vod/html39/30906.html\",\"巨根抽插宇都宫紫苑SNIS205（中文）\":\"/vod/html18/2494.html\",\"被侵犯的温泉野外露出人妻小川阿佐美RKI225\":\"/vod/html36/31456.html\",\"性感男用按摩店巨乳痴女美体师2波多野结衣\":\"/vod/html23/14027.html\",\"淫蕩可爱松岛枫ECR0010\":\"/vod/html37/31337.html\",\"浓厚精子超快感顔面绝顶喷射650连发MIBD577\":\"/vod/html42/31011.html\",\"待在家里玩最好的朋友跳蛋先生\":\"/vod/html2/32761.html\",\"满足度100分的新人泡泡浴DX ABP187\":\"/vod/html38/31208.html\",\"昙花一现极道之女 8小时下 IDBD647\":\"/vod/html38/31232.html\",\"口交补习班43水菜丽KV130\":\"/vod/html20/14113.html\",\"我与小翼与心美的甜蜜同居生活天海翼成濑心美IPTD927\":\"/vod/html19/2305.html\",\"耻辱实习教师3天海翼SSPD099\":\"/vod/html19/2287.html\",\"貌似大桥未歩的微熟女4607\":\"/vod/html42/31004.html\",\"car 1909052 3D Marie Rose 做爱机械完全破坏\":\"/vod/html26/32669.html\",\"治癒系有点淫蕩的魔法少女水菜丽HAVD824（中文）\":\"/vod/html20/14099.html\",\"苍井空S112小时Special\":\"/vod/html25/2549.html\",\"连续射精般的过激性交天海翼IPZ472\":\"/vod/html19/2319.html\",\"紧张感与开放感感度倍增青姦4小时MIBD580\":\"/vod/html42/31002.html\",\"宇宙企画ＣＯＭＢＯ４时间裸エプロン编MDS309\":\"/vod/html37/31341.html\",\"狂肏猛干射不停 北野望 ABP 523\":\"/vod/html41/30888.html\",\"avid5c514b73afd95 俺が姪（かのじょ）を○す理由（わけ） 三日目 彼女が心を闭ざした日 H动画\":\"/vod/html26/32928.html\",\"ギリギリモザイク苍井そら妄想的特殊浴场本指名苍井そら\":\"/vod/html25/2529.html\",\"日本男儿上吧 金髮美女搭讪6人240分 2 GANGX 02\":\"/vod/html27/32792.html\",\"极限马赛克巨根抽插苍井空\":\"/vod/html25/2516.html\",\"矫正院株式会社RBD282\":\"/vod/html36/31452.html\",\"无法对外人说的禁忌女同志恋爱跟好朋友的妈妈谈恋爱北条麻妃水菜丽DVDES245\":\"/vod/html20/14094.html\",\"严选美痴女为了追求业绩不断狂卖的女业务极上的性爱BIB038\":\"/vod/html42/31016.html\",\"超级极限马赛克超级极限马赛克苍井空\":\"/vod/html25/2533.html\",\"加勒比甜心4樱井莉亚HM079\":\"/vod/html35/30732.html\",\"avid5dd4b33f327a6 Yoshiwara rose chapter1(花魁道中) H动画\":\"/vod/html26/32825.html\",\"与冬月枫浓厚的接吻与性爱 IPTD843\":\"/vod/html38/31226.html\",\"性感女友优质的肉体让我老二无法抗拒想干她\":\"/vod/html2/32690.html\",\"巨乳女医与微乳护士的疗癒治疗医院PPS234（中文）\":\"/vod/html20/14114.html\",\"如果三上悠亚是我女友的话(蓝光版)\":\"/vod/html39/30860.html\",\"早起肉棒有穴肏光天化日干8小时第3季IDBD586\":\"/vod/html21/1907.html\",\"极限马赛克只属于我的偶像苍井空\":\"/vod/html25/2486.html\",\"玩弄男人的乳头4小时特别版天海翼IPTD605\":\"/vod/html19/2375.html\",\"宇都宫紫苑S112小时完整精选版下蓝光版ONSD899\":\"/vod/html18/2521.html\",\"WORLDWIDEAcky吉沢明歩\":\"/vod/html24/14055.html\",\"工作的明步吉泽明步\":\"/vod/html24/14022.html\",\"北京巨乳模特跟男友做爱影片流出3\":\"/vod/html2/32949.html\",\"红热精选鲍鱼精选TokyoOmanCollectionRED169\":\"/vod/html35/30741.html\",\"PrivateAcky吉泽明步\":\"/vod/html24/14059.html\",\"被侵犯的美女人妻在丈夫面前被彻底凌辱小川阿佐美PGD606\":\"/vod/html36/31454.html\",\"极限马赛克与小空共同生活下每天搞着性爱苍井空\":\"/vod/html25/2535.html\",\"宇都宫紫苑RIONS1下海1週年纪念作神乳J480分钟特别版上OFJE104\":\"/vod/html18/2573.html\",\"肉棒肏女教师乳砲轮姦爆射J奶12发RION宇都宫紫苑SNIS752\":\"/vod/html18/2515.html\",\"姦淫美丽的女教师--吉泽明歩\":\"/vod/html24/14032.html\",\"新人 PRESTIGE专属出道 北野望 BGN 014\":\"/vod/html41/30937.html\",\"飙汗喷汁灼热猛干砲宇都宫紫苑RIONSNIS731\":\"/vod/html18/2500.html\",\"土豪眼镜哥与女友一起鸳鸯浴被口爆\":\"/vod/html2/32839.html\",\"欢迎来到世界最高级泡泡浴天海翼IPTD729\":\"/vod/html19/2325.html\",\"经典女优的美臀精选 3 PBD048\":\"/vod/html38/31202.html\",\"女教师虐待教室前原友纪DV1527\":\"/vod/html40/30791.html\",\"car 1908143 3D 肉棒猎人 Devil may Cry 5 Nico being Fucked\":\"/vod/html26/32750.html\",\"两天一夜美少女完全预约制24\":\"/vod/html21/1940.html\",\"宇都宫紫苑S112小时完整精选版上蓝光版ONSD899\":\"/vod/html18/2539.html\",\"盯上超可爱素人店花 ×蚊香社精选 06 YRH 144\":\"/vod/html16/32985.html\",\"出租AV女优8小时角色扮演编上\":\"/vod/html20/14110.html\",\"淫乱被虐女想要大屌男的爆射精液 和叶美玲 JUFD 119\":\"/vod/html16/32612.html\",\"着衣性爱全裸是野兽、不脱衣服的情色只有人才会这样着衣插入8小时IDBD490\":\"/vod/html36/31451.html\",\"爆射小姐 3\":\"/vod/html27/32298.html\",\"与波多野结衣的快乐中出同居生活\":\"/vod/html23/2394.html\",\"饲养男友管理射精的女友大桥未久MIDD936\":\"/vod/html42/30999.html\",\"新绝对正妹租给你干 22 冬月枫 CHN042\":\"/vod/html38/31190.html\",\"car 2002044 [H动漫] 苇月伊织 3 堕落\":\"/vod/html26/32933.html\",\"?爸爸好大?爱的小手和大肉棒的双重爆击\":\"/vod/html2/32986.html\",\"干到她狂喷潮大洪水三上悠亚\":\"/vod/html39/30869.html\",\"大奶妹诱惑帅哥维修员在浴室啪啪啪\":\"/vod/html2/32804.html\",\"天然成分由来水咲萝拉120%水咲萝拉的体液\":\"/vod/html21/1895.html\",\"SKYANGELBLUE12BM292\":\"/vod/html35/30729.html\",\"--吉泽明歩精选第5季\":\"/vod/html24/14021.html\",\"缓慢挑逗发情快感性感带开发按摩三上悠亚\":\"/vod/html39/30904.html\",\"尽情款待庵花样小町桥本凉ABP102\":\"/vod/html40/30788.html\",\"秘密女搜查官被下了媚药极限特别拷问三上悠亚\":\"/vod/html39/30898.html\",\"水咲萝拉来伺候您超最新有特别服务的美体\":\"/vod/html21/1969.html\",\"湿湿答答泡泡紧贴泡泡浴天堂4小时MIBD602\":\"/vod/html42/31013.html\",\"雪之妖精樱井梨亚中文字幕版BM036\":\"/vod/html35/30746.html\",\"高画质黄金比例身体特别编ONSD767\":\"/vod/html18/2467.html\",\"人妻中出4眼镜美人太太的过淫荡性爱结衣28岁波多野结衣\":\"/vod/html23/14034.html\",\"肉体便器育成所樱井利亚XV244\":\"/vod/html35/30743.html\",\"正点牛仔裤女郎Vol18EC045\":\"/vod/html35/30737.html\",\"我与小翼的甜蜜性生活天海翼IPTD559\":\"/vod/html19/2385.html\",\"爱被别人肏的人妻\":\"/vod/html27/32142.html\",\"新人NO1STYLE宇都宫紫苑下海拍片SOE992（中文）\":\"/vod/html18/2544.html\",\"超有弹力的胸部在做爱时摇个不停三上悠亚\":\"/vod/html39/30914.html\",\"干砲淫诱惑教课水菜丽DV990\":\"/vod/html20/14093.html\",\"avid5c4eb6a3666ed Love Selection ～THE ANIMATION～ Select.1 「Love Selection」 H动画\":\"/vod/html26/32558.html\",\"从第一次被公公侵犯的那天起…三上悠亚\":\"/vod/html39/30875.html\",\"吉泽明步随时帮你打气\":\"/vod/html24/14068.html\",\"一刀不减肏4小时吉泽明步\":\"/vod/html24/14061.html\",\"和苍井空对战野球拳\":\"/vod/html25/2554.html\",\"昙花一现极道之女 8小时上 IDBD647\":\"/vod/html38/31229.html\",\"来干女童军 3\":\"/vod/html27/32681.html\",\"在波多野结衣的超棒技巧下无法忍耐生中出性爱\":\"/vod/html23/2407.html\",\"在丈夫面前被侵犯的少妻们2ONSD562\":\"/vod/html37/31343.html\",\"未来的日记松岛枫DV750\":\"/vod/html37/31325.html\",\"经典蕾丝边 冬月枫 西野翔 PGD416\":\"/vod/html38/31199.html\",\"惊人的大量舌上发射全部一饮而尽大桥未久MIGD486\":\"/vod/html42/31021.html\",\"舔弄整根肉棒榨精口爆＋超讚扫除口爆三上悠亚蓝光版\":\"/vod/html39/30910.html\",\"曼妞的极限穿刺 4\":\"/vod/html27/32718.html\",\"睁大眼睛看你喷满洨超精选MIBD961\":\"/vod/html20/14104.html\",\"迫力映像V乳尻结合处逼迫眼前彻底聚焦宇都宫紫苑AVOP004（中文）\":\"/vod/html18/2555.html\",\"FIRSTIDEAPOCKET水咲萝拉\":\"/vod/html21/1893.html\",\"想要洗热腾腾的精液澡SP5ONS383\":\"/vod/html36/31467.html\",\"献身护士的深喉咙看护大桥未久MIDD583\":\"/vod/html42/31017.html\",\"最爱的妹妹被中年大叔睡走了 濑野彩叶 NTR 008\":\"/vod/html16/32501.html\",\"熟女大集合\":\"/vod/html27/32376.html\",\"被侵犯还是如此美丽小川阿佐美ADN047\":\"/vod/html36/31457.html\",\"从早到晚一直大玩中出性爱6波多野结衣\":\"/vod/html23/14058.html\",\"黄金比例肉体宇都宫紫苑SNIS009\":\"/vod/html18/2518.html\",\"私处近拍干三砲 02 北野望 ABP 480\":\"/vod/html41/30927.html\",\"舔弄整根肉棒榨精口爆＋超讚扫除口爆三上悠\":\"/vod/html39/30910.html\",\"肏到国民偶像汗液唾液淫水狂喷三上悠亚蓝光版\":\"/vod/html39/30908.html\",\"--吉泽明歩的美臀疯狂\":\"/vod/html24/2405.html\",\"喷精性爱精选MIB632\":\"/vod/html42/31005.html\",\"跨坐淫语大姊姊大桥未久MIDD993\":\"/vod/html42/30998.html\",\"絶顶直后の超敏感怒涛のイクイクおかわりピストンBEST\":\"/vod/html39/30900.html\",\"漂亮女人是父亲的情妇 爸爸离家后 HAVD 725\":\"/vod/html16/32760.html\",\"激情爱人\":\"/vod/html27/32415.html\",\"小枫老师的诱惑教学松岛枫IPTD515\":\"/vod/html37/31329.html\",\"新人NO1STYLE神之乳宇都宫紫苑改名RION重出江湖SNIS517\":\"/vod/html18/2522.html\",\"爱我爱过头的冬月枫 ABP399\":\"/vod/html38/31184.html\",\"寝台列车的不伦之旅波多野结衣\":\"/vod/html23/14015.html\",\"美乳弹出来RION宇都宫紫苑SNIS623（中文）\":\"/vod/html18/2538.html\",\"妈妈的干砲性教育波多野结衣\":\"/vod/html23/13944.html\",\"丑闻 偷拍被把回家干的冬月枫后卖给A片商\":\"/vod/html38/31244.html\",\"被世界级大屌狂插的S级女优4小时3ONSD494\":\"/vod/html36/31453.html\",\"极美影像以好莱乌标准展现超高画质性爱苍\":\"/vod/html25/2567.html\",\"我的朋友来给我送口罩，顺便来一发\":\"/vod/html2/32577.html\",\"护士时间美少女护士SPKWB046\":\"/vod/html42/31018.html\",\"满是女人味的母亲 成为肉欲饥渴年轻人的猎物 母亲在厕所被我的朋友们玩弄 现出失禁的痴态 最终成为了肉便器 UGUG 084\":\"/vod/html16/32724.html\",\"爱肛交流浪汉\":\"/vod/html27/32181.html\",\"性感美尻拜金女被公子哥带回豪宅狂插\":\"/vod/html2/32653.html\",\"想要把脸放在部下的美臀下小川朝美秘书与社长的扭曲关係MIXS005\":\"/vod/html36/31466.html\",\"我与小枫的甜蜜性生活松岛枫IPTD543\":\"/vod/html37/31327.html\",\"极限马赛克换20套衣服干炮苍井空\":\"/vod/html25/2480.html\",\"红热精选扫除口交共计20名RED162\":\"/vod/html35/30740.html\",\"经典 V.I.P 未公开性爱×4＆8P乱交经典完全版 PGD326\":\"/vod/html38/31196.html\",\"为了你最棒的自慰SP35ONS372\":\"/vod/html37/31317.html\",\"NewComer樱井莉亚XV660\":\"/vod/html35/30725.html\",\"吹出妳的热情_舔出妳的渴望\":\"/vod/html2/32875.html\",\"柜台小姐偷拍 被公开的日常 因为淫乱的来\":\"/vod/html38/31247.html\",\"在桌上狂操极品美乳女教师.她直喊要高潮了\":\"/vod/html2/32835.html\",\"深喉咙强制口爆到高潮 初川南 MIDE 464\":\"/vod/html16/32650.html\",\"和天海翼一起去乱七八糟的淫荡宿营旅行IPTD836\":\"/vod/html19/14007.html\",\"水咲萝拉满足度100分的新人泡泡浴\":\"/vod/html21/1890.html\",\"DIGITALCHANNELDC115\":\"/vod/html21/1887.html\",\"加勒比海甜心42484\":\"/vod/html35/30730.html\",\"美癒樱井莉亚XV672\":\"/vod/html35/30742.html\",\"性感黑丝赛车小模被男友狂插口爆吞精\":\"/vod/html2/32618.html\",\"和天海翼一起去乱七八糟的淫荡宿营旅行IP\":\"/vod/html19/14007.html\",\"纯天然北野望汁120％ ABP 432\":\"/vod/html41/30867.html\",\"目标是巨乳女子主播 小鬼性骚扰电视台体验 RCT 719\":\"/vod/html16/32946.html\",\"猥亵癡汉名选集羞耻的美少女严选集4小时ONSD655\":\"/vod/html37/31321.html\",\"接吻奴隷 爱吻社长调教少妻 桐嶋莉乃 HZGD 064\":\"/vod/html16/32267.html\",\"浓情接吻与吞精四次性爱大桥未久MIDD606\":\"/vod/html42/31012.html\",\"妖艳女忍传紫雨篇松岛枫DMSM7190\":\"/vod/html37/31335.html\",\"只有明步才办得到的终极高潮术吉泽明步\":\"/vod/html24/14040.html\",\"avid5dd35b5de7086 【アニメ】ビッチ学园が清纯なはずがないっ！！？ The Animation 上巻 H动画\":\"/vod/html26/32899.html\",\"爱干砲美女 4\":\"/vod/html27/32220.html\",\"MOTTOENJOYHISCHOOL04水咲萝拉\":\"/vod/html21/1949.html\",\"想和北野望做的10种事 梦幻尻枪补助4小时SP ABP 411\":\"/vod/html41/30933.html\",\"社团日誌桌球社篇2819\":\"/vod/html35/30739.html\",\"蚊香社传说级绝对美少女回忆珍藏精选01PPT038\":\"/vod/html40/30794.html\",\"搭讪夫妻吵架离家人妻下药睡走肏到翻 SCPX 226\":\"/vod/html16/32345.html\",\"avid5dc116ef4fec3 レザーマン VOL.2 H动画\":\"/vod/html26/32862.html\",\"从接吻开始的母子爱情紧贴浓厚性爱波多野\":\"/vod/html23/14054.html\",\"整人肏好肏满4砲国民偶像被秒插三上悠亚(蓝光版)\":\"/vod/html39/30884.html\",\"超严选48人完全露出干砲4小时ONSD499\":\"/vod/html36/31463.html\",\"水咲萝拉meets得寸进尺的素人与影迷PRESTIGE影迷大感谢祭巴士之旅\":\"/vod/html21/1975.html\",\"诱惑我的白色妖精滝泽萝拉\":\"/vod/html21/1923.html\",\"痴女教师不握粉笔反握肉棒的世界CJOB019\":\"/vod/html36/31470.html\",\"车掌小姐的粉丝感谢干砲祭！ 北野望 ABP 513\":\"/vod/html41/30864.html\",\"被侵犯的超美女教师水咲萝拉\":\"/vod/html21/1910.html\",\"请给我翅膀天海翼IDBD243\":\"/vod/html19/2312.html\",\"泷泽萝拉PRESTIGEPREMIUMBEST8小时\":\"/vod/html21/1984.html\",\"超黄金比例肉体角色扮演妹7变化宇都宫紫苑RIONSNIS656\":\"/vod/html18/2506.html\",\"松岛枫的浓厚接吻与性爱IPTD535\":\"/vod/html37/31311.html\",\"梦幻名媛美女乱交 巨乳天国 DSD 284\":\"/vod/html27/32645.html\",\"躺着也让你高潮骑乘位泡泡浴2MIBD970\":\"/vod/html42/31007.html\",\"顔射满脸宇都宫紫苑SNIS110（中文）\":\"/vod/html18/2579.html\",\"从接吻开始的母子爱情紧贴浓厚性爱波多野结衣\":\"/vod/html23/14054.html\",\"强制精液100发顔射FUCK4小时ONSD495\":\"/vod/html36/31459.html\",\"avid5c4eb6a386421 颜无月 3 H动画\":\"/vod/html26/32638.html\",\"有她们俩在就无敌高桥圣子三上悠亚\":\"/vod/html39/30887.html\",\"绝对美少女出租ACT23\":\"/vod/html21/1950.html\",\"站立背后位50人4小时ONSD509\":\"/vod/html37/31347.html\",\"带大奶女友回家立马推倒她架起来干翻她\":\"/vod/html2/32762.html\",\"自慰偏执狂水菜丽DDK051\":\"/vod/html20/14115.html\",\"顔面骑乘舔嫩鲍50人4小时ONSD523\":\"/vod/html37/31333.html\",\"女经理、是我们的洩慾宠物。007 北野望 ABP 305\":\"/vod/html41/30921.html\",\"水咲萝拉的浓厚接吻与性爱\":\"/vod/html21/1918.html\",\"淫蕩之星 北野望 ABP 503\":\"/vod/html41/30941.html\",\"见面看对眼情热的SEX天海翼IPTD762\":\"/vod/html19/2345.html\",\"水咲萝拉meets得寸进尺的素人与影迷PREST\":\"/vod/html21/1975.html\",\"敏感易湿街头乐手下海给干 南优希 MIFD 015\":\"/vod/html16/32384.html\",\"颜射房间水菜丽MIGD437\":\"/vod/html20/14105.html\",\"我是波多野结衣\":\"/vod/html23/2399.html\",\"真正抽插高潮干4砲三上悠亚(蓝光版)\":\"/vod/html39/30894.html\",\"堕落剧场美女无法令人相信的理由--吉泽明歩\":\"/vod/html24/14030.html\",\"全身拘束硬肏内射77发8小时MIBD900\":\"/vod/html20/14096.html\",\"父女近亲干砲 酗酒爸与恋父女 小川桃果 NACR 111\":\"/vod/html16/32837.html\",\"知性美女32人超变态性爱ONSD647\":\"/vod/html37/31353.html\",\"究级薄码小空来好好疗癒你苍井空\":\"/vod/html25/2497.html\",\"终于让人内射啦！ 02 GNE 172\":\"/vod/html41/30943.html\",\"痴女猛扭腰骑乘位搾干4小时BIB132\":\"/vod/html36/31472.html\",\"金手指225美女KT124\":\"/vod/html35/30745.html\",\"和女友的大姊的禁忌关係天海翼\":\"/vod/html19/2301.html\",\"快乐羞耻M男屁眼快乐美体沙龙DMOW040（中文）\":\"/vod/html20/14101.html\",\"即使是绝对不能出手的对象然而看到巨乳后出手了波多野结衣\":\"/vod/html23/14042.html\",\"浓厚贴身接触与性爱冬月枫 PGD438\":\"/vod/html38/31235.html\",\"潮吹给我 4\":\"/vod/html27/32454.html\",\"--吉泽明歩的表与裏\":\"/vod/html24/14066.html\",\"现役专属女优超浓情干砲特集精选 01 PPT 036\":\"/vod/html41/30931.html\",\"比裸体还要淫荡湿透不穿奶罩的着衣巨乳天\":\"/vod/html19/2391.html\",\"水咲萝拉来伺候您超最新有特别服务的美体沙龙\":\"/vod/html21/1969.html\",\"情趣小护士的淫蕩大奶！让人想狂揉的超美巨乳\":\"/vod/html2/32614.html\",\"来场春药性爱吧水菜丽DDB185\":\"/vod/html20/14092.html\",\"真空f杯巨乳全力展现自己的女友的巨乳妹妹我这个输给诱惑的人渣三上悠亚\":\"/vod/html39/30896.html\",\"小翼爱大屌天海翼IPTD664\":\"/vod/html19/2326.html\",\"屈辱的全裸居酒屋店长吉泽明步\":\"/vod/html24/14028.html\",\"加勒比海甜心4MX059\":\"/vod/html35/30731.html\",\"投稿秘话 一晩8次的猛男丈夫丈夫在医院 媳妇被公公用48招玩弄充满魅力的牛乳店人妻 FAX 290\":\"/vod/html16/32228.html\",\"用我的肉体来解除压力吧 泽村麻耶 MOMJ 114\":\"/vod/html16/32873.html\",\"和明歩相聚一刻完全版吉泽明步\":\"/vod/html24/14037.html\",\"1910021 3D 女骑士骑触手\":\"/vod/html26/32528.html\",\"超喜欢因为很爽而说方言的性爱天海翼IPTD706\":\"/vod/html19/2296.html\",\"极限马赛克无限絶顶激猎高潮性爱苍井空\":\"/vod/html25/2491.html\",\"3DEVOLUTION进化的立体映像展现新次元性爱--吉泽明歩\":\"/vod/html24/2392.html\",\"ギリギリモザイク新米ナースそらのパコパコ看护苍井そら\":\"/vod/html25/2547.html\",\"大眼甜心樱井莉亚3541\":\"/vod/html35/30733.html\",\"car 2002066 [3D]角色合辑03\":\"/vod/html26/32854.html\",\"人妻转落物语波多野结衣\":\"/vod/html23/14023.html\",\"性感导师小姐姐帮学生解决生理上的问题\":\"/vod/html2/32687.html\",\"超级女英雄BESTATKD157\":\"/vod/html36/31462.html\",\"SModel89中出3小时絶顶选辑水菜丽SMD89（无码）\":\"/vod/html20/14111.html\",\"与冬月枫像是情侣一样的淫蕩模拟约会 PGD490\":\"/vod/html38/31223.html\",\"护士爱骑大老二 4\":\"/vod/html27/32905.html\",\"REDHOTJAM1734391\":\"/vod/html35/30726.html\",\"拥有可爱脸但却最喜欢大屌的超淫蕩保母大桥未久MIDD571\":\"/vod/html42/31009.html\",\"avid5dbc02c91df37 BibleBlack 完全版 H动画\":\"/vod/html26/32713.html\",\"在丈夫面前被侵犯的少妻们特别版5ONS399\":\"/vod/html37/31345.html\",\"问答无用姦水菜丽n0928reimizunaos（无码中文）\":\"/vod/html20/14109.html\",\"絶品嘴巴口交爽到体液满溢30连发4小时 H_479GNE 227\":\"/vod/html41/30885.html\",\"avid5dc2701a5134f 闭锁病栋 前编 H动画\":\"/vod/html26/32965.html\",\"插到恍神爽翻天超嗨干砲 北野望 ABP 268\":\"/vod/html41/30861.html\",\"把妹回去干砲偷拍再擅自卖给片商的鬼畜父亲 AOZ 213Z\":\"/vod/html16/32189.html\",\"3D天海翼IPTD785\":\"/vod/html19/2336.html\",\"满满的幼齿鲍 3\":\"/vod/html27/32493.html\",\"学生妹遇上截公车监禁樱井莉亚XV690\":\"/vod/html35/30735.html\",\"新绝对正妹租给你干10桥本凉CHN020\":\"/vod/html40/30803.html\",\"爱干炮学生妹\":\"/vod/html27/32259.html\",\"全裸巨乳家政妇波多野结衣\":\"/vod/html23/14052.html\",\"一边盯着你看的高级猥亵用语波多野结衣\":\"/vod/html23/14045.html\",\"在丈夫面前被侵犯的少妻悲剧的催眠治疗--吉泽明歩\":\"/vod/html24/14017.html\",\"保健老师中出20连发波多野结衣\":\"/vod/html23/14048.html\",\"絶世美女们漏尿梦幻桃源仙境IP风俗街VIP套餐8小时IDBD247\":\"/vod/html36/31460.html\",\"粉红窗帘苍井空\":\"/vod/html25/2577.html\",\"斩不断理还乱的欠干女人天海翼IPTD822\":\"/vod/html19/2397.html\",\"松岛枫BESTLOVESELECTION2ndseason松岛枫DV747\":\"/vod/html37/31309.html\",\"仅限此片无套中出 北野望 ABP 385\":\"/vod/html41/30882.html\",\"莉亚淫乱的嘴吧来帮你吹樱井莉亚XV682\":\"/vod/html35/30744.html\",\"被迫当人体内衣模特儿9三上悠亚N\":\"/vod/html39/30912.html\",\"淫蕩接吻与交尾前原友纪DV1487\":\"/vod/html40/30809.html\",\"魅惑的性感美体师\":\"/vod/html42/31008.html\",\"用高画质欣赏美臀4小时ONSD550\":\"/vod/html37/31339.html\",\"性感OL害羞下海援交全都录\":\"/vod/html2/32725.html\",\"GLORYBODY淫荡的女人让你狂干到爽波多野结衣\":\"/vod/html23/14065.html\",\"GLORYBODY淫荡的女人让你狂干到爽波多野\":\"/vod/html23/14065.html\",\"诱惑的性感内衣身穿内衣的华丽美女们8小时\":\"/vod/html42/31003.html\",\"欢迎来到高级偶像风俗店150分全套服务三上悠亚(蓝光版)\":\"/vod/html39/30890.html\",\"FirstTouch前原友纪DV1476\":\"/vod/html40/30779.html\",\"蚊香社夏祭 2015 溼答答岛屿狂欢 北野望 ABP 339\":\"/vod/html41/30929.html\",\"风俗塔 性感全套3小时SPECIAL 内附特典DVD 北野望 ABP 321\":\"/vod/html41/30873.html\",\"MAXGIRLS9XV671\":\"/vod/html35/30724.html\",\"完美肉体交融的体液浓情性爱特别版ONS427\":\"/vod/html37/31315.html\",\"顶尖偶像超诱惑按摩三上悠亚\":\"/vod/html39/30917.html\",\"新?绝对正妹租给你干 32 北野望 CHN 059\":\"/vod/html41/30935.html\",\"爸妈干翻我朋友 20\":\"/vod/html27/32107.html\",\"真性偶像全员中出4小时NDV0965\":\"/vod/html37/31351.html\",\"天海翼影迷颜射感谢祭IPTD679\":\"/vod/html19/2341.html\",\"被迫当人体内衣模特儿宇都宫紫苑SNIS692（中文）\":\"/vod/html18/2528.html\",\"粉丝感谢干砲祭RION宇都宫紫苑SNIS712\":\"/vod/html18/2565.html\",\"土豪爆操女神级别的171cm大长腿女模特\":\"/vod/html2/32872.html\",\"増刊dvd苍井そら\":\"/vod/html25/2526.html\",\"极上老闆娘淫技款待温泉旅馆 4 明里友香 MADM 058\":\"/vod/html16/32539.html\",\"马上干咦现在要在这里水咲萝拉\":\"/vod/html21/1961.html\",\"无法忘怀的母亲滋味 江原明美 JUC 366\":\"/vod/html16/32462.html\",\"真想被用那诱人的马尾打手枪IP美女们用着\":\"/vod/html37/31349.html\",\"MascotGirl樱井莉亚XV667\":\"/vod/html35/30747.html\",\"白色妖精再度降临水咲萝拉\":\"/vod/html21/1903.html\",\"NEWTOKYO风格03桥本凉\":\"/vod/html40/30782.html\",\"枫老师的诱惑授课 冬月枫 IPTD963\":\"/vod/html38/31193.html\",\"如果我的女友是爱咲MIU的话3567\":\"/vod/html35/30734.html\",\"瞬杀一击必杀火箭筒顔射天海翼IPTD650\":\"/vod/html19/2382.html\",\"极限马赛克润滑油地狱苍井空\":\"/vod/html25/2572.html\",\"把名媛妻回家偷干砲×蚊香社精选 07 AFS 026\":\"/vod/html16/32150.html\",\"性感频道宇都宫紫苑SNIS147（中文）\":\"/vod/html18/2471.html\",\"全裸正妹RION宇都宫紫苑OAE095\":\"/vod/html18/2561.html\",\"清纯小保姆 24\":\"/vod/html27/32532.html\",\"女王No1明歩的淫色恋FUCK吉泽明步\":\"/vod/html24/14014.html\",\"独佔众多大姐肏到爽8小时精选版 PBD295\":\"/vod/html38/31241.html\",\"极美影像以好莱乌标准展现超高画质性爱苍井空\":\"/vod/html25/2567.html\",\"欢迎来到男性潮吹美体沙龙前原友纪\":\"/vod/html40/30785.html\",\"交织的体液浓密的性爱不在乎众人眼光的热烈结合篇--吉泽明歩\":\"/vod/html24/2384.html\",\"紧身裙女教师大桥未久MIDE020\":\"/vod/html42/31001.html\",\"宇都宫紫苑RIONS1下海1週年纪念作神乳J48\":\"/vod/html18/2573.html\",\"想不想被阿佐美尽情调教呢？小川阿佐美PGD660\":\"/vod/html36/31465.html\",\"从顺洩慾女经理 1 GNE 142\":\"/vod/html41/30870.html\",\"淫荡的接吻与性爱小川阿佐美PGD627\":\"/vod/html36/31450.html\",\"我的潜在淫欲波多野结衣\":\"/vod/html23/14018.html\",\"露出痴女大桥未久MIDD807\":\"/vod/html42/31019.html\",\"露出调教轮姦MIDD463\":\"/vod/html42/31020.html\",\"彼女が旅行で不在の间48时间の记録三上悠亜\":\"/vod/html39/30872.html\",\"母子旅程 结城玲衣 SPRD 414\":\"/vod/html16/32576.html\",\"抠穴大潮喷 2\":\"/vod/html27/32940.html\",\"精选女优的嫩鲍抠弄绝顶高潮表情 BEST PBD119\":\"/vod/html38/31220.html\",\"顔面精液喷射MIBD513\":\"/vod/html42/31014.html\",\"淫乱美臀特别版小川朝美MIDD516\":\"/vod/html36/31449.html\",\"car 1909062 50种异兽性交播种\":\"/vod/html26/32706.html\",\"欧吉桑和美女的浓情香汗淋漓性交大桥未久MIDD944\":\"/vod/html42/31006.html\",\"浓厚干砲性感内衣女 1 GNE161\":\"/vod/html38/31238.html\",\"微醺性爱 冬月枫 IPZ036\":\"/vod/html38/31181.html\",\"世界级的美少女是我的宠物水咲萝拉\":\"/vod/html21/1931.html\",\"淫汁满溢自慰中毒2波多野结衣\":\"/vod/html23/14036.html\",\"风骚女主播和炮友直播车震\":\"/vod/html2/32990.html\",\"秘密女搜査官水咲萝拉\":\"/vod/html21/1904.html\",\"痴女教师的内射诱惑精选PBD313\":\"/vod/html36/31471.html\",\"完全镜头视线被干的痴态--吉泽明歩\":\"/vod/html24/14019.html\",\"后入性感黑丝女友干得她快受不了\":\"/vod/html2/32728.html\",\"最棒的性爱桥本凉\":\"/vod/html40/30812.html\",\"水咲萝拉在我骯脏的公寓直接搞起来了\":\"/vod/html21/1958.html\",\"相遇4秒马上干前原友纪DV1506\":\"/vod/html40/30800.html\",\"美丽大小姐的卑猥饲育 北野望 ABP 254\":\"/vod/html41/30916.html\",\"被侵犯的骑乘位4小时1ONSD493\":\"/vod/html36/31455.html\",\"MOODYZ创立10周年记念MOODYZIDEAPOCKET女教师强暴轮姦天海翼MIRD090\":\"/vod/html19/2292.html\"}\n";
        Map map = new Gson().fromJson(mapString, Map.class);
        return map;
    }

}

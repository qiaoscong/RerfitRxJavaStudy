package text.qiao.com.rerfitrxjavastudy.model.entity;

import java.util.List;

/**
 * @project：RerfitRxJavaStudy
 * @fileName XinWen
 * @author：乔少聪
 * @date：2018/12/12 10:18
 * @describe：新闻实体类
 */

public class XinWen {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"0050d630cd99c66af4ed9c231e8465e9","title":"谨防虚假促销陷阱　南昌市发布\u201c双十二\u201d消费提醒","date":"2018-12-12 09:56","category":"头条","author_name":"南昌头条","url":"http://mini.eastday.com/mobile/181212095645331.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181212/20181212_4795f77d90de7c170c52c9c23e7fd194_mwpm_03200403.jpg"},{"uniquekey":"93c9ab61141ea226bf80552b06df889b","title":"家中失火一对父子不幸身亡 冬季防火很重要","date":"2018-12-12 09:49","category":"头条","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/181212094900180.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181212/20181212094900_a14b0ba24eb76ade246eec3761df0ab8_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181212/20181212094900_a14b0ba24eb76ade246eec3761df0ab8_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181212/20181212094900_a14b0ba24eb76ade246eec3761df0ab8_1_mwpm_03200403.jpg"},{"uniquekey":"761b061f18b4cef0116616b669c385cc","title":"娱闻丨张卫健光头原因曝光，只因前辈一句话：你没毛就没价值","date":"2018-12-12 09:48","category":"头条","author_name":"东方号娱乐","url":"http://mini.eastday.com/mobile/181212094825345.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212_263d1a2a9e5214deca1420edd1dc6160_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181212/20181212_ef255264690bbd5475b3f53d3dcabda4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181212/20181212_53e183e7b7e6638ee649542491e4a991_mwpm_03200403.jpg"},{"uniquekey":"673c03a3be230e68248281585cf57d14","title":"乌俄友好条约凉了 大规模战争一触即发？","date":"2018-12-12 09:47","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/181212094711763.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181212/20181212094711_b5817138b4ee9764418b4462a61810fe_1_mwpm_03200403.jpg"},{"uniquekey":"4e86e63c1121b8efd284222314305cdc","title":"9种《四川凉拌菜》味型调配标准，求比例是菜鸟，理解调料才真实","date":"2018-12-12 09:41","category":"头条","author_name":"川菜世家易师傅","url":"http://mini.eastday.com/mobile/181212094125506.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212094125_261ca7ef35f00b77311a3124cb1f64f4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212094125_261ca7ef35f00b77311a3124cb1f64f4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212094125_261ca7ef35f00b77311a3124cb1f64f4_3_mwpm_03200403.jpg"},{"uniquekey":"5bb2905250f039a876cc6f3961e65afc","title":"孟晚舟获保释华为第一时间回应 专家:5G将加速推进","date":"2018-12-12 09:40","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/181212094009480.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181212/20181212094009_5542e1e86eec03a7624abe12f03071e8_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181212/20181212094009_5542e1e86eec03a7624abe12f03071e8_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181212/20181212094009_5542e1e86eec03a7624abe12f03071e8_3_mwpm_03200403.jpg"},{"uniquekey":"6eae7f17dca4cf27cb761a407ce5c560","title":"长期持有一只股票，不论涨跌每天都做T，这样下去会怎么样呢？","date":"2018-12-12 09:38","category":"头条","author_name":"杨幂私生活","url":"http://mini.eastday.com/mobile/181212093803613.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181212/20181212093803_d86aa2ddad62c6765fb959b5638b9204_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181212/20181212093803_d86aa2ddad62c6765fb959b5638b9204_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181212/20181212093803_d86aa2ddad62c6765fb959b5638b9204_3_mwpm_03200403.jpg"},{"uniquekey":"2af00e4e6f9928caaad12db46d5e25a0","title":"马化腾：王者荣耀新皮肤已经上线！网友：不好意思，我没钱！","date":"2018-12-12 09:36","category":"头条","author_name":"阿盛爆料君","url":"http://mini.eastday.com/mobile/181212093616057.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181212/20181212093616_8b51fa69e9ee19b0577999441e45b523_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181212/20181212093616_8b51fa69e9ee19b0577999441e45b523_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20181212/20181212093616_8b51fa69e9ee19b0577999441e45b523_1_mwpm_03200403.jpg"},{"uniquekey":"20824c54a76d4c9c8e48c9157ea73324","title":"彭昱畅嘴巴张到变形还是输给了王大陆，魏大勋大概只能被吃掉了","date":"2018-12-12 09:36","category":"头条","author_name":"电影天堂","url":"http://mini.eastday.com/mobile/181212093610164.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212_913c16e7579ac316eb30cdc0af449a06_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181212/20181212_21f7b5b8e8fae04449721424af2fbb8d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181212/20181212_3e4c972ae9802d257f18292f4706da4a_cover_mwpm_03200403.jpg"},{"uniquekey":"1110c5015e008d86ce894cc5000cf978","title":"开心一刻笑话：考路考那天，上午有个驾校带来的15个人全军覆没","date":"2018-12-12 09:35","category":"头条","author_name":"寂寞内涵","url":"http://mini.eastday.com/mobile/181212093559490.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212_a4b40995ef8ecbc868139c614ce00046_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181212/20181212_6f9b2a62c4ac63dd27b7180fa7c98dac_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181212/20181212_6956eb7401c963777e85a66f3b87317f_cover_mwpm_03200403.jpg"},{"uniquekey":"ce09d779bf3e7f5164415310d921c7d9","title":"泫雅最爱的奶奶风，你pick了么？","date":"2018-12-12 09:31","category":"头条","author_name":"小资CHIC杂志","url":"http://mini.eastday.com/mobile/181212093115425.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212093115_2321ea70d6952937c632a66bedcbe41d_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181212/20181212093115_2321ea70d6952937c632a66bedcbe41d_26_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181212/20181212093115_2321ea70d6952937c632a66bedcbe41d_25_mwpm_03200403.jpg"},{"uniquekey":"989f0b96c59b907c509a84e3aa884622","title":"苏格兰赛梁文博首轮出局 肖国栋内战惨遭0-4横扫","date":"2018-12-12 09:30","category":"头条","author_name":"网易体育","url":"http://mini.eastday.com/mobile/181212093012191.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181212/20181212093012_599b215b84fef8dcb8172a007347bc24_1_mwpm_03200403.jpg"},{"uniquekey":"440fbbb8b26b963643b0cf755ecd0f44","title":"巴基斯坦前驻华大使：美国挑起对华冷战几乎必输","date":"2018-12-12 09:29","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/181212092919794.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212092919_67e017d8b4b5501e7095614e6767e3f7_1_mwpm_03200403.jpg"},{"uniquekey":"fb6580b07a2cf3957ba0f9fe2bbf7b47","title":"【公告】关于调整部分印花税核定征收比例有关事项的公告","date":"2018-12-12 09:29","category":"头条","author_name":"厦门税务","url":"http://mini.eastday.com/mobile/181212092903584.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212092903_5de09566a5edb14944ff44a2aefcc8c8_1_mwpm_03200403.jpg"},{"uniquekey":"b91a93edef9b959691615c0dc1008208","title":"减重期间主食怎么吃？米饭和馒头哪一个更利于\u201c减重\u201d？","date":"2018-12-12 09:26","category":"头条","author_name":"简小月","url":"http://mini.eastday.com/mobile/181212092623121.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181212/20181212_ec73f87a55ab0eadc8bb2c401b87acd4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181212/20181212_7cdfe1b2c8d24d89ade772584581f50a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20181212/20181212_c277a5e0e67981b144d7b10a192e2e63_cover_mwpm_03200403.jpg"},{"uniquekey":"bbe0746d8eecd76de3e4dad3cf26b217","title":"米兰3500万先生刚来就闪耀！四大指标全队顶尖 开口就惊呆加图索","date":"2018-12-12 09:25","category":"头条","author_name":"国际足球冷雪","url":"http://mini.eastday.com/mobile/181212092510018.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212092510_ead70f6a6557111bfa47c62833c8c17a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212092510_ead70f6a6557111bfa47c62833c8c17a_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212092510_ead70f6a6557111bfa47c62833c8c17a_3_mwpm_03200403.jpg"},{"uniquekey":"d9933b7b3c78b94711a5872ae704aed2","title":"频繁踩踏\u201c一中\u201d红线 特朗普对台军售或创纪录 蚕食大陆警惕感？","date":"2018-12-12 09:24","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/181212092456377.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212092456_01ad3818fdf3a037ab8cb5029127e31f_1_mwpm_03200403.jpg"},{"uniquekey":"4e2c450ef9d96b785087a65d838ca1d0","title":"想拥有好的身材比例？试试这4组瑜伽体式，打造好身材","date":"2018-12-12 09:20","category":"头条","author_name":" 运动发骚客","url":"http://mini.eastday.com/mobile/181212092018333.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212_c15b6039bb9f6a47bfd98a248a724469_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212_adb6924f262cfb19611b1b6d1151c1f1_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212_22f6e0391f607ac4bc0e40b8dc66a25d_cover_mwpm_03200403.jpg"},{"uniquekey":"4974fc4f20eb33d9131f10f2691e6507","title":"陪哭服务！在日本 付钱就能请帅哥陪你哭帮你擦眼泪","date":"2018-12-12 09:19","category":"头条","author_name":"金融界","url":"http://mini.eastday.com/mobile/181212091950357.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212091950_aaaf624b45f6211b77f9ffa81c6d41b1_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212091950_aaaf624b45f6211b77f9ffa81c6d41b1_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212091950_aaaf624b45f6211b77f9ffa81c6d41b1_2_mwpm_03200403.jpg"},{"uniquekey":"a20047bf39353f9807ec313abee74d16","title":"名表丨穿西装配手表，都是有讲究的","date":"2018-12-12 09:18","category":"头条","author_name":"腕表小灰灰","url":"http://mini.eastday.com/mobile/181212091858628.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212_2ded80365314b19c64dc9bf719a00fa3_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212_8e9331e4141d1853cc20b1e15e36c55d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212_e2b7e523ff3269278a91f4285d461f99_cover_mwpm_03200403.jpg"},{"uniquekey":"d32d903451bad7e09562367f27570ef6","title":"现货黄金投资怎样把握做空时机?","date":"2018-12-12 09:18","category":"头条","author_name":"十月增伤悲","url":"http://mini.eastday.com/mobile/181212091847288.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212_55f0d8f9c27681895ff331a21a96a537_cover_mwpm_03200403.jpg"},{"uniquekey":"4ddee90a1230225c814185908936b05e","title":"俄罗斯克里姆林宫举办年度军官舞会 帅哥美女如云","date":"2018-12-12 09:18","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/181212091841297.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212091841_a910ecee03d10830c3c7fbf46fe92516_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181212/20181212091841_2c515a7e486db6b154aa4582570f387d_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181212/20181212091841_fd8875e8532fe3bef0cadf588f2eb53d_4_mwpm_03200403.jpg"},{"uniquekey":"82aedcab69a4af3937872e1b000278e5","title":"最新规定！洛阳城市区快速路禁止行人及这些车辆通行！","date":"2018-12-12 09:16","category":"头条","author_name":"洛阳网","url":"http://mini.eastday.com/mobile/181212091607320.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181212/20181212091607_4ff970be54077d3f62b51773fcc475a5_1_mwpm_03200403.jpg"},{"uniquekey":"1d77f7817929d8c06cc27fc9e1ed3ea4","title":"《王者荣耀》王者峡谷六神装后的暴击王，猴子排第三，第一名你绝对想不到！","date":"2018-12-12 09:15","category":"头条","author_name":"14游","url":"http://mini.eastday.com/mobile/181212091533428.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181212/20181212091533_fbe8aeb9c951f88f0254d83f32af2ec4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181212/20181212091533_fbe8aeb9c951f88f0254d83f32af2ec4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181212/20181212091533_fbe8aeb9c951f88f0254d83f32af2ec4_3_mwpm_03200403.jpg"},{"uniquekey":"928428b00144925fd763b11306b97d65","title":"马拉松进入课堂 大学生健康状况引重视","date":"2018-12-12 09:15","category":"头条","author_name":"跑步骚年","url":"http://mini.eastday.com/mobile/181212091510819.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181212/20181212091510_34882fbd880ce0eada952d2b0fbfde4b_1_mwpm_03200403.jpg"},{"uniquekey":"ac184b208a5a98a11b0c525c3f6d34ad","title":"《王者荣耀》清兵能力最强的5个法师，安琪拉倒数，第1只要一个技能","date":"2018-12-12 09:15","category":"头条","author_name":"14游","url":"http://mini.eastday.com/mobile/181212091504918.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181212/20181212091504_c1a52cdb96a263a7eaaaa64ed049fe3a_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181212/20181212091504_c1a52cdb96a263a7eaaaa64ed049fe3a_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181212/20181212091504_c1a52cdb96a263a7eaaaa64ed049fe3a_4_mwpm_03200403.jpg"},{"uniquekey":"54846284cdac5efbb2891bccf69ac61e","title":"宋代商人图鉴：朝朝暮暮士子梦，为求功名买房忙","date":"2018-12-12 09:14","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/181212091418294.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212091418_0fe6dcfb18de247c5c9e6b92902f3794_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181212/20181212091418_0fe6dcfb18de247c5c9e6b92902f3794_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181212/20181212091418_0fe6dcfb18de247c5c9e6b92902f3794_3_mwpm_03200403.jpg"},{"uniquekey":"cd59c550c63bccf41560685e7ee6d698","title":"都说\u201c春兰\u201d不好养，记住这6个知识，\u201c韭菜\u201d终于养开花","date":"2018-12-12 09:12","category":"头条","author_name":"养花天堂","url":"http://mini.eastday.com/mobile/181212091242568.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181212/20181212091242_bfd16951c199bf048c87677414d883a6_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181212/20181212091242_bfd16951c199bf048c87677414d883a6_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181212/20181212091242_bfd16951c199bf048c87677414d883a6_5_mwpm_03200403.jpg"},{"uniquekey":"4c6a603ad5bc5aab9272e3b6710d70b2","title":"广州恒大再曝猛料狂追顶级后腰，他若到来恒大防守势必固若金汤","date":"2018-12-12 09:11","category":"头条","author_name":"小写C的赛场","url":"http://mini.eastday.com/mobile/181212091156063.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181212/20181212091156_cb1eb768fd192de161906ffd58ff1530_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181212/20181212091156_cb1eb768fd192de161906ffd58ff1530_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181212/20181212091156_cb1eb768fd192de161906ffd58ff1530_2_mwpm_03200403.jpg"},{"uniquekey":"731614a82dc302ca085aa5746c1b9728","title":"《东宫》首播，却疑似抄袭《三生三世》，女主侧脸还撞脸赵丽颖","date":"2018-12-12 09:11","category":"头条","author_name":"号雪说","url":"http://mini.eastday.com/mobile/181212091129219.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181212/20181212_a5a2d995d5abe057ee91b04c70ab93f4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181212/20181212_7c49c9db28c1c5d7035bfbd16a8897b4_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181212/20181212_448226c77c54e77014b95f3e04692889_cover_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason1;
    private String reason;
    private ResultBean result;
    private int error_code;


    public String getReason() {
        return reason;
    }
    public void setReason(String reason1) {
        this.reason = reason1;
    }


    public String getReason1() {
        return reason1;
    }

    public void setReason1(String reason1) {
        this.reason1 = reason1;
    }

//    public String getReason() {
//        return reason2;
//    }
//
//    public void setReason(String reason) {
//        this.reason2 = reason;
//    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"0050d630cd99c66af4ed9c231e8465e9","title":"谨防虚假促销陷阱　南昌市发布\u201c双十二\u201d消费提醒","date":"2018-12-12 09:56","category":"头条","author_name":"南昌头条","url":"http://mini.eastday.com/mobile/181212095645331.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181212/20181212_4795f77d90de7c170c52c9c23e7fd194_mwpm_03200403.jpg"},{"uniquekey":"93c9ab61141ea226bf80552b06df889b","title":"家中失火一对父子不幸身亡 冬季防火很重要","date":"2018-12-12 09:49","category":"头条","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/181212094900180.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181212/20181212094900_a14b0ba24eb76ade246eec3761df0ab8_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181212/20181212094900_a14b0ba24eb76ade246eec3761df0ab8_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181212/20181212094900_a14b0ba24eb76ade246eec3761df0ab8_1_mwpm_03200403.jpg"},{"uniquekey":"761b061f18b4cef0116616b669c385cc","title":"娱闻丨张卫健光头原因曝光，只因前辈一句话：你没毛就没价值","date":"2018-12-12 09:48","category":"头条","author_name":"东方号娱乐","url":"http://mini.eastday.com/mobile/181212094825345.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212_263d1a2a9e5214deca1420edd1dc6160_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181212/20181212_ef255264690bbd5475b3f53d3dcabda4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181212/20181212_53e183e7b7e6638ee649542491e4a991_mwpm_03200403.jpg"},{"uniquekey":"673c03a3be230e68248281585cf57d14","title":"乌俄友好条约凉了 大规模战争一触即发？","date":"2018-12-12 09:47","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/181212094711763.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181212/20181212094711_b5817138b4ee9764418b4462a61810fe_1_mwpm_03200403.jpg"},{"uniquekey":"4e86e63c1121b8efd284222314305cdc","title":"9种《四川凉拌菜》味型调配标准，求比例是菜鸟，理解调料才真实","date":"2018-12-12 09:41","category":"头条","author_name":"川菜世家易师傅","url":"http://mini.eastday.com/mobile/181212094125506.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212094125_261ca7ef35f00b77311a3124cb1f64f4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212094125_261ca7ef35f00b77311a3124cb1f64f4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212094125_261ca7ef35f00b77311a3124cb1f64f4_3_mwpm_03200403.jpg"},{"uniquekey":"5bb2905250f039a876cc6f3961e65afc","title":"孟晚舟获保释华为第一时间回应 专家:5G将加速推进","date":"2018-12-12 09:40","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/181212094009480.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181212/20181212094009_5542e1e86eec03a7624abe12f03071e8_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181212/20181212094009_5542e1e86eec03a7624abe12f03071e8_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181212/20181212094009_5542e1e86eec03a7624abe12f03071e8_3_mwpm_03200403.jpg"},{"uniquekey":"6eae7f17dca4cf27cb761a407ce5c560","title":"长期持有一只股票，不论涨跌每天都做T，这样下去会怎么样呢？","date":"2018-12-12 09:38","category":"头条","author_name":"杨幂私生活","url":"http://mini.eastday.com/mobile/181212093803613.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181212/20181212093803_d86aa2ddad62c6765fb959b5638b9204_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181212/20181212093803_d86aa2ddad62c6765fb959b5638b9204_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181212/20181212093803_d86aa2ddad62c6765fb959b5638b9204_3_mwpm_03200403.jpg"},{"uniquekey":"2af00e4e6f9928caaad12db46d5e25a0","title":"马化腾：王者荣耀新皮肤已经上线！网友：不好意思，我没钱！","date":"2018-12-12 09:36","category":"头条","author_name":"阿盛爆料君","url":"http://mini.eastday.com/mobile/181212093616057.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181212/20181212093616_8b51fa69e9ee19b0577999441e45b523_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181212/20181212093616_8b51fa69e9ee19b0577999441e45b523_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20181212/20181212093616_8b51fa69e9ee19b0577999441e45b523_1_mwpm_03200403.jpg"},{"uniquekey":"20824c54a76d4c9c8e48c9157ea73324","title":"彭昱畅嘴巴张到变形还是输给了王大陆，魏大勋大概只能被吃掉了","date":"2018-12-12 09:36","category":"头条","author_name":"电影天堂","url":"http://mini.eastday.com/mobile/181212093610164.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212_913c16e7579ac316eb30cdc0af449a06_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181212/20181212_21f7b5b8e8fae04449721424af2fbb8d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181212/20181212_3e4c972ae9802d257f18292f4706da4a_cover_mwpm_03200403.jpg"},{"uniquekey":"1110c5015e008d86ce894cc5000cf978","title":"开心一刻笑话：考路考那天，上午有个驾校带来的15个人全军覆没","date":"2018-12-12 09:35","category":"头条","author_name":"寂寞内涵","url":"http://mini.eastday.com/mobile/181212093559490.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212_a4b40995ef8ecbc868139c614ce00046_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181212/20181212_6f9b2a62c4ac63dd27b7180fa7c98dac_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181212/20181212_6956eb7401c963777e85a66f3b87317f_cover_mwpm_03200403.jpg"},{"uniquekey":"ce09d779bf3e7f5164415310d921c7d9","title":"泫雅最爱的奶奶风，你pick了么？","date":"2018-12-12 09:31","category":"头条","author_name":"小资CHIC杂志","url":"http://mini.eastday.com/mobile/181212093115425.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212093115_2321ea70d6952937c632a66bedcbe41d_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181212/20181212093115_2321ea70d6952937c632a66bedcbe41d_26_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181212/20181212093115_2321ea70d6952937c632a66bedcbe41d_25_mwpm_03200403.jpg"},{"uniquekey":"989f0b96c59b907c509a84e3aa884622","title":"苏格兰赛梁文博首轮出局 肖国栋内战惨遭0-4横扫","date":"2018-12-12 09:30","category":"头条","author_name":"网易体育","url":"http://mini.eastday.com/mobile/181212093012191.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181212/20181212093012_599b215b84fef8dcb8172a007347bc24_1_mwpm_03200403.jpg"},{"uniquekey":"440fbbb8b26b963643b0cf755ecd0f44","title":"巴基斯坦前驻华大使：美国挑起对华冷战几乎必输","date":"2018-12-12 09:29","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/181212092919794.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212092919_67e017d8b4b5501e7095614e6767e3f7_1_mwpm_03200403.jpg"},{"uniquekey":"fb6580b07a2cf3957ba0f9fe2bbf7b47","title":"【公告】关于调整部分印花税核定征收比例有关事项的公告","date":"2018-12-12 09:29","category":"头条","author_name":"厦门税务","url":"http://mini.eastday.com/mobile/181212092903584.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212092903_5de09566a5edb14944ff44a2aefcc8c8_1_mwpm_03200403.jpg"},{"uniquekey":"b91a93edef9b959691615c0dc1008208","title":"减重期间主食怎么吃？米饭和馒头哪一个更利于\u201c减重\u201d？","date":"2018-12-12 09:26","category":"头条","author_name":"简小月","url":"http://mini.eastday.com/mobile/181212092623121.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181212/20181212_ec73f87a55ab0eadc8bb2c401b87acd4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181212/20181212_7cdfe1b2c8d24d89ade772584581f50a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20181212/20181212_c277a5e0e67981b144d7b10a192e2e63_cover_mwpm_03200403.jpg"},{"uniquekey":"bbe0746d8eecd76de3e4dad3cf26b217","title":"米兰3500万先生刚来就闪耀！四大指标全队顶尖 开口就惊呆加图索","date":"2018-12-12 09:25","category":"头条","author_name":"国际足球冷雪","url":"http://mini.eastday.com/mobile/181212092510018.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212092510_ead70f6a6557111bfa47c62833c8c17a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212092510_ead70f6a6557111bfa47c62833c8c17a_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212092510_ead70f6a6557111bfa47c62833c8c17a_3_mwpm_03200403.jpg"},{"uniquekey":"d9933b7b3c78b94711a5872ae704aed2","title":"频繁踩踏\u201c一中\u201d红线 特朗普对台军售或创纪录 蚕食大陆警惕感？","date":"2018-12-12 09:24","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/181212092456377.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212092456_01ad3818fdf3a037ab8cb5029127e31f_1_mwpm_03200403.jpg"},{"uniquekey":"4e2c450ef9d96b785087a65d838ca1d0","title":"想拥有好的身材比例？试试这4组瑜伽体式，打造好身材","date":"2018-12-12 09:20","category":"头条","author_name":" 运动发骚客","url":"http://mini.eastday.com/mobile/181212092018333.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212_c15b6039bb9f6a47bfd98a248a724469_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212_adb6924f262cfb19611b1b6d1151c1f1_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212_22f6e0391f607ac4bc0e40b8dc66a25d_cover_mwpm_03200403.jpg"},{"uniquekey":"4974fc4f20eb33d9131f10f2691e6507","title":"陪哭服务！在日本 付钱就能请帅哥陪你哭帮你擦眼泪","date":"2018-12-12 09:19","category":"头条","author_name":"金融界","url":"http://mini.eastday.com/mobile/181212091950357.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212091950_aaaf624b45f6211b77f9ffa81c6d41b1_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212091950_aaaf624b45f6211b77f9ffa81c6d41b1_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212091950_aaaf624b45f6211b77f9ffa81c6d41b1_2_mwpm_03200403.jpg"},{"uniquekey":"a20047bf39353f9807ec313abee74d16","title":"名表丨穿西装配手表，都是有讲究的","date":"2018-12-12 09:18","category":"头条","author_name":"腕表小灰灰","url":"http://mini.eastday.com/mobile/181212091858628.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181212/20181212_2ded80365314b19c64dc9bf719a00fa3_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181212/20181212_8e9331e4141d1853cc20b1e15e36c55d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181212/20181212_e2b7e523ff3269278a91f4285d461f99_cover_mwpm_03200403.jpg"},{"uniquekey":"d32d903451bad7e09562367f27570ef6","title":"现货黄金投资怎样把握做空时机?","date":"2018-12-12 09:18","category":"头条","author_name":"十月增伤悲","url":"http://mini.eastday.com/mobile/181212091847288.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212_55f0d8f9c27681895ff331a21a96a537_cover_mwpm_03200403.jpg"},{"uniquekey":"4ddee90a1230225c814185908936b05e","title":"俄罗斯克里姆林宫举办年度军官舞会 帅哥美女如云","date":"2018-12-12 09:18","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/181212091841297.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181212/20181212091841_a910ecee03d10830c3c7fbf46fe92516_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181212/20181212091841_2c515a7e486db6b154aa4582570f387d_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181212/20181212091841_fd8875e8532fe3bef0cadf588f2eb53d_4_mwpm_03200403.jpg"},{"uniquekey":"82aedcab69a4af3937872e1b000278e5","title":"最新规定！洛阳城市区快速路禁止行人及这些车辆通行！","date":"2018-12-12 09:16","category":"头条","author_name":"洛阳网","url":"http://mini.eastday.com/mobile/181212091607320.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181212/20181212091607_4ff970be54077d3f62b51773fcc475a5_1_mwpm_03200403.jpg"},{"uniquekey":"1d77f7817929d8c06cc27fc9e1ed3ea4","title":"《王者荣耀》王者峡谷六神装后的暴击王，猴子排第三，第一名你绝对想不到！","date":"2018-12-12 09:15","category":"头条","author_name":"14游","url":"http://mini.eastday.com/mobile/181212091533428.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181212/20181212091533_fbe8aeb9c951f88f0254d83f32af2ec4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181212/20181212091533_fbe8aeb9c951f88f0254d83f32af2ec4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181212/20181212091533_fbe8aeb9c951f88f0254d83f32af2ec4_3_mwpm_03200403.jpg"},{"uniquekey":"928428b00144925fd763b11306b97d65","title":"马拉松进入课堂 大学生健康状况引重视","date":"2018-12-12 09:15","category":"头条","author_name":"跑步骚年","url":"http://mini.eastday.com/mobile/181212091510819.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181212/20181212091510_34882fbd880ce0eada952d2b0fbfde4b_1_mwpm_03200403.jpg"},{"uniquekey":"ac184b208a5a98a11b0c525c3f6d34ad","title":"《王者荣耀》清兵能力最强的5个法师，安琪拉倒数，第1只要一个技能","date":"2018-12-12 09:15","category":"头条","author_name":"14游","url":"http://mini.eastday.com/mobile/181212091504918.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181212/20181212091504_c1a52cdb96a263a7eaaaa64ed049fe3a_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181212/20181212091504_c1a52cdb96a263a7eaaaa64ed049fe3a_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181212/20181212091504_c1a52cdb96a263a7eaaaa64ed049fe3a_4_mwpm_03200403.jpg"},{"uniquekey":"54846284cdac5efbb2891bccf69ac61e","title":"宋代商人图鉴：朝朝暮暮士子梦，为求功名买房忙","date":"2018-12-12 09:14","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/181212091418294.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181212/20181212091418_0fe6dcfb18de247c5c9e6b92902f3794_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181212/20181212091418_0fe6dcfb18de247c5c9e6b92902f3794_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181212/20181212091418_0fe6dcfb18de247c5c9e6b92902f3794_3_mwpm_03200403.jpg"},{"uniquekey":"cd59c550c63bccf41560685e7ee6d698","title":"都说\u201c春兰\u201d不好养，记住这6个知识，\u201c韭菜\u201d终于养开花","date":"2018-12-12 09:12","category":"头条","author_name":"养花天堂","url":"http://mini.eastday.com/mobile/181212091242568.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181212/20181212091242_bfd16951c199bf048c87677414d883a6_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181212/20181212091242_bfd16951c199bf048c87677414d883a6_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181212/20181212091242_bfd16951c199bf048c87677414d883a6_5_mwpm_03200403.jpg"},{"uniquekey":"4c6a603ad5bc5aab9272e3b6710d70b2","title":"广州恒大再曝猛料狂追顶级后腰，他若到来恒大防守势必固若金汤","date":"2018-12-12 09:11","category":"头条","author_name":"小写C的赛场","url":"http://mini.eastday.com/mobile/181212091156063.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181212/20181212091156_cb1eb768fd192de161906ffd58ff1530_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181212/20181212091156_cb1eb768fd192de161906ffd58ff1530_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181212/20181212091156_cb1eb768fd192de161906ffd58ff1530_2_mwpm_03200403.jpg"},{"uniquekey":"731614a82dc302ca085aa5746c1b9728","title":"《东宫》首播，却疑似抄袭《三生三世》，女主侧脸还撞脸赵丽颖","date":"2018-12-12 09:11","category":"头条","author_name":"号雪说","url":"http://mini.eastday.com/mobile/181212091129219.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181212/20181212_a5a2d995d5abe057ee91b04c70ab93f4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181212/20181212_7c49c9db28c1c5d7035bfbd16a8897b4_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181212/20181212_448226c77c54e77014b95f3e04692889_cover_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 0050d630cd99c66af4ed9c231e8465e9
             * title : 谨防虚假促销陷阱　南昌市发布“双十二”消费提醒
             * date : 2018-12-12 09:56
             * category : 头条
             * author_name : 南昌头条
             * url : http://mini.eastday.com/mobile/181212095645331.html
             * thumbnail_pic_s : http://08imgmini.eastday.com/mobile/20181212/20181212_4795f77d90de7c170c52c9c23e7fd194_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://07imgmini.eastday.com/mobile/20181212/20181212094900_a14b0ba24eb76ade246eec3761df0ab8_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://07imgmini.eastday.com/mobile/20181212/20181212094900_a14b0ba24eb76ade246eec3761df0ab8_1_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}

package text.qiao.com.rerfitrxjavastudy.model.entity.weizhang;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @project：RerfitRxJavaStudy
 * @fileName WZCity
 * @author：乔少聪
 * @date：2019/4/3 14:13
 * @describe：查询支持城市
 */
public class WZCity {


    /**
     * resultcode : 200
     * reason : 成功的返回
     * result : {"BJ":{"province":"北京","province_code":"BJ","citys":[{"city_name":"北京","city_code":"BJ","abbr":"京","engine":"1","engineno":"0","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"SH":{"province":"上海","province_code":"SH","citys":[{"city_name":"上海","city_code":"SH","abbr":"沪","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"SC":{"province":"四川","province_code":"SC","citys":[{"city_name":"成都","city_code":"SC_CD","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"双流县","city_code":"SC_SHUANGLIUXIAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"德阳","city_code":"SC_DEYANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"绵阳","city_code":"SC_MIANYANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乐山","city_code":"SC_LESHAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"自贡","city_code":"SC_ZIGONG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泸州","city_code":"SC_LUZHOU","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜宾","city_code":"SC_YIBIN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南充","city_code":"SC_NANCHONG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"攀枝花","city_code":"SC_PANZHIHUA","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"广元","city_code":"SC_GUANGYUAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"遂宁","city_code":"SC_SUINING","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"内江","city_code":"SC_NEIJIANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"资阳","city_code":"SC_ZIYANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"达州","city_code":"SC_DAZHOU","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"眉山","city_code":"SC_MEISHAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"雅安","city_code":"SC_YAAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"巴中","city_code":"SC_BAZHONG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"广安","city_code":"SC_GUANGAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阿坝","city_code":"SC_ABA","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"凉山","city_code":"SC_LIANGSHAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"甘孜","city_code":"SC_GANZI","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"ZJ":{"province":"浙江","province_code":"ZJ","citys":[{"city_name":"杭州","city_code":"ZJ_HZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宁波","city_code":"ZJ_NB","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"温州","city_code":"ZJ_WZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"义乌","city_code":"ZJ_YW","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"台州","city_code":"ZJ_TZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"慈溪","city_code":"ZJ_CX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"余姚","city_code":"ZJ_YY","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"永康","city_code":"ZJ_YK","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乐清","city_code":"ZJ_YQ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"绍兴县","city_code":"ZJ_SXX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"瑞安","city_code":"ZJ_RA","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"嘉兴","city_code":"ZJ_JX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"金华","city_code":"ZJ_JH","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"绍兴","city_code":"ZJ_SX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"温岭","city_code":"ZJ_WL","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"桐乡","city_code":"ZJ_TX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"海宁","city_code":"ZJ_HN","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"诸暨","city_code":"ZJ_ZJ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"玉环县","city_code":"ZJ_YHX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"上虞","city_code":"ZJ_SY","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"湖州","city_code":"ZJ_HUZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"丽水","city_code":"ZJ_LS","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"衢州","city_code":"ZJ_QZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"舟山","city_code":"ZJ_ZS","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"临海","city_code":"ZJ_LH","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"平湖","city_code":"ZJ_PH","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"长兴县","city_code":"ZJ_CXX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"FJ":{"province":"福建","province_code":"FJ","citys":[{"city_name":"厦门","city_code":"FJ_XM","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"福州","city_code":"FJ_FU1ZHOU","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泉州","city_code":"FJ_QUANZHOU","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"晋江","city_code":"FJ_JINJIANG","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"石狮","city_code":"FJ_SHISHI","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"莆田","city_code":"FJ_FUTIAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"漳州","city_code":"FJ_ZHANGZHOU","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南安","city_code":"FJ_NANAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"三明","city_code":"FJ_SANMING","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"龙岩","city_code":"FJ_LONGYAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南平","city_code":"FJ_NANPING","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宁德","city_code":"FJ_NINGDE","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"福清","city_code":"FJ_FUQING","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"惠安县","city_code":"FJ_HUIANXIAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"厦门","city_code":"FJ_XIAMEN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":null},{"city_name":"厦门","city_code":"FJ_XIAMEN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":null},{"city_name":"厦门","city_code":"FJ_XIAMEN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":null}]},"JL":{"province":"吉林","province_code":"JL","citys":[{"city_name":"吉林","city_code":"JL","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"长春","city_code":"JL_CHANGCHUN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"四平","city_code":"JL_SIPING","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"通化","city_code":"JL_TONGHUA","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"白山","city_code":"JL_BAISHAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"辽源","city_code":"JL_LIAOYUAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"松原","city_code":"JL_SONGYUAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"白城","city_code":"JL_BAICHENG","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"延边","city_code":"JL_YANBIAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"LN":{"province":"辽宁","province_code":"LN","citys":[{"city_name":"沈阳","city_code":"LN_SY","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"锦州","city_code":"LN_JZ","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"营口","city_code":"LN_YK","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"葫芦岛","city_code":"LN_HLD","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"大连","city_code":"LN_DL","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鞍山","city_code":"LN_AS","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"抚顺","city_code":"LN_FS","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"丹东","city_code":"LN_DD","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阜新","city_code":"LN_FX","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"辽阳","city_code":"LN_LY","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铁岭","city_code":"LN_TL","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"朝阳","city_code":"LN_CY","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"盘锦","city_code":"LN_PANJIN","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"瓦房店","city_code":"LN_WAFANGDIAN","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"本溪","city_code":"LN_BENXI","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"海城","city_code":"LN_HAICHENG","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"SD":{"province":"山东","province_code":"SD","citys":[{"city_name":"淄博","city_code":"SD_ZB","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"青岛","city_code":"SD_QD","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"威海","city_code":"SD_WH","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"枣庄","city_code":"SD_ZZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"日照","city_code":"SD_RZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"临沂","city_code":"SD_LY","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"莱芜","city_code":"SD_LW","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"菏泽","city_code":"SD_HZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"潍坊","city_code":"SD_WF","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"聊城","city_code":"SD_LC","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"济宁","city_code":"SD_JN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"滨州","city_code":"SD_BZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"德州","city_code":"SD_DZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"东营","city_code":"SD_DY","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泰安","city_code":"SD_TA","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"烟台","city_code":"SD_YT","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"济南","city_code":"SD_JINAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"滕州","city_code":"SD_TENGZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"荣成","city_code":"SD_RONGCHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"莱州","city_code":"SD_LAIZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"诸城","city_code":"SD_ZHUCHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"蓬莱","city_code":"SD_PENGLAI","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"龙口","city_code":"SD_LONGKOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"寿光","city_code":"SD_SHOUGUANG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"章丘","city_code":"SD_ZHANGQIU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"胶州","city_code":"SD_JIAOZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"平度","city_code":"SD_PINGDU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"招远","city_code":"SD_ZHAOYUAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"文登","city_code":"SD_WENDENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"邹城","city_code":"SD_ZOUCHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"兖州","city_code":"SD_YANZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乳山","city_code":"SD_RUSHAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"邹平县","city_code":"SD_ZOUPINGXIAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"新泰","city_code":"SD_XINTAI","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"肥城","city_code":"SD_FEICHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"胶南","city_code":"SD_JIAONAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"HN":{"province":"河南","province_code":"HN","citys":[{"city_name":"郑州","city_code":"HN_ZZ","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"洛阳","city_code":"HN_LY","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"许昌","city_code":"HN_XC","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"平顶山","city_code":"HN_PDS","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"驻马店","city_code":"HN_ZMD","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鹤壁","city_code":"HN_HB","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"焦作","city_code":"HN_JZ","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"三门峡","city_code":"HN_SMX","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"商丘","city_code":"HN_SQ","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"济源","city_code":"HN_JY","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"新乡","city_code":"HN_XINXIANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"巩义","city_code":"HN_GONGYI","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"安阳","city_code":"HN_ANYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南阳","city_code":"HN_NANYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"开封","city_code":"HN_KAIFENG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"濮阳","city_code":"HN_PUYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"周口","city_code":"HN_ZHOUKOU","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"信阳","city_code":"HN_XINYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"漯河","city_code":"HN_LEIHE","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"JS":{"province":"江苏","province_code":"JS","citys":[{"city_name":"南京","city_code":"JS_NJ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"徐州","city_code":"JS_XZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"常州","city_code":"JS_CZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"苏州","city_code":"JS_SZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南通","city_code":"JS_NT","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"连云港","city_code":"JS_LYG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"镇江","city_code":"JS_ZJ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宿迁","city_code":"JS_SQ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"扬州","city_code":"JS_YZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"无锡","city_code":"JS_WUXI","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"张家港","city_code":"JS_ZHANGJIAGANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"江阴","city_code":"JS_JIANGYIN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜兴","city_code":"JS_YIXING","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"盐城","city_code":"JS_YANCHENG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"昆山","city_code":"JS_KUNSHAN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"常熟","city_code":"JS_CHANGSHU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"江都","city_code":"JS_JIANGDOU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"丹阳","city_code":"JS_DANYANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"太仓","city_code":"JS_TAICANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"溧阳","city_code":"JS_LIYANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"海门","city_code":"JS_HAIMEN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"启东","city_code":"JS_QIDONG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"通州","city_code":"JS_TONGZHOU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泰州","city_code":"JS_TAI4ZHOU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"淮安","city_code":"JS_HUAIAN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吴江","city_code":"JS_WUJIANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泰兴","city_code":"JS_TAIXING","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"HUN":{"province":"湖南","province_code":"HUN","citys":[{"city_name":"长沙","city_code":"HUN_CS","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"衡阳","city_code":"HUN_HY","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"郴州","city_code":"HUN_CHENZHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"株洲","city_code":"HUN_ZHUZHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"湘潭","city_code":"HUN_XIANGTAN","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"常德","city_code":"HUN_CHANGDE","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"岳阳","city_code":"HUN_YUEYANG","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"益阳","city_code":"HUN_YIYANG","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"邵阳","city_code":"HUN_SHAOYANG","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"怀化","city_code":"HUN_HUAIHUA","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"永州","city_code":"HUN_YONGZHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"娄底","city_code":"HUN_LOUDI","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"张家界","city_code":"HUN_ZHANGJIAJIE","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吉首","city_code":"HUN_JISHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"SX":{"province":"陕西","province_code":"SX","citys":[{"city_name":"西安","city_code":"SX_XA","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"咸阳","city_code":"SX_XY","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"渭南","city_code":"SX_WN","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"安康","city_code":"SX_AK","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"延安","city_code":"SX_YA","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宝鸡","city_code":"SX_BAOJI","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"1"},{"city_name":"汉中","city_code":"SX_HANZHONG","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"榆林","city_code":"SX_YU2LIN","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铜川","city_code":"SX_TONGCHUAN","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"商洛","city_code":"SX_SHANGLUO","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"GD":{"province":"广东","province_code":"GD","citys":[{"city_name":"深圳","city_code":"GD_SZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"广州","city_code":"GD_GZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"东莞","city_code":"GD_DG","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"佛山","city_code":"GD_FS","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"中山","city_code":"GD_ZS","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"汕头","city_code":"GD_ST","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"珠海","city_code":"GD_ZH","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"江门","city_code":"GD_JM","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"揭阳","city_code":"GD_JY","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"惠州","city_code":"GD_HZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"潮州","city_code":"GD_CZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"肇庆","city_code":"GD_ZQ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阳江","city_code":"GD_YJ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"湛江","city_code":"GD_ZHANJIANG","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"韶关","city_code":"GD_SHAOGUAN","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"茂名","city_code":"GD_MAOMING","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"清远","city_code":"GD_QINGYUAN","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"梅州","city_code":"GD_MEIZHOU","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"河源","city_code":"GD_HEYUAN","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"增城","city_code":"GD_ZENGCHENG","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"云浮","city_code":"GD_YUNFU","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"汕尾","city_code":"GD_SHANWEI","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"FB":{"province":"湖北","province_code":"FB","citys":[{"city_name":"武汉","city_code":"FB_WH","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜昌","city_code":"FB_YICHANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"荆州","city_code":"FB_JINGZHOU","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"襄樊","city_code":"FB_XIANGFAN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黄冈","city_code":"FB_HUANGGANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"十堰","city_code":"FB_SHIYAN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黄石","city_code":"FB_HUANGSHI","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"随州","city_code":"FB_SUIZHOU","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"荆门","city_code":"FB_JINGMEN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"孝感","city_code":"FB_XIAOGAN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鄂州","city_code":"FB_EZHOU","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"咸宁","city_code":"FB_XIANNING","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"恩施","city_code":"FB_ENSHI","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"神农架","city_code":"FB_SHENNONGJIA","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"潜江","city_code":"FB_QIANJIANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"天门","city_code":"FB_TIANMEN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"仙桃","city_code":"FB_XIANTAO","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"襄阳","city_code":"FB_XIANGYANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"HAN":{"province":"海南","province_code":"HAN","citys":[{"city_name":"海口","city_code":"HAN_HAIKOU","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"三亚","city_code":"HAN_SANYA","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"陵水","city_code":"HAN_LINGSHUI","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"白沙","city_code":"HAN_BAISHA","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"琼海","city_code":"HAN_QIONGHAI","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"琼中","city_code":"HAN_QIONGZHONG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"澄迈县","city_code":"HAN_CHENGMAIXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"昌江","city_code":"HAN_CHANGJIANG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"文昌","city_code":"HAN_WENCHANG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"屯昌县","city_code":"HAN_TUNCHANGXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"定安县","city_code":"HAN_DINGANXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"儋州","city_code":"HAN_DANZHOU","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"保亭","city_code":"HAN_BAOTING","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"五指山","city_code":"HAN_WUZHISHAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乐东","city_code":"HAN_LEDONG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"临高县","city_code":"HAN_LINGAOXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"东方","city_code":"HAN_DONGFANG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"万宁","city_code":"HAN_WANNING","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"GZ":{"province":"贵州","province_code":"GZ","citys":[{"city_name":"贵阳","city_code":"GZ_GUIYANG","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"遵义","city_code":"GZ_ZUNYI","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"毕节","city_code":"GZ_BIJIE","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黔东南","city_code":"GZ_QIANDONGNAN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"六盘水","city_code":"GZ_LIUPANSHUI","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"安顺","city_code":"GZ_ANSHUN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铜仁","city_code":"GZ_TONGREN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黔南","city_code":"GZ_QIANNAN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黔西南","city_code":"GZ_QIANXINAN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"AH":{"province":"安徽","province_code":"AH","citys":[{"city_name":"芜湖","city_code":"AH_WUHU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黄山","city_code":"AH_HUANGSHAN","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"蚌埠","city_code":"AH_BENGBU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"亳州","city_code":"AH_BOZHOU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铜陵","city_code":"AH_TONGLING","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"淮北","city_code":"AH_HUAIBEI","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宣城","city_code":"AH_XUANCHENG","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"池州","city_code":"AH_CHIZHOU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"NX":{"province":"宁夏","province_code":"NX","citys":[{"city_name":"银川","city_code":"NX_YINCHUAN","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吴忠","city_code":"NX_WUZHONG","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"石嘴山","city_code":"NX_SHIZUISHAN","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"固原","city_code":"NX_GUYUAN","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"中卫","city_code":"NX_ZHONGWEI","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"NMG":{"province":"内蒙古","province_code":"NMG","citys":[{"city_name":"呼和浩特","city_code":"NMG_HUHEHAOTE","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"包头","city_code":"NMG_BAOTOU","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"兴安","city_code":"NMG_XINGAN","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"准格尔","city_code":"NMG_ZHUNGEER","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"赤峰","city_code":"NMG_CHIFENG","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"锡林郭勒","city_code":"NMG_XILINGUOLE","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阿拉善","city_code":"NMG_ALASHAN","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"通辽","city_code":"NMG_TONGLIAO","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鄂尔多斯","city_code":"NMG_EERDUOSI","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乌兰察布","city_code":"NMG_WULANCHABU","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"呼伦贝尔","city_code":"NMG_HULUNBEIER","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"巴彦淖尔","city_code":"NMG_BAYANNAOER","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乌海","city_code":"NMG_WUHAI","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"CQ":{"province":"重庆","province_code":"CQ","citys":[{"city_name":"重庆","city_code":"CQ","abbr":"渝","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"JX":{"province":"江西","province_code":"JX","citys":[{"city_name":"南昌","city_code":"JX_NANCHANG","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"赣州","city_code":"JX_GANZHOU","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"萍乡","city_code":"JX_PINGXIANG","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"九江","city_code":"JX_JIUJIANG","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鹰潭","city_code":"JX_YINGTAN","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"上饶","city_code":"JX_SHANGRAO","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"景德镇","city_code":"JX_JINGDEZHEN","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吉安","city_code":"JX_JIAN","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"新余","city_code":"JX_XINYU","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜春","city_code":"JX_YICHUN_J","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"抚州","city_code":"JX_FU3ZHOU","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]},"TJ":{"province":"天津","province_code":"TJ","citys":[{"city_name":"天津","city_code":"TJ","abbr":"津","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

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
         * BJ : {"province":"北京","province_code":"BJ","citys":[{"city_name":"北京","city_code":"BJ","abbr":"京","engine":"1","engineno":"0","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * SH : {"province":"上海","province_code":"SH","citys":[{"city_name":"上海","city_code":"SH","abbr":"沪","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * SC : {"province":"四川","province_code":"SC","citys":[{"city_name":"成都","city_code":"SC_CD","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"双流县","city_code":"SC_SHUANGLIUXIAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"德阳","city_code":"SC_DEYANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"绵阳","city_code":"SC_MIANYANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乐山","city_code":"SC_LESHAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"自贡","city_code":"SC_ZIGONG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泸州","city_code":"SC_LUZHOU","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜宾","city_code":"SC_YIBIN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南充","city_code":"SC_NANCHONG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"攀枝花","city_code":"SC_PANZHIHUA","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"广元","city_code":"SC_GUANGYUAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"遂宁","city_code":"SC_SUINING","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"内江","city_code":"SC_NEIJIANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"资阳","city_code":"SC_ZIYANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"达州","city_code":"SC_DAZHOU","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"眉山","city_code":"SC_MEISHAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"雅安","city_code":"SC_YAAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"巴中","city_code":"SC_BAZHONG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"广安","city_code":"SC_GUANGAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阿坝","city_code":"SC_ABA","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"凉山","city_code":"SC_LIANGSHAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"甘孜","city_code":"SC_GANZI","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * ZJ : {"province":"浙江","province_code":"ZJ","citys":[{"city_name":"杭州","city_code":"ZJ_HZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宁波","city_code":"ZJ_NB","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"温州","city_code":"ZJ_WZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"义乌","city_code":"ZJ_YW","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"台州","city_code":"ZJ_TZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"慈溪","city_code":"ZJ_CX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"余姚","city_code":"ZJ_YY","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"永康","city_code":"ZJ_YK","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乐清","city_code":"ZJ_YQ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"绍兴县","city_code":"ZJ_SXX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"瑞安","city_code":"ZJ_RA","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"嘉兴","city_code":"ZJ_JX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"金华","city_code":"ZJ_JH","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"绍兴","city_code":"ZJ_SX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"温岭","city_code":"ZJ_WL","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"桐乡","city_code":"ZJ_TX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"海宁","city_code":"ZJ_HN","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"诸暨","city_code":"ZJ_ZJ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"玉环县","city_code":"ZJ_YHX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"上虞","city_code":"ZJ_SY","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"湖州","city_code":"ZJ_HUZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"丽水","city_code":"ZJ_LS","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"衢州","city_code":"ZJ_QZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"舟山","city_code":"ZJ_ZS","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"临海","city_code":"ZJ_LH","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"平湖","city_code":"ZJ_PH","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"长兴县","city_code":"ZJ_CXX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * FJ : {"province":"福建","province_code":"FJ","citys":[{"city_name":"厦门","city_code":"FJ_XM","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"福州","city_code":"FJ_FU1ZHOU","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泉州","city_code":"FJ_QUANZHOU","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"晋江","city_code":"FJ_JINJIANG","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"石狮","city_code":"FJ_SHISHI","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"莆田","city_code":"FJ_FUTIAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"漳州","city_code":"FJ_ZHANGZHOU","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南安","city_code":"FJ_NANAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"三明","city_code":"FJ_SANMING","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"龙岩","city_code":"FJ_LONGYAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南平","city_code":"FJ_NANPING","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宁德","city_code":"FJ_NINGDE","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"福清","city_code":"FJ_FUQING","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"惠安县","city_code":"FJ_HUIANXIAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"厦门","city_code":"FJ_XIAMEN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":null},{"city_name":"厦门","city_code":"FJ_XIAMEN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":null},{"city_name":"厦门","city_code":"FJ_XIAMEN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":null}]}
         * JL : {"province":"吉林","province_code":"JL","citys":[{"city_name":"吉林","city_code":"JL","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"长春","city_code":"JL_CHANGCHUN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"四平","city_code":"JL_SIPING","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"通化","city_code":"JL_TONGHUA","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"白山","city_code":"JL_BAISHAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"辽源","city_code":"JL_LIAOYUAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"松原","city_code":"JL_SONGYUAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"白城","city_code":"JL_BAICHENG","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"延边","city_code":"JL_YANBIAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * LN : {"province":"辽宁","province_code":"LN","citys":[{"city_name":"沈阳","city_code":"LN_SY","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"锦州","city_code":"LN_JZ","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"营口","city_code":"LN_YK","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"葫芦岛","city_code":"LN_HLD","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"大连","city_code":"LN_DL","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鞍山","city_code":"LN_AS","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"抚顺","city_code":"LN_FS","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"丹东","city_code":"LN_DD","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阜新","city_code":"LN_FX","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"辽阳","city_code":"LN_LY","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铁岭","city_code":"LN_TL","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"朝阳","city_code":"LN_CY","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"盘锦","city_code":"LN_PANJIN","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"瓦房店","city_code":"LN_WAFANGDIAN","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"本溪","city_code":"LN_BENXI","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"海城","city_code":"LN_HAICHENG","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * SD : {"province":"山东","province_code":"SD","citys":[{"city_name":"淄博","city_code":"SD_ZB","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"青岛","city_code":"SD_QD","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"威海","city_code":"SD_WH","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"枣庄","city_code":"SD_ZZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"日照","city_code":"SD_RZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"临沂","city_code":"SD_LY","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"莱芜","city_code":"SD_LW","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"菏泽","city_code":"SD_HZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"潍坊","city_code":"SD_WF","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"聊城","city_code":"SD_LC","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"济宁","city_code":"SD_JN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"滨州","city_code":"SD_BZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"德州","city_code":"SD_DZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"东营","city_code":"SD_DY","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泰安","city_code":"SD_TA","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"烟台","city_code":"SD_YT","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"济南","city_code":"SD_JINAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"滕州","city_code":"SD_TENGZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"荣成","city_code":"SD_RONGCHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"莱州","city_code":"SD_LAIZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"诸城","city_code":"SD_ZHUCHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"蓬莱","city_code":"SD_PENGLAI","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"龙口","city_code":"SD_LONGKOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"寿光","city_code":"SD_SHOUGUANG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"章丘","city_code":"SD_ZHANGQIU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"胶州","city_code":"SD_JIAOZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"平度","city_code":"SD_PINGDU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"招远","city_code":"SD_ZHAOYUAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"文登","city_code":"SD_WENDENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"邹城","city_code":"SD_ZOUCHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"兖州","city_code":"SD_YANZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乳山","city_code":"SD_RUSHAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"邹平县","city_code":"SD_ZOUPINGXIAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"新泰","city_code":"SD_XINTAI","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"肥城","city_code":"SD_FEICHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"胶南","city_code":"SD_JIAONAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * HN : {"province":"河南","province_code":"HN","citys":[{"city_name":"郑州","city_code":"HN_ZZ","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"洛阳","city_code":"HN_LY","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"许昌","city_code":"HN_XC","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"平顶山","city_code":"HN_PDS","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"驻马店","city_code":"HN_ZMD","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鹤壁","city_code":"HN_HB","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"焦作","city_code":"HN_JZ","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"三门峡","city_code":"HN_SMX","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"商丘","city_code":"HN_SQ","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"济源","city_code":"HN_JY","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"新乡","city_code":"HN_XINXIANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"巩义","city_code":"HN_GONGYI","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"安阳","city_code":"HN_ANYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南阳","city_code":"HN_NANYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"开封","city_code":"HN_KAIFENG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"濮阳","city_code":"HN_PUYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"周口","city_code":"HN_ZHOUKOU","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"信阳","city_code":"HN_XINYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"漯河","city_code":"HN_LEIHE","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * JS : {"province":"江苏","province_code":"JS","citys":[{"city_name":"南京","city_code":"JS_NJ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"徐州","city_code":"JS_XZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"常州","city_code":"JS_CZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"苏州","city_code":"JS_SZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南通","city_code":"JS_NT","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"连云港","city_code":"JS_LYG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"镇江","city_code":"JS_ZJ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宿迁","city_code":"JS_SQ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"扬州","city_code":"JS_YZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"无锡","city_code":"JS_WUXI","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"张家港","city_code":"JS_ZHANGJIAGANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"江阴","city_code":"JS_JIANGYIN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜兴","city_code":"JS_YIXING","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"盐城","city_code":"JS_YANCHENG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"昆山","city_code":"JS_KUNSHAN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"常熟","city_code":"JS_CHANGSHU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"江都","city_code":"JS_JIANGDOU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"丹阳","city_code":"JS_DANYANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"太仓","city_code":"JS_TAICANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"溧阳","city_code":"JS_LIYANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"海门","city_code":"JS_HAIMEN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"启东","city_code":"JS_QIDONG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"通州","city_code":"JS_TONGZHOU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泰州","city_code":"JS_TAI4ZHOU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"淮安","city_code":"JS_HUAIAN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吴江","city_code":"JS_WUJIANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泰兴","city_code":"JS_TAIXING","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * HUN : {"province":"湖南","province_code":"HUN","citys":[{"city_name":"长沙","city_code":"HUN_CS","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"衡阳","city_code":"HUN_HY","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"郴州","city_code":"HUN_CHENZHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"株洲","city_code":"HUN_ZHUZHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"湘潭","city_code":"HUN_XIANGTAN","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"常德","city_code":"HUN_CHANGDE","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"岳阳","city_code":"HUN_YUEYANG","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"益阳","city_code":"HUN_YIYANG","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"邵阳","city_code":"HUN_SHAOYANG","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"怀化","city_code":"HUN_HUAIHUA","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"永州","city_code":"HUN_YONGZHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"娄底","city_code":"HUN_LOUDI","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"张家界","city_code":"HUN_ZHANGJIAJIE","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吉首","city_code":"HUN_JISHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * SX : {"province":"陕西","province_code":"SX","citys":[{"city_name":"西安","city_code":"SX_XA","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"咸阳","city_code":"SX_XY","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"渭南","city_code":"SX_WN","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"安康","city_code":"SX_AK","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"延安","city_code":"SX_YA","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宝鸡","city_code":"SX_BAOJI","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"1"},{"city_name":"汉中","city_code":"SX_HANZHONG","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"榆林","city_code":"SX_YU2LIN","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铜川","city_code":"SX_TONGCHUAN","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"商洛","city_code":"SX_SHANGLUO","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * GD : {"province":"广东","province_code":"GD","citys":[{"city_name":"深圳","city_code":"GD_SZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"广州","city_code":"GD_GZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"东莞","city_code":"GD_DG","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"佛山","city_code":"GD_FS","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"中山","city_code":"GD_ZS","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"汕头","city_code":"GD_ST","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"珠海","city_code":"GD_ZH","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"江门","city_code":"GD_JM","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"揭阳","city_code":"GD_JY","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"惠州","city_code":"GD_HZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"潮州","city_code":"GD_CZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"肇庆","city_code":"GD_ZQ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阳江","city_code":"GD_YJ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"湛江","city_code":"GD_ZHANJIANG","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"韶关","city_code":"GD_SHAOGUAN","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"茂名","city_code":"GD_MAOMING","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"清远","city_code":"GD_QINGYUAN","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"梅州","city_code":"GD_MEIZHOU","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"河源","city_code":"GD_HEYUAN","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"增城","city_code":"GD_ZENGCHENG","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"云浮","city_code":"GD_YUNFU","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"汕尾","city_code":"GD_SHANWEI","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * FB : {"province":"湖北","province_code":"FB","citys":[{"city_name":"武汉","city_code":"FB_WH","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜昌","city_code":"FB_YICHANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"荆州","city_code":"FB_JINGZHOU","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"襄樊","city_code":"FB_XIANGFAN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黄冈","city_code":"FB_HUANGGANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"十堰","city_code":"FB_SHIYAN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黄石","city_code":"FB_HUANGSHI","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"随州","city_code":"FB_SUIZHOU","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"荆门","city_code":"FB_JINGMEN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"孝感","city_code":"FB_XIAOGAN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鄂州","city_code":"FB_EZHOU","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"咸宁","city_code":"FB_XIANNING","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"恩施","city_code":"FB_ENSHI","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"神农架","city_code":"FB_SHENNONGJIA","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"潜江","city_code":"FB_QIANJIANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"天门","city_code":"FB_TIANMEN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"仙桃","city_code":"FB_XIANTAO","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"襄阳","city_code":"FB_XIANGYANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * HAN : {"province":"海南","province_code":"HAN","citys":[{"city_name":"海口","city_code":"HAN_HAIKOU","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"三亚","city_code":"HAN_SANYA","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"陵水","city_code":"HAN_LINGSHUI","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"白沙","city_code":"HAN_BAISHA","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"琼海","city_code":"HAN_QIONGHAI","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"琼中","city_code":"HAN_QIONGZHONG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"澄迈县","city_code":"HAN_CHENGMAIXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"昌江","city_code":"HAN_CHANGJIANG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"文昌","city_code":"HAN_WENCHANG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"屯昌县","city_code":"HAN_TUNCHANGXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"定安县","city_code":"HAN_DINGANXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"儋州","city_code":"HAN_DANZHOU","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"保亭","city_code":"HAN_BAOTING","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"五指山","city_code":"HAN_WUZHISHAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乐东","city_code":"HAN_LEDONG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"临高县","city_code":"HAN_LINGAOXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"东方","city_code":"HAN_DONGFANG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"万宁","city_code":"HAN_WANNING","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * GZ : {"province":"贵州","province_code":"GZ","citys":[{"city_name":"贵阳","city_code":"GZ_GUIYANG","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"遵义","city_code":"GZ_ZUNYI","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"毕节","city_code":"GZ_BIJIE","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黔东南","city_code":"GZ_QIANDONGNAN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"六盘水","city_code":"GZ_LIUPANSHUI","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"安顺","city_code":"GZ_ANSHUN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铜仁","city_code":"GZ_TONGREN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黔南","city_code":"GZ_QIANNAN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黔西南","city_code":"GZ_QIANXINAN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * AH : {"province":"安徽","province_code":"AH","citys":[{"city_name":"芜湖","city_code":"AH_WUHU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黄山","city_code":"AH_HUANGSHAN","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"蚌埠","city_code":"AH_BENGBU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"亳州","city_code":"AH_BOZHOU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铜陵","city_code":"AH_TONGLING","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"淮北","city_code":"AH_HUAIBEI","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宣城","city_code":"AH_XUANCHENG","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"池州","city_code":"AH_CHIZHOU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * NX : {"province":"宁夏","province_code":"NX","citys":[{"city_name":"银川","city_code":"NX_YINCHUAN","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吴忠","city_code":"NX_WUZHONG","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"石嘴山","city_code":"NX_SHIZUISHAN","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"固原","city_code":"NX_GUYUAN","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"中卫","city_code":"NX_ZHONGWEI","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * NMG : {"province":"内蒙古","province_code":"NMG","citys":[{"city_name":"呼和浩特","city_code":"NMG_HUHEHAOTE","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"包头","city_code":"NMG_BAOTOU","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"兴安","city_code":"NMG_XINGAN","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"准格尔","city_code":"NMG_ZHUNGEER","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"赤峰","city_code":"NMG_CHIFENG","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"锡林郭勒","city_code":"NMG_XILINGUOLE","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阿拉善","city_code":"NMG_ALASHAN","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"通辽","city_code":"NMG_TONGLIAO","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鄂尔多斯","city_code":"NMG_EERDUOSI","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乌兰察布","city_code":"NMG_WULANCHABU","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"呼伦贝尔","city_code":"NMG_HULUNBEIER","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"巴彦淖尔","city_code":"NMG_BAYANNAOER","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乌海","city_code":"NMG_WUHAI","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * CQ : {"province":"重庆","province_code":"CQ","citys":[{"city_name":"重庆","city_code":"CQ","abbr":"渝","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * JX : {"province":"江西","province_code":"JX","citys":[{"city_name":"南昌","city_code":"JX_NANCHANG","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"赣州","city_code":"JX_GANZHOU","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"萍乡","city_code":"JX_PINGXIANG","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"九江","city_code":"JX_JIUJIANG","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鹰潭","city_code":"JX_YINGTAN","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"上饶","city_code":"JX_SHANGRAO","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"景德镇","city_code":"JX_JINGDEZHEN","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吉安","city_code":"JX_JIAN","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"新余","city_code":"JX_XINYU","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜春","city_code":"JX_YICHUN_J","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"抚州","city_code":"JX_FU3ZHOU","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         * TJ : {"province":"天津","province_code":"TJ","citys":[{"city_name":"天津","city_code":"TJ","abbr":"津","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]}
         */

        private BJBean BJ;
        private SHBean SH;
        private SCBean SC;
        private ZJBean ZJ;
        private FJBean FJ;
        private JLBean JL;
        private LNBean LN;
        private SDBean SD;
        private HNBean HN;
        private JSBean JS;
        private HUNBean HUN;
        private SXBean SX;
        private GDBean GD;
        private FBBean FB;
        private HANBean HAN;
        private GZBean GZ;
        private AHBean AH;
        private NXBean NX;
        private NMGBean NMG;
        private CQBean CQ;
        private JXBean JX;
        private TJBean TJ;

        public BJBean getBJ() {
            return BJ;
        }

        public void setBJ(BJBean BJ) {
            this.BJ = BJ;
        }

        public SHBean getSH() {
            return SH;
        }

        public void setSH(SHBean SH) {
            this.SH = SH;
        }

        public SCBean getSC() {
            return SC;
        }

        public void setSC(SCBean SC) {
            this.SC = SC;
        }

        public ZJBean getZJ() {
            return ZJ;
        }

        public void setZJ(ZJBean ZJ) {
            this.ZJ = ZJ;
        }

        public FJBean getFJ() {
            return FJ;
        }

        public void setFJ(FJBean FJ) {
            this.FJ = FJ;
        }

        public JLBean getJL() {
            return JL;
        }

        public void setJL(JLBean JL) {
            this.JL = JL;
        }

        public LNBean getLN() {
            return LN;
        }

        public void setLN(LNBean LN) {
            this.LN = LN;
        }

        public SDBean getSD() {
            return SD;
        }

        public void setSD(SDBean SD) {
            this.SD = SD;
        }

        public HNBean getHN() {
            return HN;
        }

        public void setHN(HNBean HN) {
            this.HN = HN;
        }

        public JSBean getJS() {
            return JS;
        }

        public void setJS(JSBean JS) {
            this.JS = JS;
        }

        public HUNBean getHUN() {
            return HUN;
        }

        public void setHUN(HUNBean HUN) {
            this.HUN = HUN;
        }

        public SXBean getSX() {
            return SX;
        }

        public void setSX(SXBean SX) {
            this.SX = SX;
        }

        public GDBean getGD() {
            return GD;
        }

        public void setGD(GDBean GD) {
            this.GD = GD;
        }

        public FBBean getFB() {
            return FB;
        }

        public void setFB(FBBean FB) {
            this.FB = FB;
        }

        public HANBean getHAN() {
            return HAN;
        }

        public void setHAN(HANBean HAN) {
            this.HAN = HAN;
        }

        public GZBean getGZ() {
            return GZ;
        }

        public void setGZ(GZBean GZ) {
            this.GZ = GZ;
        }

        public AHBean getAH() {
            return AH;
        }

        public void setAH(AHBean AH) {
            this.AH = AH;
        }

        public NXBean getNX() {
            return NX;
        }

        public void setNX(NXBean NX) {
            this.NX = NX;
        }

        public NMGBean getNMG() {
            return NMG;
        }

        public void setNMG(NMGBean NMG) {
            this.NMG = NMG;
        }

        public CQBean getCQ() {
            return CQ;
        }

        public void setCQ(CQBean CQ) {
            this.CQ = CQ;
        }

        public JXBean getJX() {
            return JX;
        }

        public void setJX(JXBean JX) {
            this.JX = JX;
        }

        public TJBean getTJ() {
            return TJ;
        }

        public void setTJ(TJBean TJ) {
            this.TJ = TJ;
        }


        public static class BJBean {
            /**
             * province : 北京
             * province_code : BJ
             * citys : [{"city_name":"北京","city_code":"BJ","abbr":"京","engine":"1","engineno":"0","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBean> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBean> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBean> citys) {
                this.citys = citys;
            }

            public static class CitysBean {
                /**
                 * city_name : 北京
                 * city_code : BJ
                 * abbr : 京
                 * engine : 1
                 * engineno : 0
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class SHBean {
            /**
             * province : 上海
             * province_code : SH
             * citys : [{"city_name":"上海","city_code":"SH","abbr":"沪","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanX {
                /**
                 * city_name : 上海
                 * city_code : SH
                 * abbr : 沪
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class SCBean {
            /**
             * province : 四川
             * province_code : SC
             * citys : [{"city_name":"成都","city_code":"SC_CD","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"双流县","city_code":"SC_SHUANGLIUXIAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"德阳","city_code":"SC_DEYANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"绵阳","city_code":"SC_MIANYANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乐山","city_code":"SC_LESHAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"自贡","city_code":"SC_ZIGONG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泸州","city_code":"SC_LUZHOU","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜宾","city_code":"SC_YIBIN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南充","city_code":"SC_NANCHONG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"攀枝花","city_code":"SC_PANZHIHUA","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"广元","city_code":"SC_GUANGYUAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"遂宁","city_code":"SC_SUINING","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"内江","city_code":"SC_NEIJIANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"资阳","city_code":"SC_ZIYANG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"达州","city_code":"SC_DAZHOU","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"眉山","city_code":"SC_MEISHAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"雅安","city_code":"SC_YAAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"巴中","city_code":"SC_BAZHONG","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"广安","city_code":"SC_GUANGAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阿坝","city_code":"SC_ABA","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"凉山","city_code":"SC_LIANGSHAN","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"甘孜","city_code":"SC_GANZI","abbr":"川","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXX {
                /**
                 * city_name : 成都
                 * city_code : SC_CD
                 * abbr : 川
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class ZJBean {
            /**
             * province : 浙江
             * province_code : ZJ
             * citys : [{"city_name":"杭州","city_code":"ZJ_HZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宁波","city_code":"ZJ_NB","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"温州","city_code":"ZJ_WZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"义乌","city_code":"ZJ_YW","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"台州","city_code":"ZJ_TZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"慈溪","city_code":"ZJ_CX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"余姚","city_code":"ZJ_YY","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"永康","city_code":"ZJ_YK","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乐清","city_code":"ZJ_YQ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"绍兴县","city_code":"ZJ_SXX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"瑞安","city_code":"ZJ_RA","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"嘉兴","city_code":"ZJ_JX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"金华","city_code":"ZJ_JH","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"绍兴","city_code":"ZJ_SX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"温岭","city_code":"ZJ_WL","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"桐乡","city_code":"ZJ_TX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"海宁","city_code":"ZJ_HN","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"诸暨","city_code":"ZJ_ZJ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"玉环县","city_code":"ZJ_YHX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"上虞","city_code":"ZJ_SY","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"湖州","city_code":"ZJ_HUZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"丽水","city_code":"ZJ_LS","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"衢州","city_code":"ZJ_QZ","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"舟山","city_code":"ZJ_ZS","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"临海","city_code":"ZJ_LH","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"平湖","city_code":"ZJ_PH","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"长兴县","city_code":"ZJ_CXX","abbr":"浙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXX {
                /**
                 * city_name : 杭州
                 * city_code : ZJ_HZ
                 * abbr : 浙
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class FJBean {
            /**
             * province : 福建
             * province_code : FJ
             * citys : [{"city_name":"厦门","city_code":"FJ_XM","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"福州","city_code":"FJ_FU1ZHOU","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泉州","city_code":"FJ_QUANZHOU","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"晋江","city_code":"FJ_JINJIANG","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"石狮","city_code":"FJ_SHISHI","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"莆田","city_code":"FJ_FUTIAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"漳州","city_code":"FJ_ZHANGZHOU","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南安","city_code":"FJ_NANAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"三明","city_code":"FJ_SANMING","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"龙岩","city_code":"FJ_LONGYAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南平","city_code":"FJ_NANPING","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宁德","city_code":"FJ_NINGDE","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"福清","city_code":"FJ_FUQING","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"惠安县","city_code":"FJ_HUIANXIAN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"厦门","city_code":"FJ_XIAMEN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":null},{"city_name":"厦门","city_code":"FJ_XIAMEN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":null},{"city_name":"厦门","city_code":"FJ_XIAMEN","abbr":"闽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":null}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXX {
                /**
                 * city_name : 厦门
                 * city_code : FJ_XM
                 * abbr : 闽
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class JLBean {
            /**
             * province : 吉林
             * province_code : JL
             * citys : [{"city_name":"吉林","city_code":"JL","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"长春","city_code":"JL_CHANGCHUN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"四平","city_code":"JL_SIPING","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"通化","city_code":"JL_TONGHUA","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"白山","city_code":"JL_BAISHAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"辽源","city_code":"JL_LIAOYUAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"松原","city_code":"JL_SONGYUAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"白城","city_code":"JL_BAICHENG","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"延边","city_code":"JL_YANBIAN","abbr":"吉","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXX {
                /**
                 * city_name : 吉林
                 * city_code : JL
                 * abbr : 吉
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class LNBean {
            /**
             * province : 辽宁
             * province_code : LN
             * citys : [{"city_name":"沈阳","city_code":"LN_SY","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"锦州","city_code":"LN_JZ","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"营口","city_code":"LN_YK","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"葫芦岛","city_code":"LN_HLD","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"大连","city_code":"LN_DL","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鞍山","city_code":"LN_AS","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"抚顺","city_code":"LN_FS","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"丹东","city_code":"LN_DD","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阜新","city_code":"LN_FX","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"辽阳","city_code":"LN_LY","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铁岭","city_code":"LN_TL","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"朝阳","city_code":"LN_CY","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"盘锦","city_code":"LN_PANJIN","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"瓦房店","city_code":"LN_WAFANGDIAN","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"本溪","city_code":"LN_BENXI","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"海城","city_code":"LN_HAICHENG","abbr":"辽","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXX {
                /**
                 * city_name : 沈阳
                 * city_code : LN_SY
                 * abbr : 辽
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class SDBean {
            /**
             * province : 山东
             * province_code : SD
             * citys : [{"city_name":"淄博","city_code":"SD_ZB","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"青岛","city_code":"SD_QD","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"威海","city_code":"SD_WH","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"枣庄","city_code":"SD_ZZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"日照","city_code":"SD_RZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"临沂","city_code":"SD_LY","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"莱芜","city_code":"SD_LW","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"菏泽","city_code":"SD_HZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"潍坊","city_code":"SD_WF","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"聊城","city_code":"SD_LC","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"济宁","city_code":"SD_JN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"滨州","city_code":"SD_BZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"德州","city_code":"SD_DZ","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"东营","city_code":"SD_DY","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泰安","city_code":"SD_TA","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"烟台","city_code":"SD_YT","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"济南","city_code":"SD_JINAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"滕州","city_code":"SD_TENGZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"荣成","city_code":"SD_RONGCHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"莱州","city_code":"SD_LAIZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"诸城","city_code":"SD_ZHUCHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"蓬莱","city_code":"SD_PENGLAI","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"龙口","city_code":"SD_LONGKOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"寿光","city_code":"SD_SHOUGUANG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"章丘","city_code":"SD_ZHANGQIU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"胶州","city_code":"SD_JIAOZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"平度","city_code":"SD_PINGDU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"招远","city_code":"SD_ZHAOYUAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"文登","city_code":"SD_WENDENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"邹城","city_code":"SD_ZOUCHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"兖州","city_code":"SD_YANZHOU","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乳山","city_code":"SD_RUSHAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"邹平县","city_code":"SD_ZOUPINGXIAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"新泰","city_code":"SD_XINTAI","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"肥城","city_code":"SD_FEICHENG","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"胶南","city_code":"SD_JIAONAN","abbr":"鲁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXX {
                /**
                 * city_name : 淄博
                 * city_code : SD_ZB
                 * abbr : 鲁
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class HNBean {
            /**
             * province : 河南
             * province_code : HN
             * citys : [{"city_name":"郑州","city_code":"HN_ZZ","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"洛阳","city_code":"HN_LY","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"许昌","city_code":"HN_XC","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"平顶山","city_code":"HN_PDS","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"驻马店","city_code":"HN_ZMD","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鹤壁","city_code":"HN_HB","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"焦作","city_code":"HN_JZ","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"三门峡","city_code":"HN_SMX","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"商丘","city_code":"HN_SQ","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"济源","city_code":"HN_JY","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"新乡","city_code":"HN_XINXIANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"巩义","city_code":"HN_GONGYI","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"安阳","city_code":"HN_ANYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南阳","city_code":"HN_NANYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"开封","city_code":"HN_KAIFENG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"濮阳","city_code":"HN_PUYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"周口","city_code":"HN_ZHOUKOU","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"信阳","city_code":"HN_XINYANG","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"漯河","city_code":"HN_LEIHE","abbr":"豫","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXX {
                /**
                 * city_name : 郑州
                 * city_code : HN_ZZ
                 * abbr : 豫
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class JSBean {
            /**
             * province : 江苏
             * province_code : JS
             * citys : [{"city_name":"南京","city_code":"JS_NJ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"徐州","city_code":"JS_XZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"常州","city_code":"JS_CZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"苏州","city_code":"JS_SZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"南通","city_code":"JS_NT","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"连云港","city_code":"JS_LYG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"镇江","city_code":"JS_ZJ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宿迁","city_code":"JS_SQ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"扬州","city_code":"JS_YZ","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"无锡","city_code":"JS_WUXI","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"张家港","city_code":"JS_ZHANGJIAGANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"江阴","city_code":"JS_JIANGYIN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜兴","city_code":"JS_YIXING","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"盐城","city_code":"JS_YANCHENG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"昆山","city_code":"JS_KUNSHAN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"常熟","city_code":"JS_CHANGSHU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"江都","city_code":"JS_JIANGDOU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"丹阳","city_code":"JS_DANYANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"太仓","city_code":"JS_TAICANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"溧阳","city_code":"JS_LIYANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"海门","city_code":"JS_HAIMEN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"启东","city_code":"JS_QIDONG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"通州","city_code":"JS_TONGZHOU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泰州","city_code":"JS_TAI4ZHOU","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"淮安","city_code":"JS_HUAIAN","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吴江","city_code":"JS_WUJIANG","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"泰兴","city_code":"JS_TAIXING","abbr":"苏","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXX {
                /**
                 * city_name : 南京
                 * city_code : JS_NJ
                 * abbr : 苏
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class HUNBean {
            /**
             * province : 湖南
             * province_code : HUN
             * citys : [{"city_name":"长沙","city_code":"HUN_CS","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"衡阳","city_code":"HUN_HY","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"郴州","city_code":"HUN_CHENZHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"株洲","city_code":"HUN_ZHUZHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"湘潭","city_code":"HUN_XIANGTAN","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"常德","city_code":"HUN_CHANGDE","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"岳阳","city_code":"HUN_YUEYANG","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"益阳","city_code":"HUN_YIYANG","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"邵阳","city_code":"HUN_SHAOYANG","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"怀化","city_code":"HUN_HUAIHUA","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"永州","city_code":"HUN_YONGZHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"娄底","city_code":"HUN_LOUDI","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"张家界","city_code":"HUN_ZHANGJIAJIE","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吉首","city_code":"HUN_JISHOU","abbr":"湘","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXX {
                /**
                 * city_name : 长沙
                 * city_code : HUN_CS
                 * abbr : 湘
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class SXBean {
            /**
             * province : 陕西
             * province_code : SX
             * citys : [{"city_name":"西安","city_code":"SX_XA","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"咸阳","city_code":"SX_XY","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"渭南","city_code":"SX_WN","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"安康","city_code":"SX_AK","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"延安","city_code":"SX_YA","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宝鸡","city_code":"SX_BAOJI","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"1"},{"city_name":"汉中","city_code":"SX_HANZHONG","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"榆林","city_code":"SX_YU2LIN","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铜川","city_code":"SX_TONGCHUAN","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"商洛","city_code":"SX_SHANGLUO","abbr":"陕","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXX {
                /**
                 * city_name : 西安
                 * city_code : SX_XA
                 * abbr : 陕
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class GDBean {
            /**
             * province : 广东
             * province_code : GD
             * citys : [{"city_name":"深圳","city_code":"GD_SZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"广州","city_code":"GD_GZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"东莞","city_code":"GD_DG","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"佛山","city_code":"GD_FS","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"中山","city_code":"GD_ZS","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"汕头","city_code":"GD_ST","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"珠海","city_code":"GD_ZH","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"江门","city_code":"GD_JM","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"揭阳","city_code":"GD_JY","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"惠州","city_code":"GD_HZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"潮州","city_code":"GD_CZ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"肇庆","city_code":"GD_ZQ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阳江","city_code":"GD_YJ","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"湛江","city_code":"GD_ZHANJIANG","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"韶关","city_code":"GD_SHAOGUAN","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"茂名","city_code":"GD_MAOMING","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"清远","city_code":"GD_QINGYUAN","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"梅州","city_code":"GD_MEIZHOU","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"河源","city_code":"GD_HEYUAN","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"增城","city_code":"GD_ZENGCHENG","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"云浮","city_code":"GD_YUNFU","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"汕尾","city_code":"GD_SHANWEI","abbr":"粤","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXX {
                /**
                 * city_name : 深圳
                 * city_code : GD_SZ
                 * abbr : 粤
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class FBBean {
            /**
             * province : 湖北
             * province_code : FB
             * citys : [{"city_name":"武汉","city_code":"FB_WH","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜昌","city_code":"FB_YICHANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"荆州","city_code":"FB_JINGZHOU","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"襄樊","city_code":"FB_XIANGFAN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黄冈","city_code":"FB_HUANGGANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"十堰","city_code":"FB_SHIYAN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黄石","city_code":"FB_HUANGSHI","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"随州","city_code":"FB_SUIZHOU","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"荆门","city_code":"FB_JINGMEN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"孝感","city_code":"FB_XIAOGAN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鄂州","city_code":"FB_EZHOU","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"咸宁","city_code":"FB_XIANNING","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"恩施","city_code":"FB_ENSHI","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"神农架","city_code":"FB_SHENNONGJIA","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"潜江","city_code":"FB_QIANJIANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"天门","city_code":"FB_TIANMEN","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"仙桃","city_code":"FB_XIANTAO","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"襄阳","city_code":"FB_XIANGYANG","abbr":"鄂","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXXX {
                /**
                 * city_name : 武汉
                 * city_code : FB_WH
                 * abbr : 鄂
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class HANBean {
            /**
             * province : 海南
             * province_code : HAN
             * citys : [{"city_name":"海口","city_code":"HAN_HAIKOU","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"三亚","city_code":"HAN_SANYA","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"陵水","city_code":"HAN_LINGSHUI","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"白沙","city_code":"HAN_BAISHA","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"琼海","city_code":"HAN_QIONGHAI","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"琼中","city_code":"HAN_QIONGZHONG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"澄迈县","city_code":"HAN_CHENGMAIXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"昌江","city_code":"HAN_CHANGJIANG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"文昌","city_code":"HAN_WENCHANG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"屯昌县","city_code":"HAN_TUNCHANGXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"定安县","city_code":"HAN_DINGANXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"儋州","city_code":"HAN_DANZHOU","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"保亭","city_code":"HAN_BAOTING","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"五指山","city_code":"HAN_WUZHISHAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乐东","city_code":"HAN_LEDONG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"临高县","city_code":"HAN_LINGAOXIAN","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"东方","city_code":"HAN_DONGFANG","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"万宁","city_code":"HAN_WANNING","abbr":"琼","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXXXX {
                /**
                 * city_name : 海口
                 * city_code : HAN_HAIKOU
                 * abbr : 琼
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class GZBean {
            /**
             * province : 贵州
             * province_code : GZ
             * citys : [{"city_name":"贵阳","city_code":"GZ_GUIYANG","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"遵义","city_code":"GZ_ZUNYI","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"毕节","city_code":"GZ_BIJIE","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黔东南","city_code":"GZ_QIANDONGNAN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"六盘水","city_code":"GZ_LIUPANSHUI","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"安顺","city_code":"GZ_ANSHUN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铜仁","city_code":"GZ_TONGREN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黔南","city_code":"GZ_QIANNAN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黔西南","city_code":"GZ_QIANXINAN","abbr":"贵","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXXXXX {
                /**
                 * city_name : 贵阳
                 * city_code : GZ_GUIYANG
                 * abbr : 贵
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class AHBean {
            /**
             * province : 安徽
             * province_code : AH
             * citys : [{"city_name":"芜湖","city_code":"AH_WUHU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"黄山","city_code":"AH_HUANGSHAN","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"蚌埠","city_code":"AH_BENGBU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"亳州","city_code":"AH_BOZHOU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"铜陵","city_code":"AH_TONGLING","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"淮北","city_code":"AH_HUAIBEI","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宣城","city_code":"AH_XUANCHENG","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"池州","city_code":"AH_CHIZHOU","abbr":"皖","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXXXXXX {
                /**
                 * city_name : 芜湖
                 * city_code : AH_WUHU
                 * abbr : 皖
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class NXBean {
            /**
             * province : 宁夏
             * province_code : NX
             * citys : [{"city_name":"银川","city_code":"NX_YINCHUAN","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吴忠","city_code":"NX_WUZHONG","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"石嘴山","city_code":"NX_SHIZUISHAN","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"固原","city_code":"NX_GUYUAN","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"中卫","city_code":"NX_ZHONGWEI","abbr":"宁","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXXXXXXX {
                /**
                 * city_name : 银川
                 * city_code : NX_YINCHUAN
                 * abbr : 宁
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class NMGBean {
            /**
             * province : 内蒙古
             * province_code : NMG
             * citys : [{"city_name":"呼和浩特","city_code":"NMG_HUHEHAOTE","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"包头","city_code":"NMG_BAOTOU","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"兴安","city_code":"NMG_XINGAN","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"准格尔","city_code":"NMG_ZHUNGEER","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"赤峰","city_code":"NMG_CHIFENG","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"锡林郭勒","city_code":"NMG_XILINGUOLE","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"阿拉善","city_code":"NMG_ALASHAN","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"通辽","city_code":"NMG_TONGLIAO","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鄂尔多斯","city_code":"NMG_EERDUOSI","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乌兰察布","city_code":"NMG_WULANCHABU","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"呼伦贝尔","city_code":"NMG_HULUNBEIER","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"巴彦淖尔","city_code":"NMG_BAYANNAOER","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"乌海","city_code":"NMG_WUHAI","abbr":"蒙","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXXXXXXXX {
                /**
                 * city_name : 呼和浩特
                 * city_code : NMG_HUHEHAOTE
                 * abbr : 蒙
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class CQBean {
            /**
             * province : 重庆
             * province_code : CQ
             * citys : [{"city_name":"重庆","city_code":"CQ","abbr":"渝","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXXXXXXXXX {
                /**
                 * city_name : 重庆
                 * city_code : CQ
                 * abbr : 渝
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class JXBean {
            /**
             * province : 江西
             * province_code : JX
             * citys : [{"city_name":"南昌","city_code":"JX_NANCHANG","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"赣州","city_code":"JX_GANZHOU","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"萍乡","city_code":"JX_PINGXIANG","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"九江","city_code":"JX_JIUJIANG","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"鹰潭","city_code":"JX_YINGTAN","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"上饶","city_code":"JX_SHANGRAO","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"景德镇","city_code":"JX_JINGDEZHEN","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"吉安","city_code":"JX_JIAN","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"新余","city_code":"JX_XINYU","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"宜春","city_code":"JX_YICHUN_J","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"},{"city_name":"抚州","city_code":"JX_FU3ZHOU","abbr":"赣","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXXXXXXXXXX {
                /**
                 * city_name : 南昌
                 * city_code : JX_NANCHANG
                 * abbr : 赣
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }

        public static class TJBean {
            /**
             * province : 天津
             * province_code : TJ
             * citys : [{"city_name":"天津","city_code":"TJ","abbr":"津","engine":"1","engineno":"6","classa":"1","class":"1","classno":"6","regist":"0","registno":"0"}]
             */

            private String province;
            private String province_code;
            private List<CitysBeanXXXXXXXXXXXXXXXXXXXXX> citys;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getProvince_code() {
                return province_code;
            }

            public void setProvince_code(String province_code) {
                this.province_code = province_code;
            }

            public List<CitysBeanXXXXXXXXXXXXXXXXXXXXX> getCitys() {
                return citys;
            }

            public void setCitys(List<CitysBeanXXXXXXXXXXXXXXXXXXXXX> citys) {
                this.citys = citys;
            }

            public static class CitysBeanXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * city_name : 天津
                 * city_code : TJ
                 * abbr : 津
                 * engine : 1
                 * engineno : 6
                 * classa : 1
                 * class : 1
                 * classno : 6
                 * regist : 0
                 * registno : 0
                 */

                private String city_name;
                private String city_code;
                private String abbr;
                private String engine;
                private String engineno;
                private String classa;
                @SerializedName("class")
                private String classX;
                private String classno;
                private String regist;
                private String registno;

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getAbbr() {
                    return abbr;
                }

                public void setAbbr(String abbr) {
                    this.abbr = abbr;
                }

                public String getEngine() {
                    return engine;
                }

                public void setEngine(String engine) {
                    this.engine = engine;
                }

                public String getEngineno() {
                    return engineno;
                }

                public void setEngineno(String engineno) {
                    this.engineno = engineno;
                }

                public String getClassa() {
                    return classa;
                }

                public void setClassa(String classa) {
                    this.classa = classa;
                }

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassno() {
                    return classno;
                }

                public void setClassno(String classno) {
                    this.classno = classno;
                }

                public String getRegist() {
                    return regist;
                }

                public void setRegist(String regist) {
                    this.regist = regist;
                }

                public String getRegistno() {
                    return registno;
                }

                public void setRegistno(String registno) {
                    this.registno = registno;
                }
            }
        }
    }
}

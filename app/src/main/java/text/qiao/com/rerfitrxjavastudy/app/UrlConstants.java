package text.qiao.com.rerfitrxjavastudy.app;

/**
 * @project：RerfitRxJavaStudy
 * @fileName UrlConstants
 * @author：乔少聪
 * @date：2018/12/12 10:34
 * @describe：接口常量类
 */

public interface UrlConstants {


    /*--------------------------------------聚合数据 -----------------------------------------------------*/

    String BASE_JVHE="http://v.juhe.cn/";
    /**
     * 聚合数据 新闻头条
     */
    String APPKEY_TOUTIAO = "toutiao/index";
    /**
     * 聚合数据 笑话大全
     */
    String APPKEY_XIAOHUA = "joke/content/list.php";
    /**
     * 聚合数据 微信精选
     */
    String APPKEY_WEIXIN = "weixin/query";
    /**
     * 聚合数据 获取支持城市参数接口
     */
    String APPKEY_WZCITY = "wz/citys";
    /**
     * 聚合数据 菜谱大全 分类标签列表
     */
    String APPKEY_CAIPU = "cook/category";
    /**
     * 聚合数据 菜谱大全
     */
    String APPKEY_CAIPU_DETAILS = "cook/query.php";
}

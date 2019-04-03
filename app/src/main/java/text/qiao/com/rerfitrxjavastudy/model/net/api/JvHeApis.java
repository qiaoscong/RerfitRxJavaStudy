package text.qiao.com.rerfitrxjavastudy.model.net.api;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import text.qiao.com.rerfitrxjavastudy.app.UrlConstants;
import text.qiao.com.rerfitrxjavastudy.model.entity.WeiXinJingXuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.model.entity.caipu.CaiPuQuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.weizhang.WZCity;

/**
 * @project：RerfitRxJavaStudy
 * @fileName JvHeApis
 * @author：乔少聪
 * @date：2018/12/12 10:22
 * @describe： 聚合数据
 */

public interface JvHeApis {


    /**
     *  聚合数据 新闻头条
     * @param appkey 	应用APPKEY
     * @param type 类型,,top(头条，默认),shehui(社会),guonei(国内),guoji(国际),yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)
     * @return json
     */
    @FormUrlEncoded
    @POST(UrlConstants.APPKEY_TOUTIAO)
    Flowable<XinWen> getTouTixao(@Field("key") String appkey, @Field("type") String type);

    /**
     *
     * @param appkey 应用APPKEY
     * @param sort 类型，desc:指定时间之前发布的，asc:指定时间之后发布的
     * @param page 	当前页数,默认1
     * @param pagesize 每次返回条数,默认1,最大20
     * @param time 10位时间戳
     * @return json
     */
    @FormUrlEncoded
    @POST(UrlConstants.APPKEY_XIAOHUA)
    Flowable<XiaoHua> getXiaoHua(@Field("key") String appkey, @Field("sort") String sort, @Field("page") int page, @Field("pagesize") int pagesize, @Field("time") String time);

    /**
     *  聚合数据 微信精选
     * @param appkey
     * @param pno 当前页数，默认1
     * @param ps 每页返回条数，最大50，默认20
     * @param dtype 返回数据的格式,xml或json，默认json
     * @return
     */
    @FormUrlEncoded
    @POST(UrlConstants.APPKEY_WEIXIN)
    Flowable<WeiXinJingXuan> getWeiXin(@Field("key") String appkey, @Field("pno") String pno,@Field("ps") String ps,@Field("dtype") String dtype);


    /**
     *   获取支持城市参数接口
     * @param appkey
     * @param province 默认全部，省份简写，如：ZJ、JS
     * @param dtype
     * @param format
     * @param callback
     * @return
     */
    @FormUrlEncoded
    @POST(UrlConstants.APPKEY_WZCITY)
    Flowable<WZCity> getWZCity(@Field("key") String appkey, @Field("province") String province, @Field("dtype") String dtype, @Field("format") String format, @Field("callback") String callback);

    /**
     *  菜谱大全
     * @param appkey
     * @param parentid 分类ID，默认全部
     * @param dtype  	返回数据的格式,xml或json，默认json
     * @return
     */
    @FormUrlEncoded
    @POST(UrlConstants.APPKEY_CAIPU)
    Flowable<CaiPuQuan> getCaiPuQuan(@Field("key") String appkey, @Field("parentid") String parentid, @Field("dtype") String dtype);
}

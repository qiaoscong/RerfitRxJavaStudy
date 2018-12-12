package text.qiao.com.rerfitrxjavastudy.model.net.api;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import text.qiao.com.rerfitrxjavastudy.app.UrlConstants;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;

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
    @POST(UrlConstants.APPKEY_TOUTIAO)
    Flowable<XiaoHua> getXiaoHua(@Field("key") String appkey, @Field("sort") String sort, @Field("page") int page, @Field("pagesize") int pagesize, @Field("time") String time);
}

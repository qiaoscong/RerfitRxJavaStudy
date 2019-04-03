package text.qiao.com.rerfitrxjavastudy.model.net;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import text.qiao.com.rerfitrxjavastudy.model.entity.WeiXinJingXuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.model.entity.caipu.CaiPuQuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.weizhang.WZCity;

/**
 * @project：RerfitRxJavaStudy
 * @fileName HttpHelper
 * @author：乔少聪
 * @date：2018/12/12 10:51
 * @describe：
 */

public interface HttpHelper {

    Flowable<XinWen> getTouTixao(String appkey, String type);

    Flowable<XiaoHua> getXiaoHua(String appkey, String sort,int page,int pagesize,String time);
    Flowable<WeiXinJingXuan> getWeiXin( String appkey,  String pno,  String ps,  String dtype);

    Flowable<WZCity> getWZCity(String appkey, String province, String dtype, String format, String callback);
    Flowable<CaiPuQuan> getCaiPuQuan( String appkey,  String parentid,  String dtype);
}

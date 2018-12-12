package text.qiao.com.rerfitrxjavastudy.model.net;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;

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

}

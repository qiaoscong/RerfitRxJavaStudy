package text.qiao.com.rerfitrxjavastudy.model.net;

import javax.inject.Inject;

import io.reactivex.Flowable;
import text.qiao.com.rerfitrxjavastudy.model.entity.WeiXinJingXuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.model.entity.caipu.CaiPuQuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.weizhang.WZCity;
import text.qiao.com.rerfitrxjavastudy.model.net.api.JvHeApis;

/**
 * @project：RerfitRxJavaStudy
 * @fileName RefitertHelper
 * @author：乔少聪
 * @date：2018/12/12 10:54
 * @describe：
 */

public class RefitertHelper implements HttpHelper {
    private JvHeApis mJvHeApis;

    @Inject
    public RefitertHelper(JvHeApis mHttpHelper) {
        this.mJvHeApis = mHttpHelper;
    }

    @Override
    public Flowable<XinWen> getTouTixao(String appkey, String type) {
        return mJvHeApis.getTouTixao(appkey, type);
    }

    @Override
    public Flowable<XiaoHua> getXiaoHua(String appkey, String sort, int page, int pagesize, String time) {
        return mJvHeApis.getXiaoHua(appkey, sort, page, pagesize, time);
    }

    @Override
    public Flowable<WeiXinJingXuan> getWeiXin(String appkey, String pno, String ps, String dtype) {
        return mJvHeApis.getWeiXin(appkey, pno, ps, dtype);
    }

    @Override
    public Flowable<WZCity> getWZCity(String appkey, String province, String dtype, String format, String callback) {
        return mJvHeApis.getWZCity(appkey, province, dtype, format, callback);
    }

    @Override
    public Flowable<CaiPuQuan> getCaiPuQuan(String appkey, String parentid, String dtype) {
        return mJvHeApis.getCaiPuQuan(appkey, parentid, dtype);
    }


}

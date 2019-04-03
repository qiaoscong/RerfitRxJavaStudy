package text.qiao.com.rerfitrxjavastudy.model;

import javax.inject.Inject;

import io.reactivex.Flowable;
import text.qiao.com.rerfitrxjavastudy.model.entity.WeiXinJingXuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.model.entity.caipu.CaiPuQuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.weizhang.WZCity;
import text.qiao.com.rerfitrxjavastudy.model.net.HttpHelper;

/**
 * @project：RerfitRxJavaStudy
 * @fileName DataManager
 * @author：乔少聪
 * @date：2018/12/12 10:56
 * @describe： 数据管理类
 */

public class DataManager implements HttpHelper {
    private HttpHelper mHttpHelper;

    public DataManager(HttpHelper mHttpHelper) {
        this.mHttpHelper = mHttpHelper;
    }

    @Override
    public Flowable<XinWen> getTouTixao(String appkey, String type) {
        return mHttpHelper.getTouTixao(appkey, type);
    }

    @Override
    public Flowable<XiaoHua> getXiaoHua(String appkey, String sort, int page, int pagesize, String time) {
        return mHttpHelper.getXiaoHua(appkey, sort, page, pagesize, time);
    }

    @Override
    public Flowable<WeiXinJingXuan> getWeiXin(String appkey, String pno, String ps, String dtype) {
        return mHttpHelper.getWeiXin(appkey, pno, ps, dtype);
    }

    @Override
    public Flowable<WZCity> getWZCity(String appkey, String province, String dtype, String format, String callback) {
        return mHttpHelper.getWZCity(appkey, province, dtype, format, callback);
    }

    @Override
    public Flowable<CaiPuQuan> getCaiPuQuan(String appkey, String parentid, String dtype) {
        return mHttpHelper.getCaiPuQuan(appkey, parentid, dtype);
    }


}

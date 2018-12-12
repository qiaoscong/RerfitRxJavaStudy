package text.qiao.com.rerfitrxjavastudy.model;

import javax.inject.Inject;

import io.reactivex.Flowable;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
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
}

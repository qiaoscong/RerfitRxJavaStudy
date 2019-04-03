package text.qiao.com.rerfitrxjavastudy.base.contract;

import text.qiao.com.rerfitrxjavastudy.base.BasePresenter;
import text.qiao.com.rerfitrxjavastudy.base.BaseView;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.weizhang.WZCity;

/**
 * @project：RerfitRxJavaStudy
 * @fileName WeiZhangContract
 * @author：乔少聪
 * @date：2019/4/3 14:08
 * @describe：
 */
public interface WeiZhangContract {
    interface View extends BaseView {


        void showWZCityData(WZCity xiTongNews);

//        void showMoreXiaoHua(XiaoHua xiTongNews);

    }

    interface Presenter extends BasePresenter<View> {
        void getWZCityMessage(String appkey, String province, String dtype, String format, String callback);

//        void getXiaoHuaMoreMessage(String appkey, String sort, int page, int pagesize, String time);

    }
}

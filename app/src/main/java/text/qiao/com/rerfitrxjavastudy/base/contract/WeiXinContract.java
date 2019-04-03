package text.qiao.com.rerfitrxjavastudy.base.contract;

import text.qiao.com.rerfitrxjavastudy.base.BasePresenter;
import text.qiao.com.rerfitrxjavastudy.base.BaseView;
import text.qiao.com.rerfitrxjavastudy.model.entity.WeiXinJingXuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;

/**
 * @project：RerfitRxJavaStudy
 * @fileName WeiXinContract
 * @author：乔少聪
 * @date：2019/1/3 15:12
 * @describe：
 */

public interface WeiXinContract {
    interface View extends BaseView {


        void showWeiXinJingXuan(WeiXinJingXuan xiTongNews);

        void showMoreWeiXinJingXuan(WeiXinJingXuan xiTongNews);

    }

    interface Presenter extends BasePresenter<View> {
        void getWeiXinJingXuanMessage(String appkey, String pno, String ps, String dtype);

        void getWeiXinJingXuanMoreMessage(String appkey, String pno, String ps, String dtype);

    }
}

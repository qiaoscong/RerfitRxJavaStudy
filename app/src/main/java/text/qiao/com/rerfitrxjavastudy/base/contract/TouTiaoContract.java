package text.qiao.com.rerfitrxjavastudy.base.contract;

import text.qiao.com.rerfitrxjavastudy.base.BasePresenter;
import text.qiao.com.rerfitrxjavastudy.base.BaseView;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;

/**
 * @project：RerfitRxJavaStudy
 * @fileName TouTiaoContract
 * @author：乔少聪
 * @date：2019/1/2 11:14
 * @describe：
 */

public interface  TouTiaoContract {
    interface View extends BaseView {


        void showXinWen(XinWen xiTongNews);


    }

    interface Presenter extends BasePresenter<View> {

        void getXinWenMessage(String appkey,String type);

    }
}

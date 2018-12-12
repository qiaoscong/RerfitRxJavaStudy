package text.qiao.com.rerfitrxjavastudy.base.contract;

import text.qiao.com.rerfitrxjavastudy.base.BasePresenter;
import text.qiao.com.rerfitrxjavastudy.base.BaseView;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;

/**
 * @project：RerfitRxJavaStudy
 * @fileName MainContract
 * @author：乔少聪
 * @date：2018/12/12 15:25
 * @describe：
 */

public interface MainContract {
    interface View extends BaseView {


        void showXiaoHua(XinWen xiTongNews);


    }

    interface Presenter extends BasePresenter<View> {

        void getXiaoHuaMessage(String appkey,String type);

    }
}

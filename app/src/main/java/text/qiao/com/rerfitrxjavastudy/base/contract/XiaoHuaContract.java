package text.qiao.com.rerfitrxjavastudy.base.contract;

import retrofit2.http.Field;
import text.qiao.com.rerfitrxjavastudy.base.BasePresenter;
import text.qiao.com.rerfitrxjavastudy.base.BaseView;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;

/**
 * @project：RerfitRxJavaStudy
 * @fileName TouTiaoContract
 * @author：乔少聪
 * @date：2019/1/2 11:14
 * @describe：
 */

public interface XiaoHuaContract {
    interface View extends BaseView {


        void showXiaoHua(XiaoHua xiTongNews);

        void showMoreXiaoHua(XiaoHua xiTongNews);

    }

    interface Presenter extends BasePresenter<View> {
        void getXiaoHuaMessage(String appkey, String sort, int page, int pagesize, String time);

        void getXiaoHuaMoreMessage(String appkey, String sort, int page, int pagesize, String time);

    }
}

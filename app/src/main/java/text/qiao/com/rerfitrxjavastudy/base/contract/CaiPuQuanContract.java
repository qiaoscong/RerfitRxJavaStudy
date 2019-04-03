package text.qiao.com.rerfitrxjavastudy.base.contract;

import text.qiao.com.rerfitrxjavastudy.base.BasePresenter;
import text.qiao.com.rerfitrxjavastudy.base.BaseView;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.model.entity.caipu.CaiPuQuan;

/**
 * @project：RerfitRxJavaStudy
 * @fileName CaiPuQuanContract
 * @author：乔少聪
 * @date：2019/4/3 16:25
 * @describe：
 */
public interface CaiPuQuanContract {
    interface View extends BaseView {


        void showCaiPuQuan(CaiPuQuan xiTongNews);


    }

    interface Presenter extends BasePresenter<View> {

        void geCaiPuQuanMessage( String appkey,  String parentid,  String dtype);

    }
}

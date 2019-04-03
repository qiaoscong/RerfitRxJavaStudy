package text.qiao.com.rerfitrxjavastudy.presenter;

import javax.inject.Inject;

import text.qiao.com.rerfitrxjavastudy.base.RxPresenter;
import text.qiao.com.rerfitrxjavastudy.base.contract.TouTiaoContract;
import text.qiao.com.rerfitrxjavastudy.model.DataManager;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.util.RxUtil;
import text.qiao.com.rerfitrxjavastudy.weight.CommonSubscriber;

/**
 * @project：RerfitRxJavaStudy
 * @fileName TouTiaoPresenter
 * @author：乔少聪
 * @date：2019/1/2 11:17
 * @describe：
 */

public class TouTiaoPresenter extends RxPresenter<TouTiaoContract.View> implements TouTiaoContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public TouTiaoPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void getXinWenMessage(String appkey, String type) {
        addSubscribe(
                mDataManager.getTouTixao(appkey, type)
                        .compose(RxUtil.<XinWen>rxSchedulerHelper())
                        .compose(RxUtil.<XinWen>stringResult())
                        .subscribeWith(new CommonSubscriber<XinWen>(mView) {
                            @Override
                            public void onNext(XinWen xinWen) {
                                mView.showXinWen(xinWen);
                            }


                        })

        );
    }
}

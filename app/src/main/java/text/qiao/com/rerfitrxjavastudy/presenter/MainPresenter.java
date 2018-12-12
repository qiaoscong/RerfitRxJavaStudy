package text.qiao.com.rerfitrxjavastudy.presenter;

import javax.inject.Inject;

import text.qiao.com.rerfitrxjavastudy.base.RxPresenter;
import text.qiao.com.rerfitrxjavastudy.base.contract.MainContract;
import text.qiao.com.rerfitrxjavastudy.model.DataManager;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.util.RxUtil;
import text.qiao.com.rerfitrxjavastudy.weight.CommonSubscriber;

/**
 * @project：RerfitRxJavaStudy
 * @fileName MainPresenter
 * @author：乔少聪
 * @date：2018/12/12 15:17
 * @describe：
 */

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {

    private DataManager mDataManager;

    @Inject
    public MainPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void getXiaoHuaMessage(String appkey, String type) {

        addSubscribe(
                mDataManager.getTouTixao(appkey, type)
                        .compose(RxUtil.<XinWen>rxSchedulerHelper())
                        .compose(RxUtil.<XinWen>stringResult())
                        .subscribeWith(new CommonSubscriber<XinWen>(mView) {
                            @Override
                            public void onNext(XinWen xinWen) {
                                mView.showXiaoHua(xinWen);
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                            }
                        })

        );
    }
}

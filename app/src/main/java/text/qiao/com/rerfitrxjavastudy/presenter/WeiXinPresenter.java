package text.qiao.com.rerfitrxjavastudy.presenter;

import javax.inject.Inject;

import text.qiao.com.rerfitrxjavastudy.base.RxPresenter;
import text.qiao.com.rerfitrxjavastudy.base.contract.WeiXinContract;
import text.qiao.com.rerfitrxjavastudy.model.DataManager;
import text.qiao.com.rerfitrxjavastudy.model.entity.WeiXinJingXuan;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.util.RxUtil;
import text.qiao.com.rerfitrxjavastudy.weight.CommonSubscriber;

/**
 * @project：RerfitRxJavaStudy
 * @fileName WeiXinPresenter
 * @author：乔少聪
 * @date：2019/1/3 15:16
 * @describe：
 */

public class WeiXinPresenter extends RxPresenter<WeiXinContract.View> implements WeiXinContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public WeiXinPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void getWeiXinJingXuanMessage(String appkey, String pno, String ps, String dtype) {
        addSubscribe(
                mDataManager.getWeiXin(appkey, pno, ps, dtype)
                        .compose(RxUtil.<WeiXinJingXuan>rxSchedulerHelper())
                        .compose(RxUtil.<WeiXinJingXuan>stringResult())
                        .subscribeWith(new CommonSubscriber<WeiXinJingXuan>(mView) {
                            @Override
                            public void onNext(WeiXinJingXuan xinWen) {
                                mView.showWeiXinJingXuan(xinWen);
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                            }
                        })

        );
    }

    @Override
    public void getWeiXinJingXuanMoreMessage(String appkey, String pno, String ps, String dtype) {
        addSubscribe(
                mDataManager.getWeiXin(appkey, pno, ps, dtype)
                        .compose(RxUtil.<WeiXinJingXuan>rxSchedulerHelper())
                        .compose(RxUtil.<WeiXinJingXuan>stringResult())
                        .subscribeWith(new CommonSubscriber<WeiXinJingXuan>(mView) {
                            @Override
                            public void onNext(WeiXinJingXuan xinWen) {
                                mView.showMoreWeiXinJingXuan(xinWen);
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                            }
                        })

        );
    }
}

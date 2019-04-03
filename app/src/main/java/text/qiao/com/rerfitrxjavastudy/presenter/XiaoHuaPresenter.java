package text.qiao.com.rerfitrxjavastudy.presenter;

import javax.inject.Inject;

import text.qiao.com.rerfitrxjavastudy.base.RxPresenter;
import text.qiao.com.rerfitrxjavastudy.base.contract.XiaoHuaContract;
import text.qiao.com.rerfitrxjavastudy.model.DataManager;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.util.RxUtil;
import text.qiao.com.rerfitrxjavastudy.weight.CommonSubscriber;

/**
 * @project：RerfitRxJavaStudy
 * @fileName XiaoHuaPresenter
 * @author：乔少聪
 * @date：2019/1/2 16:26
 * @describe：
 */

public class XiaoHuaPresenter extends RxPresenter<XiaoHuaContract.View> implements XiaoHuaContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public XiaoHuaPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void getXiaoHuaMessage(String appkey, String sort, int page, int pagesize, String time) {
        addSubscribe(
                mDataManager.getXiaoHua(appkey, sort, page, pagesize, time)
                        .compose(RxUtil.<XiaoHua>rxSchedulerHelper())
                        .compose(RxUtil.<XiaoHua>stringResult())
                        .subscribeWith(new CommonSubscriber<XiaoHua>(mView) {
                            @Override
                            public void onNext(XiaoHua xinWen) {
                                mView.showXiaoHua(xinWen);
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                            }
                        })

        );
    }

    @Override
    public void getXiaoHuaMoreMessage(String appkey, String sort, int page, int pagesize, String time) {
        addSubscribe(
                mDataManager.getXiaoHua(appkey, sort, page, pagesize, time)
                        .compose(RxUtil.<XiaoHua>rxSchedulerHelper())
                        .compose(RxUtil.<XiaoHua>stringResult())
                        .subscribeWith(new CommonSubscriber<XiaoHua>(mView) {
                            @Override
                            public void onNext(XiaoHua xinWen) {
                                mView.showMoreXiaoHua(xinWen);
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                            }
                        })

        );
    }
}

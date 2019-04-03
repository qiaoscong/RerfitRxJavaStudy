package text.qiao.com.rerfitrxjavastudy.presenter;

import javax.inject.Inject;

import text.qiao.com.rerfitrxjavastudy.base.RxPresenter;
import text.qiao.com.rerfitrxjavastudy.base.contract.CaiPuQuanContract;
import text.qiao.com.rerfitrxjavastudy.model.DataManager;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.model.entity.caipu.CaiPuQuan;
import text.qiao.com.rerfitrxjavastudy.util.RxUtil;
import text.qiao.com.rerfitrxjavastudy.weight.CommonSubscriber;

/**
 * @project：RerfitRxJavaStudy
 * @fileName CaiPuQuanPresenter
 * @author：乔少聪
 * @date：2019/4/3 16:27
 * @describe：
 */
public class CaiPuQuanPresenter extends RxPresenter<CaiPuQuanContract.View> implements CaiPuQuanContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public CaiPuQuanPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void geCaiPuQuanMessage(String appkey, String parentid, String dtype) {
        addSubscribe(
                mDataManager.getCaiPuQuan(appkey, parentid, dtype)
                        .compose(RxUtil.<CaiPuQuan>rxSchedulerHelper())
                        .compose(RxUtil.<CaiPuQuan>stringResult())
                        .subscribeWith(new CommonSubscriber<CaiPuQuan>(mView) {
                            @Override
                            public void onNext(CaiPuQuan xinWen) {
                                mView.showCaiPuQuan(xinWen);
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                            }
                        })

        );
    }
}

package text.qiao.com.rerfitrxjavastudy.weight;

import android.text.TextUtils;



import io.reactivex.subscribers.ResourceSubscriber;
import retrofit2.HttpException;
import text.qiao.com.rerfitrxjavastudy.base.BaseView;
import text.qiao.com.rerfitrxjavastudy.model.net.exception.ApiException;
import text.qiao.com.utilslibrary.utils.log.LogUtil;

/**
 *
 * @author 乔少聪
 * @time 2019/1/2 9:50
 * @describe 网络请求
*/

public abstract class CommonSubscriber<T> extends ResourceSubscriber<T> {
    private BaseView mView;
    private String mErrorMsg;
    private boolean isShowErrorState = true;

    protected CommonSubscriber(BaseView view){
        this.mView = view;
    }

    protected CommonSubscriber(BaseView view, String errorMsg){
        this.mView = view;
        this.mErrorMsg = errorMsg;
    }

    protected CommonSubscriber(BaseView view, boolean isShowErrorState){
        this.mView = view;
        this.isShowErrorState = isShowErrorState;
    }

    protected CommonSubscriber(BaseView view, String errorMsg, boolean isShowErrorState){
        this.mView = view;
        this.mErrorMsg = errorMsg;
        this.isShowErrorState = isShowErrorState;
    }




    @Override
    public void onComplete() {

    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {
        if (mView == null) {
            return;
        }
        if (mErrorMsg != null && !TextUtils.isEmpty(mErrorMsg)) {
            mView.showErrorMsg(mErrorMsg);
        } else if (e instanceof ApiException) {
            mView.showErrorMsg(e.getMessage());
        } else if (e instanceof HttpException) {
            mView.showErrorMsg("当前网络不可用，请检查网络！");
        } else {
            mView.showErrorMsg("当前网络不可用，请检查网络！");
            LogUtil.e(e.toString());
        }
//        if (isShowErrorState) {
//            mView.stateError();
//        }
    }
}

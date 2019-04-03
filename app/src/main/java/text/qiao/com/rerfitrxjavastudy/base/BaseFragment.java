package text.qiao.com.rerfitrxjavastudy.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import javax.inject.Inject;

import text.qiao.com.rerfitrxjavastudy.app.MyApplication;
import text.qiao.com.rerfitrxjavastudy.di.component.DaggerFragmentComponent;
import text.qiao.com.rerfitrxjavastudy.di.component.FragmentComponent;
import text.qiao.com.rerfitrxjavastudy.di.module.FragmentModule;

/**
 * @project：RerfitRxJavaStudy
 * @fileName BaseFragment
 * @author：乔少聪
 * @date：2019/1/2 13:32
 * @describe：
 */

public abstract class BaseFragment<T extends BasePresenter> extends  SimpleFragment implements BaseView{
    @Inject
    protected T mPresenter;

    /**
     *  获取需要注入放入dragger
     * @return
     */
    protected FragmentComponent getFragmentComponent(){
        return DaggerFragmentComponent.builder()
                .myApplicationComponent(MyApplication.getMyApplicationComponent())
                .fragmentModule(new FragmentModule(this))
                .build();
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initInject();
        mPresenter.attachView(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        if(mPresenter!=null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    @Override
    public void stateError() {

    }

    @Override
    public void stateEmpty() {

    }

    @Override
    public void stateLoading() {

    }

    @Override
    public void stateMain() {

    }

    /**
     * dragger注入
     */

    protected abstract void initInject();
}

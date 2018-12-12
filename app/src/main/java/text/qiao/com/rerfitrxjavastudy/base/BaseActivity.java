package text.qiao.com.rerfitrxjavastudy.base;

import javax.inject.Inject;

import text.qiao.com.rerfitrxjavastudy.app.MyApplication;
import text.qiao.com.rerfitrxjavastudy.di.component.ActivityComponent;
import text.qiao.com.rerfitrxjavastudy.di.component.DaggerActivityComponent;
import text.qiao.com.rerfitrxjavastudy.di.module.ActivityModule;

/**
 * @project：RerfitRxJavaStudy
 * @fileName BaseActivity
 * @author：乔少聪
 * @date：2018/12/12 14:23
 * @describe：
 */

public abstract class BaseActivity<T extends BasePresenter> extends SimpleActivity implements BaseView {

    @Inject
    protected T mPresenter;

    protected ActivityComponent getActivityComponent(){
        return DaggerActivityComponent.builder().myApplicationComponent(MyApplication.getMyApplicationComponent())
                .activityModule(getActivityModule())
                .build();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    @Override
    protected void onViewCreated() {
        super.onViewCreated();
        initInject();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }
    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }

        super.onDestroy();
    }
}

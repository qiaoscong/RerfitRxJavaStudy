package text.qiao.com.rerfitrxjavastudy.di.component;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Component;
import text.qiao.com.rerfitrxjavastudy.di.module.ActivityModule;
import text.qiao.com.rerfitrxjavastudy.di.module.HttpModule;
import text.qiao.com.rerfitrxjavastudy.di.module.MyApplicationModule;
import text.qiao.com.rerfitrxjavastudy.di.scope.ActivityScope;
import text.qiao.com.rerfitrxjavastudy.view.MainActivity;
import text.qiao.com.rerfitrxjavastudy.view.activity.CaiPuActivity;
import text.qiao.com.rerfitrxjavastudy.view.activity.WeiXinActivity;
import text.qiao.com.rerfitrxjavastudy.view.activity.WeiZhangActivity;
import text.qiao.com.rerfitrxjavastudy.view.activity.XiaoHuaActivity;

/**
 * @project：RerfitRxJavaStudy
 * @fileName ActivityComponent
 * @author：乔少聪
 * @date：2018/12/12 11:00
 * @describe：
 */

@ActivityScope
@Component(dependencies = MyApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();

    void inject(MainActivity mainActivity);

    void inject(XiaoHuaActivity xiaoHuaActivity);

    void inject(WeiXinActivity mWeiXinActivity);

    void inject(WeiZhangActivity mWeiZhangActivity);

    void inject(CaiPuActivity mCaiPuActivity);
}

package text.qiao.com.rerfitrxjavastudy.di.module;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import text.qiao.com.rerfitrxjavastudy.di.scope.ActivityScope;

/**
 * @project：RerfitRxJavaStudy
 * @fileName ActivityModule
 * @author：乔少聪
 * @date：2018/12/12 11:00
 * @describe：
 */
@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }


    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return activity;
    }
}

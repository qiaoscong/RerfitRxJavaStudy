package text.qiao.com.rerfitrxjavastudy.di.module;

import android.app.Activity;
import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;
import text.qiao.com.rerfitrxjavastudy.di.scope.FragmentScope;

/**
 * @project：RerfitRxJavaStudy
 * @fileName FragmentModule
 * @author：乔少聪
 * @date：2019/1/2 13:34
 * @describe：
 */
@Module
public class FragmentModule {
    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }
    @Provides
    @FragmentScope
    public Activity priovideActivity(){
        return fragment.getActivity();
    }
}

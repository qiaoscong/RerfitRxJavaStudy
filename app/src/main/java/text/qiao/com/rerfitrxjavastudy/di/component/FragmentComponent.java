package text.qiao.com.rerfitrxjavastudy.di.component;

import android.app.Activity;

import dagger.Component;
import text.qiao.com.rerfitrxjavastudy.di.module.FragmentModule;
import text.qiao.com.rerfitrxjavastudy.di.scope.FragmentScope;
import text.qiao.com.rerfitrxjavastudy.view.fragment.TouTiaoFragment;

/**
 * @project：RerfitRxJavaStudy
 * @fileName FragmentComponent
 * @author：乔少聪
 * @date：2019/1/2 13:38
 * @describe：
 */
@FragmentScope
@Component(modules = FragmentModule.class, dependencies = MyApplicationComponent.class)
public interface FragmentComponent {
    Activity getActivity();

    void inject(TouTiaoFragment touTiaoFragment);
}

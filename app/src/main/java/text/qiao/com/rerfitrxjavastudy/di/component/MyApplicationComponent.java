package text.qiao.com.rerfitrxjavastudy.di.component;

import javax.inject.Singleton;

import dagger.Component;
import text.qiao.com.rerfitrxjavastudy.di.module.HttpModule;
import text.qiao.com.rerfitrxjavastudy.di.module.MyApplicationModule;
import text.qiao.com.rerfitrxjavastudy.model.DataManager;
import text.qiao.com.rerfitrxjavastudy.model.net.RefitertHelper;

/**
 * @project：RerfitRxJavaStudy
 * @fileName MyApplicationComponent
 * @author：乔少聪
 * @date：2018/12/12 11:32
 * @describe：
 */
@Singleton
@Component(modules = {MyApplicationModule.class, HttpModule.class})
public interface MyApplicationComponent {

    /**
     * 获取数据管理
     *
     * @return
     */

    DataManager getDataManager();

    /**
     * 网络请求管理类
     *
     * @return
     */

    RefitertHelper getRefitertHelper();
}

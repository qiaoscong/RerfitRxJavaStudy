package text.qiao.com.rerfitrxjavastudy.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


import text.qiao.com.rerfitrxjavastudy.model.DataManager;
import text.qiao.com.rerfitrxjavastudy.model.net.HttpHelper;
import text.qiao.com.rerfitrxjavastudy.model.net.RefitertHelper;

/**
 * @project：RerfitRxJavaStudy
 * @fileName MyApplicationModule
 * @author：乔少聪
 * @date：2018/12/12 11:20
 * @describe：
 */
@Module
public class MyApplicationModule {

    @Provides
    @Singleton
    HttpHelper provideHttpHelperHelper(RefitertHelper mHttpHelper) {
        return mHttpHelper;
    }


    @Provides
    @Singleton
    DataManager provideDataManagerHelper(HttpHelper mHttpHelper) {
        return new DataManager(mHttpHelper);
    }

}

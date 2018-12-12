package text.qiao.com.rerfitrxjavastudy.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import java.util.HashSet;
import java.util.Set;

import text.qiao.com.rerfitrxjavastudy.BuildConfig;
import text.qiao.com.rerfitrxjavastudy.di.component.DaggerMyApplicationComponent;
import text.qiao.com.rerfitrxjavastudy.di.component.MyApplicationComponent;
import text.qiao.com.rerfitrxjavastudy.di.module.ActivityModule;
import text.qiao.com.rerfitrxjavastudy.di.module.HttpModule;
import text.qiao.com.rerfitrxjavastudy.di.module.MyApplicationModule;
import text.qiao.com.utilslibrary.utils.ToastUtil;
import text.qiao.com.utilslibrary.utils.log.LogUtil;

/**
 * @project：RerfitRxJavaStudy
 * @fileName MyApplication
 * @author：乔少聪
 * @date：2018/12/12 8:59
 * @describe：application
 */

public class MyApplication extends Application {
    private static MyApplication instance;
    public static MyApplicationComponent myApplicationComponent;

    public static int SCREEN_WIDTH = -1;
    public static int SCREEN_HEIGHT = -1;
    public static float DIMEN_RATE = -1.0F;
    public static int DIMEN_DPI = -1;

    private Set<Activity> allActivities;

    public static synchronized MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化屏幕宽高
        getScreenSize();

        init();


    }

    /**
     * 初始化
     */
    private void init() {
        instance = this;
        LogUtil.init(BuildConfig.LOG_DEBUG);
        //初始化吐司
        ToastUtil.init(instance);
    }

    public void getScreenSize() {
        WindowManager windowManager = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        Display display = windowManager.getDefaultDisplay();
        display.getMetrics(dm);
        DIMEN_RATE = dm.density / 1.0F;
        DIMEN_DPI = dm.densityDpi;
        SCREEN_WIDTH = dm.widthPixels;
        SCREEN_HEIGHT = dm.heightPixels;
        if (SCREEN_WIDTH > SCREEN_HEIGHT) {
            int t = SCREEN_HEIGHT;
            SCREEN_HEIGHT = SCREEN_WIDTH;
            SCREEN_WIDTH = t;
        }
    }

    public static MyApplicationComponent getMyApplicationComponent() {
        if (myApplicationComponent == null) {
            myApplicationComponent = DaggerMyApplicationComponent.builder()
                    .myApplicationModule(new MyApplicationModule())
                    .httpModule(new HttpModule())
                    .build();
        }
        return myApplicationComponent;
    }

    public void addActivity(Activity act) {
        if (allActivities == null) {
            allActivities = new HashSet<>();
        }
        allActivities.add(act);
    }

    public void removeActivity(Activity act) {
        if (allActivities != null) {
            allActivities.remove(act);
        }
    }

    public void exitApp() {
        if (allActivities != null) {
            synchronized (allActivities) {
                for (Activity act : allActivities) {
                    act.finish();
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}

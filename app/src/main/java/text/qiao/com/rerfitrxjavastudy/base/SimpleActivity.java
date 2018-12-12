package text.qiao.com.rerfitrxjavastudy.base;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation_swipeback.SwipeBackActivity;
import text.qiao.com.rerfitrxjavastudy.app.MyApplication;
import text.qiao.com.rerfitrxjavastudy.view.MainActivity;

/**
 * @project：RerfitRxJavaStudy
 * @fileName SimpleActivity
 * @author：乔少聪
 * @date：2018/12/12 14:10
 * @describe：
 */

public abstract class SimpleActivity extends SwipeBackActivity{

    protected Activity mContext;
    private Unbinder mUnBinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mUnBinder = ButterKnife.bind(this);
        mContext = this;
        onViewCreated();
        MyApplication.getInstance().addActivity(this);
        //默认不支持侧滑
        setSwipeBackEnable(false);
        //由具体的activity实现，做视图相关的初始化
        initView();
        //由具体的activity实现，做数据的初始化
        obtainData();
        //由具体的activity实现，做事件监听的初始化
        initEvent();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyApplication.getInstance().removeActivity(this);
        mUnBinder.unbind();
    }

    /**
     *
     */
    private void init(){

    }
    protected void onViewCreated() {

    }

    protected abstract void initInject();
    /**
     * @return 返回所需布局
     */
    protected abstract int getLayout();

    /**
     * 实现initView来做视图相关的初始化
     */
    protected abstract void initView();

    /**
     * 实现obtainData来做数据的初始化
     */
    protected abstract void obtainData();

    /**
     * 实现initEvent来做事件监听的初始化
     */
    protected abstract void initEvent();
}

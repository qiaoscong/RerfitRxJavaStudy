package text.qiao.com.rerfitrxjavastudy.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * @project：RerfitRxJavaStudy
 * @fileName SimpleFragment
 * @author：乔少聪
 * @date：2019/1/2 11:27
 * @describe：
 */

public abstract class SimpleFragment extends SwipeBackFragment {
    protected View mView;
    protected Activity mActivity;
    protected Context mContext;
    private Unbinder mUnBinder;
    protected boolean isInited = false;

    @Override
    public void onAttach(Context context) {
        mActivity = (Activity) context;
        mContext = context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(getLayoutId(), null);
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mUnBinder = ButterKnife.bind(this, view);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //侧滑关闭比的距离
        setParallaxOffset(0.5f);
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        isInited = true;
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
    public void onDestroyView() {
        super.onDestroyView();
        mUnBinder.unbind();
    }

    protected abstract int getLayoutId();

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

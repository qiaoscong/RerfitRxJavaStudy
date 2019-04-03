package text.qiao.com.rerfitrxjavastudy.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liaoinstan.springview.container.DefaultFooter;
import com.liaoinstan.springview.container.DefaultHeader;
import com.liaoinstan.springview.widget.SpringView;

import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.app.Constants;
import text.qiao.com.rerfitrxjavastudy.base.BaseFragment;
import text.qiao.com.rerfitrxjavastudy.base.contract.TouTiaoContract;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.presenter.TouTiaoPresenter;
import text.qiao.com.rerfitrxjavastudy.view.activity.WebActivity;
import text.qiao.com.rerfitrxjavastudy.view.adapter.XinWenAdapter;
import text.qiao.com.rerfitrxjavastudy.view.adapter.jiekou.DJOnClickLister;
import text.qiao.com.utilslibrary.utils.ToastUtil;
import text.qiao.com.utilslibrary.utils.log.LogUtil;

/**
 * @author 乔少聪
 * @time 2019/1/2 11:13
 * @describe 新闻-头条
 */
public class TouTiaoFragment extends BaseFragment<TouTiaoPresenter> implements TouTiaoContract.View, DJOnClickLister {


    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.springView)
    SpringView springView;

    private String type = "top";
    private XinWenAdapter mXinWenAdapter;

    private XinWen xiTongNews;
    public TouTiaoFragment() {
        // Required empty public constructor
    }

    public static TouTiaoFragment newInstance(String type) {
        Bundle args = new Bundle();
        args.putString("type",type);
        TouTiaoFragment fragment = new TouTiaoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            type = args.getString("type");
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_toutiao;
    }

    @Override
    protected void initView() {
        springView.setHeader(new DefaultHeader(mContext));
        springView.setEnableFooter(false);
    }

    @Override
    protected void obtainData() {
        LogUtil.e("TouTiaoFragment");
        mPresenter.getXinWenMessage(Constants.APPKEY_TOUTIAO, type);
    }

    @Override
    protected void initEvent() {
        springView.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
                LogUtil.e("刷新");
                mPresenter.getXinWenMessage(Constants.APPKEY_TOUTIAO, type);
            }

            @Override
            public void onLoadmore() {

            }
        });
    }

    @Override
    public void showErrorMsg(String msg) {

    }

    @Override
    public void useTypeMode(String type) {

    }

    @Override
    public void showXinWen(XinWen xiTongNews) {
        this.xiTongNews=xiTongNews;
        springView.onFinishFreshAndLoad();
        if (mXinWenAdapter == null) {
            mXinWenAdapter = new XinWenAdapter(mContext, xiTongNews.getResult().getData(), this);
            recycleView.setLayoutManager(new LinearLayoutManager(mContext));
            recycleView.setAdapter(mXinWenAdapter);
        }else {
            mXinWenAdapter.setDataBeanList(xiTongNews.getResult().getData());
            mXinWenAdapter.notifyDataSetChanged();
        }
    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }


    @Override
    public void DianJi(View view, int postion) {

        LogUtil.e("点击");
        WebActivity.startXinWen(_mActivity,xiTongNews.getResult().getData().get(postion).getUrl());
    }
}

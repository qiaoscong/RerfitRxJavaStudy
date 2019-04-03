package text.qiao.com.rerfitrxjavastudy.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.TextView;

import com.liaoinstan.springview.container.DefaultFooter;
import com.liaoinstan.springview.container.DefaultHeader;
import com.liaoinstan.springview.widget.SpringView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.app.Constants;
import text.qiao.com.rerfitrxjavastudy.base.BaseActivity;
import text.qiao.com.rerfitrxjavastudy.base.contract.XiaoHuaContract;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.presenter.XiaoHuaPresenter;
import text.qiao.com.rerfitrxjavastudy.util.CommonUtil;
import text.qiao.com.rerfitrxjavastudy.view.adapter.XiaoHuaAdapter;
import text.qiao.com.utilslibrary.utils.DateUtil;
import text.qiao.com.utilslibrary.utils.ToastUtil;
import text.qiao.com.utilslibrary.utils.log.LogUtil;

public class XiaoHuaActivity extends BaseActivity<XiaoHuaPresenter> implements XiaoHuaContract.View {

    @BindView(R.id.tv_statusBarView)
    TextView tv_statusBarView;
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.springView)
    SpringView springView;

    private int page = 1;
    private XiaoHuaAdapter mXiaoHuaAdapter;
    private List<XiaoHua.ResultBean.DataBean> leiBiebeanList = new ArrayList<>();
    public static void startXinWen(Context context) {
        Bundle args = new Bundle();
        Intent ii = new Intent(context, XiaoHuaActivity.class);
        ii.putExtras(args);
        context.startActivity(ii);
    }
    @Override
    protected void initInject() {

        getActivityComponent().inject(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_xiao_hua;
    }

    @Override
    protected void initView() {
        setSwipeBackEnable(true);
//        CommonUtil.getStatusBarView(tv_statusBarView, CommonUtil.getStatusBarHeight(mContext));
        springView.setHeader(new DefaultHeader(mContext));
        springView.setFooter(new DefaultFooter(mContext));
    }

    @Override
    protected void obtainData() {

        LogUtil.e("DateUtil.getCurrentTime():" + DateUtil.getCurrentTime());
        mPresenter.getXiaoHuaMessage(Constants.APPKEY_XIAOHUA, "desc", page, 20, DateUtil.getCurrentTime() + "");
    }

    @Override
    protected void initEvent() {
        springView.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
                page = 1;
                mPresenter.getXiaoHuaMessage(Constants.APPKEY_XIAOHUA, "desc", page, 20, DateUtil.getCurrentTime() + "");
            }

            @Override
            public void onLoadmore() {
                page++;
                mPresenter.getXiaoHuaMoreMessage(Constants.APPKEY_XIAOHUA, "desc", page, 20, DateUtil.getCurrentTime() + "");
            }
        });
    }

    @Override
    public void showErrorMsg(String msg) {

        ToastUtil.show(msg);
    }

    @Override
    public void useTypeMode(String type) {

    }

    @Override
    public void stateError() {

    }

    @Override
    public void stateEmpty() {

    }

    @Override
    public void stateLoading() {

    }

    @Override
    public void stateMain() {

    }

    @Override
    public void showXiaoHua(XiaoHua xiTongNews) {
        springView.onFinishFreshAndLoad();
        leiBiebeanList = xiTongNews.getResult().getData();
        if (mXiaoHuaAdapter == null) {
            mXiaoHuaAdapter = new XiaoHuaAdapter(mContext, leiBiebeanList);
            recycleView.setLayoutManager(new LinearLayoutManager(mContext));
            recycleView.setAdapter(mXiaoHuaAdapter);
        } else {
            mXiaoHuaAdapter.setLeiBiebeanList(leiBiebeanList);
            mXiaoHuaAdapter.notifyDataSetChanged();
        }


    }

    @Override
    public void showMoreXiaoHua(XiaoHua xiTongNews) {
        springView.onFinishFreshAndLoad();
        leiBiebeanList.addAll(xiTongNews.getResult().getData());
        mXiaoHuaAdapter.setLeiBiebeanList(leiBiebeanList);
        mXiaoHuaAdapter.notifyDataSetChanged();

    }


}

package text.qiao.com.rerfitrxjavastudy.view;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.app.Constants;
import text.qiao.com.rerfitrxjavastudy.base.BaseActivity;
import text.qiao.com.rerfitrxjavastudy.base.contract.MainContract;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.model.entity.main.LeiBiebean;
import text.qiao.com.rerfitrxjavastudy.presenter.MainPresenter;
import text.qiao.com.rerfitrxjavastudy.view.activity.WeiZhangActivity;
import text.qiao.com.rerfitrxjavastudy.view.activity.XiaoHuaActivity;
import text.qiao.com.rerfitrxjavastudy.view.activity.XinWenActivity;
import text.qiao.com.rerfitrxjavastudy.view.adapter.MainAdapter;
import text.qiao.com.rerfitrxjavastudy.view.adapter.jiekou.DJOnClickLister;
import text.qiao.com.utilslibrary.utils.ToastUtil;
import text.qiao.com.utilslibrary.utils.log.LogUtil;

/**
 * @author 乔少聪
 * @time 2019/1/2 9:33
 * @describe 首页
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View, DJOnClickLister {


    @BindView(R.id.recycleview_main)
    RecyclerView recycleviewMain;

    private String type = "keji";

    private List<LeiBiebean> leiBiebeanList = new ArrayList<>();

    private MainAdapter mMainAdapter;

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void obtainData() {
        initData();
        mMainAdapter = new MainAdapter(getApplicationContext(), leiBiebeanList);
        mMainAdapter.setmDJOnClickLister(this);
        recycleviewMain.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        recycleviewMain.setAdapter(mMainAdapter);
    }

    @Override
    protected void initEvent() {
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ToastUtil.show("开始请求数据");
//                mPresenter.getXiaoHuaMessage(Constants.APPKEY_TOUTIAO, type);
//            }
//        });
    }

    @Override
    public void showErrorMsg(String msg) {

        LogUtil.e(msg);
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
    public void showXiaoHua(XinWen xiTongNews) {

    }

    private void initData() {

        leiBiebeanList.add(new LeiBiebean(R.drawable.ic_xinwen, "新闻头条"));
        leiBiebeanList.add(new LeiBiebean(R.drawable.ic_xiaolian, "笑话大全"));
        leiBiebeanList.add(new LeiBiebean(R.drawable.ic_weixin, "微信精选"));
        leiBiebeanList.add(new LeiBiebean(R.drawable.ic_weizhang, "违章查询"));
    }

    /**
     * recycleview  点击
     *
     * @param view
     * @param postion
     */
    @Override
    public void DianJi(View view, int postion) {
//        ToastUtil.show(leiBiebeanList.get(postion).getTitle());
        switch (postion) {
            case 0:
                XinWenActivity.startXinWen(getApplicationContext());
                break;
            case 1:
                XiaoHuaActivity.startXinWen(getApplicationContext());
                break;
            case 2:
                break;
            case 3:
                WeiZhangActivity.startWeiZhang(getApplicationContext());
                break;
            default:
                XinWenActivity.startXinWen(getApplicationContext());
                break;
        }
    }
}

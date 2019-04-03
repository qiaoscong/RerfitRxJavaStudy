package text.qiao.com.rerfitrxjavastudy.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.app.Constants;
import text.qiao.com.rerfitrxjavastudy.base.BaseActivity;
import text.qiao.com.rerfitrxjavastudy.base.contract.WeiZhangContract;
import text.qiao.com.rerfitrxjavastudy.model.entity.weizhang.WZCity;
import text.qiao.com.rerfitrxjavastudy.presenter.WeiZhangPresenter;
import text.qiao.com.rerfitrxjavastudy.view.adapter.WZCittyAdapter;
import text.qiao.com.rerfitrxjavastudy.view.adapter.jiekou.DJOnClickLister;

/**
 * @author 乔少聪
 * @time 2019/4/3 14:07
 * @describe 违章
 */
public class WeiZhangActivity extends BaseActivity<WeiZhangPresenter> implements WeiZhangContract.View, DJOnClickLister{

    @BindView(R.id.rl_wz_list)
    RecyclerView rlWzList;


    private WZCittyAdapter mWZCittyAdapter;
    private List<String> cityList=new ArrayList<>();
    public static void startWeiZhang(Context context) {
        Bundle args = new Bundle();
        Intent ii = new Intent(context, WeiZhangActivity.class);
        ii.putExtras(args);
        context.startActivity(ii);
    }

    @Override
    protected void initInject() {

        getActivityComponent().inject(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_weizhang;
    }

    @Override
    protected void initView() {

        mPresenter.getWZCityMessage(Constants.APPKEY_WEIZHANG, "", "json", "1", "");
    }

    @Override
    protected void obtainData() {

    }

    @Override
    protected void initEvent() {

    }

    @Override
    public void showWZCityData(WZCity xiTongNews) {

        mPresenter.initData(xiTongNews,cityList);
        mWZCittyAdapter=new WZCittyAdapter(getApplicationContext(),cityList);
        mWZCittyAdapter.setmDJOnClickLister(this);
        rlWzList.setLayoutManager(new GridLayoutManager(getApplicationContext(), 4));
        rlWzList.setAdapter(mWZCittyAdapter);
    }

    @Override
    public void showErrorMsg(String msg) {

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
    public void DianJi(View view, int postion) {

    }
    private void initData(WZCity xiTongNews){
        if(xiTongNews.getResult().getAH()!=null){
            cityList.add(xiTongNews.getResult().getAH().getProvince());
        }

    }
}

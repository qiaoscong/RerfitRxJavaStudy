package text.qiao.com.rerfitrxjavastudy.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.app.Constants;
import text.qiao.com.rerfitrxjavastudy.base.BaseActivity;
import text.qiao.com.rerfitrxjavastudy.base.contract.CaiPuQuanContract;
import text.qiao.com.rerfitrxjavastudy.model.entity.caipu.CaiPuQuan;
import text.qiao.com.rerfitrxjavastudy.presenter.CaiPuQuanPresenter;
import text.qiao.com.rerfitrxjavastudy.view.adapter.CaiPuListAdapter;
import text.qiao.com.rerfitrxjavastudy.view.adapter.WZCittyAdapter;
import text.qiao.com.rerfitrxjavastudy.view.adapter.jiekou.DJOnClickLister;

/**
 * @author 乔少聪
 * @time 2019/4/3 17:06
 * @describe 菜谱
 */
public class CaiPuActivity extends BaseActivity<CaiPuQuanPresenter> implements CaiPuQuanContract.View, DJOnClickLister {


    @BindView(R.id.tv_cp_title)
    TextView tvCpTitle;
    @BindView(R.id.rl_cp_list)
    RecyclerView rlCpList;


    private CaiPuListAdapter mCaiPuListAdapter;
    public static void startCaiPu(Context context) {
        Bundle args = new Bundle();
        Intent ii = new Intent(context, CaiPuActivity.class);
        ii.putExtras(args);
        context.startActivity(ii);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initInject() {

        getActivityComponent().inject(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_caipu;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void obtainData() {

        mPresenter.geCaiPuQuanMessage(Constants.APPKEY_CAIPU,"","");
    }

    @Override
    protected void initEvent() {

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
    public void showCaiPuQuan(CaiPuQuan xiTongNews) {
        if(xiTongNews.getResult().get(0)!=null){
            tvCpTitle.setText(xiTongNews.getResult().get(0).getName());
            mCaiPuListAdapter=new CaiPuListAdapter(getApplicationContext(),xiTongNews.getResult().get(0).getList());
            mCaiPuListAdapter.setmDJOnClickLister(this);
            rlCpList.setLayoutManager(new GridLayoutManager(getApplicationContext(), 4));
            rlCpList.setAdapter(mCaiPuListAdapter);
        }

    }

    @Override
    public void DianJi(View view, int postion) {

    }
}

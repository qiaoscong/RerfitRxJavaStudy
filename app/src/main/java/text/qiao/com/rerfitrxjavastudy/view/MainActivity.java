package text.qiao.com.rerfitrxjavastudy.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.app.Constants;
import text.qiao.com.rerfitrxjavastudy.base.BaseActivity;
import text.qiao.com.rerfitrxjavastudy.base.contract.MainContract;
import text.qiao.com.rerfitrxjavastudy.model.entity.XinWen;
import text.qiao.com.rerfitrxjavastudy.presenter.MainPresenter;
import text.qiao.com.utilslibrary.utils.ToastUtil;
import text.qiao.com.utilslibrary.utils.log.LogUtil;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.textView)
    TextView textView;

    private String type = "keji";

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

    }

    @Override
    protected void initEvent() {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.show("开始请求数据");

                mPresenter.getXiaoHuaMessage(Constants.APPKEY_TOUTIAO, type);
            }
        });
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
//        ToastUtil.show(xiTongNews.getReason() != null ? xiTongNews.getReason() : "没有请求到指定字段的数据");
        textView.setText(xiTongNews.getReason() != null ? xiTongNews.getReason() : "没有请求到指定字段的数据");
//        LogUtil.e(xiTongNews.getReason());
    }


}

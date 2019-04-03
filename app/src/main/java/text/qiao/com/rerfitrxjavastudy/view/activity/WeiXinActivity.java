package text.qiao.com.rerfitrxjavastudy.view.activity;

  import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.liaoinstan.springview.widget.SpringView;

import butterknife.BindView;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.base.BaseActivity;
import text.qiao.com.rerfitrxjavastudy.base.contract.WeiXinContract;
import text.qiao.com.rerfitrxjavastudy.model.entity.WeiXinJingXuan;
import text.qiao.com.rerfitrxjavastudy.presenter.WeiXinPresenter;
/**
 *
 * @author 乔少聪
 * @time 2019/1/3 15:34
 * @describe 微信精选
*/
public class WeiXinActivity extends BaseActivity<WeiXinPresenter> implements WeiXinContract.View{
    @BindView(R.id.tv_statusBarView)
    TextView tv_statusBarView;
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.springView)
    SpringView springView;

    public static void startWeiXin(Context context) {
        Bundle args = new Bundle();
        Intent ii = new Intent(context, WeiXinActivity.class);
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
        return R.layout.activity_wei_xin;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void obtainData() {

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
    public void showWeiXinJingXuan(WeiXinJingXuan xiTongNews) {

    }

    @Override
    public void showMoreWeiXinJingXuan(WeiXinJingXuan xiTongNews) {

    }
}

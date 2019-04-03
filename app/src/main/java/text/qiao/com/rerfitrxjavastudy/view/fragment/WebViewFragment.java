package text.qiao.com.rerfitrxjavastudy.view.fragment;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.just.agentweb.AgentWeb;
import com.just.agentweb.DefaultWebClient;

import butterknife.BindView;
import butterknife.OnClick;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.base.SimpleFragment;
import text.qiao.com.rerfitrxjavastudy.util.CommonUtil;
import text.qiao.com.rerfitrxjavastudy.weight.WebLayout;
import text.qiao.com.utilslibrary.utils.log.LogUtil;


public class WebViewFragment extends SimpleFragment {

    @BindView(R.id.tv_statusBarView)
    TextView tv_statusBarView;
    @BindView(R.id.frame_layout_web)
    FrameLayout frame_layout_web;
    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.rl_title)
    RelativeLayout rl_title;
    @BindView(R.id.iv_load_failed)
    ImageView iv_load_failed;//

    private Bundle bundle;
    private String url = "";
    protected AgentWeb mAgentWeb;
    //
    private WebChromeClient mWebChromeClient = new WebChromeClient() {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
        }

        @Override
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            if (tv_title != null) {
                tv_title.setText(title);
            }
        }
    };
    private WebViewClient mWebViewClient = new WebViewClient() {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            //do you  work
            Log.i("Info", "BaseWebActivity onPageStarted");
        }
    };

    public WebViewFragment() {
        // Required empty public constructor
    }

    public static WebViewFragment newInstance(String address) {
        Bundle args = new Bundle();
        args.putString("address", address);
        WebViewFragment fragment = new WebViewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            url = args.getString("address");
        }
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_web_view;
    }

    @Override
    protected void initView() {
        setSwipeBackEnable(true);
        CommonUtil.getStatusBarView(tv_statusBarView, CommonUtil.getStatusBarHeight(getContext()));
    }

    @Override
    protected void obtainData() {
        mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(frame_layout_web, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .setWebChromeClient(mWebChromeClient)
                .setWebViewClient(mWebViewClient)
                .setMainFrameErrorView(R.layout.agentweb_error_page, -1)
                .setSecurityType(AgentWeb.SecurityType.STRICT_CHECK)
                .setWebLayout(new WebLayout(_mActivity))
                .setOpenOtherPageWays(DefaultWebClient.OpenOtherPageWays.ASK)//打开其他应用时，弹窗咨询用户是否前往其他应用
                .interceptUnkownUrl() //拦截找不到相关页面的Scheme
                .createAgentWeb()
                .ready()
                .go(url);
    }

    @Override
    protected void initEvent() {

    }


    @OnClick(R.id.iv_load_failed)
    void shuaXin() {
        mAgentWeb.getWebCreator().getWebView().reload();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        mAgentWeb.getWebCreator().getWebView().destroy();
        WebView webView = mAgentWeb.getWebCreator().getWebView();
        webView = null;
    }
}

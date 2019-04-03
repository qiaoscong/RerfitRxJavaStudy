package text.qiao.com.rerfitrxjavastudy.presenter;

import java.util.List;

import javax.inject.Inject;

import text.qiao.com.rerfitrxjavastudy.base.RxPresenter;
import text.qiao.com.rerfitrxjavastudy.base.contract.WeiZhangContract;
import text.qiao.com.rerfitrxjavastudy.model.DataManager;
import text.qiao.com.rerfitrxjavastudy.model.entity.XiaoHua;
import text.qiao.com.rerfitrxjavastudy.model.entity.weizhang.WZCity;
import text.qiao.com.rerfitrxjavastudy.util.RxUtil;
import text.qiao.com.rerfitrxjavastudy.weight.CommonSubscriber;
import text.qiao.com.utilslibrary.utils.log.LogUtil;

/**
 * @project：RerfitRxJavaStudy
 * @fileName WeiZhangPresenter
 * @author：乔少聪
 * @date：2019/4/3 14:18
 * @describe：
 */
public class WeiZhangPresenter extends RxPresenter<WeiZhangContract.View> implements WeiZhangContract.Presenter{
    private DataManager mDataManager;

    @Inject
    public WeiZhangPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void getWZCityMessage(String appkey, String province, String dtype, String format, String callback) {
        addSubscribe(
                mDataManager.getWZCity(appkey, province, dtype, format, callback)
                        .compose(RxUtil.<WZCity>rxSchedulerHelper())
                        .compose(RxUtil.<WZCity>stringResult())
                        .subscribeWith(new CommonSubscriber<WZCity>(mView) {
                            @Override
                            public void onNext(WZCity xinWen) {
                                mView.showWZCityData(xinWen);

                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                            }
                        })

        );
    }

    /**
     *  赋值列表
     * @param xiTongNews 请求集合
     * @param strings 显示列表
     */
    public void initData(WZCity xiTongNews, List<String> strings){
        //1
        if(xiTongNews.getResult().getAH()!=null){
            strings.add(xiTongNews.getResult().getAH().getProvince());
        }
        //2
        if(xiTongNews.getResult().getFJ()!=null){
            strings.add(xiTongNews.getResult().getFJ().getProvince());
        }
        //3
        if(xiTongNews.getResult().getFB()!=null){
            strings.add(xiTongNews.getResult().getFB().getProvince());
        }
        //4
        if(xiTongNews.getResult().getCQ()!=null) {
            strings.add(xiTongNews.getResult().getCQ().getProvince());
        }
        //5
        if(xiTongNews.getResult().getBJ()!=null){
            strings.add(xiTongNews.getResult().getBJ().getProvince());
        }
        //6
        if(xiTongNews.getResult().getGD()!=null){
            strings.add(xiTongNews.getResult().getGD().getProvince());
        }
        //7
        if(xiTongNews.getResult().getGZ()!=null){
            strings.add(xiTongNews.getResult().getGZ().getProvince());
        }
        //8
        if(xiTongNews.getResult().getHAN()!=null){
            strings.add(xiTongNews.getResult().getHAN().getProvince());
        }
        //9
        if(xiTongNews.getResult().getHN()!=null){
            strings.add(xiTongNews.getResult().getHN().getProvince());
        }
        //10
        if(xiTongNews.getResult().getJL()!=null){
            strings.add(xiTongNews.getResult().getJL().getProvince());
        }
        //11
        if(xiTongNews.getResult().getHUN()!=null){
            strings.add(xiTongNews.getResult().getHUN().getProvince());
        }
        //12
        if(xiTongNews.getResult().getJS()!=null){
            strings.add(xiTongNews.getResult().getJS().getProvince());
        }
        //13
        if(xiTongNews.getResult().getJX()!=null){
            strings.add(xiTongNews.getResult().getJX().getProvince());
        }
        //14
        if(xiTongNews.getResult().getLN()!=null){
            strings.add(xiTongNews.getResult().getLN().getProvince());
        }
        //15
        if(xiTongNews.getResult().getNMG()!=null){
            strings.add(xiTongNews.getResult().getNMG().getProvince());
        }
        //16
        if(xiTongNews.getResult().getNX()!=null){
            strings.add(xiTongNews.getResult().getNX().getProvince());
        }
        //17
        if(xiTongNews.getResult().getSC()!=null){
            strings.add(xiTongNews.getResult().getSC().getProvince());
        }
        //18
        if(xiTongNews.getResult().getSD()!=null){
            strings.add(xiTongNews.getResult().getSD().getProvince());
        }
        //19
        if(xiTongNews.getResult().getSH()!=null){
            strings.add(xiTongNews.getResult().getSH().getProvince());
        }
        //20
        if(xiTongNews.getResult().getSX()!=null){
            strings.add(xiTongNews.getResult().getSX().getProvince());
        }
        //21
        if(xiTongNews.getResult().getTJ()!=null){
            strings.add(xiTongNews.getResult().getTJ().getProvince());
        }
        //22
        if(xiTongNews.getResult().getZJ()!=null){
            strings.add(xiTongNews.getResult().getZJ().getProvince());
        }


    }
}

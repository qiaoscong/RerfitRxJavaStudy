package text.qiao.com.rerfitrxjavastudy.base;

/**
 * @project：RerfitRxJavaStudy
 * @fileName BasePresenter
 * @author：乔少聪
 * @date：2018/12/12 13:58
 * @describe：
 */

public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}

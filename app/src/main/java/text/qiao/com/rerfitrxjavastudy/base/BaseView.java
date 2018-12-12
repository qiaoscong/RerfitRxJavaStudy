package text.qiao.com.rerfitrxjavastudy.base;

/**
 * @project：RerfitRxJavaStudy
 * @fileName BaseView
 * @author：乔少聪
 * @date：2018/12/12 13:57
 * @describe：
 */

public interface BaseView {
    /**
     *  错误
     * @param msg
     */
    void showErrorMsg(String msg);

    /**
     *  预留接口
     * @param type
     */
    void useTypeMode(String type);

    //=======  State  =======

    /**
     * 状态 失败
     */
    void stateError();
    /**
     *  状态 空
     */
    void stateEmpty();
    /**
     *  状态 加载中
     */
    void stateLoading();
    /**
     *  状态 成功
     */
    void stateMain();
}

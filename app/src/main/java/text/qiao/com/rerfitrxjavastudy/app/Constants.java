package text.qiao.com.rerfitrxjavastudy.app;

import android.os.Environment;

import java.io.File;

/**
 * @project：RerfitRxJavaStudy
 * @fileName Constants
 * @author：乔少聪
 * @date：2018/12/12 10:08
 * @describe： 常量类
 */

public interface Constants {


    /*--------------------------------------聚合数据 appkey-----------------------------------------------------*/

    /**
     * 聚合数据 新闻头条
     */
    String APPKEY_TOUTIAO = "3a437b0a6225be41e61198104d624477";
    /**
     * 聚合数据 笑话大全
     */
    String APPKEY_XIAOHUA = "fd6916b82ed065a1c546acdd6c464926";
    /**
     * 聚合数据 微信精选
     */
    String APPKEY_WEIXIN = "c27690abc86fe023455b7dfb2beb62dd";
    /**
     * 聚合数据 违章
     */
    String APPKEY_WEIZHANG = "80c010e769bc99e3dc6809b1f40eda59";
    /**
     * 聚合数据 菜谱大全
     */
    String APPKEY_CAIPU = "5cdc9ab4bde7db1caf00f35e161c743f";

    /*--------------------------------------  path  -----------------------------------------------------*/

    String PATH_DATA = MyApplication.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    String PATH_CACHE = PATH_DATA + "/NetCache";

    String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "codeest" + File.separator + "rerfitrxjavastudy";
}

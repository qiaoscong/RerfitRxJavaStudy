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

    /*--------------------------------------  path  -----------------------------------------------------*/

    String PATH_DATA = MyApplication.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    String PATH_CACHE = PATH_DATA + "/NetCache";

    String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "codeest" + File.separator + "rerfitrxjavastudy";
}

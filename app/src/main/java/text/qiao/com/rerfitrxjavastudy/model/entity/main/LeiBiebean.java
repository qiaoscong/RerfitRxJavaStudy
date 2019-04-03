package text.qiao.com.rerfitrxjavastudy.model.entity.main;

import android.support.annotation.DrawableRes;

/**
 * @project：RerfitRxJavaStudy
 * @fileName LeiBiebean
 * @author：乔少聪
 * @date：2019/1/2 9:27
 * @describe：
 */

public class LeiBiebean {
    private @DrawableRes int image;
    private String title;

    public LeiBiebean(@DrawableRes int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

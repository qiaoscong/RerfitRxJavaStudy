package text.qiao.com.rerfitrxjavastudy.weight;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;

import java.security.MessageDigest;

/**
 * Created by Administrator on 2018/3/13 0013.
 */

public class GlideRoundTransform extends BitmapTransformation {
    private static float mRadius = 0f;
    private static float           mDiameter = 0f;
    public GlideRoundTransform(Context context) {
        this(context, 4);
    }

    public GlideRoundTransform(Context context, int dp) {
        super(context);
        this.mRadius = Resources.getSystem().getDisplayMetrics().density * dp;
        mDiameter = 2 * mRadius;
    }

    @Override
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        //我们要先获取到Centercrop()这个属性后得到到图片，然后在根据这个图片在进行圆角加工然后在返回
        Bitmap bitmap = TransformationUtils.centerCrop(pool, toTransform, outWidth, outHeight);
//        Bitmap bitmap = TransformationUtils.centerCrop(pool, toTransform, outWidth, outHeight);
        return roundCrop(pool, bitmap);
    }

    private static Bitmap roundCrop(BitmapPool pool, Bitmap source) {
        if (source == null) return null;

        Bitmap result = pool.get(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        if (result == null) {
            result = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        }

        Canvas canvas = new Canvas(result);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(source, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP));
        paint.setAntiAlias(true);
//        RectF rectF = new RectF(0f, 0f, source.getWidth(), source.getHeight());
//        canvas.drawRoundRect(rectF, mRadius, mRadius, paint);

        drawTopCorner(canvas,paint,source.getWidth(), source.getHeight());
        return result;
    }
    /**
     * 画上 角
     */
    private static void drawTopCorner(Canvas canvas, Paint paint, float width, float height) {
//        LogUtil.e("画上 角drawTopCorner"+mRadius);
        canvas.drawRect(new RectF(0, mRadius, width, height), paint);
        canvas.drawRect(new RectF(mRadius, 0, width-mRadius, mRadius), paint);
        canvas.drawArc(new RectF(0, 0, mDiameter, mDiameter), 180, 90, true, paint);
        canvas.drawArc(new RectF(width - mDiameter, 0, width, mDiameter), 270, 90, true, paint);
    }
    public String getId() {
        return getClass().getName() + Math.round(mRadius);
    }

    @Override
    public void updateDiskCacheKey(MessageDigest messageDigest) {

    }
}

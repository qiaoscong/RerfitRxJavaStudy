package text.qiao.com.rerfitrxjavastudy.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;


import java.io.File;
import java.math.BigDecimal;

import jp.wasabeef.glide.transformations.BlurTransformation;
import text.qiao.com.rerfitrxjavastudy.R;
import text.qiao.com.rerfitrxjavastudy.weight.GlideApp;
import text.qiao.com.rerfitrxjavastudy.weight.GlideRequest;
import text.qiao.com.rerfitrxjavastudy.weight.GlideRoundTransform;
import text.qiao.com.rerfitrxjavastudy.weight.RoundCornersTransformation;
import text.qiao.com.utilslibrary.utils.log.LogUtil;


/**
 * Created by Administrator on 2018/3/28.
 * <p>
 * 描述：Glide缓存工具类
 * Created by
 */


public class GlideCacheUtil {
    private static GlideCacheUtil instance;// 单例
    private Context mContext;

    public GlideCacheUtil(Context mContext) {
        this.mContext = mContext;
    }

    public void loadYuanJiaoImageView(int yuanjiao, String url, ImageView imageView,RoundCornersTransformation.CornerType type){
        LogUtil.e("loadYuanJiaoImageView ");
//        url= UrlConstants.HOST_SITE_HTTPS_ADDRESS+url;
//        LogUtil.e(url);
        RoundCornersTransformation transformation =
                new RoundCornersTransformation(mContext,
                        yuanjiao,type);
//        RoundCornersTransformation1 transformation =
//                new RoundCornersTransformation1(mContext,
//                        yuanjiao,type);
//        GlideRoundTransform transformation =
//                new GlideRoundTransform(mContext,
//                        25);
        RequestOptions myOptions = new RequestOptions();

        myOptions.transform(transformation);
        myOptions.diskCacheStrategy(DiskCacheStrategy.ALL  );
        myOptions.error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai);
        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .apply(myOptions)
                .into(imageView);
    }
    public void loadJiaoImageView(int yuanjiao, String url, ImageView imageView,RoundCornersTransformation.CornerType type){

//设置图片圆角角度
        RoundedCorners roundedCorners= new RoundedCorners(yuanjiao);
        RoundCornersTransformation transformation =
                new RoundCornersTransformation(mContext,
                        yuanjiao,type);

        RequestOptions myOptions = RequestOptions.bitmapTransform(roundedCorners);

//        myOptions.transform(transformation);
        myOptions.diskCacheStrategy(DiskCacheStrategy.ALL );
        myOptions.error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai);
        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .apply(myOptions)
                .into(imageView);
    }
    /**
     *  加载圆角图片
     * @param yuanjiao
     * @param url
     * @param imageView
     */

    public void loadYuanJiaoImageView(int yuanjiao, String url, ImageView imageView) {
//        url= UrlConstants.HOST_SITE_HTTPS_ADDRESS+url;
//        LogUtil.e(url);
        RequestOptions myOptions = new RequestOptions();

        myOptions.transform(new GlideRoundTransform(mContext, yuanjiao));
        myOptions.diskCacheStrategy(DiskCacheStrategy.ALL );
        myOptions.error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai);

        GlideApp.with(mContext)
                .load(url)
                .dontAnimate()
                .skipMemoryCache(false)
                .apply(myOptions)

                .into(imageView);

    }

    /**
     *  加载GIF
     * @param imageView
     */
    public void loadGifIamgeView(ImageView imageView, @DrawableRes int ziyuan){

        GlideRequest<GifDrawable> requestBuilder = GlideApp.with(mContext).asGif();
        RequestOptions myOptions = new RequestOptions();
        myOptions.diskCacheStrategy(DiskCacheStrategy.ALL );
        myOptions.error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai);
        requestBuilder
                .load(ziyuan)
                .apply(myOptions)
                .into(imageView);
    }
    /**
     *  加载圆角图片(预加载是自身)
     * @param yuanjiao
     * @param url
     * @param imageView
     */

    public void loadYuanJiaoImageView_ziji(int yuanjiao, String url, ImageView imageView) {
        RequestListener mRequestListener = new RequestListener() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target target, boolean isFirstResource) {
                LogUtil.e("onException: " + e.toString()+"  model:"+model+" isFirstResource: "+isFirstResource);

                return false;
            }

            @Override
            public boolean onResourceReady(Object resource, Object model, Target target, DataSource dataSource, boolean isFirstResource) {
//                LogUtil.e( "model:"+model+" isFirstResource: "+isFirstResource);
                return false;
            }
        };

        RequestOptions myOptions = new RequestOptions();
        myOptions.transform(new GlideRoundTransform(mContext, yuanjiao));
//        myOptions.diskCacheStrategy(DiskCacheStrategy.ALL );
        myOptions.error(R.drawable.ic_image_shibai).placeholder(R.drawable.ic_image_shibai) ;

        GlideApp.with(mContext)
                .load(url)
                .dontAnimate()
                .listener(mRequestListener)
                .skipMemoryCache(false)
                .apply(myOptions)
                .into(imageView);
    }





    public void loadYuanJiaoImageView_ziji(int yuanjiao, int url, ImageView imageView) {
//        url= UrlConstants.HOST_SITE_HTTPS_ADDRESS+url;
//        LogUtil.e(url);
        RequestOptions myOptions = new RequestOptions();

        myOptions.transform(new GlideRoundTransform(mContext, yuanjiao));
        myOptions.diskCacheStrategy(DiskCacheStrategy.ALL );
        myOptions.error(R.drawable.ic_image_shibai).placeholder(R.drawable.ic_image_shibai) ;
//                .placeholder(imageView.getDrawable());
        GlideApp.with(mContext)
                .load(url)
                .dontAnimate()
                .skipMemoryCache(false)
                .apply(myOptions)
                .into(imageView);
    }
    /**
     *  加载圆图片
     * @param url
     * @param imageView
     */

    public void loadYuanImageView( String url, ImageView imageView) {
//        url= UrlConstants.HOST_SITE_HTTPS_ADDRESS+url;
//        LogUtil.e(url);
        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()).diskCacheStrategy(DiskCacheStrategy.ALL).error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai))
                .into(imageView);
    }
    /**
     *  加载圆图片
     *
     * @param url
     * @param imageView
     */

    public void loadYuanImageView1( String url, ImageView imageView) {

        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()).diskCacheStrategy(DiskCacheStrategy.ALL).error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai))
                .into(imageView);
    }
    /**
     *  加载圆图片
     *  本地的
     * @param url
     * @param imageView
     */

    public void loadYuanImageView( int url, ImageView imageView) {
        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()).diskCacheStrategy(DiskCacheStrategy.ALL).error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai))
                .into(imageView);
    }
    public Bitmap loadyuanBitmap(String url,int width,int height){
//        url= UrlConstants.HOST_SITE_HTTPS_ADDRESS+url;
//        LogUtil.e(url);
//        Bitmap bitmap= GlideApp.with(mContext)
//
//                .load(url)
//                .into()
        final Bitmap[] bitmap = {null};
        GlideApp.with(mContext)
                .load(url)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()).diskCacheStrategy(DiskCacheStrategy.ALL).error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai))
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        LogUtil.e("onLoadFailed --->" +e);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        LogUtil.e("onResourceReady---> " + resource);
                        BitmapDrawable bd = (BitmapDrawable) resource;
                        bitmap[0] = bd.getBitmap();

                        return false;
                    }
                }).submit(width,height);




        return bitmap[0];
    }
    /**
     *  普通加载图片
     * @param url
     * @param imageView
     */
    public void loadImageView(String url, ImageView imageView) {
        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.ic_image_shibai)
                .placeholder(R.drawable.ic_image_shibai)
                .into(imageView);
    }
    /**
     *  普通加载图片
     * @param url
     * @param imageView
     */
    public void loadImageView1(String url, ImageView imageView) {

//        myOptions.diskCacheStrategy(DiskCacheStrategy.ALL);

        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.ic_image_shibai)
                .placeholder(R.drawable.ic_image_shibai)
                .into(imageView);
    }
    /**
     *  普通加载图片
     * @param url
     * @param imageView
     */
    public void loadImageView(int url, ImageView imageView) {

//        myOptions.diskCacheStrategy(DiskCacheStrategy.ALL);

        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.ic_image_shibai)
                .placeholder(R.drawable.ic_image_shibai)
                .into(imageView);
    }
    /**
     *  高斯特模糊图
     * @param url
     * @param imageView
     */
    public void loadGaoSiImageView(String url, ImageView imageView) {
//        url= UrlConstants.HOST_SITE_HTTPS_ADDRESS+url;
//        LogUtil.e(url);
        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .apply(new RequestOptions().bitmapTransform(new BlurTransformation(10, 1)).error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai).diskCacheStrategy(DiskCacheStrategy.ALL  ))
                .into(imageView);
    }
    /**
     *  普通加载图片
     * @param url
     * @param imageView
     */
    public void loadImageView(File url, ImageView imageView) {
        RequestOptions myOptions = new RequestOptions();
        myOptions.diskCacheStrategy(DiskCacheStrategy.ALL );
        myOptions.error(R.drawable.ic_image_shibai) .placeholder(R.drawable.ic_image_shibai);
        GlideApp.with(mContext)
                .load(url)
                .skipMemoryCache(false)
                .apply(myOptions)
                .into(imageView);
    }

    /**
     * 加载本地图片，这里是mipmap文件夹下的资源
     */
    public void loadLocalImage(int mipmap,ImageView imageView) {
        RequestBuilder<Drawable> drawableRequestBuilder = GlideApp.with(mContext).load(mipmap);
        drawableRequestBuilder.into(imageView);
    }

    /**
     * 初始化单例
     *
     * @param context
     */
    public static synchronized void init(Context context) {
        if (instance == null) {
            instance = new GlideCacheUtil(context);
        }
    }

    /**
     * 获取单例
     *
     * @return
     */
    public static GlideCacheUtil getInstance() {
        if (instance == null) {
            throw new RuntimeException("class should init!");
        }
        return instance;
    }


    /**
     * 清除图片磁盘缓存
     */
    public void clearImageDiskCache() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Glide.get(mContext).clearDiskCache();
// BusUtil.getBus().post(new GlideCacheClearSuccessEvent());
                    }
                }).start();
            } else {
                Glide.get(mContext).clearDiskCache();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 清除图片内存缓存
     */
    public void clearImageMemoryCache(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) { //只能在主线程执行
                Glide.get(context).clearMemory();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 清除图片所有缓存
     */
    public void clearImageAllCache() {
        clearImageDiskCache();
        clearImageMemoryCache(mContext);
        String ImageExternalCatchDir = mContext.getExternalCacheDir() + ExternalCacheDiskCacheFactory.DEFAULT_DISK_CACHE_DIR;
        deleteFolderFile(ImageExternalCatchDir, true);
    }

    /**
     * 获取Glide造成的缓存大小
     *
     * @return CacheSize
     */
    public String getCacheSize(Context context) {
        try {
            String str = getFormatSize(getFolderSize(new File(context.getCacheDir() + "/" + InternalCacheDiskCacheFactory.DEFAULT_DISK_CACHE_DIR)));
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * 获取指定文件夹内所有文件大小的和
     *
     * @param file file
     * @return size
     * @throws Exception
     */
    private long getFolderSize(File file) throws Exception {
        long size = 0;
        try {
            File[] fileList = file.listFiles();
            for (File aFileList : fileList) {
                if (aFileList.isDirectory()) {
                    size = size + getFolderSize(aFileList);
                } else {
                    size = size + aFileList.length();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return size;
    }

    /**
     * 删除指定目录下的文件，这里用于缓存的删除
     *
     * @param filePath       filePath
     * @param deleteThisPath deleteThisPath
     */
    private void deleteFolderFile(String filePath, boolean deleteThisPath) {
        if (!TextUtils.isEmpty(filePath)) {
            try {
                File file = new File(filePath);
                if (file.isDirectory()) {
                    File files[] = file.listFiles();
                    for (File file1 : files) {
                        deleteFolderFile(file1.getAbsolutePath(), true);
                    }
                }
                if (deleteThisPath) {
                    if (!file.isDirectory()) {
                        file.delete();
                    } else {
                        if (file.listFiles().length == 0) {
                            file.delete();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 格式化单位
     *
     * @param size size
     * @return size
     */
    private static String getFormatSize(double size) {

        double kiloByte = size / 1024;
        if (kiloByte < 1) {
            return size + "M";
        }

        double megaByte = kiloByte / 1024;
        if (megaByte < 1) {
            BigDecimal result1 = new BigDecimal(Double.toString(kiloByte));
            return result1.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "KB";
        }

        double gigaByte = megaByte / 1024;
        if (gigaByte < 1) {
            BigDecimal result2 = new BigDecimal(Double.toString(megaByte));
            return result2.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "MB";
        }

        double teraBytes = gigaByte / 1024;
        if (teraBytes < 1) {
            BigDecimal result3 = new BigDecimal(Double.toString(gigaByte));
            return result3.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "GB";
        }
        BigDecimal result4 = new BigDecimal(teraBytes);

        return result4.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "TB";
    }
}

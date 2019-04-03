package text.qiao.com.rerfitrxjavastudy.weight;

import android.content.Context;
import android.support.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.module.AppGlideModule;

import java.io.InputStream;

/**
 * Created by Administrator on 2018/4/3.
 */
@GlideModule
public class CustomGlideModule extends AppGlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        //缓存4屏幕
//        MemorySizeCalculator calculator = new MemorySizeCalculator.Builder(context)
//                .setMemoryCacheScreens(2)
//                .build();
//        builder.setMemoryCache(new LruResourceCache(calculator.getMemoryCacheSize()));
        //磁盘缓存
        int diskCacheSizeBytes = 1024 * 1024 * 300; // 1000 MB
//        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888); // 设置图片质量为高质量
        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, diskCacheSizeBytes));
//        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, "cacheFolderName", diskCacheSizeBytes));
//        builder.setDiskCache(new ExternalCacheDiskCacheFactory(context));
    }

    /**
     * 为App注册一个自定义的String类型的BaseGlideUrlLoader
     * @param context
     * @param glide
     * @param registry
     */
    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        registry.append(String.class, InputStream.class,new CustomBaseGlideUrlLoader.Factory());
        super.registerComponents(context, glide, registry);

    }

    /**
     * 清单解析的开启
     *
     * 这里不开启，避免添加相同的modules两次
     * @return
     */
    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}

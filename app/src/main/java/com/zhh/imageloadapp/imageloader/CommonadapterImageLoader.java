package com.zhh.imageloadapp.imageloader;

import android.content.Context;
import android.widget.ImageView;

import com.classic.adapter.interfaces.ImageLoad;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by zhh on 2017/04/01.
 */
public class CommonadapterImageLoader implements ImageLoad {
    @Override
    public void load(Context context, ImageView imageView, String imageUrl) {

        /**
         * //加载网络图片之前，请调用setImageLoad方法，设置网络图片加载的实现类
         helper.setImageLoad(new CommonadapterImageLoader());
         helper.setImageUrl(R.id.xxx,url);
         */
        //这里就是异步加载网络图片的地方
        ImageLoader.getInstance().displayImage(imageUrl, imageView, OptionsUtils.getImageLoaderOptions());

    }
}

package com.zhh.imageloadapp.glide;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.classic.adapter.interfaces.ImageLoad;
import com.zhh.imageloadapp.R;

/**
 * Created by zhh on 2017/2017/4/01.
 */
public class CommonadapterGlide implements ImageLoad {
    @Override
    public void load(Context context, ImageView imageView, String imageUrl) {

        Glide.with(context)

                .load(imageUrl)// 加载图片资源

//                .skipMemoryCache(false)//是否将图片放到内存中
//                .diskCacheStrategy(DiskCacheStrategy.ALL)//磁盘图片缓存策略
//                .dontAnimate()//不执行淡入淡出动画
                .crossFade(100)// 默认淡入淡出动画300ms
//                .override(300,300)//图片大小
                .placeholder(R.mipmap.ic_launcher)// 占位图片
                .error(R.mipmap.ic_launcher)//图片加载错误显示
                .centerCrop()//  fitCenter()
//                .animate()// 执行的动画
//                .bitmapTransform(null)// bitmap操作
//                .priority(Priority.HIGH)// 当前线程的优先级
//                .signature(new StringSignature("ssss"))
                .into(imageView);
    }
}

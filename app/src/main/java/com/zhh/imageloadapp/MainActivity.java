package com.zhh.imageloadapp;

import android.view.View;

import com.zhh.imageloadapp.base.BaseActivity;
import com.zhh.imageloadapp.fresco.FrescoWebActivity;
import com.zhh.imageloadapp.glide.GildeActivity;
import com.zhh.imageloadapp.imageloader.ImageLoaderActivity;
import com.zhh.imageloadapp.picasso.PicassoActivity;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    /**
     * ---------------------常用图片加载库
     *http://mt.sohu.com/20161215/n475917458.shtml
     *
     * Universal Image Loader：一个强大的图片加载库，包含各种各样的配置，最老牌，使用也最广泛。
     *
     *  Glide：Google推荐的图片加载库，专注于流畅的滚动。
     *
     * Picasso: Square出品，必属精品。和OkHttp搭配起来更配呦！
     *
     * Fresco：Facebook出的，天生骄傲！不是一般的强大。
     *
     *
     *
     * @return
     */
    @Override
    protected int setContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initLayout() {

    }


    @OnClick({R.id.btn_imageloader,R.id.btn_glide,R.id.btn_picasso, R.id.btn_fresco,})
    void onBtnClick(View v) {
        switch (v.getId()) {
            case R.id.btn_imageloader:
                openActivity(ImageLoaderActivity.class);
                break;

            case R.id.btn_glide:
                openActivity(GildeActivity.class);
                break;
            case R.id.btn_picasso:
                openActivity(PicassoActivity.class);
                break;
            case R.id.btn_fresco:
                openActivity(FrescoWebActivity.class);
                break;
            default:
                break;
        }
    }
}

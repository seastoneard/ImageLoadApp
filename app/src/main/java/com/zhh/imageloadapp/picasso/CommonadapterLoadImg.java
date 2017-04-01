package com.zhh.imageloadapp.picasso;

import android.content.Context;
import android.widget.ImageView;

import com.classic.adapter.interfaces.ImageLoad;
import com.squareup.picasso.Picasso;
import com.zhh.imageloadapp.R;


public class CommonadapterLoadImg implements ImageLoad {
    @Override
    public void load(Context context, ImageView imageView, String imageUrl) {

        //这里就是异步加载网络图片的地方
        Picasso.
                with(context).
                load(imageUrl).
                placeholder(R.mipmap.ic_launcher).
                error(R.mipmap.ic_launcher).
                fit().tag(this).
                into(imageView);
    }
}

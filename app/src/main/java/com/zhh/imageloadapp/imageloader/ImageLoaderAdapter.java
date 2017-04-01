package com.zhh.imageloadapp.imageloader;

import android.content.Context;

import com.classic.adapter.BaseAdapterHelper;
import com.classic.adapter.CommonAdapter;
import com.zhh.imageloadapp.R;
import com.zhh.imageloadapp.model.ImageModel;


import java.util.List;

/**
 *  Created by zhh on 2017/04/01.
 */
public class ImageLoaderAdapter extends CommonAdapter<ImageModel> {


    public ImageLoaderAdapter(Context context, int layoutResId, List<ImageModel> list) {
        super(context, layoutResId, list);
    }

    @Override
    public void onUpdate(BaseAdapterHelper helper, ImageModel model, int position) {
        helper.setText(R.id.text, model.getName())
                .setImageLoad(new CommonadapterImageLoader())
                .setImageUrl(R.id.img, model.getPath());

    }
}

package com.zhh.imageloadapp.picasso;

import android.content.Context;

import com.classic.adapter.BaseAdapterHelper;
import com.classic.adapter.CommonAdapter;
import com.zhh.imageloadapp.R;

import java.util.List;


public class PicassoAdapter extends CommonAdapter<String> {


    public PicassoAdapter(Context context, int layoutResId, List<String> list) {
        super(context, layoutResId, list);
    }

    @Override
    public void onUpdate(BaseAdapterHelper helper, String item, int position) {
        helper.setText(R.id.text, "图片" + (position + 1))
                .setImageLoad(new CommonadapterLoadImg())
                .setImageUrl(R.id.img, item);
    }
}

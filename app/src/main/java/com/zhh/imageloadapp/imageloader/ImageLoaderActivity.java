package com.zhh.imageloadapp.imageloader;

import android.widget.ImageView;
import android.widget.ListView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.zhh.imageloadapp.R;
import com.zhh.imageloadapp.base.BaseActivity;
import com.zhh.imageloadapp.datas.AppConfig;

import butterknife.Bind;

/**
 * Created by zhh on 2017/04/01.
 */
public class ImageLoaderActivity extends BaseActivity {

    @Bind(R.id.imageloader_img)
    ImageView img;

    @Bind(R.id.listview)
    ListView listView;

    @Override
    protected int setContentView() {
        return R.layout.imageloader_layout;
    }

    @Override
    protected void initLayout() {
        ImageLoader.getInstance().displayImage("http://avatar.csdn.net/4/A/A/1_zhh_csdn_ard.jpg",
                img, OptionsUtils.getImageLoaderOptions());
        ImageLoaderAdapter adapter = new ImageLoaderAdapter(this, R.layout.listview_img_item, AppConfig.resultImgData());
        listView.setAdapter(adapter);
    }
}

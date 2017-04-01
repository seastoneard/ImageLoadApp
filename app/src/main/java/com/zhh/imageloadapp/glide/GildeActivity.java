package com.zhh.imageloadapp.glide;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.zhh.imageloadapp.R;
import com.zhh.imageloadapp.base.BaseActivity;
import com.zhh.imageloadapp.datas.AppConfig;

import java.io.File;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by zhh on 2017/04/01.
 */
public class GildeActivity extends BaseActivity {

    /**
     * Glide的主要目的有两个:
     * 1.一个是实现平滑的图片列表滚动效果，
     * 2.另一个是支持远程图片的获取、大小调整和展示
     * 3.支持Gif 动画和视频剧照解码、智能的暂停和重新开始请求、支持缩略图

     * http://www.open-open.com/lib/view/open1440397324450.html
     */

    @Bind(R.id.img)
    ImageView img;

    @Bind(R.id.listview)
    ListView listView;


    private String imgurl = "http://avatar.csdn.net/4/A/A/1_zhh_csdn_ard.jpg";

    @Override
    protected int setContentView() {
        return R.layout.gilde_img_layout;
    }

    @Override
    protected void initLayout() {
        GlideAdapter adapter = new GlideAdapter(this, R.layout.listview_img_item, AppConfig.resultImgData());
        listView.setAdapter(adapter);
    }

    @OnClick({R.id.btn0, R.id.btn1, R.id.btn2})
    void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                test0();
                break;
            case R.id.btn1:
                test1();
                break;
            case R.id.btn2:
                // 必须在UI线程中调用
                Glide.get(GildeActivity.this).clearMemory();
                break;

        }

    }

    //基础glide网络图片加载
//      Glide的with方法不光接受Context，还接受Activity 和 Fragment，Context会自动的从他们获取

    //    图片的缩放，centerCrop()和fitCenter()：
    //使用centerCrop是利用图片图填充ImageView设置的大小，如果ImageView的
    private void test0() {
        Glide.with(this)
                .load(imgurl)//路径支持png,jpg,gif,mp4
                .placeholder(R.mipmap.ic_launcher) // 预加载图片
                .error(R.mipmap.ic_launcher)//加载图片失败
                .crossFade()//淡入淡出动画效果
                .centerCrop()
                .into(img);

    }

    //gif显示
    private void test1() {
        Glide.with(this)
                .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1491037864865&di=cc8f78a7e5c1d359839cec3463123b47&imgtype=0&src=http%3A%2F%2Fi.zeze.com%2Fattachment%2Fforum%2F201501%2F29%2F181236dyjtsu2qinms5qjz.jpg")
                .asGif() //判断加载的url资源是否为gif格式的资源
                .placeholder(R.mipmap.ic_launcher) // 预加载图片
                .error(R.mipmap.ic_launcher)//加载图片失败
                .into(img);
//         .into(new GlideDrawableImageViewTarget(img, 1));//如果要控制Gif 显示次数，可以使用

    }

    // 显示本地视频
    private void test2() {

        String filePath = "/storage/emulated/0/Pictures/example_video.mp4";
        Glide
                .with(this)
                .load(Uri.fromFile(new File(filePath)))
                .into(img);
    }

    //缓存
    private void test3() {
        Glide
                .with(this)
                .load(imgurl)
                .skipMemoryCache(true) //跳过内存缓存
                .into(img);
    }

    //缓存
    private void test4() {
        Glide
                .with(this)
                .load(imgurl)
                .diskCacheStrategy(DiskCacheStrategy.NONE) //跳过硬盘缓存
                .into(img);
    }


    /**
     * DiskCacheStrategy.NONE 什么都不缓存
     * DiskCacheStrategy.SOURCE 仅仅只缓存原来的全分辨率的图像
     * DiskCacheStrategy.RESULT 仅仅缓存最终的图像，即降低分辨率后的（或者是转换后的）
     * DiskCacheStrategy.ALL 缓存所有版本的图像（默认行为）
     */

//    使用Glide 显示圆形图片
    private void test5() {
        Glide.with(this).load(imgurl).asBitmap().centerCrop().into(new BitmapImageViewTarget(img) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(GildeActivity.this.getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                img.setImageDrawable(circularBitmapDrawable);
            }
        });
    }

}

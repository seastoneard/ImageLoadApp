package com.zhh.imageloadapp.picasso;

import android.os.Environment;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.zhh.imageloadapp.R;
import com.zhh.imageloadapp.base.BaseActivity;

import java.io.File;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by zhh on 2017/04/01.
 * 毕加索加载图片
 * <p>
 * <p>
 * 总结：
 * <p>
 * 如果你的项目里面，对于图片有一些具体的要求的话，建议使用这个库，
 * 但是这个库当你需要对图片作一些具体的操作比如加载圆角矩形图片、裁剪图片为圆形时，需要你自己写一些操作，
 * 如果基础不够好的会感觉很困难。还有就是这个库我们只能看到结果，无法关心图片的下载过程。
 */
public class PicassoActivity extends BaseActivity {

    @Bind(R.id.picasso_img)
    ImageView img;

    private String imgurl = "http://avatar.csdn.net/4/A/A/1_zhh_csdn_ard.jpg";

    @Override
    protected int setContentView() {
        return R.layout.picasso_img_layout;
    }

    @Override
    protected void initLayout() {

    }

    @Override
    protected void onDestroy() {
        Picasso.with(this).cancelTag(this);
        super.onDestroy();
    }

    @OnClick({R.id.picasso_btn0, R.id.picasso_btn1, R.id.picasso_listview})
    void onClick(View v) {
        switch (v.getId()) {
            case R.id.picasso_btn0:
                loadNetWorkImg(img);
                break;
            case R.id.picasso_btn1:
                loadimgError(img);
                break;
            case R.id.picasso_listview:
                openActivity(PicassoListActivity.class);
                break;
        }

    }

    //网络图片加载
    private void loadNetWorkImg(ImageView img) {

        Picasso.with(this)
                .load(imgurl)
                .into(img);
    }

    //本地图片加载
    private void loadResource(ImageView img) {

        int resourceId = R.mipmap.ic_launcher;
        Picasso
                .with(this)
                .load(resourceId)
                .into(img);
    }

    //File加载图片
    private void loadFileImg(ImageView img) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "test.jpg");
        Picasso
                .with(this)
                .load(file)
                .into(img);
    }

    private void loadimgError(ImageView img) {
        Picasso
                .with(this)
                .load(imgurl)
                .placeholder(R.mipmap.ic_launcher) // 预加载的图片
                .error(R.mipmap.ic_launcher) // 加载图片出错(图片不存在)的图片
                .into(img);
    }

    /**
     * 若该页面存在加载多张图片，可为imgView设置优先级
     * 你可以使用priority() 这个方法。这需要使用三个常量：HIGH ,MEDIUM ，LOW .
     * 默认的，所有的请求都使用MEDIUM 。赋予图片不同的加载优先级将会影响到Picasso的加载行为。
     */
    private void imgPriority(ImageView img) {

        Picasso.
                with(this).
                load(imgurl).
                fit().
                priority(Picasso.Priority.HIGH).
                into(img);

    }

    /**
     * 转换图片以适应布局大小并减少内存占用
     *
     * @param img
     */
    private void imgSizeSet(ImageView img) {
        Picasso.with(this)
                .load(imgurl)
                .resize(50, 50)
                .placeholder(R.mipmap.ic_launcher) // 预加载的图片
                .error(R.mipmap.ic_launcher) // 加载图片出错(图片不存在)的图片
                .centerCrop()//图片的scanType
                .fit().tag(this)
                .into(img);
    }

    /**
     * 单独一个时的推荐加载
     * Picasso.
     * with(this).
     * load(imgurl).
     * placeholder(R.mipmap.ic_launcher).
     * error(R.mipmap.ic_launcher).
     * fit().tag(this).
     * into(img);//一行代码链式加载
     */

//Picasso的tag设置，是listview滑动时不加载图片，停止滑动则加载图片

    //图片旋转
    private void imgRotate(ImageView img) {
        Picasso
                .with(this)
                .load(imgurl)
                .rotate(90f)//旋转90度--简单旋转(由中心开始)
                .into(img);

// 特定的旋转       rotate(float degrees, float pivotX, float pivotY)

    }



}

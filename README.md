# ImageLoadApp

<!-- Baidu Button BEGIN -->
<div id="article_content" class="article_content">

<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><strong><br>
</strong></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><strong>前言</strong>：图片加载涉及到图片的缓存、图片的处理、图片的显示等。四种常用的图片加载框架，分别是Fresco、ImageLoader、 Picasso、 Glide。</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">1.Universal Image Loader：<span style="color:rgb(51,51,51); font-family:Arial; font-size:14px">ImageLoader是比较老的框架，</span>一个强大的图片加载库，包含各种各样的配置，最老牌，使用也最广泛。</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">ImageLoader开源库存哪些特征:</p>
</blockquote>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="white-space:pre"></span><br>
<br>
<span style="white-space:pre"></span><span style="white-space:pre"></span></p>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="background-color:rgb(255,255,255)">.多线程下载图片，图片可以来源于网络，文件系统，项目文件夹assets中以及drawable中等</span></p>
</blockquote>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="background-color:rgb(255,255,255)">.支持随意的配置ImageLoader，例如线程池，图片下载器，内存缓存策略，硬盘缓存策略，图片显示选项以及其他的一些配置</span></p>
</blockquote>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="background-color:rgb(255,255,255)">.支持图片的内存缓存，文件系统缓存或者SD卡缓存</span></p>
</blockquote>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="background-color:rgb(255,255,255)">.支持图片下载过程的监听</span></p>
</blockquote>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="background-color:rgb(255,255,255)">.根据控件(ImageView)的大小对Bitmap进行裁剪，减少Bitmap占用过多的内存</span></p>
</blockquote>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="background-color:rgb(255,255,255)">.较好的控制图片的加载过程，例如暂停图片加载，重新开始加载图片，一般使用在ListView,GridView中，滑动过程中暂停加</span></p>
</blockquote>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="background-color:rgb(255,255,255)">.载图片，停止滑动的时候去加载图片</span></p>
</blockquote>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="background-color:rgb(255,255,255)">.提供在较慢的网络下对图片进行加载</span></p>
</blockquote>
</blockquote>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">2.Glide：Google推荐的图片加载库，专注于流畅的滚动。</p>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="white-space:pre"><span style="color:rgb(51,51,51); font-family:Arial; font-size:14px">Glide<span style="color:rgb(51,51,51); font-family:Arial; font-size:14px">开源库特征:</span></span></span></p>
</blockquote>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="white-space:pre"></span></p>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">.支持 Gif、WebP、缩略图。甚至是 Video，所以更该当做一个媒体缓存。</p>
</blockquote>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">.支持优先级处理。</p>
</blockquote>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">.内存友好,图片默认使用默认 RGB_565 而不是 ARGB_888，虽然清晰度差些，但图片更小，也可配置到 ARGB_888<span style="color:rgb(51,51,51); font-family:Arial; font-size:14px">等...</span></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
</blockquote>
</blockquote>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="white-space:pre"></span></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="font-family:微软雅黑,宋体; white-space:pre"></span></p>
<p style="color:rgb(51,51,51); font-family:Arial"><span style="font-size:14px">3.Picasso:</span><span style="color:rgb(47,47,47)"><span style="font-size:12px">Picasso是Square公司出品的一款非常优秀的开源图片加载库，是目前Android开发中超级流行的图片加载库之一，</span></span><span style="font-size:14px">和OkHttp搭配起来更配呦！</span></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="color:rgb(255,0,0)"><strong><br>
</strong></span></p>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="color:rgb(255,0,0)"><strong>&nbsp;&nbsp;</strong></span><a target="_blank" target="_blank" href="http://www.jianshu.com/p/c2b029f69f52" style="font-weight:bold">详情使用...</a></p>
</blockquote>
<p style="font-family:Arial"><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">4.Fresco：Facebook出的，天生骄傲！不是一般的强大。<br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial"><span style="white-space:pre"><a target="_blank" target="_blank" href="https://www.fresco-cn.org/" style="font-family:Arial; white-space:pre"><strong><span style="font-size:14px">开源学习...</span></strong></a></span></p>
</blockquote>
<p style="color:rgb(51,51,51); font-family:Arial"><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="color:rgb(51,51,51); font-family:宋体; font-size:14px; text-align:center; background-color:rgb(249,249,249)"><strong>效果(具体见源码)：</strong></span><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="color:rgb(51,51,51); font-family:宋体; font-size:14px; text-align:center; background-color:rgb(249,249,249)"><strong><br>
</strong></span></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="color:rgb(51,51,51); font-family:宋体; font-size:14px; text-align:center; background-color:rgb(249,249,249)">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<img src="http://images2015.cnblogs.com/blog/1130112/201704/1130112-20170405142020082-406161598.gif" width="300" height="400" alt=""><br>
</span></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="color:rgb(51,51,51); font-family:宋体; font-size:14px; text-align:center; background-color:rgb(249,249,249)"><br>
</span></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="color:rgb(51,51,51); font-family:宋体; font-size:14px; text-align:center; background-color:rgb(249,249,249)"><span style="color:rgb(51,51,51); font-family:宋体; font-size:14px; text-align:center; background-color:rgb(249,249,249)"><span style="font-family:&quot;Microsoft YaHei&quot;,Arial"><strong>开发环境：AndroidStudio2.2.1&#43;gradle-2.14.1</strong></span></span><br>
</span></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><span style="color:rgb(51,51,51); font-family:宋体; font-size:14px; text-align:center; background-color:rgb(249,249,249)"><strong>引入依赖：</strong></span></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"></p>
<pre name="code" class="java"> //适配器
    compile 'com.classic.adapter:commonadapter:1.2'
    //注解式开发
    compile 'com.jakewharton:butterknife:7.0.1'

    compile 'com.nostra13.universalimageloader:universal-image-loader:1.9.4'

    compile 'com.github.bumptech.glide:glide:3.6.1'

    compile 'com.squareup.picasso:picasso:2.5.2'</pre><br>
<p></p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px"><br>
<strong>设计知识：</strong><br>
</p>
<blockquote style="margin:0 0 0 40px; border:none; padding:0px">
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">1.注解式开发&#43;(Commonadapter)万能适配器使用</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">2.图片加载库：ImageLoader、Glide、Picasso</p>
<p style="color:rgb(51,51,51); font-family:Arial; font-size:14px">3.WebView&#43;SwipeRefreshLayout实现加载和刷新网页</p>
</blockquote>
<p><span style="text-align:center; background-color:rgb(249,249,249)"></span></p>
<p><strong><br>
</strong></p>
<p><strong>部分代码（Gilde使用）：</strong><br>
</p>
<p><strong></strong></p>
<pre name="code" class="java">public class GildeActivity extends BaseActivity {

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


    private String imgurl = &quot;http://avatar.csdn.net/4/A/A/1_zhh_csdn_ard.jpg&quot;;

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
                .load(&quot;https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;
                sec=1491037864865&amp;di=cc8f78a7e5c1d359839cec3463123b47&amp;
                imgtype=0&amp;src=http%3A%2F%2Fi.zeze.
                com%2Fattachment%2Fforum%2F201501%2F29%2F181236dyjtsu2qinms5qjz.jpg&quot;)
                .asGif() //判断加载的url资源是否为gif格式的资源
                .placeholder(R.mipmap.ic_launcher) // 预加载图片
                .error(R.mipmap.ic_launcher)//加载图片失败
                .into(img);
//         .into(new GlideDrawableImageViewTarget(img, 1));//如果要控制Gif 显示次数，可以使用

    }

    // 显示本地视频
    private void test2() {

        String filePath = &quot;/storage/emulated/0/Pictures/example_video.mp4&quot;;
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
</pre><br>
<br> 
</div>



<!-- Baidu Button END -->

package com.zhh.imageloadapp.fresco;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.zhh.imageloadapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by zhh on 2017/04/01.
 * Fresco加载图片还在学习中：
 * 网站推荐：
 * http://www.cnblogs.com/liushilin/p/5659301.html
 * http://blog.csdn.net/wl1769127285/article/details/51085207
 * https://www.fresco-cn.org/
 */
public class FrescoWebActivity extends AppCompatActivity {

    @Bind(R.id.refresh)
    SwipeRefreshLayout mySwipeRefreshLayout;

    @Bind(R.id.webview)
    WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_fresco_layout);
        ButterKnife.bind(this);


        //设置下拉圆圈的大小，两个值 LARGE， DEFAULT
        mySwipeRefreshLayout.setSize(SwipeRefreshLayout.LARGE);

        // 设置下拉圆圈上的颜色，蓝色、绿色、橙色、红色
        mySwipeRefreshLayout.setColorSchemeResources(
                android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                R.color.colorAccent,
                R.color.colorPrimary);

        /*
 * 设置手势下拉刷新的监听
 */
        mySwipeRefreshLayout.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {  // 刷新动画开始后回调到此方法
                        //重新刷新页面
                        webView.loadUrl(webView.getUrl());
                        Toast.makeText(FrescoWebActivity.this, "正在刷新", Toast.LENGTH_SHORT).show();
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                Toast.makeText(FrescoWebActivity.this, "刷新完成", Toast.LENGTH_SHORT).show();
                                mySwipeRefreshLayout.setRefreshing(false);
                            }
                        }, 4000);//刷新时间
                    }
                }
        );
        webSet();
        webView.loadUrl("http://www.cnblogs.com/liushilin/p/5659301.html");
//        复写shouldOverrideUrlLoading()方法，使得打开网页时不调用系统浏览器， 而是在本WebView中显示
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }

    private void webSet() {
        //声明WebSettings子类
        WebSettings webSettings = webView.getSettings();

        //如果访问的页面中要与Javascript交互，则webview必须设置支持Javascript
        webSettings.setJavaScriptEnabled(true);

        //支持插件
//        webSettings.setPluginsEnabled(true);

        //设置自适应屏幕，两者合用
        webSettings.setUseWideViewPort(true); //将图片调整到适合webview的大小
        webSettings.setLoadWithOverviewMode(true); // 缩放至屏幕的大小

        //缩放操作
        webSettings.setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
        webSettings.setBuiltInZoomControls(true); //设置内置的缩放控件。若为false，则该WebView不可缩放
        webSettings.setDisplayZoomControls(false); //隐藏原生的缩放控件
        //其他细节操作
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); //关闭webview中缓存
        webSettings.setAllowFileAccess(true); //设置可以访问文件
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true); //支持通过JS打开新窗口
        webSettings.setLoadsImagesAutomatically(true); //支持自动加载图片
        webSettings.setDefaultTextEncodingName("utf-8");//设置编码格式


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}

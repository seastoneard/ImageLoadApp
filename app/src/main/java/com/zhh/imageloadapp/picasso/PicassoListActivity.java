package com.zhh.imageloadapp.picasso;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.zhh.imageloadapp.R;
import com.zhh.imageloadapp.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * http://square.github.io/picasso/
 */
public class PicassoListActivity extends BaseActivity {

    @Bind(R.id.listview)
    ListView listView;

    List<String> list = new ArrayList<>();

    @Override
    protected int setContentView() {
        return R.layout.listview_layout;
    }

    @Override
    protected void initLayout() {

        list.add("https://ps.ssl.qhimg.com/sdmt/141_135_100/t014df0a6568ade8bf3.jpg");
        list.add("https://ps.ssl.qhimg.com/sdmt/102_135_100/t013400c72abbf99dc6.jpg");
        list.add("http://p1.so.qhmsg.com/bdr/_240_/t017c0fcaab604b369b.jpg");
        list.add("http://p3.so.qhmsg.com/bdr/_240_/t0187b567f068e163c3.jpg");
        list.add("https://github.com/fluidicon.png");
        list.add("http://p0.so.qhmsg.com/bdr/_240_/t01746d1d983b269e3a.jpg");
        list.add("http://p4.so.qhmsg.com/bdr/_240_/t01ea255bd145354014.png");
        list.add("http://p3.so.qhmsg.com/bdr/_240_/t01e143c41dc3cb50cd.jpg");
        PicassoAdapter adapter = new PicassoAdapter(this, R.layout.listview_img_item,list);
        listView.setAdapter(adapter);

    }
}

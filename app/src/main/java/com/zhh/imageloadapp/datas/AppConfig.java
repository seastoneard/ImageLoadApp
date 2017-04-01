package com.zhh.imageloadapp.datas;


import com.zhh.imageloadapp.model.ImageModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhh on 2017/04/01.
 */
public class AppConfig {

    public static List<ImageModel> resultImgData() {
        List<ImageModel> datas = new ArrayList<>();
        datas.add(new ImageModel(1, "杨桃", "http://foodqs.cn/memberpicture/landiaoxianguo200679132637.jpg", "杨桃好好吃的...", 0, 18.00));

        datas.add(new ImageModel(2, "凤梨", "https://encrypted-tbn3.gstatic.com/images?" +
                "q=tbn:ANd9GcSNDDaaVc0k3pq5E-lD2lvfqiHJu5nD61-gd2Npi2Odc5dts9KR", "凤梨好好吃的...", 0, 9.9));

        datas.add(new ImageModel(3, "草莓", "http://sucai.dabaoku.com/zhiwu/shuiguo/er122.jpg", "草莓好好吃的...", 0, 25));

        datas.add(new ImageModel(4, "西瓜", "http://img.xinggan.com/uploads/allimg/130531/1_130531135001_1.jpg", "西瓜好好吃的...", 0, 3.50));

        datas.add(new ImageModel(5, "香蕉", "https://encrypted-tbn1.gstatic.com/images?" +
                "q=tbn:ANd9GcRJoN1vBEtIskzx3OvX5nJNZWRXtpFB-ICTE4xoP9O2Hh8suxMe", "香蕉好好吃的...", 0, 3));

        datas.add(new ImageModel(6, "苹果", "http://pic.pimg.tw/leeyihugh/1409076519-230101976.jpg", "苹果好好吃的...", 0, 5));

        datas.add(new ImageModel(7, "黑布林", "http://img.caichongwang.com/thumbs/0036628.jpg", "黑布林好好吃的...", 0, 8.99));

        datas.add(new ImageModel(8, "梨", "https://encrypted-tbn2.gstatic.com/images?" +
                "q=tbn:ANd9GcSM3tPMibWK8L_aWnymYP4Vf80k15e__XRt3J1v__yImZ3DApBn", "梨好好吃的...", 0, 4.99));

        datas.add(new ImageModel(9, "葡萄", "http://www.39kf.com/uploadfiles/image/10190/TXT-200541114561734.jpg", "葡萄好好吃的...", 0, 9));

        datas.add(new ImageModel(10, "猕猴桃", "https://encrypted-tbn1.gstatic.com/images?" +
                "q=tbn:ANd9GcSmrTI_YOX2riOhVy9Q19GrvLE3jm1nlJmN144OSsNgKEF545Jn", "猕猴桃好好吃的...", 0, 20));

        datas.add(new ImageModel(11, "西红柿", "https://encrypted-tbn3.gstatic.com/images?" +
                "q=tbn:ANd9GcRHPnf6PtpE7Q5MwN9SEA4NeqQekcl7xI40Z9Nakn6RC11O4lel", "西红柿好好吃的...", 0, 2));

        return datas;
    }
}

package com.example.zzshopping.bean;

import com.example.zzshopping.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "p20pro", "小米mix alpha", "oppok7x", "魅族17pro", "vivo iQOO5pro", "三星 galaxy S20 FE 5G",
            "诺基亚 nokia 220 ","一加手机oneplus 8t "
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "华为p20pro 8GB+128GB 全网通渐变色4G手机",
            "小米MIX Alpha,5G环绕屏概念手机",
            "oppo K7X 8G+128G 蓝色超能续航5G手机",
            "魅族17Pro 高通骁龙 865 + UFS 3.1 + LPDDR5 | 6400W 全场景 AR 专业影像系统 | 煅烧陶瓷机身 ",
            "vivo iQOO5pro 皓影黑 8+128G 120Hz柔性屏 高通骁龙865 , 全网通双模5G手机",
            "三星 Galaxy S20 FE 5G(SM-G7810)双模5G 骁龙865 120Hz屏幕刷新率 8GB+128GB 异想蓝",
            "诺基亚 NOKIA 220 4G 移动联通电信三网4G 蓝色 直板按键 双卡双待 备用功能机 老人老年手机 ",
            "一加手机OnePlus 8T 5G旗舰 120Hz柔性直屏  高通骁龙865  12GB+256GB 银时 拍照游戏手机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6888, 19999, 1499, 4699, 4999, 4999,299,3699};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.huawei_s, R.drawable.xiaomi_s, R.drawable.oppo_s,
            R.drawable.meizu_s, R.drawable.vivo_s, R.drawable.sanxing_s,
            R.drawable.nuojiya_s,R.drawable.yijia_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.huawei, R.drawable.xiaomi, R.drawable.oppo,
            R.drawable.meizu, R.drawable.vivo, R.drawable.sanxing,
            R.drawable.nuojiya,R.drawable.yijia_s
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
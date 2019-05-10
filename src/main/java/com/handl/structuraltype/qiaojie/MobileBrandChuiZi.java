package com.handl.structuraltype.qiaojie;

/**
 * Created by handl on 2017/9/28.
 *
 * 维度1实现
 * 手机品牌实现
 *
 */
public class MobileBrandChuiZi extends MobileBrand {
    @Override
    void run() {
        System.out.println("我是锤子手机，我要运行软件了。。。");
        this.software.run();
    }
}

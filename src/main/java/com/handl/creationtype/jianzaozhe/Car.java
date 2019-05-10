package com.handl.creationtype.jianzaozhe;

/**
 * Created by handl on 2017/9/22.
 *
 * Car类包含组件引用
 *
 */
public class Car {

    private LunTai lunTai;
    private YinQing yinQing;

    public LunTai getLunTai() {
        return lunTai;
    }

    public void setLunTai(LunTai lunTai) {
        this.lunTai = lunTai;
    }

    public YinQing getYinQing() {
        return yinQing;
    }

    public void setYinQing(YinQing yinQing) {
        this.yinQing = yinQing;
    }
}

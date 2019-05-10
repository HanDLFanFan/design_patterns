package com.handl.structuraltype.qiaojie;

/**
 * Created by handl on 2017/9/28.
 *
 * 维度1 手机品牌抽象，提供抽象方法
 *  组合手机软件抽象
 *
 */
public abstract class MobileBrand {
    protected Software software;
    //手机品牌抽象的行为接口
    abstract void run();

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }
}

package com.handl.creationtype.chouxianggongchang;

/**
 * Created by handl on 2017/9/23.
 *
 * 产品---引擎
 *
 */
public abstract class YinQing {

    protected int power;//马力
    protected String model;//型号

    abstract public void say();


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

package com.handl.creationtype.yuanxing;

/**
 * Created by handl on 2017/9/22.
 *
 * C对象，没有引用变量，仅需要实现Cloneable接口，并重写clone方法，
 * 在clone方法中调用父类的clone方法
 *
 */
public class C implements Cloneable {

    private int i;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

package com.handl.creationtype.yuanxing;

/**
 * Created by handl on 2017/9/22.
 *
 * B对象，包含C对象，需要实现Cloneable接口，并重写clone方法
 * 在clone方法中先调用父类的clone方法创建一个新的B对象
 * 然后调用C对象的clone方法创建新的C对象，并赋值给新的B对象的C对象引用。
 *
 */
public class B implements Cloneable {

    private int i;

    private C c;

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        B newb = (B) super.clone();
        newb.c = (C) c.clone();
        return newb;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}

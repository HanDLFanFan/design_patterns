package com.handl.creationtype.yuanxing;

/**
 * Created by handl on 2017/9/22.
 *
 * A对象，包含B对象，需要实现Cloneable接口，并重写clone方法
 * 在clone方法中先调用父类的clone方法创建一个新的A对象
 * 然后调用B对象的clone方法创建新的B对象，并赋值给新的A对象的B对象引用。
 *
 */
public class A implements Cloneable {

    private int i;
    private B b;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        A newA = (A) super.clone();
        newA.b = (B) b.clone();
        return newA;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}

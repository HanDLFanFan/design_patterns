package com.handl.structuraltype.daili;

/**
 * Created by handl on 2017/9/22.
 *
 * 代理类：持有被代理对象的引用
 *          重写方法时调用被代理对象的方法
 *          可以做一些额外操作
 *
 */
public class Proxy implements Subject {

    private Subject subject;

    @Override
    public void play() {
        subject.play(); //调用被代理对象的方法
        System.out.println("我是代理类，我调用了被代理对象的play方法"); //额外操作
    }

    @Override
    public void eat() {
        subject.eat();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }
}

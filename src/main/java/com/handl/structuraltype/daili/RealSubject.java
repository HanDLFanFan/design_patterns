package com.handl.structuraltype.daili;

/**
 * Created by handl on 2017/9/22.
 *
 * 真实类
 *
 */
public class RealSubject implements Subject {
    @Override
    public void play() {
        System.out.println("我是RealSubject的play方法");
    }

    @Override
    public void eat() {
        System.out.println("我是RealSubject的eat方法");
    }
}

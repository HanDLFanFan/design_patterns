package com.handl.structuraltype.daili;

/**
 * Created by handl on 2017/10/13.
 */
public class DongTaiDaiLiRealeSubject implements DongTaiDaiLiSubject {
    @Override
    public void request(String name) {
        System.out.println("i name is "+name);
    }

    @Override
    public void say(String str) {
        System.out.println("这是测试是否两个方法都走一个方法处理！！！"+str);
    }
}

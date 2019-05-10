package com.handl.structuraltype.zhuangshi;

/**
 * Created by handl on 2017/9/22.
 *
 * 装饰子类A
 *
 */
public class DecorateA extends Decorate {

    public static final String NAME = "DecorateA";

    @Override
    public void sayHello() {
        //调用原有实现类的方法
        component.sayHello();
        //需要扩展的功能
        System.out.println(NAME);
    }
}

package com.handl.structuraltype.shipeiqi;

/**
 * Created by handl on 2017/9/24.
 *
 *
 * 被适配接口的实现
 *
 */
public class Ps2Impl implements Ps2{
    @Override
    public void say() {
        System.out.println("我是原生的PS2接口");
    }
}

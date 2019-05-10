package com.handl.structuraltype.shipeiqi;

/**
 * Created by handl on 2017/9/24.
 *
 * 需求接口的实现类
 *
 */
public class UsbImpl implements Usb{
    @Override
    public void say() {
        System.out.println("我是原生的USB接口");
    }
}

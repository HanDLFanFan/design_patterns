package com.handl.creationtype.chouxianggongchang;

/**
 * Created by handl on 2017/9/23.
 *
 * 产品族工厂实现----汽车
 *
 */
public class CarProductFactoryImpl implements ProductFactory{
    @Override
    public YouXiang createYouXiang() {
        return new CarYouXiang();
    }

    @Override
    public YinQing createYinQing() {
        return new CarYinQing();
    }
}

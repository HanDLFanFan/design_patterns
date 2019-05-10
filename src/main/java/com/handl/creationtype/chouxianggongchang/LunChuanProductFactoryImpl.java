package com.handl.creationtype.chouxianggongchang;

/**
 * Created by handl on 2017/9/23.
 *
 * 产品族工厂实现---轮船
 *
 */
public class LunChuanProductFactoryImpl implements ProductFactory{
    @Override
    public YouXiang createYouXiang() {
        return new LunChuanYouXiang();
    }

    @Override
    public YinQing createYinQing() {
        return new LunChuanYinQing();
    }
}

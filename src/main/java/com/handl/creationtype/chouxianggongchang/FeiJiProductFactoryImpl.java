package com.handl.creationtype.chouxianggongchang;

/**
 * Created by handl on 2017/9/23.
 *
 * 产品族工厂实现----飞机
 *
 */
public class FeiJiProductFactoryImpl implements ProductFactory{
    @Override
    public YouXiang createYouXiang() {
        return new FeiJiYouXiang();
    }

    @Override
    public YinQing createYinQing() {
        return new FeiJiYinQing();
    }
}

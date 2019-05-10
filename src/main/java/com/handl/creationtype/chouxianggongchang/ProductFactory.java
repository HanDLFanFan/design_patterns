package com.handl.creationtype.chouxianggongchang;

/**
 * Created by handl on 2017/9/23.
 *
 * 产品工厂接口，封装了产品创建步骤
 *
 */
public interface ProductFactory {
    //定义产品--油箱
    YouXiang createYouXiang();
    //定义产品--引擎
    YinQing createYinQing();

}

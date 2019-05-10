package com.handl.creationtype.jianzaozhe;

/**
 * Created by handl on 2017/9/22.
 *
 * 构造者抽象类：
 *      定义构造产品的步骤骨架
 *      提供返回产品的接口
 */
public interface CarBuilder {
    /**
     * 定义构造轮胎的步骤
     */
    void builderLunTai();

    /**
     * 定义构造引擎的步骤
     */
    void builderYinQing();

    /**
     * 返回构造对象
     * @return
     */
    Car creatCar();

}

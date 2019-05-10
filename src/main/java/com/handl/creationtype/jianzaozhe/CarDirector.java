package com.handl.creationtype.jianzaozhe;

/**
 * Created by handl on 2017/9/22.
 *
 * 构造者管理对象，持有构造者的引用，并管理构造过程和返回构造结果
 *
 */
public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector setBuilder(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
        return this;
    }

    /**
     * 管理构造并返回结果
     * 提示：这个地方也可以不返回结果，直接让客户端在构造者中获取
     * @return
     */
    public Car builderCar(){
        carBuilder.builderLunTai();
        carBuilder.builderYinQing();
        return carBuilder.creatCar();
    }
}

package com.handl.creationtype.jianzaozhe;

/**
 * Created by handl on 2017/9/22.
 *
 * 真实的构造者，实现抽象构造者
 *
 * 定义被构造产品的引用，并实现抽象方法来构造产品，在返回产品方法中，
 * 返回构造完成的产品
 */
public class CarBuilderA implements CarBuilder {

    private Car car;

    public CarBuilderA() {
        this.car = new Car();
    }

    @Override
    public void builderLunTai() {
        LunTai lunTai = new LunTai();
        lunTai.setName("奥迪");
        lunTai.setShape("圆的");
        car.setLunTai(lunTai);
    }

    @Override
    public void builderYinQing() {
        YinQing yinQing = new YinQing();
        yinQing.setName("贵的");
        yinQing.setFrom("进口");
        car.setYinQing(yinQing);
    }

    @Override
    public Car creatCar() {
        return car;
    }
}

package com.handl.creationtype.chouxianggongchang;

/**
 * Created by handl on 2017/9/23.
 *
 * 抽象工厂模式：提供一个创建一系列相关或者相互依赖对象的接口，而无需制定他们具体的类。
 *          用来解决有多个产品，并且产品有多个类型
 *
 *           步骤1： 创建抽象工厂类，定义具体工厂的公共接口；
             步骤2： 创建抽象产品族类 ，定义抽象产品的公共接口；
             步骤3： 创建抽象产品类 （继承抽象产品族类），定义具体产品的公共接口；
             步骤4： 创建具体产品类（继承抽象产品类） & 定义生产的具体产品；
             步骤5： 创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法；
             步骤6： 客户端通过实例化具体的工厂类，并调用其创建不同目标产品的方法创建不同具体产品类的实例
 *
 *    注意：抽象工厂与工厂方法模式的区别是：
 *          1.工厂方法模式所要创建的产品(对象)仅且只有一个，但是有多个产品实现，
 *              每一个产品实现对应每一个具体的产品实现工厂
 *          2.抽象工厂所创建的产品有许多个，每一个产品也有多个实现，但每一个产品都属于多个产品族(比如引擎和
 *              油箱属于产品，而汽车轮船和飞机属于产品族，产品族包含产品)
 *              抽象工厂定义的是产品的骨架，而抽象工厂的实现则是由具体的产品族来实现其包含的每一个产品(有多少个产品族
 *              就有多少个抽象工厂实现)
 *
 *      例如：飞机、轮船、汽车(产品族)都有引擎、油箱(产品)
 *
 *      1.产品接口类(油箱接口和引擎接口)
 *      2.产品接口实现类(有多少个产品族包含这些产品，就有多少个实现，这里就是飞机、轮船、汽车的产品(引擎、油箱)实现)
 *      3.抽象工厂接口(封装了产品实现的接口)
 *      4.抽象工厂实现类(有多少个产品族包含了这些产品，就有多少个工厂接口实现类，这里就是飞机、轮船、汽车的工厂实现)
 *
 */
public class Test {

    public static void main(String[] args) {
        //创建不同产品族工厂对象
        ProductFactory factoryFeiJi = new FeiJiProductFactoryImpl();
        ProductFactory factoryCar = new CarProductFactoryImpl();
        ProductFactory factoryLunChuan = new LunChuanProductFactoryImpl();

        //通过不同产品族创建引擎产品(对象)
        YinQing yinQingFeiJi = factoryFeiJi.createYinQing();
        yinQingFeiJi.setModel("飞机引擎");  //这些参数可以放到工厂里设置
        yinQingFeiJi.setPower(10000);
        YinQing yinQingCar = factoryCar.createYinQing();
        yinQingCar.setModel("汽车引擎");
        yinQingCar.setPower(2000);
        YinQing yinQingLunChuan = factoryLunChuan.createYinQing();
        yinQingLunChuan.setModel("轮船引擎");
        yinQingLunChuan.setPower(6000);

        yinQingFeiJi.say();
        yinQingCar.say();
        yinQingLunChuan.say();

        //通过不同产品族创建油箱产品(对象)
        YouXiang youXiangFeiJi = factoryFeiJi.createYouXiang();
        youXiangFeiJi.setModel("飞机油箱");
        youXiangFeiJi.setCapacity(5000);
        YouXiang youXiangCar = factoryCar.createYouXiang();
        youXiangCar.setModel("汽车油箱");
        youXiangCar.setCapacity(1000);
        YouXiang youXiangLunChuan = factoryLunChuan.createYouXiang();
        youXiangLunChuan.setModel("轮船油箱");
        youXiangLunChuan.setCapacity(15000);


        youXiangFeiJi.say();
        youXiangCar.say();
        youXiangLunChuan.say();
    }
}

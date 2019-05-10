package com.handl.creationtype.jiandangongchang;

/**
 * Created by handl on 2017/9/22.
 *
 * 简单工厂模式：
 *      从设计模式的类型上来说，简单工厂模式是属于创建型模式，
 *      又叫做静态工厂方法（Static Factory Method）模式，
 *      但不属于23种GOF设计模式之一。简单工厂模式是由一个
 *      工厂对象决定创建出哪一种产品类的实例。简单工厂模式是
 *      工厂模式家族中最简单实用的模式，可以理解为是不同工厂模式的
 *      一个特殊实现
 *
 *
 *
 * 模拟一个加减运算
 *
 *  1.要有加碱类的接口或者是抽象类(Operation，面向对象--抽象),
 *      提供实现类统一操作的结果方法result方法
 *
 *  2.加碱属于两种运算，也就是说要有一个加法实现类(SumOperation)和
 *      减法实现类(SubOperation)
 *
 *  3.加碱类的工厂类，用于创建运算的实现类(可以通过策略或者是
 *      标识判断等方式通过一个方法创建实现类，
 *      也可以多个实现类方法分开创建实现类)
 *
 *   提示:需要扩展算法，只需要重新写一个算法类继承抽象算法类，
 *          然后再工厂类中添加新的算法类的创建方式
 *
 */
public class Test {

    public static void main(String[] args) {
        //通过工厂类创建实例(加法)
        Operation operationSum = OperationFactory.createOperation("sum");
        getresult(operationSum);

        //通过工厂类创建实例(减法)
        Operation operationSub = OperationFactory.createOperation("sub");
        getresult(operationSub);
    }

    static void getresult(Operation operationSub){
        operationSub.setX(10);
        operationSub.setY(5);
        operationSub.result();
    }

}

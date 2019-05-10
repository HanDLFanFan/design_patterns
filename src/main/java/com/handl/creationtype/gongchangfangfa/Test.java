package com.handl.creationtype.gongchangfangfa;

/**
 * Created by handl on 2017/9/22.
 *
 * 工厂方法模式：对应每一个需要创建的对象都有一个工厂类
 *      与简单工厂的区别是：
 *              1.简单工厂模式的逻辑判断是在工厂类中处理，而工厂方法模式的
 *                  逻辑处理转移到客户端来做。
 *              2.简单工厂模式的工厂实现类创建所有的需要创建的对象，而工厂方法模式
 *                  则是对应每一个需要创建的对象都有一个工厂类，并都继承同一个工厂接口
 *
 *  还是以加减运算为例：
 *      1.加减运算抽象类Operation，运算工厂接口类OperationFactory
 *      2.加减运算多个实现子类SumOperation，SubOperation
 *          运算工厂多个实现子类SumOperationFactory，SubOperationFactory
 *
 */
public class Test {

    public static void main(String[] args) {
        //创建工厂实例(可以改变工厂创建实例类型)
        OperationFactory factory = new SumOperationFactory();
//        OperationFactory factory = new SubOperationFactory();
        //通过工厂实例创建运算类实例
        Operation operation = factory.createOperation();

        //使用运算实例
        operation.setX(10);
        operation.setY(9);
        operation.result();
    }

}

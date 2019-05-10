package com.handl.structuraltype.zhuangshi;

/**
 * Created by handl on 2017/9/22.
 *
 * 装饰模式：动态的给一个对象添加一些额外的职责，
 *      就增加功能来讲，装饰模式比生成子类更加灵活。
 *
 *      注意：是在原来方法的基础上添加新的功能
 *
 *  1.接口类Component(普通的接口或者抽象类)
 *
 *  2.实现类ComponentImpl
 *
 *  3.装饰类Decorate(或者是抽象类)：扩展实现类的功能
 *      1).装饰类也要实现接口类
 *      2).装饰类中要有接口类的引用(其实就是要有实现类对象)
 *      3).重写接口类的方法：注意重写方法时一定先调用实现类原来的方法，在写自己的方法实现，
 *          这样就既保留了原来的实现，又扩展了新的功能
 *
 *  4.装饰子类(DecorateA,DecorateB,......)：可以通过不同的装饰子类来扩展不同的功能，
 *          用法和装饰类一样。
 *
 *
 *  提示:装饰类也可以去扩展装饰类的功能：比如装饰类A扩展实现类，装饰类B扩展装饰类A
 *      即：装饰A拿的是实现类的引用
 *          装饰B拿的是装饰A的引用
 *
 */
public class Test {

    public static void main(String[] args) {
        //创建原有实现类
        Component component = new ComponentImpl();

        //装饰子类A扩展实现类
        Decorate decorateA = new DecorateA();
        decorateA.setComponent(component); //传入实现类
        decorateA.sayHello(); //调用装饰子类A的方法

        //装饰子类B扩展实现类
        Decorate decorateB = new DecorateB();
        decorateB.setComponent(component); //传入实现类
        decorateB.sayHello(); //调用装饰子类B的方法

        //装饰子类A扩展实现类，装饰子类B扩展装饰子类A
        decorateB.setComponent(decorateA);
        decorateB.sayHello();

    }
}

package com.handl.structuraltype.xiangyuan;

/**
 * Created by handl on 2017/9/29.
 *
 * 享元模式Flyweight：运用共享技术有效地支持大量细粒度的对象。
 *      内部状态：对象中相同的属性
 *      外部状态：对象中不同的属性
 *      将内部状态和外部状态分离，分别封装对象，内部状态对象因为是相同的，所以只存在一个实例，
 *      而外部状态因为之间不相同，所以存在许多实例。
 *      在使用时，将许多的外部状态实例都作用在一个内部状态实例中，这样就不会导致很多对象中有
 *          相同属性的存在，从而减少消耗。
 *
 *     享元工厂类FlyweightFactory：用来创建享元对象
 *     享元抽象类Flyweight:定义接受外部属性状态的接口
 *     享元实现类：需要共享的(通过享元工厂获取对象)，和不需要共享的(通过new实现)
 *          1.共享的ConcreteFlyweight：使用共享方式结合外部状态
 *          2.不共享的UnsharedConcreteFlyweight：不强制共享
 *
 *      例子：五子棋，内部状态(颜色黑白)，外部状态(坐标)
 *
 *      1.WuZiQiFlyweightFactory:五子棋享元工厂,定义享元对象的Hash(保证唯一性)
 *      2.WuZiQiFlyweight:五子棋享元抽象(内部状态)
 *      3.WuZiQiConcreteFlyweight：五子棋共享享元实现类
 *      4.WuZiQiUnsharedConcreteFlyweight：五子棋不共享享元实现类
 *      5.Coordinate:坐标类(外部状态)
 */
public class Test {

    public static void main(String[] args) {
        //创建享元工厂
        WuZiQiFlyweightFactory flyweightFactory = new WuZiQiFlyweightFactory();
        //通过享元工厂获取一个黑色享元对象
        WuZiQiFlyweight hei1 = flyweightFactory.createFlyweight("黑");
        //通过享元工厂获取一个白色享元对象
        WuZiQiFlyweight bai1 = flyweightFactory.createFlyweight("白");
        //给享元对象设置外部属性
        hei1.action(new Coordinate(1,2));
        bai1.action(new Coordinate(3,4));

        //通过享元工厂获再一次获取一个黑色享元对象
        WuZiQiFlyweight hei2 = flyweightFactory.createFlyweight("黑");
        //比较两个享元对象是否已经共享(是同一个对象)
        System.out.println("hei1 == hei2:"+ (hei1 == hei2));

        //创建不共享的享元对象，通过new
        WuZiQiFlyweight bai2 = new WuZiQiUnsharedConcreteFlyweight("白");
        bai2.action(new Coordinate(5,6));
        System.out.println("bai1 == bai2:"+ (bai1 == bai2));
    }
}

package com.handl.creationtype.yuanxing;

/**
 * Created by handl on 2017/9/22.
 *
 * 原型模式:实现Cloneable接口，重写clone方法
 *      默认为：基本类型复制值，引用类型赋值内存地址，而不是创建新的对象
 *      1.浅复制：引用类型变量仅仅复制内存地址
 *          被复制的类(包含引用类型)实现Cloneable接口，重写clone方法，就是最简单的浅复制。
 *      2.深复制：引用类型变量重新创建，是一个新的对象
 *              被赋值的类实现Cloneable接口并重写clone方法，在clone方法中
 *          先调用父类的clone方法创建新的本类对象，
 *          然后调用引用类型的clone方法重新给新对象的引用类型变量赋值，
 *              如果引用类型中也包含引用类型，那么也需要实现Cloneable接口并重写clone方法，
 *          也是先调用父类的clone方法创建新的本类对象，
 *          同样在clone方法中调用引用类型的clone方法给新的对象变量赋值。
 *
 *          以此类推。。。。
 *
 *
 *      有对象A，B，C
 *      A包含B，B包含C
 *      A需要实现Cloneable接口并重写clone方法
 *      首先调用父类的clone方法创建新的A对象
 *      并且要给新的A对象赋值调用B的clone方法
 *
 *      B对象类似于A对象，也要实现Cloneable接口并重写clone方法
 *      首先调用父类的clone方法创建新的B对象
 *      并且要给新的B对象赋值调用的clone方法C
 *
 *      C对象如果没有引用类型，那么只要实现Cloneable接口并重写clone方法
 *      在clone方法中调用父类的clone方法即可
 *
 *
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        //创建ABC三个对象，并组合
        A a = new A();
        B b = new B();
        C c = new C();

        a.setI(1);
        a.setB(b);

        b.setI(2);
        b.setC(c);

        c.setI(3);

        //调用A对象的clone方法，复制一个A对象

        A newA = (A) a.clone();
        B newB = newA.getB();
        C newC =newB.getC();

        //比较ABC和新的ABC三个对象是否是不同的内存地址
        System.out.println("a===newA:"+ (a==newA));
        System.out.println("b===newb:"+ (b==newB));
        System.out.println("c===newC:"+ (c==newC));
    }
}

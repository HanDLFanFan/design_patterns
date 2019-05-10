package com.handl.creationtype.danli;

/**
 * Created by handl on 2017/9/26.
 *
 * 静态内部类方式：这种方式同样利用了classloder的机制来保证初始化instance时只有一个线程，
 *          和饿汉式的区别是，静态内部类方式是在使用时才实例化
 *
 * 注意：静态内部类方式中，在静态内部类创建外部类对象
 *
 */
public class JingTaiInnerClass {

    //私有构造器
    private JingTaiInnerClass(){
    }

    //定义静态内部类,类似于外部类的静态属性
    private static class Singleton{
        private final static JingTaiInnerClass jingTaiInnerClass = new JingTaiInnerClass();
    }

    //全局访问接口,通过调用静态内部类返回
    public static final JingTaiInnerClass getJingTaiInnerClass(){
        return Singleton.jingTaiInnerClass;
    }
}

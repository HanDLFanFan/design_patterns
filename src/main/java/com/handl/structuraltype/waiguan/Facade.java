package com.handl.structuraltype.waiguan;

/**
 * Created by handl on 2017/9/22.
 *
 * 外观类:持有被封装对象的引用，并在构造函数实例化
 *      提供封装引用对象的方法，对客户端提供统一调用
 *
 */
public class Facade {
    /**
     * 持有被封装对象引用
     */
    private SubOne one;
    private SubTwo two;

    /**
     * 实例化被封装对象
     */
    public Facade() {
        this.one = new SubOne();
        this.two = new SubTwo();
    }

    /**
     * 提供对客户端调用的封装接口
     *
     * 可以任意组合，使之完成功能
     *
     */
    public void say(){
        one.say();
        two.say();
    }

    public void eat(){
        two.eat();
    }

}

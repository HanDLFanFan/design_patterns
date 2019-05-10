package com.handl.structuraltype.daili;

/**
 * Created by handl on 2017/9/22.
 *
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问
 *
 *  代理类需要代理具体类，防止客户端直接访问具体类，那么代理类和具体类就需要有共同的方法
 *
 * 1.接口类Subject(提供代理类和实现类的共同方法)
 *
 * 2.实现类RealSubject，需要实现接口类，重写其方法
 *
 * 3.代理类Proxy,也需要实现接口类并重写其方法，
 *      但代理类持有实现类的引用，方法中其实调用的还是实现类的方法
 *
 *  提示：可以在代理类中做一些额外的操作
 */
public class Test {

    public static void main(String[] args) {
        //创建代理被，并传入被代理类对象
        Proxy proxy = new Proxy(new RealSubject());

        proxy.play();
        proxy.eat();

    }
}

package com.handl.structuraltype.daili;

/**
 * Created by handl on 2017/10/13.
 *
 * 在java的动态代理机制中，有两个重要的类或接口，
 * 一个是 InvocationHandler(Interface)、
 * 另一个则是 Proxy(Class)，
 * 这一个类和接口是实现我们动态代理所必须用到的。
 *
 */
public class DongTaiDaiLiTest {

    public static void main(String[] args) {
        //通过客户端或去代理类，并调用方法
        DongTaiDaiLiClient.invokeMethod().request("haha");
        System.out.println("-----------------------------------");
        DongTaiDaiLiClient.invokeMethod().say("olololololo");
    }
}

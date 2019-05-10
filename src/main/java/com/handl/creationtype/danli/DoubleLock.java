package com.handl.creationtype.danli;

/**
 * Created by handl on 2017/9/26.
 *
 * 双重所模式:比懒汉式的同步方法效率高
 *
 */
public class DoubleLock {

    private volatile static DoubleLock doubleLock;
    //私有构造器
    private DoubleLock(){
    }

    //全局访问接口,双重锁模式,线程安全的，效率快(jdk1.5后支持)
    public static DoubleLock getLanHanShi(){
        if (doubleLock == null){
            synchronized (DoubleLock.class){
                if (doubleLock == null){
                    doubleLock = new DoubleLock();
                }
            }
        }
        return doubleLock;
    }
}

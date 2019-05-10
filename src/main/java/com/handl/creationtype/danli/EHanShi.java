package com.handl.creationtype.danli;

/**
 * Created by handl on 2017/9/26.
 *
 * 饿汉式：在类初始化或者装载的时候进行实例化创建
 *
 *      初始化：只定义的类的引用，在静态代码块中初始化
 *      装载：定义引用并直接初始化
 *
 */
public class EHanShi {

    //装载实例化
    private static EHanShi eHanShi = new EHanShi();
    //初始化实例化
    /*static {
        eHanShi = new EHanShi();
    }*/

    //私有构造器
    private EHanShi(){
    }

    //全局访问接口,饿汉式根据jvm机制，是安全的
    public static EHanShi geteHanShi(){
        return eHanShi;
    }
}

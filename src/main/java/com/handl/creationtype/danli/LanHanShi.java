package com.handl.creationtype.danli;

/**
 * Created by handl on 2017/9/26.
 *
 * 懒汉式：在第一次创建对象时才初始化
 *      1.线程不安全
 *      2.线程安全
 */
public class LanHanShi {

    private static LanHanShi lanHanShi;

    //私有构造器.防止他人来构造对象
    private LanHanShi() {
    }

    //全局访问接口1,线程不安全的，多线程访问下会造成对象有多个
    /*public static LanHanShi getLanHanShi(){
        if (lanHanShi == null){
            lanHanShi = new LanHanShi();
        }
        return lanHanShi;
    }*/

    //全局访问接口2,线程安全的，通过加锁同步，让多线程排队处理,缺点是效率慢
    public static synchronized LanHanShi getLanHanShi(){
        if (lanHanShi == null){
            lanHanShi = new LanHanShi();
        }
        return lanHanShi;
    }

}

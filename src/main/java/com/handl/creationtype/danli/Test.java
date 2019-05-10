package com.handl.creationtype.danli;

/**
 * Created by handl on 2017/9/26.
 *
 * 单例模式Singleton：保证一个类仅有一个实例，并提供一个访问它的全局访问点
 *      懒汉式，
 *      饿汉式，
 *      双重锁模式，
 *      静态内部类方式，
 *      枚举
 */
public class Test {

    public static void main(String[] args) {
        //饿汉式
        EHanShi eHanShi1 = EHanShi.geteHanShi();
        EHanShi eHanShi2 = EHanShi.geteHanShi();
        System.out.println("饿汉式比较===" + (eHanShi1 == eHanShi2 ? true : false));

        //懒汉式
        LanHanShi lanHanShi1 = LanHanShi.getLanHanShi();
        LanHanShi lanHanShi2 = LanHanShi.getLanHanShi();
        System.out.println("懒汉式比较===" + (lanHanShi1 == lanHanShi2 ? true : false));

        //双重锁模式
        DoubleLock doubleLock1 = DoubleLock.getLanHanShi();
        DoubleLock doubleLock2 = DoubleLock.getLanHanShi();
        System.out.println("双重锁比较===" + (doubleLock1 == doubleLock2 ? true : false));

        //静态内部类方式
        JingTaiInnerClass jingTaiInnerClass1 = JingTaiInnerClass.getJingTaiInnerClass();
        JingTaiInnerClass jingTaiInnerClass2 = JingTaiInnerClass.getJingTaiInnerClass();
        System.out.println("静态内部类比较===" + (jingTaiInnerClass1 == jingTaiInnerClass2 ? true : false));

        //枚举方式
        EnumType enumType1 = EnumType.INSRTANSE;
        EnumType enumType2 = EnumType.INSRTANSE;
        System.out.println("枚举比较===" + (enumType1 == enumType2 ? true : false));

        System.out.println(EnumType.OBJECT.isFlag());
        System.out.println(EnumType.INSRTANSE.isFlag());
    }
}

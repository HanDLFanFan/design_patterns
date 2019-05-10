package com.handl.behaviouraltype.guanchazhe;

/**
 * Created by handl on 2017/9/22.
 *
 * 观察者模式(发布订阅模式)：定义了一种一对多的关系，让多个观察者对象同时
 *      监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有的观察者对象，
 *      使他们能够自动的更新自己。
 *
 *     1.主题接口(主题抽象类)Subject：保存所有监听主题的观察者对象集合，
 *          定义对观察者对象的添加和删除以及通知操作的步骤
 *
 *     2.主题实现子类SubjectImpl:继承主题接口，使其拥有对观察者操作的步骤定义以及
 *          具体的操作观察者。
 *          可以定义特有的状态信息，然后通知到观察者对象。
 *
 *     3.观察者接口Observer:定义了一个更新接口，让所有的具体的观察者实现，实现统一调用
 *
 *     3.观察者实现ObserverImpl:实现观察者接口，并实现更新接口，接受一个主题类的对象，
 *          用来接收主题类的更新和状态(当然也可以不适用主题对象，不需要主题的状态)
 *
 */
public class Test {

    public static void main(String[] args) {
        //创建主题类
        SubjectImpl subject = new SubjectImpl();
        subject.setName("我是主题实现类");

        //创建观察者类,（不需要主题和观察者有交互可以在观察者中不适用主题引用）
        Observer observerA = new ObserverImpl("我是观察者A",subject);
        Observer observerB = new ObserverImpl("我是观察者B",subject);

        //把观察者添加到主题的观察者集合
        subject.addObserver(observerA);
        subject.addObserver(observerB);

        //通过主题的notifyObserverf方法通知观察者
        subject.notifyObserver();

        //现在删除观察者2，在调用通知方法
        subject.deleteObserver(observerB);
        subject.setName("我已经删除了观察者2");
        subject.notifyObserver();
    }
}

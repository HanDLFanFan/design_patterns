package com.handl.behaviouraltype.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by handl on 2017/9/23.
 *
 * 主题抽象类，定义了观察者集合，以及对观察者的添加、删除、通知等操作
 *
 */
public class Subject {
    //定义需要通知的观察者集合
    protected List<Observer> observerList = new ArrayList<>();

    /**
     * 添加观察者对象到集合
     * @param observer
     */
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    /**
     * 从集合删除观察者
     * @param observer
     */
    protected void deleteObserver(Observer observer){
        observerList.remove(observer);
    }

    /**
     * 定义通知接口，通知集合中的每一个观察者
     *
     * 可以放到子类实现
     *
     */
    protected void notifyObserver(){
        for (Observer observer : observerList)
            observer.updata();
    }

}

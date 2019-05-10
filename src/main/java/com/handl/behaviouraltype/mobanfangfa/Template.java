package com.handl.behaviouraltype.mobanfangfa;

/**
 * Created by handl on 2017/9/22.
 *
 * 模板类
 *
 */
public abstract class Template {

    /**
     * 定义算法骨架方法，把算法提出抽象方法，在子类实现
     * @param x
     * @param y
     */
    protected void result(int x,int y){
        //调用算法抽象方法
        int sum = sum(x,y);

        System.out.println("结果是:" + sum);

    }

    /**
     * 抽象算法方法，在子类实现
     * @param x
     * @param y
     * @return
     */
    abstract protected int sum(int x,int y);
}

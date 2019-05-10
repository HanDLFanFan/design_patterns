package com.handl.behaviouraltype.mingling;

/**
 * Created by handl on 2017/9/28.
 *
 * 命令抽象类:定义执行者引用，和命令统一操作接口
 *
 */
public abstract class Command {

    //定义接收者引用
    protected Receiver receiver;

    //通过构造函数传入具体对应的执行者
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    //定义命令统一处理接口
    abstract void action();
}

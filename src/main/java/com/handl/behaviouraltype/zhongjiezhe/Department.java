package com.handl.behaviouraltype.zhongjiezhe;

/**
 * Created by handl on 2017/9/29.
 *
 * 同事类抽象
 *      定义中介者引用，
 *      定义发送(通过调用中介者来发送消息)接口
 *      定义接受消息接口
 */
public abstract class Department {
    //定义中介者引用
    protected Mediator mediator;

    public Department(Mediator mediator) {
        this.mediator = mediator;
    }

    //发送消息接口
    public void sendMsg(String msg,int from,int to){
        mediator.action(msg,from,to);
    }

    //定义消息接收接口
    public void notify(String msg,int from){
        System.out.println(from+",发来了消息:"+msg);
    }

}

package com.handl.behaviouraltype.zhongjiezhe;

/**
 * Created by handl on 2017/9/29.
 *
 * 中介者实现类：定义所有的同事应用，这里用一个列表包含
 *
 */
public class MediatorImpl extends Mediator {

    @Override
    public void action(String msg, int from, int to) {
        //接收到消息，调用被通知同事通知方法
        System.out.println("收到"+from+"发来的消息，他要发送给"+to);
        this.departmentList.get(to).notify(msg,from);
    }
}

package com.handl.behaviouraltype.mingling;

/**
 * Created by handl on 2017/9/28.
 *
 * 具体命令执行者---烤羊腿
 *
 */
public class YangTuiReceiver implements Receiver {
    @Override
    public void action() {
        System.out.println("现在开始烤羊腿!!!");
    }
}

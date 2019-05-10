package com.handl.behaviouraltype.mingling;

/**
 * Created by handl on 2017/9/28.
 *
 * 具体命令实现类：烤鸡翅
 *
 */
public class JiChiReceiver implements Receiver {
    @Override
    public void action() {
        System.out.println("现在开始烤鸡翅!!!!!!!!");
    }
}

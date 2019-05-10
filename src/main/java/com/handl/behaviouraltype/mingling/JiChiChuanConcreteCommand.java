package com.handl.behaviouraltype.mingling;

/**
 * Created by handl on 2017/9/28.
 *
 * 具体命令实现类：烤鸡翅
 *
 */
public class JiChiChuanConcreteCommand extends Command {

    public JiChiChuanConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void action() {
        this.receiver.action();
    }
}

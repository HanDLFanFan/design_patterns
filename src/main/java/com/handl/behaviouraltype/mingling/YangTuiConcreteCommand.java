package com.handl.behaviouraltype.mingling;

/**
 * Created by handl on 2017/9/28.
 *
 * 具体命令实现类：烤羊腿
 *
 */
public class YangTuiConcreteCommand extends Command {

    public YangTuiConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void action() {
        this.receiver.action();
    }
}

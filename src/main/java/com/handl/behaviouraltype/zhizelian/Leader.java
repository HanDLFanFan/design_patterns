package com.handl.behaviouraltype.zhizelian;

/**
 * Created by handl on 2017/9/28.
 *
 * 处理着抽象类
 *       定义处理者引用
 *       定义统一的处理接口
 *
 */
public abstract class Leader {
    //处理者引用(让具体的处理持有下一个具体处理者对象)
    protected Leader leader;

    public Leader(Leader leader) {
        this.leader = leader;
    }

    //统一的处理接口,接受请求对象
    abstract void action(Leave leave);
}

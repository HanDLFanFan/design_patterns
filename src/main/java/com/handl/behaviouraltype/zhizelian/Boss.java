package com.handl.behaviouraltype.zhizelian;

/**
 * Created by handl on 2017/9/28.
 *
 * 处理者实现类--Boss，能够处理7天以上的请假
 *
 */
public class Boss extends Leader {

    public Boss(Leader leader) {
        super(leader);
    }

    @Override
    void action(Leave leave) {
        if (leave.getDay() > 10)
            //这里是最终处理，没有下一个处理对象了
            System.out.println("Boss:"+leave.getName()+"你给我滚蛋吧!!!");
        else
            System.out.println("Boss:"+leave.getName()+",你请假"+leave.getDay()+"天，批准了!!!");
    }
}

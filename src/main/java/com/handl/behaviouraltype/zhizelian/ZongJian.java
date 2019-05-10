package com.handl.behaviouraltype.zhizelian;

/**
 * Created by handl on 2017/9/28.
 *
 * 处理者实现类--总监，能够处理5-7天的请假
 *
 */
public class ZongJian extends Leader {

    public ZongJian(Leader leader) {
        super(leader);
    }

    @Override
    void action(Leave leave) {
        if (leave.getDay() > 7)
            //把请求转移到下一个对象处理
            this.leader.action(leave);
        else
            System.out.println("总监:"+leave.getName()+",你请假"+leave.getDay()+"天，批准了!!!");
    }
}

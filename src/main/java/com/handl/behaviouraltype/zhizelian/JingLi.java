package com.handl.behaviouraltype.zhizelian;

/**
 * Created by handl on 2017/9/28.
 *
 * 处理者实现类--经理，能够处理3-5天的请假
 *
 */
public class JingLi extends Leader {

    public JingLi(Leader leader) {
        super(leader);
    }

    @Override
    void action(Leave leave) {
        if (leave.getDay() > 5)
            //把请求转移到下一个对象处理
            this.leader.action(leave);
        else
            System.out.println("经理:"+leave.getName()+",你请假"+leave.getDay()+"天，批准了!!!");
    }
}

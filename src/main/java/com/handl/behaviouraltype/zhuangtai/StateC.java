package com.handl.behaviouraltype.zhuangtai;

/**
 * Created by handl on 2017/9/23.
 *
 * 不同状态实现类----绑定卡
 *
 *
 */
public class StateC implements State{
    @Override
    public void handl(StateContext stateContext) {
        System.out.println("开始绑卡验证，当前状态值是："+stateContext.getStateValue());
    }
}

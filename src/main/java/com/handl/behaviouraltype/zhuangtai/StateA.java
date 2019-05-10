package com.handl.behaviouraltype.zhuangtai;

/**
 * Created by handl on 2017/9/23.
 *
 * 不同状态实现类----身份证认证
 *
 */
public class StateA implements State{
    @Override
    public void handl(StateContext stateContext) {
        System.out.println("开始身份证认证，当前状态值是："+stateContext.getStateValue());
    }
}

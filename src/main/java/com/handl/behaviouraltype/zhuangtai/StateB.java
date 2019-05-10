package com.handl.behaviouraltype.zhuangtai;

/**
 * Created by handl on 2017/9/23.
 *
 * 不同状态实现类----人脸识别
 *
 */
public class StateB implements State{
    @Override
    public void handl(StateContext stateContext) {
        System.out.println("开始人脸识别认证，当前状态值是："+stateContext.getStateValue());
    }
}

package com.handl.behaviouraltype.zhuangtai;

/**
 * Created by handl on 2017/9/23.
 *
 * 与状态关联的工作类，提供不同状态基础的属性
 *      维护一个状态引用
 *      有特有的属性
 *      提供调用状态操作接口的方法
 *
 */
public class StateContext {

    //维护状态对象
    private State state;

    //特有属性
    private String stateValue; //标识状态是否执行还是改变状态

    /**
     * 调用状态对象的状态操作接口
     */
    public void stateHandl(){
        state.handl(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }
}

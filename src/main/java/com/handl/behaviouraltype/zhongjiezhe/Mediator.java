package com.handl.behaviouraltype.zhongjiezhe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by handl on 2017/9/29.
 *
 * 中介者抽象接口
 *      定义同事操作列表，定义同事对象的添加和删除方法
 *      定义同事类执行操作接口(参数：定义消息，消息来源和消息目的地)
 *
 */
public abstract class Mediator {
    //同事对象列表
    protected List<Department> departmentList;

    public Mediator() {
        departmentList = new ArrayList<>();
    }

    //同事对象操作接口
    abstract void action(String msg,int from, int to);

    public void addObject(Department department){
        departmentList.add(department);
    }

    public void removeObject(Department department){
        departmentList.remove(department);
    }
}

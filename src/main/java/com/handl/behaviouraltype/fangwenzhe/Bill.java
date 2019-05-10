package com.handl.behaviouraltype.fangwenzhe;

/**
 * Created by handl on 2017/9/29.
 *
 * 节点类,定义操作和接受访问者接口
 *
 */
public interface Bill {

    void accept(Visitor visitor);
}

package com.handl.structuraltype.zuhe;

/**
 * Created by handl on 2017/9/26.
 *
 * 节点抽象接口
 *      定义容器节点和叶子节点统一接口:handl
 *      使用透明方式，接口中定义对节点的添加和删除接口
 *
 */
public interface Operation {

    void addNode(Operation operation);

    void removeNode(Operation operation);

    void handl();

}

package com.handl.behaviouraltype.diedaiqi;

/**
 * Created by handl on 2017/9/26.
 *
 * 聚集对象抽象类
 *      定义创建迭代器接口
 *
 */
public interface Aggregate {
    //创建迭代器
    Itreator iterator();
    //添加元素
    void add(Object obj);
    //获取元素
    Object get(int index);
    //获取元素个数
    int getSize();

}

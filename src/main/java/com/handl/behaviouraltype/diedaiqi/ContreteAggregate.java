package com.handl.behaviouraltype.diedaiqi;

/**
 * Created by handl on 2017/9/26.
 */
public class ContreteAggregate implements Aggregate {
    //元素数组
    private Object[] list;
    //元素个数
    private int size=0;
    //当前元素角标
    private int index=0;
    //初始化
    public ContreteAggregate(int size){
        index=0;
        this.size=0;
        list=new Object[size];
    }
    @Override
    public void add(Object obj) {
        list[index++]=obj;
        size++;
    }

    //创建迭代器，迭代聚集对象元素数组
    @Override
    public Itreator iterator() {
        return new ContreteIterator(this);
    }
    @Override
    public Object get(int index) {
        return list[index];
    }
    @Override
    public int getSize() {
        return size;
    }
}

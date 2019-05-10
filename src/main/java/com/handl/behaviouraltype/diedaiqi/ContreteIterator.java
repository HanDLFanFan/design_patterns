package com.handl.behaviouraltype.diedaiqi;

/**
 * Created by handl on 2017/9/26.
 *
 * 聚集对象实现类，
 *      定义聚合对象引用，以及角标(用以索引聚合对象)
 *
 */
public class ContreteIterator implements Itreator {

    //聚集对象引用
    private Aggregate aggregate = null;
    //记录操作角标
    private int index;

    //初始化传入具体的聚集对象
    public ContreteIterator(Aggregate aggregate) {
        super();
        this.aggregate = aggregate;
    }

    //判断聚集对象是否有下一个
    @Override
    public boolean hasNext() {
        if (index >= aggregate.getSize()) {
            return false;
        } else {
            return true;
        }
    }

    //获取聚集对象的下一个参数
    @Override
    public Object next() {
        Object object = aggregate.get(index);
        index++;
        return object;
    }
}

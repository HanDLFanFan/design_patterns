package com.handl.behaviouraltype.diedaiqi;

/**
 * Created by handl on 2017/9/26.
 *
 * 迭代器模式Iterator:提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部标识。
 *      当访问一个内聚对象，而且不管这些对象是什么都需要遍历的时候，考虑使用迭代器模式。
 *      为遍历不同的聚集结构提供如开始、下一个、是否结束、当前哪一项等统一的接口。
 *
 *      1.迭代器抽象类Iterator:用于定义得到开始对象、下一个对象、判断是否到结尾、当前对象等统一接口。
 *
 *      2.迭代器具体实现类ContreteIterator：定义聚集对象引用，构建时传入
 *
 *      3.聚集抽象类Aggregate:定义创建所有聚聚对象的迭代器接口
 *
 *      4.聚集对象实现类ContreteAggregate：定义一个对象集合，存放需要被迭代器遍历的对象
 *
 */
public class Test {
    public static void main(String[] args) {
        //创建聚合对象
        Aggregate contreteAggregate = new ContreteAggregate(100);
        //添加需要遍历的对象
        contreteAggregate.add("a");
        contreteAggregate.add("b");
        contreteAggregate.add("c");
        contreteAggregate.add("d");
        contreteAggregate.add("e");

        //创建迭代器对象，传入聚合对象
        Itreator itreator = contreteAggregate.iterator();

        //使用迭代器操作聚合对象
        while (itreator.hasNext()){
            System.out.println(itreator.next());
        }
        System.out.println("迭代完成！！！");
    }
}

package com.handl.behaviouraltype.fangwenzhe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by handl on 2017/9/29.
 */
public class ObjectStructure {

    private List<Bill> bills = new ArrayList<>();

    //添加
    public void add(Bill bill){
        bills.add(bill);
    }
    //删除
    public void remove(Bill bill){
        bills.remove(bill);
    }

    //让一个访问者可以循环调用所有节点
    public void accept(Visitor visitor){
        for (Bill bill : bills){
            bill.accept(visitor);
        }
    }
}

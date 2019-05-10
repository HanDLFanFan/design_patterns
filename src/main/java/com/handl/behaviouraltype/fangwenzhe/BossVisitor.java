package com.handl.behaviouraltype.fangwenzhe;

/**
 * Created by handl on 2017/9/29.
 *
 * 访问者实现对象：老板类
 *
 */
public class BossVisitor implements Visitor {
    @Override
    public void jieGuo(ZhiChuBill zhiChuBill) {
        System.out.println("老板: 这个月支出了"+zhiChuBill.getZhiChu());
    }

    @Override
    public void jieGuo(ShouRuBill shouRuBill) {
        System.out.println("老板: 这个月收入了"+shouRuBill.getShouRu());
    }

}

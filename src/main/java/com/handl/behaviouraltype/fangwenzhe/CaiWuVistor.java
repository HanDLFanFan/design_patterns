package com.handl.behaviouraltype.fangwenzhe;

/**
 * Created by handl on 2017/9/29.
 */
public class CaiWuVistor implements Visitor {
    @Override
    public void jieGuo(ZhiChuBill zhiChuBill) {
        System.out.println("财务: 这个月支出了"+zhiChuBill.getZhiChu());
    }

    @Override
    public void jieGuo(ShouRuBill shouRuBill) {
        System.out.println("财务: 这个月收入了"+shouRuBill.getShouRu());
    }

}

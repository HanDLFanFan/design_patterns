package com.handl.behaviouraltype.fangwenzhe;

/**
 * Created by handl on 2017/9/29.
 *
 * 具体的节点对象
 *      通过调用访问者的访问接口来访问节点对象本身
 *
 */
public class ZhiChuBill implements Bill {

    protected int zhiChu;


    @Override
    public void accept(Visitor visitor) {
        visitor.jieGuo(this);
    }

    public ZhiChuBill(int zhiChu) {
        this.zhiChu = zhiChu;
    }

    public int getZhiChu() {
        return zhiChu;
    }

    public void setZhiChu(int zhiChu) {
        this.zhiChu = zhiChu;
    }
}

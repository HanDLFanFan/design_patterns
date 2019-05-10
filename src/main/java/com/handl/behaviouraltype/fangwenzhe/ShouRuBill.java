package com.handl.behaviouraltype.fangwenzhe;

/**
 * Created by handl on 2017/9/29.
 *
 *  具体的节点对象
 *      通过调用访问者的访问接口来访问节点对象本身
 */
public class ShouRuBill implements Bill {

    protected int shouRu;

    @Override
    public void accept(Visitor visitor) {
        visitor.jieGuo(this);
    }

    public ShouRuBill(int shouRu) {
        this.shouRu = shouRu;
    }

    public int getShouRu() {
        return shouRu;
    }

    public void setShouRu(int shouRu) {
        this.shouRu = shouRu;
    }
}

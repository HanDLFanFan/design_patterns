package com.handl.behaviouraltype.fangwenzhe;

/**
 * Created by handl on 2017/9/29.
 *
 * 访问者抽象接口
 *      定义对所有节点的访问接口(参数就是访问者)
 *
 */
public interface Visitor {

    //访问支出
    void jieGuo(ZhiChuBill zhiChuBill);
    //访问收入
    void jieGuo(ShouRuBill shouRuBill);
}

package com.handl.creationtype.jiandangongchang;

/**
 * Created by handl on 2017/9/22.
 *
 * 减法运算实现类
 *
 */
public class SubOperation extends Operation{
    protected void result() {
        System.out.println(this.x + "-" + this.y + "=" + (this.x - this.y));
    }
}

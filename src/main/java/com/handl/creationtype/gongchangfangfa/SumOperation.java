package com.handl.creationtype.gongchangfangfa;

/**
 * Created by handl on 2017/9/22.
 *
 * 加法运算实现类
 *
 */
public class SumOperation extends Operation {

    protected void result() {
        System.out.println(this.x + "+" + this.y + "=" + (this.x + this.y));
    }
}

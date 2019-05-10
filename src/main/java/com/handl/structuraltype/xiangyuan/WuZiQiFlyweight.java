package com.handl.structuraltype.xiangyuan;

/**
 * Created by handl on 2017/9/29.
 *
 *享元抽象
 *      定义内部状态
 *
 */
public abstract class WuZiQiFlyweight {
    //颜色
    protected String colour;

    //定义与外部状态操作接口,接受外部属性对象作为参数
    abstract public void action(Coordinate coordinate);

    public WuZiQiFlyweight(String colour) {
        this.colour = colour;
    }
}

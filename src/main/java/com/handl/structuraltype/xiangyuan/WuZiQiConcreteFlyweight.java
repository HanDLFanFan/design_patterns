package com.handl.structuraltype.xiangyuan;

/**
 * Created by handl on 2017/9/29.
 *
 * 具体的享元对象：共享的
 *
 */
public class WuZiQiConcreteFlyweight extends WuZiQiFlyweight {

    public WuZiQiConcreteFlyweight(String colour) {
        super(colour);
    }

    @Override
    public void action(Coordinate coordinate) {
        System.out.println("颜色是:"+this.colour+",坐标是:X="+coordinate.getX()+",Y="+coordinate.getY());
    }
}

package com.handl.structuraltype.xiangyuan;

/**
 * Created by handl on 2017/9/29.
 *
 * 具体的享元对象：不共享的(不是通过工厂创建)，享元属性要自己来设置
 *
 *
 */
public class WuZiQiUnsharedConcreteFlyweight extends WuZiQiFlyweight {

    public WuZiQiUnsharedConcreteFlyweight(String colour) {
        super(colour);
    }

    @Override
    public void action(Coordinate coordinate) {
        System.out.println("颜色是:"+this.colour+",坐标是:X="+coordinate.getX()+",Y="+coordinate.getY());
    }
}

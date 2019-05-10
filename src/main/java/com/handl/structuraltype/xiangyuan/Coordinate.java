package com.handl.structuraltype.xiangyuan;

/**
 * Created by handl on 2017/9/29.
 *
 * 外部属性状态对象：可以是抽象的，但为了简单，这里直接就是实现
 * 坐标类
 *
 */
public class Coordinate {
    //定义外部状态属性
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

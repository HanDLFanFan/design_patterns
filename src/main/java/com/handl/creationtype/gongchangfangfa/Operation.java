package com.handl.creationtype.gongchangfangfa;

/**
 * Created by handl on 2017/9/22.
 */
public abstract class Operation {
    protected int x;
    protected int y;

    /**
     * 结果方法
     */
    abstract protected void result();

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

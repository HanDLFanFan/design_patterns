package com.handl.behaviouraltype.mobanfangfa;

/**
 * Created by handl on 2017/9/22.
 *
 * 子类实现：实现抽象算法方法
 *
 */
public class TemplateImpl extends Template {
    @Override
    protected int sum(int x, int y) {
        return x+y;
    }
}

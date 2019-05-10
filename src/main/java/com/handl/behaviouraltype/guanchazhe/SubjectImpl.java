package com.handl.behaviouraltype.guanchazhe;

/**
 * Created by handl on 2017/9/23.
 *
 * 主题实现类，添加特有的属性
 *
 * 当然如果观察者不需要主题的属性也可以没有
 *
 *
 */
public class SubjectImpl extends Subject {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

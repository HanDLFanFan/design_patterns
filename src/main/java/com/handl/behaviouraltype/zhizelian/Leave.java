package com.handl.behaviouraltype.zhizelian;

/**
 * Created by handl on 2017/9/28.
 *
 * 请求对象：包含特有属性
 *
 * 这里是请假，那就有请假人姓名和请假天数
 *
 */
public class Leave {

    private String name;

    private int day;

    public Leave(String name, int day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

package com.handl.behaviouraltype.beiwanglu;

/**
 * Created by handl on 2017/9/24.
 *
 * 备忘录对象
 *      存储了需要备份的属性
 *
 */
public class Memento {

    //对应Originator对象中的属性
    private String name;
    private int dengji;

    public Memento() {
    }

    public Memento(String name, int dengji) {
        this.name = name;
        this.dengji = dengji;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDengji() {
        return dengji;
    }

    public void setDengji(int dengji) {
        this.dengji = dengji;
    }
}

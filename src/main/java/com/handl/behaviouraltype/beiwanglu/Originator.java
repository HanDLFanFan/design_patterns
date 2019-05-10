package com.handl.behaviouraltype.beiwanglu;

/**
 * Created by handl on 2017/9/24.
 *
 * 发起人Originator对象
 *
 *  提供备份和恢复备份的接口，和特有的属性
 *
 */
public class Originator {

    //需要备份的属性
    private String name;
    private int dengji;


    //备份接口，创建备忘录，并初始化需备份的属性
    public Memento createMemento(){
        return new Memento(this.name,this.dengji);
    }

    //恢复接口,接口一个Memento对象，从Mement恢复状态
    public void setMemento(Memento memento){
        this.name = memento.getName();
        this.dengji = memento.getDengji();
    }

    public Originator() {
    }

    public Originator(String name, int dengji) {
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

    @Override
    public String toString() {
        System.out.println("name="+this.name+",dengji="+this.dengji);
        return "";
    }
}

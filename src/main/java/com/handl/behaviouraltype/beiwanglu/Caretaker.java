package com.handl.behaviouraltype.beiwanglu;

/**
 * Created by handl on 2017/9/24.
 *
 * 备忘录管理类，用来存储备忘录对象，但不能对其修改
 *
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

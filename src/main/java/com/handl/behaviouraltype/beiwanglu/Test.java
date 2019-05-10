package com.handl.behaviouraltype.beiwanglu;

/**
 * Created by handl on 2017/9/24.
 *
 * 备忘录模式：在不破坏封装性的前提系啊，捕获一个对象的内部状态，并在该对象之外
 *          保存这个状态。这样以后就可以将该对象恢复到原先保存的状态。
 *
 *     1.发起人Originator(需要备份的对象)：
 *          提供一个接口用于创建和初始化(设置备忘录需要备份的属性)备忘录对象
 *          提供一个接口(接受备忘录对象),用以恢复之前的状态
 *
 *     2.备忘录Memento：负责存储Originator对象的内部状态
 *          定义需要存储的属性
 *
 *     3.管理者Caretaker：负责保存备忘录对象Memento，但不能对Memento进行修改
 *          用来把备忘录对象传递给Originator对象
 */
public class Test {

    public static void main(String[] args) {
        //创建一个发起人Originator类，并出初始化属性
        Originator originator = new Originator("shierlou",89);
        originator.toString();//刚初始化状态属性

        //保存到备忘录(调用createMemento方法,把返回的备忘录对象交由管理者保存)
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        //修改发起人对象的属性
        originator.setName("toutoukan");
        originator.setDengji(85);
        originator.toString();//修改后的状态属性

        //恢复备忘录(调用setMemento方法,从管理对象中获取备忘录对象)
        originator.setMemento(caretaker.getMemento());
        originator.toString();//恢复后的状态属性

    }
}

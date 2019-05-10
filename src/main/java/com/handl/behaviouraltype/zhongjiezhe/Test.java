package com.handl.behaviouraltype.zhongjiezhe;

/**
 * Created by handl on 2017/9/28.
 *
 * 中介者模式(Mediator)：用一个中介对象来封装一系列的对象交互。中介者使各对象不需要
 *      显示的相互引用，从而使其耦合松散，而且可以独立地改变他们之间的交互。
 *
 *      抽象中介者Mediator:定义同事对象到中介者对象的接口。
 *
 *      抽象同事类Colleague:普通的接口
 *
 *      具体抽象中介者实现类(ConcreteMediator)：具体中介者对象，它知道所有具体的同事类，
 *              并从具体的同事类接受消息，向具体同事对象发出命令。
 *
 *      具体的同事实现类：每个具体的同事只知道自己的行为，而不了解其他同事的行为，
 *              但他们都认识中介者对象。
 *
 *
 *     例子：公司里技术部门，运营部门，产品部门
 *
 *     1.中介者抽象Mediator：
 *     2.同事类抽象Department:
 *     3.具体中介者实现MediatorImpl
 *     4.具体的同事类:JiShuDepartment,YunYingDepartment,ChanPinDepartment
 *
 *     注意：中介者模式有很大的变通性，比如可以让中介者保存数据等等
 *     例如：中介者好比图书管理员，负责记录图书的借还，
 *          有同学A(同事对象)借了就要记录，下一个来借的同学B来也要记录，
 *          借相同的书，那么就要等到同学A还了之后由管理员通知同学B
 *
 *
 */
public class Test {

    public static void main(String[] args) {
        //创建中介者对象，并添加同事对象，注意顺序，技术0产品1运营2
        Mediator mediator = new MediatorImpl();

        //创建同事对象
        Department jiShu = new JiShuDepartment(mediator);
        Department chanPin = new ChanPinDepartment(mediator);
        Department yunYing = new YunYingDepartment(mediator);

        mediator.addObject(jiShu);
        mediator.addObject(chanPin);
        mediator.addObject(yunYing);

        //技术向运营发送消息
        jiShu.sendMsg("我是技术人员，运营你们好吗?",0,2);

        //产品向技术发送消息
        chanPin.sendMsg("我是产品，技术人员你们好吗?",1,0);

        //运营向产品发送消息
        chanPin.sendMsg("我是运营，产品你们好吗?",2,1);
    }
}

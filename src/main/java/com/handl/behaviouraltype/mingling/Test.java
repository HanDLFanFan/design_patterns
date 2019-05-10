package com.handl.behaviouraltype.mingling;

/**
 * Created by handl on 2017/9/28.
 *
 * 命令模式：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，
 *      另外，对请求排队或记录请求日志，以及支持可撤销操作。
 *
 *      1.命令抽象类Command:定义统一的命令操作接口,并声明执行者(实际命令操作者)引用
 *      2.具体命令实现类ConcreteCommand:可以有无限多命令，把命令分别封装为命令实现对象。
 *      3.命令操作管理对象Invoker：持有命令对象引用(单个命令引用或者命令集合来做批处理)，
 *          对命令进行管理和操作(定义命令操作接口，用来通知命令执行)，
 *      4.命令执行者Receiver:真正来处理命令的对象
 *            可以是一个执行者操作所有命令(这样只有一个具体的命令执行者Receiver)，
 *            也可以是有执行者抽象，并且有多个执行者实现对应不同的命令操作(命令执行者Receiver是一个接口，有多个实现)。
 *
 *      例子：烧烤例子，烤羊腿和鸡翅,这里使用执行者抽象，每个命令对应每个执行者
 *      1.命令抽象类Command：定义烤羊腿和鸡翅的接口
 *      2.具体命令实现类YangTuiConcreteCommand,JiChiChuanConcreteCommand
 *      3.命令操作管理对象Invoker：定义命令列表，以便做批处理操作
 *      4.命令执行者抽象类Receiver：定义执行者统一操作接口
 *      5.命令执行者实现类YangTuiReceiver，JiChiReceiver
 *
 */
public class Test {

    public static void main(String[] args) {
        //创建命令执行者(相当于烧烤的师傅)
        Receiver receiverYangTui = new YangTuiReceiver();
        Receiver receiverJiChi = new JiChiReceiver();

        //创建命令管理对象
        Invoker invoker = new Invoker();

        //创建命令(顾客的需求)
        Command commandYangTui_1 = new YangTuiConcreteCommand(receiverYangTui);
        Command commandJiChi_1 = new JiChiChuanConcreteCommand(receiverJiChi);
        Command commandJiChi_2 = new JiChiChuanConcreteCommand(receiverJiChi);
        Command commandJiChi_3 = new JiChiChuanConcreteCommand(receiverJiChi);

        //向命令管理者添加命令(服务员记录顾客的需求)
        invoker.addCommand(commandYangTui_1);
        invoker.addCommand(commandJiChi_1);
        invoker.addCommand(commandJiChi_2);
        invoker.addCommand(commandJiChi_3);

        //命令管理者删除命令(顾客感觉点的太多，去掉一个鸡翅)
        invoker.removeCommand(commandJiChi_3);

        //命令管理者批量执行命令(顾客点完单，服务员确认后把顾客订单告知烧烤师傅)
        invoker.commandNotify();
    }
}

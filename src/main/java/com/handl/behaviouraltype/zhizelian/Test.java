package com.handl.behaviouraltype.zhizelian;

/**
 * Created by handl on 2017/9/28.
 *
 * 职责连(也叫责任链):使得[多个对象]都有机会处理[请求]，从而避免请求的发送和接受之间的耦合关系，
 *          将这个对象连成一条链，并沿着这条链传递该请求，知道有一个对象处理这个请求为止。
 *
 *          多个对象：指的是同一种类型的不同处理方式或者级别的对象
 *          请求:指的是可以被这多个对象来处理，并且是链式的，一级一级的处理，知道能够处理为止
 *
 *         例如：员工请假，需要多个领导审批(组长，经理，总监，老板等等)
 *          员工请假就是请求，多个领导审批就是多个(同类型的)对象,
 *          多个同类型的对象有统一的处理接口，但是有不同的具体处理方式，
 *          并且是级联结构，当前对象处理不了就要转入下一个对象处理。
 *          例如：组长能审批三天，经理审批五天
 *              当员工请假四天的时候，首先要经过组长，组长审批不了，就要转到经理处理，
 *              经理能够处理了，就不再需要向后传递。
 *              那么这里关键点就是，组长要知道经理，经理要知道总监。。。依次类推
 *
 *         1.请求处理抽象类(就好比是各个领导的抽象):
 *              需要声明处理对象(领导对象)引用：使当前处理对象知道下一个处理对象。
 *              定义处理类统一的处理接口
 *         2.请求处理实现类(具体的领导，组长、经理、总监、boss)：
 *              具体的处理对象，分别有自己特有的行为
 *         3.请求者(请假):对请求属性和行为的封装，让处理着调用并做出处理
 *
 *
 *     例子：请假
 *     1.处理类抽象类(抽象领导类)Leader:定义处理者引用，并提供统一的处理接口
 *     2.处理这实现类：ZuZhang(3天)、JingLi(3-5天)、ZongJian(5-7天)、Boss(7天以上)
 *     3.请求者对象(请假对象)leave：包含特有的属性，如果请假人名称和请假天数
 */
public class Test {

    public static void main(String[] args) {
        //初始化具体的处理者对象
        Leader leader = new ZuZhang(  //组长的下一个是经理，传入经理
                new JingLi(  //经理的下一个是总监，传入总监
                        new ZongJian(   //总监的下一个是Boss,传入Boss
                                new Boss(null)))); //Boss是最后，没有下一个传入null

        //创建请求对象
        Leave zhangSan = new Leave("张三",88);

        //调用处理者的处理方法处理请求
        leader.action(zhangSan);
    }
}

package com.handl.behaviouraltype.zhuangtai;

/**
 * Created by handl on 2017/9/23.
 *
 * 状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 *      主要解决当控制一个对象状态转换的条件表达式过于复杂的情况。把状态的判断逻辑
 *          转移到不同状态的一系列类当中，可以把复杂的判断逻辑简单化。
 *
 *      状态模式好处是：将于特定状态相关的行为局部化，并且
 *
 *  1.状态抽象接口State(定义了不同状态对象的统一的状态操作接口，
 *          接受StateContext作为参数，使当前状态操作StateContext的行为，
 *          StateContext也就是拥有不同状态的工作类)
 *
 *  2.状态实现子类StateA, StateB, StateC,...：实现具体的状态行为
 *
 *  3.状态上下文管理类StateContext(状态对应的工作对象(也就是一个对象有多个不同状态)Work类)：
 *         持有状态对象的引用，
 *      StateContext维护一个状态对象的引用，不同状态值有不同的状态实现对象
 *
 *
 *   例子：授信流程：身份验证StateA，人脸识别StateB，绑定卡StateC
 *
 *      1.状态接口State，定义handl状态操作接口
 *      2.状态实现类身份验证StateA，人脸识别StateB，绑定卡StateC
 *          实现状态接口State，重写handl方法，处理当前状态逻辑
 *      3.StateContext工作类，维护一个状态对象，有特有的属性(状态值)给状态类使用
 *          和调用状态对象接口操作的方法
 *
 *      提醒：状态工作类是同一个，对应了不同的状态类，
 *          比如：数据库一个用户对象，用户授权流程的不同状态就由不同的状态子类实现，
 *                  当前状态对象执行完成后，就要修改数据库对应的状态值，
 *                  当下一步状态要执行时，先去抓取状态数值，判断由哪个状态执行，然后再
 *                  去找对应的状态对象(这里结合工厂模式可以很好的实现对状态对象的选择)
 *
 *
 *      注意：状态模式与策略模式结构上类似，但解决面向的问题不一样
 *                  状态模式对应了不同状态的行为
 *                  策略模式封装了算法家族
 */
public class Test {

    public static void main(String[] args) {
        //模拟数据库中用户授权操作

        //第一步，用户开始授权身份证认证，状态值是0
        //创建工作类StateContent(从数据库获取对象)
        StateContext stateContextA = new StateContext();
        //通过查询数据库，得到状态值，通过工厂模式创建对应的状态对象，并传入工作类
        //这里就模拟(默认)就是StateA 值是0,真是做法是通过状态值来判断具体状态类
        StateA stateA = new StateA();
        stateContextA.setState(stateA);
        stateContextA.setStateValue("0");
        //模拟完成，开始调用工作类的状态处理方法进行状态操作
        stateContextA.stateHandl();


        //第二步，用户开始授权人脸识别认证，状态值是1
        //创建工作类StateContent(从数据库获取对象)
        StateContext stateContextB = new StateContext();
        //通过查询数据库，得到状态值，通过工厂模式创建对应的状态对象，并传入工作类
        //这里就模拟(默认)就是StateB 值是1
        StateB stateB = new StateB();
        stateContextB.setState(stateB);
        stateContextB.setStateValue("1");
        //模拟完成，开始调用工作类的状态处理方法进行状态操作
        stateContextB.stateHandl();


        //第三步，用户开始授权绑卡，状态值是2
        //创建工作类StateContent(从数据库获取对象)
        StateContext stateContextC = new StateContext();
        //通过查询数据库，得到状态值，通过工厂模式创建对应的状态对象，并传入工作类
        //这里就模拟(默认)就是StateC 值是2
        StateC stateC = new StateC();
        stateContextC.setState(stateC);
        stateContextC.setStateValue("2");
        //模拟完成，开始调用工作类的状态处理方法进行状态操作
        stateContextC.stateHandl();


        //如果有更多的状态以此类推
    }
}

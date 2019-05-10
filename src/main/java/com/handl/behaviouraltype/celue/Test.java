package com.handl.behaviouraltype.celue;

/**
 *Created by handl on 2017/9/22.
 *
 * 策略模式：模拟打折的不同优惠算法
 *      策略定义了算法家族，分别封装起来，算法之间可以互相替换，策略模式中算法的变化不影响使用的客户端
 *
 * 1.算法接口或者是抽象类(Strategy)
 *
 * 2.实现算法接口或者抽象类的多个算法子类(StrategyA,StrategyB,......)
 *
 * 3.算法上下文类(StrategyContext)，用来维护使用的算法对象，
 *      算法上下文类(StrategyContext)提供的方法中调用维护使用的策略对象的方法
 *
 * 4.客户端统一调用算法上下文类(StrategyContext)提供的方法，
 *      避免直接与策略算法类耦合
 *
 * 提示：策略模式可以结合简单工厂模式一起使用，通过工厂模式创建策略实现子类
 *      1.可以单独创建策略工厂类，这样在算法上下文类(StrategyContext)的
 *          构造方法中直接传入一个具体的策略对象，通过在算法上下文类的构造方法中调用策略工厂类来创建
 *
 *      2.可以使用算法上下文类(StrategyContext)当作工厂类，
 *          在算法上下文类(StrategyContext)的构造方法中创建具体策略对象标识，
 *
 */
public class Test {

    public static void main(String[] args) {
        //创建策略上下文类----直接传入策略对象
        StrategyContext strategyContextA = new StrategyContext(
                StrategyFactory.createStrategy("A"));

        strategyContextA.strategyResult();

        //创建策略上下文类----传入标识
        StrategyContext strategyContextB = new StrategyContext("B");

        strategyContextB.strategyResult();
    }
}

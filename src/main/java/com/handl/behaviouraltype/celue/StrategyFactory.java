package com.handl.behaviouraltype.celue;

/**
 * Created by handl on 2017/9/22.
 */
public class StrategyFactory {

    public static Strategy createStrategy(final String flag){
        Strategy strategy = null;
        switch (flag){
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
            default:
                System.out.println("策略不存在 !!!");
                break;
        }
        return strategy;
    }

}

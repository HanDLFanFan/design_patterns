package com.handl.structuraltype.xiangyuan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by handl on 2017/9/29.
 *
 * 享元工厂类：用来创建享元对象(有了就直接返回，没有先创建然后再返回)
 * 注意多线程会导致创建多个对象问题，通过加锁解决
 *
 */
public class WuZiQiFlyweightFactory {

    //一定是静态的，因为正式环境会在多线程情况下运行
    private static Map<String,WuZiQiFlyweight> map = new HashMap<>();

    //定义创建享元对象的接口,享元对象通过判断内部属性状态来确定有没有创建，这里是颜色
    public WuZiQiFlyweight createFlyweight(String colour){
        if(map.containsKey(colour)){
            //有就直接返回
            return map.get(colour);
        }else {
            //没有就先创建在返回
            WuZiQiFlyweight flyweight = null;
            //加锁保证线程安全
            synchronized (WuZiQiFlyweightFactory.class){
                if (map.containsKey(colour)){
                    return map.get(colour);
                }
                flyweight = new WuZiQiConcreteFlyweight(colour);
                map.put(colour,flyweight);
            }

            return flyweight;
        }
    }
}

package com.handl.structuraltype.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by handl on 2017/10/13.
 *
 * 每一个动态代理类都必须要实现InvocationHandler这个接口，
 * 并且每个代理类的实例都关联到了一个handler，
 * 当我们通过代理对象调用一个方法的时候，
 * 这个方法的调用就会被转发为由InvocationHandler这个接口的invoke 方法来进行调用。
 *
 * 我们来看看InvocationHandler这个接口的唯一一个方法 invoke 方法：
     proxy:　　指代我们所代理的那个真实对象
     method:　　指代的是我们所要调用真实对象的某个方法的Method对象
     args:　　指代的是调用真实对象某个方法时接受的参数
 *
 */
public class DongTaiDaiLiProxy implements InvocationHandler {

    //　这个就是我们要代理的真实对象
    private Object subject;

    //    构造方法，给我们要代理的真实对象赋初值
    public DongTaiDaiLiProxy(Object subject)
    {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在代理真实对象前我们可以添加一些自己的操作
        System.out.println("before rent house");
        System.out.println("Method:" + method.getName());
        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(subject, args);
        //在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after rent house");
        return null;
    }
}

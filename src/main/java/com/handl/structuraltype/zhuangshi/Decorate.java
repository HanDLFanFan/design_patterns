package com.handl.structuraltype.zhuangshi;

/**
 * Created by handl on 2017/9/22.
 *
 * 装饰类(也可以是抽象类)
 *      实现接口类
 *      引用接口类句柄
 *
 */
public abstract class Decorate implements Component {
    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 此方法可以扩展新的功能，也可以只调用原有实现，
     * 而在装饰子类中扩展功能
     */
    @Override
    public void sayHello() {
        //调用原有实现类的方法
        component.sayHello();
        //在装饰子类中扩展新功能
    }
}

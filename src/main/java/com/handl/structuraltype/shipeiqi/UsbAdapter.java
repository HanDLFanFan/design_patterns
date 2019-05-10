package com.handl.structuraltype.shipeiqi;

/**
 * Created by handl on 2017/9/24.
 *
 * USB接口的适配器
 *      1.不改变原有USb接口的行为，因此要实现USB接口
 *      2.要替换原来的实现变成PS2实现，要持有PS2的引用
 *        在原有接口中调用被适配接口的实习
 */
public class UsbAdapter implements Usb{
    //持有被适配对象应用，并在构造器中初始化
    private Ps2 ps2;

    public UsbAdapter() {
        ps2 = new Ps2Impl();
    }

    /**
     * 调用了被适配接口的实现
     */
    @Override
    public void say() {
        System.out.println("我是USB接口的适配类");
        ps2.say();
        System.out.println("通过适配完成了对Ps2接口的调用");
    }

    public Ps2 getPs2() {
        return ps2;
    }

    public void setPs2(Ps2 ps2) {
        this.ps2 = ps2;
    }
}

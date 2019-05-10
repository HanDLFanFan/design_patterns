package com.handl.structuraltype.shipeiqi;

/**
 * Created by handl on 2017/9/24.
 *
 * 适配器模式Adapter：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本
 *      由于接口不兼容而不能一起工作的那些类可以一起工作
 *
 *      当系统的数据和行为都正确，但接口不符合时，就考虑使用适配器模式，
 *      适配器模式主要用于希望服用一些现存的类，但是接口又与复用环境要求不一致的情况。
 *
 *      1.需求接口(Target)：客户期待的接口
 *      2.需要适配接口(Adaptee)：真正起作用的接口
 *      3.适配器(Adapter)：把需要被适配的接口转换成需求接口
 *          不改变需求接口的情况下，把需求接口的实现替换成被适配接口
 *          (因为客户端调用的是需求接口，那么适配器应继承需求接口，这样才能不改变客户端
 *          的行为，并且重写需求接口，替换成被适配接口的实现)
 *      4.客户端：客户端使用的是需求接口，但真正执行的是被适配类的接口
 *
 *     例子：USB接口和PS2接口之间的转换
 *
 *     1.需求接口(USB)：也有自己的实现，但现在要使用PS2的实现
 *     2.需要适配的接口(PS2)
 *     3.适配器：把需求接口的实现替换成需要适配接口的实现
 *
 *
 */
public class Test {

    public static void main(String[] args) {
        //原生的USB接口
        Usb usb = new UsbImpl();
        usb.say();
        //原生的PS2接口
        Ps2 ps2 = new Ps2Impl();
        ps2.say();
        //USB适配后的接口(适配器是需求接口的子类实现，所以按照依赖倒置原则，
        //  客户端不做任何修改就可以使用)
        Usb usbAdapter = new UsbAdapter();
        usbAdapter.say();

    }
}

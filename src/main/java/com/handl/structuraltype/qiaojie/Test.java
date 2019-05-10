package com.handl.structuraltype.qiaojie;

/**
 * Created by handl on 2017/9/27.
 *
 * 桥接模式Bridge：将抽象部分与它的实现部分分离，使它们都可以独立的变化
 *
 *      注意：抽象与实现分离并不是指的让抽象类与其派生类分离，这样没有任何意义。
 *          这里指的是，抽象类和他的派生类用来实现自己的对象，也就是有多个维度，
 *          例如：手机可以按手机品牌和功能等多个维度来抽象。
 *
 *          由于抽象维度有多种，桥接模式就是让他们都都独立出来各自变化，这就使得
 *          每种维度之间互不影响。
 *
 *      Abstrction(维度1)：维度1抽象
 *      Imolementor(维度2):维度2抽象，
 *          注意：维度1和维度2只是问题多维度的抽象类或者接口，跟名字叫法无关
 *                  维度1组合维度2或者维度2组合维度1，
 *                  例如：手机品牌抽象组合软件抽象，或者软件抽象组合手机品牌抽象，
 *                      可以灵活来用
 *      维度1抽象实现：RefinedAbstrctionA，RefinedAbstrctionB
 *      维度2抽象实现：ConcreateImplementorA，ConcreateImplementorB
 *          例如：维度1实现：苹果手机，锤子手机
 *                  维度2实现:听歌软件，拍照软件
 *
 *
 *     例子:手机品牌(设为维度1)和手机软件(设为维度2)，手机品牌组合手机软件
 *
 *      手机品牌抽象：MobileBrand
 *      软件抽象：Software
 *      手机品牌实现：MobileBrandChuiZi，MobileBrandIphone
 *      软件实现：SoftwarePaiZhao,SoftwareChangGe
 */
public class Test {

    public static void main(String[] args) {
        //创建拍照对象和唱歌对象
        Software softwareA = new SoftwarePaiZhao();
        Software softwareB = new SoftwareChangGe();

        //创建手机品牌实现
        MobileBrand mobileBrandA = new MobileBrandChuiZi();
        MobileBrand mobileBrandB = new MobileBrandIphone();

        //手机品牌组合手机软件
        mobileBrandA.setSoftware(softwareA);
        mobileBrandA.run();

        mobileBrandA.setSoftware(softwareB);
        mobileBrandA.run();


        mobileBrandB.setSoftware(softwareA);
        mobileBrandB.run();

        mobileBrandB.setSoftware(softwareB);
        mobileBrandB.run();

    }
}

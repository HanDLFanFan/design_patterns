package com.handl.creationtype.jianzaozhe;

/**
 * Created by handl on 2017/9/22.
 *
 * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建
 *          不同的表示。主要用于创建一些复杂的对象，这些对象的内部构造顺序是稳定的，
 *          但对象内部的构建通常面临着变化。
 *
 *   使用汽车组装例子：产品为汽车，组装的组件轮胎和引擎
 *
 *   1.产品类 Car
 *   2.组件类 LunTai   YinQing
 *   3.构造者抽象接口CarBuilder(定义产品构建骨架)
 *          定义产品的组装方法和组装完成后的结果返回方法
 *   4.构造者实现类CarBuilderA ，CarBuilderB
 *   5.管理者CarDirector,用来管理构造者的构建过程，避免客户端直接使用构造者
 *      持有构造者的引用，在使用时通过构造方法传入真实的构造者
 *      构造完成后，调用构造者的结果返回方法获取构造对象并返回到客户端。
 *
 *
 *   提示：如果产品的组件也需要其他组件，可以做构造级联的方式
 */
public class Test {

    public static void main(String[] args) {

        //创建管理者
        CarDirector carDirector = new CarDirector();

        //创建构造者,可以把构造者转移到管理类中
        CarBuilder carBuilderA = new CarBuilderA();
        CarBuilder carBuilderB = new CarBuilderB();

        //给管理者设置构造者，并构造产品
        Car carA = carDirector.setBuilder(carBuilderA).builderCar();
        Car carB = carDirector.setBuilder(carBuilderB).builderCar();

        System.out.println("CarA.LunTai=" + carA.getLunTai().getName() +","
                +carA.getLunTai().getShape()+"\n CarA.Yinqing="
                + carA.getYinQing().getName() + ","+carA.getYinQing().getFrom());

        System.out.println("CarB.LunTai=" +carB.getLunTai().getName() +","
                +carB.getLunTai().getShape()+"\n CarB.Yinqing="
                + carB.getYinQing().getName() + ","+carB.getYinQing().getFrom());
    }
}

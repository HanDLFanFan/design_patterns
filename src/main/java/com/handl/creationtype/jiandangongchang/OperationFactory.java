package com.handl.creationtype.jiandangongchang;

/**
 * Created by handl on 2017/9/22.
 *
 * 运算工厂类
 *  这里使用一个方法通过标识创建，也可以通过多个方法分别创建不同实现类
 *
 */
public class OperationFactory {

    public static Operation createOperation(final String flag){

        Operation operation = null;

        switch (flag){
            case "sum":
                operation = new SumOperation();
                break;
            case "sub":
                operation = new SubOperation();
                break;
            default:
                System.out.println("你要的算法不存在 !!!");
                break;
        }

        return operation;
    }

}

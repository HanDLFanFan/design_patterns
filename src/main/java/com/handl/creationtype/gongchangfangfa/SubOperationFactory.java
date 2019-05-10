package com.handl.creationtype.gongchangfangfa;

/**
 * Created by handl on 2017/9/22.
 *
 * 减法工厂实现类
 *
 */
public class SubOperationFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}

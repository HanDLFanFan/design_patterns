package com.handl.creationtype.gongchangfangfa;

/**
 * Created by handl on 2017/9/22.
 *
 * 加法工厂实现类
 *
 */
public class SumOperationFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new SumOperation();
    }
}

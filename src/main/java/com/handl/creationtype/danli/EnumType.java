package com.handl.creationtype.danli;

/**
 * Created by handl on 2017/9/26.
 *
 * 枚举类型：天然的线程安全的
 *
 */
public enum  EnumType {
    OBJECT("枚举的参数1"),
    INSRTANSE("枚举的参数2"){
        //枚举的私有方法

        @Override
        public boolean isFlag() {
            return true;
        }
    };

    private String name;

    private EnumType(String name){
        this.name = name;
    }

    //所有枚举的公用方法
    public boolean isFlag(){
        return false;
    }
}

package com.handl.creationtype.chouxianggongchang;

/**
 * Created by handl on 2017/9/23.
 *
 * 产品引擎实现类----轮船产品族
 *
 */
public class LunChuanYinQing extends YinQing{
    @Override
    public void say() {
        System.out.println(this.model+",马力="+this.power);
    }
}

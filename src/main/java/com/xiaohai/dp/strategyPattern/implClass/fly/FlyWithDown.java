package com.xiaohai.dp.strategyPattern.implClass.fly;

import com.xiaohai.dp.strategyPattern.interfaceClass.FlyBehavior;

public class FlyWithDown implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("向下飞！");
    }
}

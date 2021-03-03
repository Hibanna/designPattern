package com.xiaohai.dp.strategyPattern.implClass.duck;

import com.xiaohai.dp.strategyPattern.abstractClass.Duck;
import com.xiaohai.dp.strategyPattern.interfaceClass.FlyBehavior;
import com.xiaohai.dp.strategyPattern.interfaceClass.SayBehavior;

public class RedDuck extends Duck {

    @Override
    public void display() {
        System.out.println("我是红色的鸭子");
    }
}

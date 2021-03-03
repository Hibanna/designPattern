package com.xiaohai.dp.strategyPattern.implClass.say;

import com.xiaohai.dp.strategyPattern.interfaceClass.SayBehavior;

public class SayWithYes implements SayBehavior {
    @Override
    public void say() {
        System.out.println("say>>> yes!");
    }
}

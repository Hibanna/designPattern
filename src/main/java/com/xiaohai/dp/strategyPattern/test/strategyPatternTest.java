package com.xiaohai.dp.strategyPattern.test;

import com.xiaohai.dp.strategyPattern.abstractClass.Duck;
import com.xiaohai.dp.strategyPattern.implClass.duck.RedDuck;
import com.xiaohai.dp.strategyPattern.implClass.fly.FlyWithUp;
import com.xiaohai.dp.strategyPattern.implClass.say.SayWithYes;

public class strategyPatternTest {
    public static void main(String[] args) {
        Duck duck = new RedDuck();
        duck.setFlyBehavior(new FlyWithUp());
        duck.display();
        duck.fly();
    }
}

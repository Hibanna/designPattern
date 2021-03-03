package com.xiaohai.dp.strategyPattern.abstractClass;

import com.xiaohai.dp.strategyPattern.interfaceClass.FlyBehavior;
import com.xiaohai.dp.strategyPattern.interfaceClass.SayBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected SayBehavior sayBehavior;

    public abstract void  display();

    public void swim() {
      System.out.println("每一个鸭子都会游泳！");
    }
    public void fly() {
        flyBehavior.fly();
    }
    public void say() {
        sayBehavior.say();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSayBehavior(SayBehavior sayBehavior) {
        this.sayBehavior = sayBehavior;
    }
}

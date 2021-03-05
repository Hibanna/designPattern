package com.xiaohai.dp.decoratorPattern.implClass;

import com.xiaohai.dp.decoratorPattern.abstractClass.Coffee;

public class Mocha extends Coffee {

    String des = "摩卡";
    @Override
    public double cost() {
        return 10d;
    }
    public String  getDes() {
        return des;
    }
}

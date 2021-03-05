package com.xiaohai.dp.decoratorPattern.implClass;

import com.xiaohai.dp.decoratorPattern.abstractClass.Coffee;

public class Latte extends Coffee {
    String des = "拿铁";
    @Override
    public double cost() {
        return 15d;
    }
    public String  getDes() {
        return des;
    }
}

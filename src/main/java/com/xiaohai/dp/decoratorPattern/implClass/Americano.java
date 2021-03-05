package com.xiaohai.dp.decoratorPattern.implClass;

import com.xiaohai.dp.decoratorPattern.abstractClass.Coffee;

public class Americano extends Coffee {
    String des = " 美式";
    @Override
    public double cost() {
        return 15d;
    }
    public String  getDes() {
        return des;
    }
}

package com.xiaohai.dp.decoratorPattern.test;

import com.xiaohai.dp.decoratorPattern.abstractClass.Coffee;
import com.xiaohai.dp.decoratorPattern.implClass.Latte;
import com.xiaohai.dp.decoratorPattern.implClass.Mocha;
import com.xiaohai.dp.decoratorPattern.implClass.Sugar;
import com.xiaohai.dp.decoratorPattern.implClass.Tea;

public class DPtest {
    public static void main(String[] args) {
        Coffee coffee = new Mocha();
        coffee = new Tea(coffee);
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDes()+"==============="+coffee.cost());
        coffee = new Latte();
        coffee = new Tea(coffee);
        System.out.println(coffee.getDes()+"==============="+coffee.cost());
    }
}

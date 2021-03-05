package com.xiaohai.dp.decoratorPattern.implClass;

import com.xiaohai.dp.decoratorPattern.abstractClass.Coffee;
import com.xiaohai.dp.decoratorPattern.abstractClass.CoffeeDecorator;

public class Tea  extends CoffeeDecorator {
    String des = "加茶";

    public Tea(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return 0.6d+coffee.cost();
    }

    @Override
    public String getDes() {
        return coffee.getDes() + des;
    }
}

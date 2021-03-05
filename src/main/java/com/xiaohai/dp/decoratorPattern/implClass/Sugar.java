package com.xiaohai.dp.decoratorPattern.implClass;

import com.xiaohai.dp.decoratorPattern.abstractClass.Coffee;
import com.xiaohai.dp.decoratorPattern.abstractClass.CoffeeDecorator;

public class Sugar extends CoffeeDecorator {
    String des = "加糖";

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return 0.5d+coffee.cost();
    }

    @Override
    public String getDes() {
        return coffee.getDes() + des;
    }

}

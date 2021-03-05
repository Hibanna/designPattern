package com.xiaohai.dp.decoratorPattern.abstractClass;

public abstract class CoffeeDecorator  extends Coffee{

    String des ;
    protected Coffee coffee;
    @Override
    public  abstract double cost();
    public abstract  String  getDes();
}

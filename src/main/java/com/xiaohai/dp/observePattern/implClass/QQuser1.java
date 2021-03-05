package com.xiaohai.dp.observePattern.implClass;

import com.xiaohai.dp.observePattern.abstractClass.Observer;

public class QQuser1 implements Observer {

    private  String name;

    public QQuser1(String name) {
        this.name = name;
    }

    @Override
    public void update(Object o) {
        System.out.println(this.name+o);
    }
}

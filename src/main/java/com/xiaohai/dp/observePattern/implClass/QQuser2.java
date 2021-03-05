package com.xiaohai.dp.observePattern.implClass;

import com.xiaohai.dp.observePattern.abstractClass.Observer;

public class QQuser2 implements Observer {

    private  String name;
    public QQuser2(String name) {
        this.name = name;
    }

    @Override
    public void update(Object o) {
        System.out.println(this.name+o);
    }
}

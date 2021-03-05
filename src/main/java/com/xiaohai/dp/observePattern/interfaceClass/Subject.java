package com.xiaohai.dp.observePattern.interfaceClass;

import com.xiaohai.dp.observePattern.abstractClass.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected final List<Observer> observers = new ArrayList<>();
    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void  removeObserver(Observer o) {
        observers.remove(o);
    }
    public abstract void  notifyObserver();
}

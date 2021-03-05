package com.xiaohai.dp.observePattern.implClass;

import com.xiaohai.dp.observePattern.abstractClass.Observer;
import com.xiaohai.dp.observePattern.interfaceClass.Subject;

public class TencentNews extends Subject {


    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(this.getData());
        }
    }
}

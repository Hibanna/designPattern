package com.xiaohai.dp.observePattern.test;

import com.xiaohai.dp.observePattern.abstractClass.Observer;
import com.xiaohai.dp.observePattern.implClass.QQuser1;
import com.xiaohai.dp.observePattern.implClass.QQuser2;
import com.xiaohai.dp.observePattern.implClass.TencentNews;
import com.xiaohai.dp.observePattern.interfaceClass.Subject;

public class OPtest {
    public static void main(String[] args) {
        Subject subject = new TencentNews();
        Observer observer1 = new QQuser1("QQuser1");
        Observer observer2 = new QQuser2("QQuser2");
        subject.setData("通知一");
        subject.registerObserver(observer1);
        subject.notifyObserver();
        subject.setData("通知二");
        subject.registerObserver(observer2);
        subject.notifyObserver();
        subject.setData("通知三");
        subject.removeObserver(observer1);
        subject.notifyObserver();
    }
}

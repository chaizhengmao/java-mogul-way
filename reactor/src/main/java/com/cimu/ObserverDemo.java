package com.cimu;

import java.util.Observable;

public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observerDemo = new ObserverDemo();
        observerDemo.addObserver((o, arg) -> {
            System.out.println("changed....." + arg);
        });
        observerDemo.addObserver((o, arg) -> {
            System.out.println("follow change....." + arg);
        });
        observerDemo.setChanged();
        observerDemo.notifyObservers("&&&&&");
    }
}

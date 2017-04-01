package com.algorithm.singletonpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class Singleton {
    private static volatile Singleton singletonObject;

    private Singleton() {}

    public static Singleton getSingletonObject() {
        if(singletonObject == null) {
            synchronized (Singleton.class) {
                if(singletonObject == null) {
                    singletonObject = new Singleton();
                }
            }
        }
        return singletonObject;
    }
}

package com.algorithm.adapterpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class AdapterServiceB {
    ServiceB serviceB = new ServiceB();

    public void runService() {
        serviceB.runByServiceB();
    }
}

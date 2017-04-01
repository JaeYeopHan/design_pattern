package com.algorithm.adapterpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class AdapterServiceA {
    ServiceA serviceA = new ServiceA();

    public void runService() {
        serviceA.runByServiceA();
    }
}

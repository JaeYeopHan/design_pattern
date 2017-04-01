package com.algorithm.proxypattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class Service implements IService {
    @Override
    public String runSomething() {
        return "Service running!";
    }
}

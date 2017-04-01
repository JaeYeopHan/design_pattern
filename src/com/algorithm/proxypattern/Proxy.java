package com.algorithm.proxypattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class Proxy implements IService {
    @Override
    public String runSomething() {
        System.out.println("Proxy!!");
        Service service = new Service();
        System.out.println("별도의 로직 수행중!");
        return service.runSomething();
    }
}

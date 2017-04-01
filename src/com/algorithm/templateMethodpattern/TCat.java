package com.algorithm.templateMethodpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class TCat extends TAnimal {
    @Override
    void play() {
        System.out.println("야옹야옹");
    }

    @Override
    void runSomething() {
        super.runSomething();
        System.out.println("난 고양이임");
    }
}

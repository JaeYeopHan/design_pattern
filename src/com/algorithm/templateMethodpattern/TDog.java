package com.algorithm.templateMethodpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class TDog extends TAnimal {
    @Override
    void play() {
        System.out.println("멍멍");
    }

    @Override
    void runSomething() {
        super.runSomething();
        System.out.println("난 강아지임");
    }
}

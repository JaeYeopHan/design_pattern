package com.algorithm.templateMethodpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public abstract class TAnimal {
    public void playWithOwner() {
        System.out.println("Come on!");
        play();
        runSomething();
        System.out.println("Good job!");
    }

    abstract void play();

    void runSomething() {
        System.out.println("꼬리 살랑 살랑");
    }
}

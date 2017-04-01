package com.algorithm.strategypattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class Soldier {
    public void getWeapon(Strategy strategy) {
        System.out.println("Start!");
        strategy.runStrategy();
        System.out.println("End");
    }
}

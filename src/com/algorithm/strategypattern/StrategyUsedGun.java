package com.algorithm.strategypattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class StrategyUsedGun implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("탕탕탕탕탕!");
    }
}

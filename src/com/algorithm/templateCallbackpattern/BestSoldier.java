package com.algorithm.templateCallbackpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class BestSoldier {
    public void getWeapon(String weapon) {
        System.out.println("Start!");
        useWeapon(weapon).runStrategy();
        System.out.println("End");
    }

    private BestStrategy useWeapon(final String weapon) {
        return new BestStrategy() {
            @Override
            public void runStrategy() {
                System.out.println(weapon);
            }
        };
    }
}

package com.algorithm.factoryMethodpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class CatToy extends AnimalToy {
    @Override
    public void identify() {
        System.out.println("고양이 장난감");
    }
}

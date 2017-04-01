package com.algorithm.factoryMethodpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class DogToy extends AnimalToy {
    @Override
    public void identify() {
        System.out.println("강아지의 장난감");
    }
}

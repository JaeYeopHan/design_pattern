package com.algorithm.factoryMethodpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class Dog extends Animal {
    @Override
    public AnimalToy getToy() {
        return new DogToy();
    }
}

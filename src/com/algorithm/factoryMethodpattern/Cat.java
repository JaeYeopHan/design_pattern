package com.algorithm.factoryMethodpattern;

/**
 * Created by Jbee on 2016. 11. 26..
 */
public class Cat extends Animal {
    @Override
    public AnimalToy getToy() {
        return new CatToy();
    }
}

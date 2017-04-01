package com.algorithm;

import com.algorithm.adapterpattern.AdapterServiceA;
import com.algorithm.adapterpattern.AdapterServiceB;
import com.algorithm.adapterpattern.ServiceA;
import com.algorithm.adapterpattern.ServiceB;
import com.algorithm.factoryMethodpattern.Animal;
import com.algorithm.factoryMethodpattern.AnimalToy;
import com.algorithm.factoryMethodpattern.Cat;
import com.algorithm.factoryMethodpattern.Dog;
import com.algorithm.proxypattern.Proxy;
import com.algorithm.proxypattern.Service;
import com.algorithm.singletonpattern.Singleton;
import com.algorithm.strategypattern.Soldier;
import com.algorithm.strategypattern.Strategy;
import com.algorithm.strategypattern.StrategyUsedGun;
import com.algorithm.strategypattern.StrategyUsedSword;
import com.algorithm.templateCallbackpattern.BestSoldier;
import com.algorithm.templateMethodpattern.TAnimal;
import com.algorithm.templateMethodpattern.TCat;
import com.algorithm.templateMethodpattern.TDog;

public class Main {

    public static void main(String[] args) {
        System.out.print("------------------------------");
        System.out.println("Adapter Pattern");
        //Adapter Pattern
        //before
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();

        serviceA.runByServiceA();
        serviceB.runByServiceB();


        //After
        AdapterServiceA a = new AdapterServiceA();
        AdapterServiceB b = new AdapterServiceB();

        a.runService();
        b.runService();

        System.out.print("------------------------------");
        System.out.println("Proxy Pattern");
        //Proxy Pattern
        //before
        Service service = new Service();
        System.out.println(service.runSomething());

        //After
        Proxy proxy = new Proxy();
        System.out.println(proxy.runSomething());


        System.out.print("------------------------------");
        System.out.println("Singleton Pattern");

        //생성자에 private 키워드가 있기 때문에 new를 통해 인스턴스를 생성할 수 없다
        //Singleton singleton = new Singleton();
        Singleton s1 = Singleton.getSingletonObject();
        Singleton s2 = Singleton.getSingletonObject();
        System.out.println(s1);//com.algorithm.singletonpattern.Singleton@39ed3c8d
        System.out.println(s2);//com.algorithm.singletonpattern.Singleton@39ed3c8d

        System.out.print("------------------------------");
        System.out.println("Template Method Pattern");
        //Template Method Pattern
        TAnimal bolt = new TDog();
        TAnimal kitty = new TCat();

        bolt.playWithOwner();
        kitty.playWithOwner();

        System.out.print("------------------------------");
        System.out.println("Factory Method Pattern");
        Animal dog = new Dog();
        Animal cat = new Cat();

        AnimalToy dogToy = dog.getToy();
        AnimalToy catToy = cat.getToy();

        dogToy.identify();
        catToy.identify();

        System.out.print("------------------------------");
        System.out.println("Strategy Method Pattern");
        Soldier jbee = new Soldier();
        Strategy strategyUsedGun = new StrategyUsedGun();
        Strategy strategyUsedSword = new StrategyUsedSword();
        jbee.getWeapon(strategyUsedGun);
        jbee.getWeapon(strategyUsedSword);

        System.out.print("------------------------------");
        System.out.println("Template Callback Pattern");
        BestSoldier bjbee = new BestSoldier();
        bjbee.getWeapon("탕탕ㅌ앝앝아");

    }
}


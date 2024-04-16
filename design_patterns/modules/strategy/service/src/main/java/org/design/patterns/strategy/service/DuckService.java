package org.design.patterns.strategy.service;

import org.design.patterns.strategy.service.behaviors.QuackSilent;
import org.design.patterns.strategy.service.ducks.MallardDuck;
import org.design.patterns.strategy.api.Duck;

public class DuckService {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setQuackBehavior(new QuackSilent());
        mallardDuck.performQuack();
    }
}
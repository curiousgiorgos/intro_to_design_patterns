package org.design.patterns.strategy;

import org.design.patterns.strategy.behaviors.QuackSilent;
import org.design.patterns.strategy.ducks.MallardDuck;
import org.designs.pattern.strategy.api.Duck;

public class DuckService {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setQuackBehavior(new QuackSilent());
        mallardDuck.performQuack();
    }
}
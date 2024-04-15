package org.design.patterns.strategy.ducks;

import org.design.patterns.strategy.behaviors.FlyWithWings;
import org.design.patterns.strategy.behaviors.QuackLoud;
import org.designs.pattern.strategy.api.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new QuackLoud());
    }

    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}

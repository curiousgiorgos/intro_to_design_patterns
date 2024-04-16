package org.design.patterns.strategy.service.ducks;

import org.design.patterns.strategy.api.Duck;
import org.design.patterns.strategy.service.behaviors.FlyWithWings;
import org.design.patterns.strategy.service.behaviors.QuackLoud;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new QuackLoud());
    }

    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}

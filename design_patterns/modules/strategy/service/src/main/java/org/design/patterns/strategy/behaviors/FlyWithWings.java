package org.design.patterns.strategy.behaviors;

import org.designs.pattern.strategy.api.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    public FlyWithWings() {
    }

    public void fly() {
        System.out.println("I am flying using wings");
    }
}

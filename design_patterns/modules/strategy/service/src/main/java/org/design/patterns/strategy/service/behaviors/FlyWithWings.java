package org.design.patterns.strategy.service.behaviors;

import org.design.patterns.strategy.api.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    public FlyWithWings() {
    }

    public void fly() {
        System.out.println("I am flying using wings");
    }
}

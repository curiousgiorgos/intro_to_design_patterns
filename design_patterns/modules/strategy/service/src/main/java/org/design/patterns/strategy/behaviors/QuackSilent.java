package org.design.patterns.strategy.behaviors;

import org.designs.pattern.strategy.api.QuackBehavior;

public class QuackSilent implements QuackBehavior {

    public void quack() {
        System.out.println("Silent quack!");
    }

}

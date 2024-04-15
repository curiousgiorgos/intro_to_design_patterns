package org.design.patterns.strategy.behaviors;

import org.designs.pattern.strategy.api.QuackBehavior;

public class QuackLoud implements QuackBehavior {

    public QuackLoud() {
    }

    public void quack() {
        System.out.println("QUACK!");
    }
}

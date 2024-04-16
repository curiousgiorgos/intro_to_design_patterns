package org.design.patterns.strategy.service.behaviors;

import org.design.patterns.strategy.api.QuackBehavior;

public class QuackLoud implements QuackBehavior {

    public QuackLoud() {
    }

    public void quack() {
        System.out.println("QUACK!");
    }
}

package org.design.patterns.strategy.service.behaviors;

import org.design.patterns.strategy.api.QuackBehavior;

public class QuackSilent implements QuackBehavior {

    public void quack() {
        System.out.println("Silent quack!");
    }

}

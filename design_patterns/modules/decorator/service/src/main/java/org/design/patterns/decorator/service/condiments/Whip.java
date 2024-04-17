package org.design.patterns.decorator.service.condiments;

import org.design.patterns.decorator.api.Beverage;
import org.design.patterns.decorator.api.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.17 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip ";
    }
}

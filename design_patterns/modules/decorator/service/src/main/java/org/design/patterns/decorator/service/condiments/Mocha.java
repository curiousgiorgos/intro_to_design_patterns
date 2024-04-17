package org.design.patterns.decorator.service.condiments;

import org.design.patterns.decorator.api.Beverage;
import org.design.patterns.decorator.api.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.3 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha ";
    }
}

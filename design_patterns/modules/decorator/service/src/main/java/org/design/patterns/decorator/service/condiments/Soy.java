package org.design.patterns.decorator.service.condiments;

import org.design.patterns.decorator.api.Beverage;
import org.design.patterns.decorator.api.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.15 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy ";
    }
}

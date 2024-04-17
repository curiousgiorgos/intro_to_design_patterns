package org.design.patterns.decorator.service.beverages;

import org.design.patterns.decorator.api.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.9;
    }
}

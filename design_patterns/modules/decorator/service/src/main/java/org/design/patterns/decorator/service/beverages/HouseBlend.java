package org.design.patterns.decorator.service.beverages;

import org.design.patterns.decorator.api.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    public double cost() {
        return 1.2;
    }
}

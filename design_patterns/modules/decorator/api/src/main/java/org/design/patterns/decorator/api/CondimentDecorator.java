package org.design.patterns.decorator.api;

public abstract class  CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();
}

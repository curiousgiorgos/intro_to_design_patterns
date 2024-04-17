package org.design.patterns.decorator.api;

public abstract class Beverage {

    public static String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

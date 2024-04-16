package org.design.patterns.observer.api;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
    public void update();
}

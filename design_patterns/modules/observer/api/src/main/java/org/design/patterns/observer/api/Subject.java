package org.design.patterns.observer.api;

public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void measurementsChanged();


    public float getTemperature();

    public float getPressure();

    public float getHumidity();

}

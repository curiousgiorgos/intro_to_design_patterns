package org.design.patterns.observer.service;

import org.design.patterns.observer.api.Observer;
import org.design.patterns.observer.api.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherData implements Subject{

    private List<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obsToRemove) {
        observers = observers.stream()
                .filter(obs -> !obs.equals(obsToRemove))
                .collect(Collectors.toList());
    }

    private void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
            // second implementation: notifying observers and allowing each observer to pull
            // relevant data
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    // testing method
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

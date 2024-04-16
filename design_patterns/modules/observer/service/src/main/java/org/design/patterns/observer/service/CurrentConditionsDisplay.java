package org.design.patterns.observer.service;

import org.design.patterns.observer.api.DisplayElement;
import org.design.patterns.observer.api.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    // second implementation: the observer gets notified of a change and is allowed
    // to pull specific information using getters
    public void update() {
        this.temperature = weatherData.getTemperature();
        display();
    }

    public void unregister() {
        this.weatherData.removeObserver(this);
    }

    public void register(WeatherData weatherData) {
        setWeatherData(weatherData);
        register();
    }

    public void register() {
        weatherData.registerObserver(this);
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void display() {
        System.out.println("Current temperature: " + temperature + ", current humidity: " + humidity + ", current pressure " + pressure);
    }
}

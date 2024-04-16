package org.design.patterns.observer.service;


public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10, 20, 30.4f);
        weatherData.setMeasurements(60, 30, 30.4f);
        weatherData.setMeasurements(40, 20, 29.4f);
    }
}
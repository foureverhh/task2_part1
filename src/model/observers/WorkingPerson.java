package model.observers;

import model.observable.WeatherReport;

import java.util.Observable;

public class WorkingPerson extends Person {
    public WorkingPerson(String name, int age) {
        super(name, age);
    }

    public void update(Observable o, Object arg) {
        WeatherReport weatherReport = (WeatherReport) o;
        if(weatherReport.getTemperature() == -10){
            responseToWeather(" work from home, temperature is too low ", weatherReport);
        }else if(weatherReport.getTemperature() == 10){
            responseToWeather(" work as usual, temperature is nice",weatherReport);
        }else {
            responseToWeather(" have to go to work, temperature is too high",weatherReport);
        }

    }

    @Override
    public void responseToWeather(String myChoice, WeatherReport weatherReport) {
        super.responseToWeather(myChoice, weatherReport);
    }
}

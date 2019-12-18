package model.observers;

import model.observable.WeatherReport;

import java.util.Observable;

public class StudentPerson extends Person {
    public StudentPerson(String name, int age) {
        super(name, age);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherReport weatherReport = (WeatherReport) o;
        if(weatherReport.getTemperature() == -10){
            responseToWeather(" not go to school, temperature is too low ", weatherReport);
        }else if(weatherReport.getTemperature() == 10){
            responseToWeather("go to school, temperature is nice",weatherReport);
        }else {
            responseToWeather("go to swim, temperature is too high",weatherReport);
        }
    }

    @Override
    public void responseToWeather(String myChoice, WeatherReport weatherReport) {
        super.responseToWeather(myChoice, weatherReport);
    }
}

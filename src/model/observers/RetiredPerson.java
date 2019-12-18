package model.observers;

import model.observable.WeatherReport;

import java.util.Observable;

public class RetiredPerson extends Person {

    public RetiredPerson(String name, int age) {
        super(name, age);
    }

    public void update(Observable o, Object arg) {
        WeatherReport weatherReport = (WeatherReport) o;
        if(weatherReport.getTemperature() == -10){
            responseToWeather(" stay at home, temperature is too low ", weatherReport);
        }else if(weatherReport.getTemperature() == 10){
            responseToWeather("fika with old friends, temperature is nice",weatherReport);
        }else {
            responseToWeather("use air conditioner, temperature is too high",weatherReport);
        }

    }

    @Override
    public void responseToWeather(String myChoice, WeatherReport weatherReport) {
        super.responseToWeather(myChoice, weatherReport);
    }
}

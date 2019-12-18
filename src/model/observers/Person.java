package model.observers;

import model.observable.WeatherReport;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer{
    private String name;
    private int age;
    private String response;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void update(Observable o, Object arg) { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void responseToWeather(String myChoice, WeatherReport weatherReport){
        this.response = "I am " + this.getClass().getSimpleName() + " " + this.getName() + " ,under weather temperature " +
                weatherReport.getTemperature() +", I would " + myChoice;
    }

    public String getResponse() {
        return response;
    }
}

package model.observable;

import model.observers.Person;

import java.util.Observable;

import java.util.ArrayList;
import java.util.List;

public class WeatherReport extends Observable {
    private int temperature;
    List<Person> personList;

    public WeatherReport() {
        personList = new ArrayList<>();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.setChanged();
        this.notifyAllPerson();
    }

    public void notifyAllPerson(){
        this.notifyObservers();
    }
}

package model;

import model.observers.Person;
import model.observable.WeatherReport;
import model.factory.PersonCreator;

public class Facade {

    private Person retiredJack;
    private Person workerJack;
    private Person studentJack;

    public Facade() {

        createPersonInstances();
    }

    public void createPersonInstances(){
        retiredJack = PersonCreator.createPerson("Jack",68);
        workerJack = PersonCreator.createPerson("Jack",40);
        studentJack = PersonCreator.createPerson("Jack",15);

    }


    public Person getRetiredJack() {
        return retiredJack;
    }

    public Person getWorkerJack() {
        return workerJack;
    }

    public Person getStudentJack() {
        return studentJack;
    }
}

package model.factory;

import model.observers.Person;
import model.observers.StudentPerson;
import model.observers.RetiredPerson;
import model.observers.WorkingPerson;

public class PersonCreator {
    public static Person createPerson(String name, int age) {
        if( age < 18){
            return new StudentPerson(name,age);
        }else if(age < 65 ){
            return new WorkingPerson(name,age);
        } else {
            return new RetiredPerson(name,age);
        }
    }
}

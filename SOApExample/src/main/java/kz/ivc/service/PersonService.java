package kz.ivc.service;


import kz.ivc.soapexample.Person;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class PersonService {

    private static final Map<String, Person> persons = new HashMap<>();

    @PostConstruct
    public void initialize(){
        Person person = new Person();
        person.setId(1);
        person.setName("Zharkyn");
        person.setSurname("Karakozhin");
        persons.put(person.getName(), person);

        person = new Person();
        person.setId(2);
        person.setName("Bekzat");
        person.setSurname("Minazhatov");
        persons.put(person.getName(), person);
    }

    public Person getPersons(String name){
        return persons.get(name);
    }
}

package com.codingschool.redIotProject.Services;

import java.util.List;
import com.codingschool.redIotProject.Entities.Person;

public interface PersonService {

    List<Person> findByName(String name);
    List<Person> findAll();
    List<Person> findByNameContaining(String searchterm);
    Person findById(long id);
    Person save(Person d);
    //void delete(Integer id);
    //void delete(Person p);

}
package com.codingschool.redIotProject.Repositories;

import com.codingschool.redIotProject.Entities.Person;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByName(String name);
    List<Person> findAll();
    List<Person> findByNameContaining(String searchterm);
    Person findById(long id);


}

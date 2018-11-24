package com.codingschool.redIotProject.Services;

import com.codingschool.redIotProject.Repositories.PersonRepository;
import org.springframework.stereotype.Service;



@Service
public class PersonService {

    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}

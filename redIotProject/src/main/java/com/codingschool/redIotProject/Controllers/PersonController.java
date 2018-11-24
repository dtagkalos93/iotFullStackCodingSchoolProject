package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.Person;
import com.codingschool.redIotProject.Repositories.PersonRepository;
import com.codingschool.redIotProject.Services.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private PersonRepository repository;
    private PersonService personService;

    public PersonController(PersonRepository repository, PersonService personService) {
        this.repository = repository;
        this.personService = personService;
    }

}

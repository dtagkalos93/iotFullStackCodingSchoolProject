package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.Person;
import com.codingschool.redIotProject.Repositories.PersonRepository;
import com.codingschool.redIotProject.Services.PersonService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/persons")
public class PersonController {
	/*
    private PersonRepository repository;
    private PersonService personService;

    public PersonController(PersonRepository repository, PersonService personService) {
        this.repository = repository;
        this.personService = personService;
    }*/
	
	@Autowired
	private PersonService personService;
	
	@GetMapping
	public List<Person> findAll(){
		return personService.findAll();
	}
	
	@GetMapping("/{id}")
    public Person findOne(@PathVariable int id) {
        return personService.findByid(id);
    }
 
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody Person person) {
        return personService.save(person);
    }
	
	
	

}

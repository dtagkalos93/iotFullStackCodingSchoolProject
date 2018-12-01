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


import java.security.Principal;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/persons")
public class PersonController {


    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> findAll(){
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person findOne(@PathVariable int id) {
        return personService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody Person person) {
        return personService.save(person);
    }

    @RequestMapping("/login")
    public Map<String,String> login(@RequestBody Person person) {
        Map<String,String> tmp= new HashMap<>();
        tmp.put("auth",(person.getMail().equals("email") && person.getPassword().equals("password"))+"");
        tmp.put("role",person.getRole().toString());
        return tmp;

    }

    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
                .substring("Basic".length()).trim();
        return () ->  new String(Base64.getDecoder()
                .decode(authToken)).split(":")[0];
    }



}
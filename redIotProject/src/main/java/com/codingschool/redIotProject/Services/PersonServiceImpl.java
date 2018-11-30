package com.codingschool.redIotProject.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingschool.redIotProject.Entities.Person;
import com.codingschool.redIotProject.Repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRep;
	
	@Override
	public List<Person> findByname(String name){
		return personRep.findByname(name);
	}
	
	@Override
    public List<Person> findAll(){
		return personRep.findAll();
	}
	
	@Override
	public List<Person> findByNameContaining(String searchterm){
		return personRep.findByNameContaining(searchterm);
	}
    
	@Override
	public Person findByid(long id) {
		return personRep.findByid(id);
	}
	
	@Override
    public Person save(Person d) {
		return personRep.save(d);
	}
}

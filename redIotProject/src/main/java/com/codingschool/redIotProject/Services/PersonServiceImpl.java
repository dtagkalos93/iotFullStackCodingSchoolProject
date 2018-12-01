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
	public List<Person> findByName(String name){
		return personRep.findByName(name);
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
	public Person findById(long id) {
		return personRep.findById(id);
	}

	@Override
	public Person save(Person d) {
		return personRep.save(d);
	}
}
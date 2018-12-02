package com.codingschool.redIotProject.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingschool.redIotProject.Entities.User;
import com.codingschool.redIotProject.Repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository personRep;

	@Override
	public List<User> findByName(String name){
		return personRep.findByName(name);
	}

	@Override
	public List<User> findAll(){
		return personRep.findAll();
	}

	@Override
	public List<User> findByNameContaining(String searchterm){
		return personRep.findByNameContaining(searchterm);
	}

	@Override
	public User findById(long id) {
		return personRep.findById(id);
	}

	@Override
	public User save(User d) {
		return personRep.save(d);
	}
}
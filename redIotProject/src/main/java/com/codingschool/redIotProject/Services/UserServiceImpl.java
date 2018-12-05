package com.codingschool.redIotProject.Services;

import com.codingschool.redIotProject.Entities.User;
import com.codingschool.redIotProject.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public User updateUsername(User newUser, long id) {

		User currentUser = personRep.findById(id);
		newUser.setId(id);
		currentUser.setUsername(newUser.getUsername());

		return personRep.save(currentUser);

	}

	@Override
	public void deleteById(long id){ personRep.deleteById(id);}

}
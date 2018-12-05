package com.codingschool.redIotProject.Services;

import com.codingschool.redIotProject.Entities.User;

import java.util.List;

public interface UserService {

    List<User> findByName(String name);
    List<User> findAll();
    List<User> findByNameContaining(String searchterm);
    User findById(long id);
    User save(User d);
    User updateUsername (User user, long id);
    //void delete(Integer id);
   // ResponseEntity<Object> createUser(User user);
   // ResponseEntity<Object> updateUser(User user,long id);
    void deleteById(long id);

}
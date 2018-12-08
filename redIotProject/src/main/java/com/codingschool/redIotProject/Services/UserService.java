package com.codingschool.redIotProject.Services;

import com.codingschool.redIotProject.Entities.User;

import java.util.List;

public interface UserService {

    List<User> findByName(String name);
    List<User> findAll();
    List<User> findByNameContaining(String searchterm);
    User findById(long id);
    User save(User d);
<<<<<<< Updated upstream
    User updateUsername (User user, long id);
    void deleteById(long id);
=======
    User findByUsername(String name);
    //void delete(Integer id);
    //void delete(User p);
>>>>>>> Stashed changes

}
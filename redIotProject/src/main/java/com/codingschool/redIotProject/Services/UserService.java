package com.codingschool.redIotProject.Services;

import java.util.List;
import com.codingschool.redIotProject.Entities.User;

public interface UserService {

    List<User> findByName(String name);
    List<User> findAll();
    List<User> findByNameContaining(String searchterm);
    User findById(long id);
    User save(User d);
    //void delete(Integer id);
    //void delete(User p);

}
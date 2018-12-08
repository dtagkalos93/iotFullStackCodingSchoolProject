package com.codingschool.redIotProject.Repositories;

import com.codingschool.redIotProject.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.http.ResponseEntity;
>>>>>>> master
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByName(String name);
    List<User> findAll();
    List<User> findByNameContaining(String searchterm);
    User findById(long id);
    void deleteById(long id);
    User findByUsername(String name);
}

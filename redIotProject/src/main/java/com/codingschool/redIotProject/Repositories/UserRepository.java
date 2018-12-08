package com.codingschool.redIotProject.Repositories;

import com.codingschool.redIotProject.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

<<<<<<< Updated upstream
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
>>>>>>> Stashed changes
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByName(String name);
    User findByUsername(String name);
    List<User> findAll();
    List<User> findByNameContaining(String searchterm);
    User findById(long id);
    void deleteById(long id);


}

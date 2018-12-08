package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.User;
import com.codingschool.redIotProject.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

<<<<<<< Updated upstream
=======

import java.security.Principal;
import java.util.Base64;
>>>>>>> Stashed changes
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin
public class UserController {


    @Autowired
    private UserService userService;

    // returns all users
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

<<<<<<< Updated upstream

    // Returns user by id
    @GetMapping("/{id}")
    public User findOne(@PathVariable long id) {
=======
    @GetMapping("/users/{id}")
    public User findOne(@PathVariable int id) {
>>>>>>> Stashed changes
        return userService.findById(id);
    }


    // Creates new User
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    User newUser(@RequestBody User newUser) {
        return userService.save(newUser);
    }

    // updates username found by id
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User updateUsername(@RequestBody User user, @PathVariable Long id) {
        return userService.updateUsername(user, id);
    }

    // deletes user by id
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteById(id);
    }


    @RequestMapping("/login")
    public boolean login(@RequestBody User user) {
        return user.getUsername().equals("user") && user.getPassword().equals("password");
    }

<<<<<<< Updated upstream


=======
    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
                .substring("Basic".length()).trim();
        return () ->  new String(Base64.getDecoder()
                .decode(authToken)).split(":")[0];
    }
>>>>>>> Stashed changes
}
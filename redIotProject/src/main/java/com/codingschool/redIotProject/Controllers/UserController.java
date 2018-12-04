package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.User;
import com.codingschool.redIotProject.Services.UserService;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable int id) {
        return userService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping("/login")
    public Map<String,String> login(@RequestBody User user) {
        Map<String,String> tmp= new HashMap<>();
        tmp.put("auth",(user.getMail().equals("email") && user.getPassword().equals("password"))+"");
        tmp.put("role", user.getRole().toString());
        return tmp;

    }





}
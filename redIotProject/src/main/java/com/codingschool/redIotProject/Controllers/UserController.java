package com.codingschool.redIotProject.Controllers;


import com.codingschool.redIotProject.Entities.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/person")
    public Person helloPerson (@RequestParam(value = "id",defaultValue = "0")long id,
                   @RequestParam(value = "name",defaultValue = "Jack") String name,
                   @RequestParam(value = "surname",defaultValue = "Dao") String surname,
                   @RequestParam(value = "mail",defaultValue = "test@test.com")  String mail,
                   @RequestParam(value = "password",defaultValue = "12345") String password){
        return new Person (id,name,surname,mail,password);
    }
}

package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Вадим on 21.10.2017.
 */
@RestController
@RequestMapping(value = "/users")
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping(value = "/id/{id}")
    public User getById(@PathVariable ("id") String id){
        return userService.findUserById(id);
    }

    @GetMapping(value = "/{name}")
    public User getByName(@PathVariable ("name") String name){
        return userService.findByName(name);
    }


}

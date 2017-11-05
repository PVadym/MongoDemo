package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 * Created by Вадим on 21.10.2017.
 */

public class Runner implements CommandLineRunner{

    @Autowired
    UserService userService;


    @Override
    public void run(String... strings) throws Exception {

        User user1 = new User("vadim","pylypchenko",32, new Date(),new ArrayList<>());
        User user2 = new User("petya","kuzya",32, new Date(),new ArrayList<User>(Collections.singletonList(user1)));
        User user3 = new User("gorik","teprov",32, new Date(),new ArrayList<>(Arrays.asList(user1, user2)));

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);


    }
}

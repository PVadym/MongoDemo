package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * Created by Вадим on 21.10.2017.
 */
public interface UserService {

    List<User> getAll();
    User findUserById (String id);
    User save(User user);
    void update(User user);
    void delete(String id);
    User findByName(String name);
}

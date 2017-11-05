package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Вадим on 21.10.2017.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query(value = "{name :?0}")
    User findByName(String name);
}

package com.foodbackend.repository;

import com.foodbackend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends MongoRepository<User,Long> {
    User findByEmail(String email);
    User findBy_id(String _id);

    User findByuserID(long userID);



}

package com.valmirsales.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.valmirsales.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

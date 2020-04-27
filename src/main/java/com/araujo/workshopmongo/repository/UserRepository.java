package com.araujo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.araujo.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}

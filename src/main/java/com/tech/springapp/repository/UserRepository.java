package com.tech.springapp.repository;

import com.tech.springapp.model.User;
import org.springframework.data.repository.CrudRepository;

//Java Persistence API is a specification that defines an object-relational mapping (ORM) standard for storing,
// accessing, and managing Java objects in a relational database.
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}

package com.tech.springapp.repository;

import com.tech.springapp.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String rolename);
}

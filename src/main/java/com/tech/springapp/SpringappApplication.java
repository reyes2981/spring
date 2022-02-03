package com.tech.springapp;

import com.tech.springapp.model.Role;
import com.tech.springapp.model.User;
import com.tech.springapp.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringappApplication.class, args);
    }

//    @Bean
//    CommandLineRunner run(UserService userService) {
//        return args -> {
//            userService.saveRole(new Role(null, "ROLE_USER"));
//            userService.saveRole(new Role(null, "ROLE_ADMIN"));
//
//            userService.saveUser(new User(null, "optimus prime", "optimusprime456", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "ben sisko", "benjaminsisko123", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "christian nodal", "christiannodal789", "1234", new ArrayList<>()));
//
//            userService.addRoleToUser("optimusprime456", "ROLE_USER");
//            userService.addRoleToUser("benjaminsisko123", "ROLE_ADMIN");
//            userService.addRoleToUser("christiannodal789", "ROLE_USER");
//        };
//    }


}

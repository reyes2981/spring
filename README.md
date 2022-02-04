# springtech-java-project-2

### Set Up
1. Create a new DB called [ sprringtech ] in postgres and connect to it. 

    a. \c springtech

### Option1

- [X] Persist at least **four models** eg: (`User`, `Resource`, `Category`, `Role`) to a PostgreSQL database.
- [X] Use Spring Profiles for environment settings.
- [X] At least one API endpoint must perform full CRUD **create, read, update, and delete actions**.
- [X] Other API endpoints can perform CRUD based on the business use-case.    
- [X] Expose CRUD routes that were built using **REST conventions**.
- [X] **Handle exceptions** gracefully.
- [X] Send appropriate messages back to the client in the event that an exception occurs.
- [X] Must have `Controller` and  `Service` separate.
- [X] Document each end-point

This is a backend program that utilizes a RESTful API to handle, receive and request data from a database that stores user information and more. The program is designed for an admin client side and allows for users to be created. The user also has the permission to add, update, delete and create new categogorized resources. 

# The original Plan

![charlie-day-its-always-sunny-in-philadelphia](https://user-images.githubusercontent.com/68618256/152446514-6928c9d2-8466-4308-9bc1-8420ed06b715.gif)

I had big plans when I first started the project, to say the least. I originally was going to create a program that implemeented authorization and authenticataion to my database. My plan was to only make some 

![spring](https://user-images.githubusercontent.com/68618256/152446601-990201a3-7126-4981-b65d-547ce5bbe509.jpeg)

| Request Type | URL| Functionality | 
|--|--|--|
| GET | /categories/getCategories | Get all Categories |
| POST | /categories/addCategory | Add a Category |
| POST | /categories/addResourceToCategory | Add a Resource to a Category |
| DELETE | /categories//categories/{categoryId}/resources/{resourceId}/remove | Remove a Resource from a Category |
| GET | /categories/getCategory/id | Get a Category |
| PUT | /categories/editCategory/id | Edit a Category |
| DELETE | /categories/deleteCategory/id | Remove a Category |
| GET | /resources/getResources | Get all Resources |
| POST | /resources/addResource | Add a Resource |
| GET | /resources/getResource/id | Get a Resource |
| PUT | /resources/editResource/id | Edit a Resource |
| DELETE | /resources/deleteResource/id | Remove a Resource |
| GET | /users/getUsers | Get all Users |
| POST | /users/saveUser | Add a User |
| POST | /users/role/addToUser | Add a Role to User |
| POST | /users/role/save | Add a Role |

# Project Challenges

1. Adding authentication/authorization - Initially, one of my goals, was to add these functionalities using JWT tokens. When I would look for a user in the DB I would get an error that stated the object I was trying to view was null. I did research on Google/StackOverFlow and then my classmates on Slack. I was steered in the right direction and attempted to implement UserDetails and UserDetailsService but it was still not working. 
2. Not a fan of Postman interface - I ended up using Swagger UI

# DEPENDENCIES USED

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
            <version>2.6.3</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.22</version>
            <scope>provided</scope>
        </dependency>

        <dependency>
            <groupId>com.auth0</groupId>
            <artifactId>java-jwt</artifactId>
            <version>3.18.3</version>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.22</version>
            <scope>provided</scope>
        </dependency>

        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-boot-starter</artifactId>
            <version>3.0.0</version>
        </dependency>

## System Tools Used

|  |  |
| --- | :--- |
| Spring Boot | IntelliJ IDEA/Java 11 and 17 |
| Apache Maven | Google |
| Swagger UI | Postgres |
| Lucid App |


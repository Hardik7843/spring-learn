package com.example.restful_web_services.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResource {
    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    // GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // GET /users/{id}
    @GetMapping("/users/{id}")
    public User retriveUser(@PathVariable("id") int id) {
        User foundUser = service.findOne(id);
        if (foundUser == null) {
            throw new UserNotFoundException("User Not Found");
        }
        return foundUser;
    }

    @DeleteMapping("/users/{id}")
    public User deleteOneUser(@PathVariable("id") int id) {
        User deletedUser = service.deleteById(id);
        if (deletedUser == null) {
            throw new UserNotFoundException("User Not Found");
        }
        return deletedUser;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User userSaved = service.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userSaved.getId())
                .toUri();
        return ResponseEntity.created(location).body(userSaved);
    }

}

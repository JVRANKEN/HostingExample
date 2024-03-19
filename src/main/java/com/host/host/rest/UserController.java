package com.host.host.rest;

import com.host.host.crud.UserRepository;
import com.host.host.jpa.HostingUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // standard constructors

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<HostingUser> getUsers() {
        return (List<HostingUser>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody HostingUser user) {
        userRepository.save(user);
    }
}

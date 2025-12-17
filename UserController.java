package com.micro.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "List of users";
    }

    @PostMapping
    public String createUser(@RequestBody String name) {
        return "Created user: " + name;
    }
}

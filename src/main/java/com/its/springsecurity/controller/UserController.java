package com.its.springsecurity.controller;

import com.its.springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

//    @PostMapping("/saveUser")
//    public ResponseEntity<Void> saveUser(@RequestBody User user) {
//        userService.save(user);
//        return ResponseEntity.ok().build();
//    }
}

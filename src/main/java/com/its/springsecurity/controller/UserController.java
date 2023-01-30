package com.its.springsecurity.controller;

import com.its.springsecurity.domain.User;
import com.its.springsecurity.domain.user.UserDTO;
import com.its.springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/join")
    public String joinForm() {
        return "save";
    }

    @PostMapping("/save")
        public String createUser(@ModelAttribute UserDTO userDTO){
            userService.save(User.toSaveEntity(userDTO));
            return "login";

        }

    }

package com.its.springsecurity.controller;


import com.its.springsecurity.config.auth.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final HttpSession httpSession;


    @GetMapping("/")
    public String index(Model model) {

        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        if (user != null) {
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }

    @GetMapping("/squad")
    public String squad() {
        return "SquadMake/SquadMaker";
    }

    @GetMapping("/wcMvp")
    public String wcMvP() {
        return "WcMvp";
    }

    @GetMapping("/wcYp")
    public String wcYp() {
        return "WcYoung";
    }

    @GetMapping("/index2")
    public String index2() {
        return "index2";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }


}

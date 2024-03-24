package com.example.buybag.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.buybag.models.User;
import com.example.buybag.services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public ModelAndView createUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        if(!userService.createUser(user)){
            modelAndView.addObject("errorMessage", "User with Email: " + user.getEmail() + " already exists");
            modelAndView.setViewName("registration");
        } else {
            modelAndView.setViewName("redirect:/login");
        }
        return modelAndView;
    }

    @GetMapping("/hello")
    public String securityUrl(){
        return "hello";
    }
}

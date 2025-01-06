package com.quizapp.Quiz_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.quizapp.Quiz_App.model.UserDtls;

import com.quizapp.Quiz_App.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    @Autowired
   

   

    @GetMapping("/signin")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(HttpSession session, Model model) {
        String msg = (String) session.getAttribute("msg");
        if (msg != null) {
            model.addAttribute("msg", msg);
            session.removeAttribute("msg"); 
        }
        return "register";
    }

    @PostMapping("/createUser")
    public String createUser(@ModelAttribute UserDtls user, HttpSession session) {
        boolean emailExists = userService.checkEmail(user.getEmail());

        if (emailExists) {
            session.setAttribute("msg", "Email ID already exists");
        } else {
            UserDtls userDtls = userService.createUser(user);
            if (userDtls != null) {
                session.setAttribute("msg", "Registered Successfully");
            } else {
                session.setAttribute("msg", "Something went wrong on the server");
            }
        }

        return "redirect:/register";
    }
}
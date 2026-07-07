package com.shiva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shiva.dao.UserDAO;
import com.shiva.model.User;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String register(@ModelAttribute User user, Model model) {

        UserDAO dao = new UserDAO();

        boolean status = dao.saveUser(user);

        if(status) {
            model.addAttribute("name", user.getName());
            return "success";
        } else {
            return "index";
        }
    }
}
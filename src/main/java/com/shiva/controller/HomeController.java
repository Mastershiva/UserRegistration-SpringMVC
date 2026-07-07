package com.shiva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shiva.dao.UserDAO;
import com.shiva.model.User;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
    @RequestMapping(value="/checkUsername", method=RequestMethod.GET)
    @ResponseBody
    public String checkUsername(@RequestParam("username") String username) {

        UserDAO dao = new UserDAO();

        if (dao.userExists(username)) {
            return "EXISTS";
        }

        return "AVAILABLE";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute User user, Model model) {

        UserDAO dao = new UserDAO();

        // Check if username already exists (case-insensitive)
        if (dao.userExists(user.getUsername())) {

            model.addAttribute("error", "User already exists! Please choose another username.");

            return "index";
        }

        boolean status = dao.saveUser(user);

        if (status) {

            model.addAttribute("name", user.getName());

            return "success";

        } else {

            model.addAttribute("error", "Registration Failed!");

            return "index";
        }
    }
}
package com.shiva.controller;

import javax.servlet.http.HttpSession;

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

    // Home Page
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    // ===========================
    // Registration Page (GET)
    // ===========================
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage() {
        return "index";
    }

    // ===========================
    // Check Username Availability
    // ===========================
    @RequestMapping(value = "/checkUsername", method = RequestMethod.GET)
    @ResponseBody
    public String checkUsername(@RequestParam("username") String username) {

        UserDAO dao = new UserDAO();

        if (dao.userExists(username)) {
            return "EXISTS";
        }

        return "AVAILABLE";
    }

    // ===========================
    // Register User (POST)
    // ===========================
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute User user, Model model) {

        UserDAO dao = new UserDAO();

        if (dao.userExists(user.getUsername())) {

            model.addAttribute("error",
                    "User already exists! Please choose another username.");

            return "index";
        }

        boolean status = dao.saveUser(user);

        if (status) {

            model.addAttribute("name", user.getName());

            return "success";
        } else {

            model.addAttribute("error",
                    "Registration Failed!");

            return "index";
        }
    }

    // ===========================
    // Login Page
    // ===========================
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    // ===========================
    // Login Validation
    // ===========================
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session,
            Model model) {

        UserDAO dao = new UserDAO();

        if (dao.login(username, password)) {

            session.setAttribute("username", username);
            model.addAttribute("username", username);

            return "dashboard";
        }

        model.addAttribute("error",
                "Invalid Username or Password");

        return "login";
    }

    // ===========================
    // Forgot Password Page
    // ===========================
    @RequestMapping(value = "/forgotPassword", method = RequestMethod.GET)
    public String forgotPasswordPage() {

        return "forgot-password";
    }

    // ===========================
    // Forgot Password Update
    // ===========================
    @RequestMapping(value = "/forgotPassword", method = RequestMethod.POST)
    public String forgotPassword(
            @RequestParam("username") String username,
            @RequestParam("newPassword") String newPassword,
            Model model) {

        UserDAO dao = new UserDAO();

        boolean status = dao.updatePassword(username, newPassword);

        if (status) {

            model.addAttribute("success",
                    "Password changed successfully. Please login.");

            return "login";
        }

        model.addAttribute("error",
                "Username not found!");

        return "forgot-password";
    }

    // ===========================
    // Change Password Page
    // ===========================
    @RequestMapping(value = "/changePassword", method = RequestMethod.GET)
    public String changePasswordPage() {

        return "change-password";
    }

    // ===========================
    // Change Password
    // ===========================
    @RequestMapping(value = "/changePassword", method = RequestMethod.POST)
    public String changePassword(
            @RequestParam("oldPassword") String oldPassword,
            @RequestParam("newPassword") String newPassword,
            HttpSession session,
            Model model) {

        String username = (String) session.getAttribute("username");

        if (username == null) {
            return "redirect:/login";
        }

        UserDAO dao = new UserDAO();

        boolean status = dao.changePassword(username, oldPassword, newPassword);

        if (status) {

            model.addAttribute("username", username);
            model.addAttribute("success",
                    "Password changed successfully.");

            return "dashboard";
        }

        model.addAttribute("error",
                "Old password is incorrect.");

        return "change-password";
    }

    // ===========================
    // Logout
    // ===========================
    @RequestMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate();

        return "redirect:/login";
    }
    
    @RequestMapping(value="/dashboard", method=RequestMethod.GET)
    public String dashboard(HttpSession session, Model model) {

        String username = (String) session.getAttribute("username");

        if(username == null) {
            return "redirect:/login";
        }

        model.addAttribute("username", username);

        return "dashboard";
    }

}
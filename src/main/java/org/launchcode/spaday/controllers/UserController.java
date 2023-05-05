package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("user")
public class UserController {

    private static List<User> users = new ArrayList<>();

    @GetMapping
    public String customerForm (Model model) {
        model.addAttribute("username", "allU");
        model.addAttribute("email", "allE");
        model.addAttribute("password", "allP");
        return "user/index";
    }

    @GetMapping("add")
    public String displayAddUserForm(Model model) {
//        model.addAttribute();
//        model.addAttribute();
//        model.addAttribute();
        return "user/add";
    }

    @PostMapping("add")
    public String displayAddUserForm(Model model, @ModelAttribute User user, String verify) {
//        model.addAttribute();
//        model.addAttribute();
//        model.addAttribute();
        return "redirect:";
    }

}

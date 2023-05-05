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

    @GetMapping
    public String user () {
        return "user/index";
    }

    @GetMapping("add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping("add")
    public String displayAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if(user.getPassword().equals(verify)) {
            return "redirect:";
        }
        model.addAttribute("username", user.getUsername());
        return "user/add";
    }

}

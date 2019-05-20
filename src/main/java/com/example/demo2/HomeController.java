package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar", "This is the value of myvar key");
        model.addAttribute("myvar1", "This is the definition of myvar1.");
        return "hometemplate";
    }
}
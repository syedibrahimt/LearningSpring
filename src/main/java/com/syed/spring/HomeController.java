package com.syed.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHome() {
        return "home-page";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "form-page";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "welcome-page";
    }
}

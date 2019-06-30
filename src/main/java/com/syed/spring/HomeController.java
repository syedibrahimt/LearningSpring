package com.syed.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        String studentName = request.getParameter("studentName");
        studentName = studentName.toUpperCase();
        String result = "Yoyo !! " + studentName;
        model.addAttribute("sName", result);
        return "welcome-page";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutAgain(@RequestParam("studentName") String name, Model model){
        model.addAttribute("sName", name);
        return "welcome-page";
    }
}

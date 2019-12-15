package com.SunMoon.TechnicalBlogWebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {



    @GetMapping("/user/login")
    public String login(){
        return "/user/login";
    }

    @GetMapping("/user/registeration")
    public String registeration(){
        return "/user/registeration";
    }

//    @RequestMapping (value = "/user/login", method = RequestMethod.POST)
    @PostMapping("/user/login")
    public String user()
    {
        return "redirect:/userpost";
    }
}

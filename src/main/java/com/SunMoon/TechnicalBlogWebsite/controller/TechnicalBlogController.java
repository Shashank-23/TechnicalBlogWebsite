package com.SunMoon.TechnicalBlogWebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import java.util.ArrayList;
import java.util.Date;

@Controller
public class TechnicalBlogController {

    @GetMapping("/")
    public String getAllPost(Model model){

        ArrayList<Post> postData = new ArrayList<>();

        Post post1 = new Post();
        post1.setPostTitle("Post 1");
        post1.setPostBody("Post 1 Body");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setPostTitle("Post 2");
        post2.setPostBody("Post 2 Body");
        post2.setDate(new Date());

        postData.add(post1);
        postData.add(post2);

        model.addAttribute("postData",postData);

        return "landingPage";
    }
}

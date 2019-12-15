package com.SunMoon.TechnicalBlogWebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;



@Controller
public class TechnicalBlogController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String getAllPost(Model model){

        ArrayList<PostData> post = postService.createPostData();
        model.addAttribute("postData",post);

        return "landingPage";
    }
}

package com.SunMoon.TechnicalBlogWebsite;

import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/userpost")
    public String getUserPosts(){
        return "userpost";
    }

    @PostMapping("/userpost")
    public String redirectToHome(Model model){
        ArrayList<PostData> post = postService.createPostData();
        model.addAttribute("postData",post);
        return "landingPage";
    }

}

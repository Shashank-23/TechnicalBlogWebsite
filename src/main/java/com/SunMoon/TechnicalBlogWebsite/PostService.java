package com.SunMoon.TechnicalBlogWebsite;

import java.util.ArrayList;
import java.util.Date;

import com.SunMoon.TechnicalBlogWebsite.PostData;
import org.springframework.stereotype.Service;

@Service
public class PostService{

    public ArrayList<PostData> createPostData(){

        ArrayList<PostData> po = new ArrayList<PostData>();

        PostData post1 = new PostData();
        post1.setPostTitle("Post 1");
        post1.setPostBody("Post 1 Body");
        post1.setDate(new Date());

        PostData post2 = new PostData();
        post2.setPostTitle("Post 2");
        post2.setPostBody("Post 2 Body");
        post2.setDate(new Date());

        po.add(post1);
        po.add(post2);

    return po;

    }
}

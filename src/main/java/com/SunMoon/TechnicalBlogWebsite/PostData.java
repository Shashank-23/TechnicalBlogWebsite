package com.SunMoon.TechnicalBlogWebsite;

import java.util.Date;

public class PostData {

        private String PostTitle;
        private String PostBody;
        private Date date;

        public String getPostTitle() {
        return PostTitle;
    }

        public void setPostTitle(String postTitle) {
        PostTitle = postTitle;
    }

        public String getPostBody() {
        return PostBody;
    }

        public void setPostBody(String postBody) {
        PostBody = postBody;
    }

        public Date getDate() {
        return date;
    }

        public void setDate(Date date) {
        this.date = date;
    }
    }



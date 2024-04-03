package com.example.model;

import java.util.List;

public class Press {
    private String title;
    private String content;
    private List<Comments> comments;
    private List<Ad> ads;


    public Press(String title, String content, List<Comments> comments, List<Ad> ads) {
        this.title = title;
        this.content = content;
        this.comments = comments;
        this.ads = ads;
    }

    public Press() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }

    @Override
    public String toString() {
        return "Press{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", ads=" + ads +
                ", comments=" + comments +
                '}';
    }
}


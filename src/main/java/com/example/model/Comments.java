package com.example.model;
import java.util.Date;

public class Comments {
    private String author;
    private String content;
    private String date;

    // Getters and Setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        return "Comments{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' + // Make sure to adjust the toString method
                '}';
    }
}

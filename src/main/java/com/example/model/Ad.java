package com.example.model;

public class Ad {
    private String name;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Ad.java
    @Override
    public String toString() {
        return "Ad{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

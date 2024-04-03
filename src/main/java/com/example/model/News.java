package com.example.model;

import java.util.List;

public class News {
    private String theme; // New field for theme
    private List<Press> pressReleases;

    // Existing constructor that takes a List of Press objects
    public News(List<Press> pressReleases) {
        this.pressReleases = pressReleases;
    }

    // New getter and setter for the theme
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    // Existing getter and setter for pressReleases
    public List<Press> getPressReleases() {
        return pressReleases;
    }

    public void setPressReleases(List<Press> pressReleases) {
        this.pressReleases = pressReleases;
    }

    @Override
    public String toString() {
        return "News{" +
                "theme='" + theme + '\'' +
                ", pressReleases=" + pressReleases +
                '}';
    }
}



package com.example.model;

import java.util.List;

public class News {
    private String theme; // New field for theme
    private List<Press> pressReleases;

    public News(List<Press> pressReleases) {
        this.pressReleases = pressReleases;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

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



package com.kaneadua.kaneadua;

import java.util.ArrayList;

public class Game2 {
    String imageurl;
    String title;
    String tags;
    String description;

    public Game2() {
    }

    public Game2(String imageurl, String title, String tags, String description) {
        this.imageurl = imageurl;
        this.title = title;
        this.tags = tags;
        this.description = description;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

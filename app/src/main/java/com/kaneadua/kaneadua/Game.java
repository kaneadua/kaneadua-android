package com.kaneadua.kaneadua;

import java.util.Random;

public class Game {
   int id;
   String name;
   String publisher;
   String platform;
   String description;
   String downloadUrl;
   String imageUrl;
   double price;
   String[] tags;

    public Game() {
    }

    public Game(int id, String name, String publisher, String platform, String description, String downloadUrl, String imageUrl, double price, String[] tags) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.platform = platform;
        this.description = description;
        this.downloadUrl = downloadUrl;
        this.imageUrl = imageUrl;
        this.price = price;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}

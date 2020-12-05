package com.kaneadua.kaneadua;

public class Dummy {
    // for jsonplaceholder.typicode.com/photos

    int albumId;
    int id;
    String title;
    String url;
    String thumbnailurl;

    public Dummy() {
        // empty constructor
    }

    public Dummy(int albumId, int id, String title, String url, String thumbnailurl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailurl = thumbnailurl;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }
}

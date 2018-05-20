package com.example.android.totalitygolf;

public class VideoCardView {

    private int id;
    private String title;
    private String description;
    private int image;

    public VideoCardView(int id, String title, String description, int image){
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}

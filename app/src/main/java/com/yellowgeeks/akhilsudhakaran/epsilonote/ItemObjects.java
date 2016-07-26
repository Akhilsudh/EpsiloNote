package com.yellowgeeks.akhilsudhakaran.epsilonote;

/**
 * Created by Akhil Sudhakar on 25-07-2016.
 */
public class ItemObjects {
    private String name;
    private int photo;

    public ItemObjects(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
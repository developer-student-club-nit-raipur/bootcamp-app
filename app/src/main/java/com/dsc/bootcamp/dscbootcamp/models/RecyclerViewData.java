package com.dsc.bootcamp.dscbootcamp.models;

// Model class for the properties present in individual element of the list.

public class RecyclerViewData {

    private int id;
    private String  name;
    private String number;
    private String image;

    public RecyclerViewData(int id, String name, String number, String image) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.image = image;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

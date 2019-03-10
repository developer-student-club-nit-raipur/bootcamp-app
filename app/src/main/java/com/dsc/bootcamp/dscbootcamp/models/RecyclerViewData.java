package com.dsc.bootcamp.dscbootcamp.models;

// Model class for the properties present in individual element of the list.

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RecyclerViewData implements Serializable {

    //If you use mock data uncomment this
//    private int id;
//    private String  name;
//    private String number;
//    private String image;

//    public RecyclerViewData(int id, String name, String number, String image) {
//        this.id = id;
//        this.name = name;
//        this.number = number;
//        this.image = image;
//    }

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("number")
    @Expose
    private String number;


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

package com.example.internandroid.data.model;

import com.google.gson.annotations.SerializedName;

public class DataModel {
    @SerializedName("name")
    private String name;
    @SerializedName("detail")
    private String detail;
    @SerializedName("image")
    private String img;

    public DataModel(String name, String detail, String img) {
        this.name = name;
        this.detail = detail;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

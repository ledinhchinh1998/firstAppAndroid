package com.example.internandroid.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MenuModel {

    @SerializedName("errorCode")
    private int errorCode;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<DataModel> datas;
    public MenuModel(int errorCode, String message, List<DataModel> datas) {
        this.errorCode = errorCode;
        this.message = message;
        this.datas = datas;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataModel> getDatas() {
        return datas;
    }

    public void setDatas(List<DataModel> datas) {
        this.datas = datas;
    }

}

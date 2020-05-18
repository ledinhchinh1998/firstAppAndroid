package com.example.internandroid.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GirlModel {

    @SerializedName("errorCode")
    private int errorCode;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<Data> datas;


    public GirlModel(int errorCode, String message, List<Data> datas) {
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

    public List<Data> getDatas() {
        return datas;
    }

    public void setDatas(List<Data> datas) {
        this.datas = datas;
    }

    public class Data{
        @SerializedName("name")
        private String name;
        @SerializedName("detail")
        private String detail;
        @SerializedName("image")
        private String img;

        public Data(String name, String detail, String img) {
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
}

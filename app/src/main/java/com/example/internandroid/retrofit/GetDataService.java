package com.example.internandroid.retrofit;

import com.example.internandroid.data.model.MenuModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/getMenu")
    Call<MenuModel.getDatas> dataGirl();
}

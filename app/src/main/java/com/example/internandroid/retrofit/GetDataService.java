package com.example.internandroid.retrofit;

import com.example.internandroid.model.GirlModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/getMenu")
    Call<List<GirlModel.Data>> dataGirl();
}

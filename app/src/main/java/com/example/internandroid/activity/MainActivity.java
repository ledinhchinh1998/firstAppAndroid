package com.example.internandroid.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internandroid.R;
import com.example.internandroid.adapter.GirlAdapter;
import com.example.internandroid.data.model.DataModel;
import com.example.internandroid.data.model.MenuModel;
import com.example.internandroid.retrofit.GetDataService;
import com.example.internandroid.retrofit.RetrofitClientInstance;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements GirlAdapter.OnLick {
    private RecyclerView rvListGirl;
    private List<MenuModel.Data> mList = new ArrayList<>();
    private String TAG = "Show";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvListGirl = findViewById(R.id.rvListGirl);
        rvListGirl.setLayoutManager(new LinearLayoutManager(this));
        requestAPI();
        GirlAdapter adapter = new GirlAdapter(mList, this, this);
        rvListGirl.setAdapter(adapter);
    }

    @Override
    public void onPos(int pos) {
        Log.e(TAG, "onPos: " + pos );
    }
    //Create handle for the retroFit instance interface
    private void requestAPI() {
        //em lam con thieu thi phai
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<DataModel>> call = service.dataGirl();
        call.enqueue(new Callback<MenuModel>() {
            @Override
            public void onResponse(Call<MenuModel> call, Response<MenuModel> response) {
                mList = respo
            }

            @Override
            public void onFailure(Call<MenuModel> call, Throwable t) {

            }
        });
    }

}

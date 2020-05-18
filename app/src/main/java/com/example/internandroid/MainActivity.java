package com.example.internandroid;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internandroid.adapter.GirlAdapter;
import com.example.internandroid.model.GirlModel;
import com.example.internandroid.retrofit.GetDataService;
import com.example.internandroid.retrofit.RetrofitClientInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements GirlAdapter.OnLick {
    private RecyclerView rvListGirl;
    private List<GirlModel.Data> mList = new ArrayList<>();
    private String TAG = "Show onclick view";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvListGirl = findViewById(R.id.rvListGirl);
        rvListGirl.setLayoutManager(new LinearLayoutManager(this));
//        GirlAdapter adapter = new GirlAdapter(mList,this,this);
//        rvListGirl.setAdapter(adapter);
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<GirlModel.Data>> call = service.dataGirl();
        call.enqueue(new Callback<List<GirlModel.Data>>() {
            @Override
            public void onResponse(Call<List<GirlModel.Data>> call, Response<List<GirlModel.Data>> response) {
                List<GirlModel.Data> list = new ArrayList<>();
                list = response.body();
                GirlAdapter adapter = new GirlAdapter(list, this, this);
                rvListGirl.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<GirlModel.Data>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void onPos(int pos) {
        Log.e(TAG, "onPos: " + pos );
    }
}

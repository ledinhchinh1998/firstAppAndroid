package com.example.internandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internandroid.R;
import com.example.internandroid.data.model.MenuModel;

import java.util.List;

public class GirlAdapter extends RecyclerView.Adapter<GirlAdapter.ViewHolder> {
    private List<MenuModel.Data> mList;
    private Context context;
    private OnLick listener;

    public GirlAdapter(List<MenuModel.Data> mList, Context context, OnLick listener) {
        this.mList = mList;
        this.context = context;
        this.listener = listener;
    }

    public void setOnClickListener(OnLick listener) {
        this.listener = listener;
    }


    // khoi tao view
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_string,parent,false);
        return new ViewHolder(view);
    }

    // xu ly code
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        MenuModel.Data data = mList.get(position);
        holder.tvName.setText(data.getName());
        holder.tvDetail.setText(data.getDetail());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName;
        private TextView tvDetail;
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvDetail = itemView.findViewById(R.id.tvDetail);
            imageView = itemView.findViewById(R.id.img);
        }
    }

    public interface OnLick {
        void onPos(int pos);
    }

}

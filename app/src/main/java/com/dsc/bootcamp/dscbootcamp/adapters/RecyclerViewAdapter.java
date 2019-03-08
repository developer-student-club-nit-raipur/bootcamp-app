package com.dsc.bootcamp.dscbootcamp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dsc.bootcamp.dscbootcamp.R;
import com.dsc.bootcamp.dscbootcamp.models.RecyclerViewData;

import java.util.ArrayList;
import java.util.List;

// This adapter sets the data into elements of the list

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<RecyclerViewData> recyclerViewDataList = new ArrayList<>();

    // Constructor to initialize context
    public RecyclerViewAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    // Setting up the list fetched from RecyclerViewActivity.java into recyclerViewDataList
    public void setRecyclerViewDataList(List<RecyclerViewData> recyclerViewDataList) {
        this.recyclerViewDataList = recyclerViewDataList;
    }

    // Linking the recycler_view_item.xml layout to this adapter class
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = layoutInflater.inflate(R.layout.recycler_view_item, parent, false);
        return new MyViewHolder(view);
    }

    // Binding the elements present in an item of the list according to the postion of the item
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        final RecyclerViewData data = recyclerViewDataList.get(i);
        holder.txtName.setText(data.getName());
        holder.txtNumber.setText(data.getNumber());

        // Using Glide library to set the image, also applying circular transformation to the image view
        Glide.with(context).load(data.getImage()).apply(RequestOptions.circleCropTransform()).into(holder.imgPic);
        //Glide.with(context).load(R.drawable.android_logo).apply(RequestOptions.circleCropTransform()).into(holder.imgPic);

    }

    @Override
    public int getItemCount() {
        return recyclerViewDataList.size();
    }


    // Custom made ViewHolder class
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtNumber;
        ImageView imgPic;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtNumber = itemView.findViewById(R.id.txt_number);
            imgPic = itemView.findViewById(R.id.img_pic);
        }
    }
}

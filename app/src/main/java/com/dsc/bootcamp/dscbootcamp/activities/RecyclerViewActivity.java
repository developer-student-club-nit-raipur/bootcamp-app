package com.dsc.bootcamp.dscbootcamp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dsc.bootcamp.dscbootcamp.R;
import com.dsc.bootcamp.dscbootcamp.adapters.RecyclerViewAdapter;
import com.dsc.bootcamp.dscbootcamp.models.RecyclerViewData;

import java.util.ArrayList;
import java.util.List;

// This activity contains setting up the recycler view and passing the mock list to the recycler adapter

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private List<RecyclerViewData> mockDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initialise();
        createMockList();
        setUpRecyclerView();
    }


    private void initialise() {
        recyclerView = findViewById(R.id.recycler_view);
    }

    private void createMockList() {
        RecyclerViewData data;
        data = new RecyclerViewData(1,"Vrihas Pathak", "1111111111", "https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData(1,"Samveg Thaker", "2222222222", "https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData(1,"Shreyansh Sahare", "3333333333", "https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData(1,"Kuldeep Pisda", "4444444444", "https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData(1,"Vinay Khobragade", "5555555555", "https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData(1,"Mayank Chaurasia", "6666666666", "https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData(1,"Amrita Mishra", "7777777777", "https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);

    }

    private void setUpRecyclerView() {
        recyclerViewAdapter = new RecyclerViewAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.setRecyclerViewDataList(mockDataList);
        recyclerViewAdapter.notifyDataSetChanged();
        recyclerView.setNestedScrollingEnabled(false);
    }
}

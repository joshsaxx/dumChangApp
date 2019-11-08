package com.example.dummychangoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private ArrayList<Groups> mGroupData;
    private GroupAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        // Set the Layout Manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the ArrayList that will contain the data.
        mGroupData = new ArrayList<>();

        // Initialize the adapter and set it to the RecyclerView.
        mAdapter = new GroupAdapter(this, mGroupData);
        mRecyclerView.setAdapter(mAdapter);

        // Get the data.
        initializeData();
    }

    private void initializeData() {

    }
}

package com.example.dummychangoapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;

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
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mGroupData = new ArrayList<>();

        mAdapter = new GroupAdapter(this, mGroupData);
        mRecyclerView.setAdapter(mAdapter);

        initializeData();



    }

    private void initializeData() {

        mGroupData = new ArrayList<>();

        Groups group = new Groups("Nss", "12 members", "24/10/19", "Private" , R.drawable.ic_group2);
        group.add(group);

        mAdapter.notifyDataSetChanged();


    }


}

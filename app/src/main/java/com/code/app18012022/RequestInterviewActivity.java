package com.code.app18012022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.code.app18012022.databinding.ActivityRequestInterviewBinding;
import com.code.app18012022.recycleview.Adapter;
import com.code.app18012022.recycleview.ModelClass;

import java.util.ArrayList;
import java.util.List;

public class RequestInterviewActivity extends AppCompatActivity {
    private ActivityRequestInterviewBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRequestInterviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initData();
        initRecyclerView();
    }
    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    com.code.app18012022.recycleview.Adapter adapter;


//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        initData();
//        initRecyclerView();
//    }

    private void initRecyclerView() {
        mrecyclerView = binding.RecyclerView;
        layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }


    private void initData() {
        userList = new ArrayList<>();

        userList.add(new ModelClass( "capgemini", "Developer", "_______________________________________"));

//        userList.add(new ModelClass( "Tata Consultancy service", "Data Analysis", "_______________________________________"));

        userList.add(new ModelClass( "Infosys", "Data Structure",  "_______________________________________"));

//        userList.add(new ModelClass("HCL Technologies", "Software Developer",  "_______________________________________"));

    }
}
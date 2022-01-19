package com.code.app18012022;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.code.app18012022.databinding.ActivityMatchingJobsBinding;
import com.code.app18012022.databinding.ActivityUploadResumeBinding;
import com.code.app18012022.recycleview.Adapter;
import com.code.app18012022.recycleview.ModelClass;

import java.util.ArrayList;
import java.util.List;

public class MatchingJobsActivity extends AppCompatActivity {

//    private com.code.app18012022.databinding.ActivityMatchingJobsBinding binding;
    private ActivityMatchingJobsBinding binding;
    private ActivityUploadResumeBinding resumeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resumeBinding = ActivityUploadResumeBinding.inflate(getLayoutInflater());
        binding = ActivityMatchingJobsBinding.inflate(getLayoutInflater());
        setContentView(resumeBinding.getRoot());
        resumeBinding.uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(binding.getRoot());
                initData();
                initRecyclerView();
            }
        });



    }

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<com.code.app18012022.recycleview.ModelClass> userList;
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

//    private void initDataChat() {
//        userList = new ArrayList<>();
//
//        userList.add(new ModelClass(R.drawable.gi, "Anjali", "How are you?", "10:45 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.bo, "Brijesh", "I am fine", "15:08 pm", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.boy, "Sam", "You Know?", "1:02 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.girl, "Divya", "How are you?", "12:55 pm", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.gi, "Simran", "This is Easy", "13:50 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.boy, "Karan", "I am Don", "1:08 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.bo, "Sameer", "You Know this?", "4:02 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.girl, "Baby", "How ?", "11:55 pm", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.gi, "Anjali", "How are you?", "10:45 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.bo, "Brijesh", "I am fine", "15:08 pm", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.boy, "Sam", "You Know?", "1:02 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.girl, "Divya", "How are you?", "12:55 pm", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.gi, "Simran", "This is Easy", "13:50 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.boy, "Karan", "I am Don", "1:08 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.bo, "Sameer", "You Know this?", "4:02 am", "_______________________________________"));
//
//        userList.add(new ModelClass(R.drawable.girl, "Baby", "How ?", "11:55 pm", "_______________________________________"));
//
//
//    }
private void initData() {
    userList = new ArrayList<>();

    userList.add(new ModelClass( "capgemini", "Developer", "_______________________________________"));

    userList.add(new ModelClass( "Tata Consultancy service", "Data Analysis", "_______________________________________"));

    userList.add(new ModelClass( "Infosys", "Data Structure",  "_______________________________________"));

    userList.add(new ModelClass("HCL Technologies", "Software Developer",  "_______________________________________"));

}

}

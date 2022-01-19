    package com.code.app18012022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.code.app18012022.databinding.ActivityScheduleInterviewBinding;
import com.code.app18012022.recycleview.Adapter;
import com.code.app18012022.recycleview.ModelClass;

import java.util.ArrayList;
import java.util.List;

    public class ScheduleInterviewActivity extends AppCompatActivity {
        private ActivityScheduleInterviewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScheduleInterviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initData();
        initRecyclerView();
//        View root = binding.getRoot();
//        initData();
//        initRecyclerView();


//        return root;
    }

        RecyclerView mrecyclerView;
        LinearLayoutManager layoutManager;
        List<ModelClass> userList;
        Adapter adapter;



//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        initData();
//        initRecyclerView();
//    }

        private void initRecyclerView() {
            mrecyclerView=binding.RecyclerView;
            layoutManager = new LinearLayoutManager(getApplicationContext());
            layoutManager.setOrientation(RecyclerView.VERTICAL);
            mrecyclerView.setLayoutManager(layoutManager);
            adapter=new Adapter(userList);
            mrecyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();

        }

        private void initData() {
            userList = new ArrayList<>();

//            userList.add(new ModelClass( "capgemini", "Developer", "10:45 am", "_______________________________________"));

            userList.add(new ModelClass( "Tata Consultancy service", "Data Analysis", "15:08 pm", "_______________________________________"));

//            userList.add(new ModelClass( "Infosys", "Data Structure", "1:02 am", "_______________________________________"));

            userList.add(new ModelClass("HCL Technologies", "Software Developer", "12:55 pm", "_______________________________________"));

//        userList.add(new ModelClass( "Simran", "This is Easy", "13:50 am", "_______________________________________"));
//
//        userList.add(new ModelClass( "Karan", "I am Don", "1:08 am", "_______________________________________"));
//
//        userList.add(new ModelClass( "Sameer", "You Know this?", "4:02 am", "_______________________________________"));
//
//        userList.add(new ModelClass( "Baby", "How ?", "11:55 pm", "_______________________________________"));
//
//        userList.add(new ModelClass( "Anjali", "How are you?", "10:45 am", "_______________________________________"));
//
//        userList.add(new ModelClass( "Brijesh", "I am fine", "15:08 pm", "_______________________________________"));
//
//        userList.add(new ModelClass( "Sam", "You Know?", "1:02 am", "_______________________________________"));
//
//        userList.add(new ModelClass( "Divya", "How are you?", "12:55 pm", "_______________________________________"));
//
//        userList.add(new ModelClass( "Simran", "This is Easy", "13:50 am", "_______________________________________"));
//
//        userList.add(new ModelClass( "Karan", "I am Don", "1:08 am", "_______________________________________"));
//
//        userList.add(new ModelClass( "Sameer", "You Know this?", "4:02 am", "_______________________________________"));
//
//        userList.add(new ModelClass( "Baby", "How ?", "11:55 pm", "_______________________________________"));


        }



}
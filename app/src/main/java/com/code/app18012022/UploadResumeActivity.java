package com.code.app18012022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.code.app18012022.databinding.ActivityUploadResumeBinding;

public class UploadResumeActivity extends AppCompatActivity {
    private ActivityUploadResumeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUploadResumeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}
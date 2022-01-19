package com.code.app18012022;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.code.app18012022.databinding.ActivityHrchatBinding;

public class HRChatActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityHrchatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHrchatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }


}
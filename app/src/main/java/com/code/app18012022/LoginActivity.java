package com.code.app18012022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.code.app18012022.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SharedPreferences getShared = getApplicationContext().getSharedPreferences("demo", Context.MODE_PRIVATE);
        String value = getShared.getString("loginAccess","cant");
        if (value == "can"){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
                finish();
        }
        binding.buttonLoginPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, PhoneActivity.class);
                startActivity(intent);
//                finish();
            }
        });
        binding.buttonLoginEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,LoginWithEmailActivity.class);
                startActivity(intent);
//                finish();
            }
        });
        binding.buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,CreateAccountActivity.class);
                startActivity(intent);
//                finish();
            }
        });
    }
}
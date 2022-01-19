package com.code.app18012022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.code.app18012022.databinding.ActivityLoginWithEmailBinding;

public class LoginWithEmailActivity extends AppCompatActivity {
    private ActivityLoginWithEmailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginWithEmailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.loginWithEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginWithEmailActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
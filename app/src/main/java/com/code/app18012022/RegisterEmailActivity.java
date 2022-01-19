package com.code.app18012022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.code.app18012022.databinding.ActivityRegisterEmailBinding;

public class RegisterEmailActivity extends AppCompatActivity {
    private ActivityRegisterEmailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterEmailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.buttonPassLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterEmailActivity.this,OTPActivity.class);
                intent.putExtra("phone","email");
                startActivity(intent);
                finish();
            }
        });
    }
}
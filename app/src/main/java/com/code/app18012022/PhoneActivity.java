package com.code.app18012022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.code.app18012022.databinding.ActivityPhoneBinding;

public class PhoneActivity extends AppCompatActivity {
    private ActivityPhoneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhoneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonPhoneGetOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneActivity.this,OTPActivity.class);
                intent.putExtra("phone","login");
                startActivity(intent);
                finish();
            }
        });
    }
}
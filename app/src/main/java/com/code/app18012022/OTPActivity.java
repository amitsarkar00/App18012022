package com.code.app18012022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.code.app18012022.databinding.ActivityOtpactivityBinding;

public class OTPActivity extends AppCompatActivity {
    private ActivityOtpactivityBinding binding;
    private String otpverify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOtpactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        otpverify = getIntent().getStringExtra("phone");
        otpverify = getIntent().getStringExtra("phone");
        otpverify = getIntent().getStringExtra("phone");
        System.out.println("Mobile:: "+getIntent().getStringExtra("phone"));
        System.out.println("Mobile:: "+getIntent().getStringExtra("phone"));
        System.out.println("Mobile:: "+getIntent().getStringExtra("phone"));
        System.out.println("Mobile:: "+getIntent().getStringExtra("phone"));
        System.out.println("Mobile:: "+getIntent().getStringExtra("phone"));
        System.out.println("Mobile:: "+getIntent().getStringExtra("phone"));

        switch (otpverify){
            case "login":
            {
              binding.buttonVerify.setText("Login");
            }
            break;
            case "verify":
            {
                binding.buttonVerify.setText("Verify");
            }
            break;
            case "email":
            {
                binding.buttonVerify.setText("Verify");;
            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + otpverify);
        }
        binding.buttonVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (otpverify){
                    case "login":
                    {
                        Intent intent = new Intent(OTPActivity.this,MainActivity.class);
                        startActivity(intent);
                        System.out.println("otp login");
                        binding.buttonVerify.setText("");
                        SharedPreferences share = getSharedPreferences("demo", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = share.edit();
                        editor.putString("login", "can");
                        editor.apply();
                        finish();
                    }
                    break;
                    case "verify":
                    {
                        Intent intent = new Intent(OTPActivity.this,RegisterEmailActivity.class);
                        startActivity(intent);
                        System.out.println("otp phone verify");
                        binding.buttonVerify.setText("");
                        finish();
                    }
                    break;
                    case "email":
                    {
                        Intent intent = new Intent(OTPActivity.this,SignupActivity.class);
                        startActivity(intent);
                        System.out.println("otp email verify");
                        binding.buttonVerify.setText("");
                        finish();
                    }
                    break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + otpverify);
                }


            }
        });


    }
}
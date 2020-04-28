package com.akshay.bloodbank.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.akshay.bloodbank.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //HANDLER IS USED HERE TO DELAY THE OPENING OF START ACTIVITIES BY USING SPLASH SCREEN ACTIVITY
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, RegisterActivity.class));
                finish();
            }
        },1500);
    }
}

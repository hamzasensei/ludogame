package com.example.myludogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class splash_screen extends AppCompatActivity {

    long Delay = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        Timer RunSplash = new Timer();
        TimerTask showSplash = new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent = new Intent(splash_screen.this,HomeActivity.class);
                startActivity(intent);
            }
        };
        RunSplash.schedule(showSplash,Delay);
    }
}
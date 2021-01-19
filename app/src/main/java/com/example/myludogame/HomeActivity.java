package com.example.myludogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button btnplay, btndemo, btnexit;
    Animation scaleup, scaledown;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

         btnplay = findViewById(R.id.btnplay);
         btndemo = findViewById(R.id.btndemo);
         btnexit = findViewById(R.id.btnexit);

         scaleup = AnimationUtils.loadAnimation(this,R.anim.scale_up);
         scaledown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

         btnplay.setOnTouchListener(new View.OnTouchListener() {
             @Override
             public boolean onTouch(View view, MotionEvent motionEvent) {
                 if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                     btnplay.startAnimation(scaleup);
                     openActivity();
                 }
                 else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                     btnplay.startAnimation(scaledown);
                 }
                 return true;
             }
         });

        btndemo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    btndemo.startAnimation(scaleup);

                }
                else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    btndemo.startAnimation(scaledown);
                }
                return true;
            }
        });

        btnexit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    btnexit.startAnimation(scaleup);

                }
                else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    btnexit.startAnimation(scaledown);
                }
                return true;
            }
        });

    }
    public void openActivity() {
        Intent intent = new Intent(this, HomeActivity1.class);
        startActivity(intent);
    }
}
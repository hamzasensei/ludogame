package com.example.myludogame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity1 extends AppCompatActivity {

    private Button btn2p, btn4p, btnoffline;
    Animation scaleup, scaledown;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home1);

        btn4p = findViewById(R.id.btn4player);
        btn2p = findViewById(R.id.btn2player);
        btnoffline = findViewById(R.id.btnoffline);

        scaleup = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaledown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        btn2p.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    btn2p.startAnimation(scaleup);
                    open2pActivity();
                }
                else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    btn2p.startAnimation(scaledown);
                }
                return true;
            }
        });

        btn4p.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    btn4p.startAnimation(scaleup);
                    open4pActivity();
                }
                else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    btn4p.startAnimation(scaledown);
                }
                return true;
            }
        });

        btnoffline.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    btnoffline.startAnimation(scaleup);

                }
                else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    btnoffline.startAnimation(scaledown);
                }
                return true;
            }
        });

    }
    public void open2pActivity() {
        Intent intent = new Intent(this, twoplayers.class);
        startActivity(intent);
    }
    public void open4pActivity() {
        Intent intent = new Intent(this, fourplayers.class);
        startActivity(intent);
    }

}
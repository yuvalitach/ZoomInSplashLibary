package com.example.zoominlibary;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoomIn zoomIn = new zoomIn();
        MotionLayout motionLayout = findViewById(R.id.motionLayout);
        zoomIn.showSplashScreen(MainActivity.this, R.drawable.twitterr, motionLayout, Color.parseColor("#03a9f4"));
    }
}
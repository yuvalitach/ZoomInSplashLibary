package com.example.zoominlibary;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class zoomIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoomin);

    }

    public void showSplashScreen(Activity activity, int logoResId, MotionLayout motionLayout,  int backgroundColor){

        activity.setContentView(R.layout.activity_zoomin);
        ImageView logoImageView = activity.findViewById(R.id.imageView);
        logoImageView.setImageResource(logoResId);
        View splashBackgroundView = activity.findViewById(R.id.splashBackgroundView);
        splashBackgroundView.setBackgroundColor(backgroundColor);

        motionLayout.setTransitionListener(new MotionLayout.TransitionListener() {


            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int startId, int endId) {

            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int startId, int endId, float progress) {

            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int currentId) {
                //startActivity(newIntent);
            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int triggerId, boolean positive, float progress) {

            }
        });
    }
}


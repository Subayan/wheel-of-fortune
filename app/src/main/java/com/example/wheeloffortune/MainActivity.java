package com.example.wheeloffortune;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "MainActivity";
    int rotationDeg, timeDur;
    ImageView wheel, marker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wheel  = (ImageView) findViewById(R.id.wheel);
    }


    public void turnTheWheel(View view){
        rotationDeg = 0;
        wheel.setRotation(rotationDeg );
        Random random = new Random();
        rotationDeg = random.nextInt(3600) + 6000;
        timeDur =  rotationDeg;//random.nextInt(2000)+1000;
        Log.d(TAG, "rotateRandowm: rotating the criclet by "+ rotationDeg + "deg and Time Duration is " + timeDur );
        wheel.animate().setInterpolator(new DecelerateInterpolator()).rotation(rotationDeg).setDuration(timeDur);
        Log.d(TAG, "turnTheWheel: ");
    }

}

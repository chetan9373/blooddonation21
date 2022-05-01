package com.harsh1310.rakkktcharitr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {
    Animation animation;

    View img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        //img =(View)findViewById(R.id.image);
        //animation= AnimationUtils.loadAnimation(this,R.anim.zoom);
      //  img.setAnimation(animation);
        int timeset=2900;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Splash_Screen.this,Login_activity.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);


                finish();

            }
        }, timeset);
    }

}
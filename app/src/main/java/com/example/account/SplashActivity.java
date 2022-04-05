package com.example.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;
    Animation topAnim;
    TextView welcometxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed( ()->{
                Intent i= new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);

                finish();
        }, SPLASH_TIME_OUT);
        welcometxt=findViewById(R.id.textView);
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        welcometxt.setAnimation(topAnim);
    }
}
package com.example.learnjava;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

            private static int SPLASH_TIME=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent menu = new Intent(SplashScreen.this,MenuActivity1.class);
                startActivity(menu);
                finish();

            }
        },SPLASH_TIME);
    }
}

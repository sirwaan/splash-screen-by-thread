package com.sirwansoft.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashAct extends AppCompatActivity {
Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        thread = new Thread(new Runnable()
        {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    Intent intent = new Intent(SplashAct.this, MainActivity.class);
                    startActivity(intent);
                    finish();  // if we want not to go back to splash screen again by press back , we should finish it
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}

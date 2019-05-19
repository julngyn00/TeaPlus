package com.example.ruhacks_teaplus;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class LoadingPage extends AppCompatActivity {

    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);

        openActivity3();
    }

    public void openActivity3() {

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(LoadingPage.this, ChatPage.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}

package com.sikder.kidslearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Spalash extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spalash);

        progressBar = (ProgressBar) findViewById(R.id.progressId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });
        thread.start();


    }
    public void doWork(){

        for (progres=10; progres < 100; progres = progres + 10){

            try {
                Thread.sleep(1000);
                progressBar.setProgress(progres);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
    public void startApp(){
        Intent intent = new Intent(Spalash.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
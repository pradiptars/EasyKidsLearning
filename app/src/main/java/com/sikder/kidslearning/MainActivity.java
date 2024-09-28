package com.sikder.kidslearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imagebtn_1, imagebtn_2, imagebtn_3, imagebtn_4, imagebtn_5, imagebtn_6,
            imagebtn_7, imagebtn_8, imagebtn_9, imagebtn_10, imagebtn_11, imagebtn_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imagebtn_1 = (ImageButton) findViewById(R.id.imagebtn_1);
        imagebtn_2 = (ImageButton) findViewById(R.id.imagebtn_2);
        imagebtn_3 = (ImageButton) findViewById(R.id.imagebtn_3);
        imagebtn_4 = (ImageButton) findViewById(R.id.imagebtn_4);
        imagebtn_5 = (ImageButton) findViewById(R.id.imagebtn_5);
        imagebtn_6 = (ImageButton) findViewById(R.id.imagebtn_6);
        imagebtn_7 = (ImageButton) findViewById(R.id.imagebtn_7);
        imagebtn_8 = (ImageButton) findViewById(R.id.imagebtn_8);
        imagebtn_9 = (ImageButton) findViewById(R.id.imagebtn_9);
        imagebtn_10 = (ImageButton) findViewById(R.id.imagebtn_10);
        imagebtn_11 = (ImageButton) findViewById(R.id.imagebtn_11);
        imagebtn_12 = (ImageButton) findViewById(R.id.imagebtn_12);


        imagebtn_1.setOnClickListener(this);
        imagebtn_2.setOnClickListener(this);
        imagebtn_3.setOnClickListener(this);
        imagebtn_4.setOnClickListener(this);
        imagebtn_5.setOnClickListener(this);
        imagebtn_6.setOnClickListener(this);
        imagebtn_7.setOnClickListener(this);
        imagebtn_8.setOnClickListener(this);
        imagebtn_9.setOnClickListener(this);
        imagebtn_10.setOnClickListener(this);
        imagebtn_11.setOnClickListener(this);
        imagebtn_12.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.imagebtn_1) {
            Intent intent = new Intent(MainActivity.this, SorobornoActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.imagebtn_2) {
            Intent intent = new Intent(MainActivity.this, BanjonBornoActivity.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.imagebtn_3) {
            Intent intent = new Intent(MainActivity.this, AlphabetActivity.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.imagebtn_4) {
            Intent intent = new Intent(MainActivity.this, OneTwo.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.imagebtn_5) {
            Intent intent = new Intent(MainActivity.this, BananActivity.class);
            startActivity(intent);


        }
        if (v.getId() == R.id.imagebtn_6) {
            Intent intent = new Intent(MainActivity.this, MonthBanglaActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.imagebtn_7) {
            Intent intent = new Intent(MainActivity.this, NamotaActivity.class);
            startActivity(intent);

        }

        if (v.getId() == R.id.imagebtn_8) {
            Intent intent = new Intent(MainActivity.this, GeneralKnowledge.class);
            startActivity(intent);


        }
        if (v.getId() == R.id.imagebtn_9) {
            Intent intent = new Intent(MainActivity.this, SanskritActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.imagebtn_10) {
            Intent intent = new Intent(MainActivity.this, MontraActivity.class);
            startActivity(intent);


        }

       /* if (v.getId() == R.id.imagebtn_11) {
            Intent intent = new Intent(MainActivity.this, PaintActivity.class);
            startActivity(intent);
        }*/
        if (v.getId() == R.id.imagebtn_12) {
            Intent intent = new Intent(MainActivity.this, KobitaActivity.class);
            startActivity(intent);

        }


    }
}


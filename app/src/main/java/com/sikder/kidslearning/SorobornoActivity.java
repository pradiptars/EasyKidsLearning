package com.sikder.kidslearning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SorobornoActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView_1, imageView_2, imageView_3, imageView_4, imageView_5, imageView_6, imageView_7, imageView_8, imageView_9, imageView_10, imageView_11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_soroborno);
        imageView_1 = (ImageView) findViewById(R.id.imageView_1);
        imageView_2 = (ImageView) findViewById(R.id.imageView_2);
        imageView_3 = (ImageView) findViewById(R.id.imageView_3);
        imageView_4 = (ImageView) findViewById(R.id.imageView_4);
        imageView_5 = (ImageView) findViewById(R.id.imageView_5);
        imageView_6 = (ImageView) findViewById(R.id.imageView_6);
        imageView_7 = (ImageView) findViewById(R.id.imageView_7);
        imageView_8 = (ImageView) findViewById(R.id.imageView_8);
        imageView_9 = (ImageView) findViewById(R.id.imageView_9);
        imageView_10 = (ImageView) findViewById(R.id.imageView_10);
        imageView_11 = (ImageView) findViewById(R.id.imageView_11);

        //final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_1);


        imageView_1.setOnClickListener(this);
        imageView_2.setOnClickListener(this);
        imageView_3.setOnClickListener(this);
        imageView_4.setOnClickListener(this);
        imageView_5.setOnClickListener(this);
        imageView_6.setOnClickListener(this);
        imageView_7.setOnClickListener(this);
        imageView_8.setOnClickListener(this);
        imageView_9.setOnClickListener(this);
        imageView_10.setOnClickListener(this);
        imageView_11.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.imageView_1) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_1.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_1.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_1);
            mediaPlayer.start();


        } else if (v.getId() == R.id.imageView_2) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_2.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_2.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_2);
            mediaPlayer.start();

        } else if (v.getId() == R.id.imageView_3) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_3.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_3.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_3);
            mediaPlayer.start();

        } else if (v.getId() == R.id.imageView_4) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_4.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_4.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_4);
            mediaPlayer.start();

        } else if (v.getId() == R.id.imageView_5) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_5.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_5.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_5);
            mediaPlayer.start();

        } else if (v.getId() == R.id.imageView_6) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_6.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_6.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_6);
            mediaPlayer.start();

        } else if (v.getId() == R.id.imageView_7) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_7.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_7.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_7);
            mediaPlayer.start();

        } else if (v.getId() == R.id.imageView_8) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_8.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_8.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_8);
            mediaPlayer.start();

        } else if (v.getId() == R.id.imageView_9) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_9.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_9.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_9);
            mediaPlayer.start();

        } else if (v.getId() == R.id.imageView_10) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_10.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_10.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_10);
            mediaPlayer.start();

        } else if (v.getId() == R.id.imageView_11) {

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            imageView_11.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            imageView_11.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording_11);
            mediaPlayer.start();

        }

    }



}
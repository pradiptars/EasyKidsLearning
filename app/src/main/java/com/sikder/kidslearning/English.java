package com.sikder.kidslearning;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class English extends Fragment implements View.OnClickListener {
    private ImageView imageView_1, imageView_2, imageView_3, imageView_4, imageView_5, imageView_6, imageView_7, imageView_8, imageView_9, imageView_10;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_english, container, false);

        imageView_1 = view.findViewById(R.id.imageView_1);
        imageView_2 = view.findViewById(R.id.imageView_2);
        imageView_3 = view.findViewById(R.id.imageView_3);
        imageView_4 = view.findViewById(R.id.imageView_4);
        imageView_5 = view.findViewById(R.id.imageView_5);
        imageView_6 = view.findViewById(R.id.imageView_6);
        imageView_7 = view.findViewById(R.id.imageView_7);
        imageView_8 = view.findViewById(R.id.imageView_8);
        imageView_9 = view.findViewById(R.id.imageView_9);
        imageView_10 = view.findViewById(R.id.imageView_10);


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


           /*imageView_1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
                   imageView_1.startAnimation(animation1);

                   Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
                   imageView_1.startAnimation(animation2);

                   final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.recording_1);
                   mediaPlayer.start();
               }
           });*/


        return view;

    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imageView_1){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_1.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_1.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.one_2);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_2){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_2.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_2.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.two_2);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_3){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_3.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_3.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.three_2);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_4){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_4.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_4.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.four_2);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_5){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_5.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_5.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.five_2);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_6){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_6.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_6.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.six_2);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_7){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_7.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_7.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.seven_2);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_8){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_8.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_8.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.eight_2);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_9){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_9.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_9.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.nine_2);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_10){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_10.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_10.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.ten_2);
            mediaPlayer.start();
        }

    }
}
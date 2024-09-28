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


public class BanglaFragment extends Fragment implements View.OnClickListener {
    private ImageView imageView_11, imageView_12, imageView_13, imageView_14, imageView_15, imageView_16, imageView_17, imageView_18, imageView_19, imageView_20;







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bangla, container, false);

        imageView_11 = view.findViewById(R.id.imageView_11);
        imageView_12 = view.findViewById(R.id.imageView_12);
        imageView_13 = view.findViewById(R.id.imageView_13);
        imageView_14 = view.findViewById(R.id.imageView_14);
        imageView_15 = view.findViewById(R.id.imageView_15);
        imageView_16 = view.findViewById(R.id.imageView_16);
        imageView_17 = view.findViewById(R.id.imageView_17);
        imageView_18 = view.findViewById(R.id.imageView_18);
        imageView_19 = view.findViewById(R.id.imageView_19);
        imageView_20 = view.findViewById(R.id.imageView_20);


        imageView_11.setOnClickListener(this);
        imageView_12.setOnClickListener(this);
        imageView_13.setOnClickListener(this);
        imageView_14.setOnClickListener(this);
        imageView_15.setOnClickListener(this);
        imageView_16.setOnClickListener(this);
        imageView_17.setOnClickListener(this);
        imageView_18.setOnClickListener(this);
        imageView_19.setOnClickListener(this);
        imageView_20.setOnClickListener(this);

        return view;



    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imageView_11){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_11.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_11.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.one_1);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_12){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_12.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_12.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.two_1);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_13){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_13.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_13.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.three_1);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_14){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_14.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_14.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.four_1);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_15){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_15.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_15.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.five_1);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_16){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_16.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_16.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.six_1);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_17){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_17.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_17.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.seven_1);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_18){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_18.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_18.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.eight_1);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_19){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_19.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_19.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.nine_1);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_20){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_20.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_20.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.ten_1);
            mediaPlayer.start();
        }

    }
}

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


public class BigFragment extends Fragment implements View.OnClickListener {

    private ImageView imageView_1, imageView_2, imageView_3, imageView_4, imageView_5, imageView_6, imageView_7, imageView_8, imageView_9, imageView_10,
            imageView_11, imageView_12, imageView_13, imageView_14, imageView_15, imageView_16, imageView_17, imageView_18, imageView_19, imageView_20,
            imageView_21, imageView_22, imageView_23, imageView_24, imageView_25, imageView_26;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_big, container, false);


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
        imageView_21 = view.findViewById(R.id.imageView_21);
        imageView_22 = view.findViewById(R.id.imageView_22);
        imageView_23 = view.findViewById(R.id.imageView_23);
        imageView_24 = view.findViewById(R.id.imageView_24);
        imageView_25 = view.findViewById(R.id.imageView_25);
        imageView_26 = view.findViewById(R.id.imageView_26);


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
        imageView_12.setOnClickListener(this);
        imageView_13.setOnClickListener(this);
        imageView_14.setOnClickListener(this);
        imageView_15.setOnClickListener(this);
        imageView_16.setOnClickListener(this);
        imageView_17.setOnClickListener(this);
        imageView_18.setOnClickListener(this);
        imageView_19.setOnClickListener(this);
        imageView_20.setOnClickListener(this);
        imageView_21.setOnClickListener(this);
        imageView_22.setOnClickListener(this);
        imageView_23.setOnClickListener(this);
        imageView_24.setOnClickListener(this);
        imageView_25.setOnClickListener(this);
        imageView_26.setOnClickListener(this);







        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imageView_1){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_1.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_1.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.a);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_2){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_2.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_2.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.b);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_3){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_3.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_3.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.c);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_4){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_4.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_4.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.d);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_5){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_5.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_5.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.e);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_6){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_6.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_6.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.f);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_7){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_7.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_7.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.g);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_8){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_8.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_8.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.h);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_9){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_9.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_9.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.i);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_10){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_10.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_10.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.j);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_11){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_11.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_11.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.k);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_12){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_12.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_12.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.l);
            mediaPlayer.start();
        }if(v.getId() == R.id.imageView_13){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_13.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_13.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.m);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_14){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_14.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_14.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.n);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_15){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_15.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_15.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.o);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_16){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_16.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_16.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.p);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_17){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_17.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_17.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.q);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_18){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_18.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_18.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.r);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_19){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_19.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_19.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.s);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_20){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_20.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_20.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.t);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_21){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_21.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_21.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.u);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_22){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_22.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_22.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.v);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_23){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_23.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_23.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.w);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_24){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_24.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_24.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.x);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_25){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_25.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_25.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.y);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_26){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_26.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_26.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.z);
            mediaPlayer.start();
        }

    }
}
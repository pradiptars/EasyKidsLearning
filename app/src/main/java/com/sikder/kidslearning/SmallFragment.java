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


public class SmallFragment extends Fragment implements View.OnClickListener {
    private ImageView imageView_27, imageView_28, imageView_29, imageView_30, imageView_31, imageView_32, imageView_33, imageView_34, imageView_35, imageView_36,
            imageView_37, imageView_38, imageView_39, imageView_40, imageView_41, imageView_42, imageView_43, imageView_44, imageView_45, imageView_46,
            imageView_47, imageView_48, imageView_49, imageView_50, imageView_51, imageView_52;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_small, container, false);

        imageView_27 = view.findViewById(R.id.imageView_27);
        imageView_28 = view.findViewById(R.id.imageView_28);
        imageView_29 = view.findViewById(R.id.imageView_29);
        imageView_30 = view.findViewById(R.id.imageView_30);
        imageView_31 = view.findViewById(R.id.imageView_31);
        imageView_32 = view.findViewById(R.id.imageView_32);
        imageView_33 = view.findViewById(R.id.imageView_33);
        imageView_34 = view.findViewById(R.id.imageView_34);
        imageView_35 = view.findViewById(R.id.imageView_35);
        imageView_36 = view.findViewById(R.id.imageView_36);
        imageView_37 = view.findViewById(R.id.imageView_37);
        imageView_38 = view.findViewById(R.id.imageView_38);
        imageView_39 = view.findViewById(R.id.imageView_39);
        imageView_40 = view.findViewById(R.id.imageView_40);
        imageView_41 = view.findViewById(R.id.imageView_41);
        imageView_42 = view.findViewById(R.id.imageView_42);
        imageView_43 = view.findViewById(R.id.imageView_43);
        imageView_44 = view.findViewById(R.id.imageView_44);
        imageView_45 = view.findViewById(R.id.imageView_45);
        imageView_46 = view.findViewById(R.id.imageView_46);
        imageView_47 = view.findViewById(R.id.imageView_47);
        imageView_48 = view.findViewById(R.id.imageView_48);
        imageView_49 = view.findViewById(R.id.imageView_49);
        imageView_50 = view.findViewById(R.id.imageView_50);
        imageView_51 = view.findViewById(R.id.imageView_51);
        imageView_52 = view.findViewById(R.id.imageView_52);


        imageView_27.setOnClickListener(this);
        imageView_28.setOnClickListener(this);
        imageView_29.setOnClickListener(this);
        imageView_30.setOnClickListener(this);
        imageView_31.setOnClickListener(this);
        imageView_32.setOnClickListener(this);
        imageView_32.setOnClickListener(this);
        imageView_33.setOnClickListener(this);
        imageView_34.setOnClickListener(this);
        imageView_35.setOnClickListener(this);
        imageView_36.setOnClickListener(this);
        imageView_37.setOnClickListener(this);
        imageView_38.setOnClickListener(this);
        imageView_39.setOnClickListener(this);
        imageView_40.setOnClickListener(this);
        imageView_41.setOnClickListener(this);
        imageView_42.setOnClickListener(this);
        imageView_43.setOnClickListener(this);
        imageView_44.setOnClickListener(this);
        imageView_45.setOnClickListener(this);
        imageView_46.setOnClickListener(this);
        imageView_47.setOnClickListener(this);
        imageView_48.setOnClickListener(this);
        imageView_49.setOnClickListener(this);
        imageView_50.setOnClickListener(this);
        imageView_51.setOnClickListener(this);
        imageView_52.setOnClickListener(this);




        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imageView_27){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_27.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_27.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.a);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_28){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_28.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_28.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.b);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_29){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_29.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_29.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.c);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_30){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_30.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_30.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.d);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_31){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_31.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_31.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.e);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_32){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_32.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_32.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.f);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_33){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_33.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_33.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.g);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_34){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_34.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_34.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.h);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_35){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_35.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_35.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.i);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_36){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_36.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_36.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.j);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_37){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_37.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_37.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.k);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_38){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_38.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_38.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.l);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_39){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_39.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_39.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.m);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_40){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_40.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_40.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.n);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_41){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_41.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_41.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.o);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_42){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_42.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_42.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.p);
            mediaPlayer.start();
        } if(v.getId() == R.id.imageView_43){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_43.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_43.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.q);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_44){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_44.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_44.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.r);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_45){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_45.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_45.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.s);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_46){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_46.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_46.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.t);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_47){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_47.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_47.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.u);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_48){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_48.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_48.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.v);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_49){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_49.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_49.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.w);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_50){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_50.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_50.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.x);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_51){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_51.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_51.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.y);
            mediaPlayer.start();
        }
        if(v.getId() == R.id.imageView_52){
            Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_out);
            imageView_52.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
            imageView_52.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.z);
            mediaPlayer.start();
        }
    }
}
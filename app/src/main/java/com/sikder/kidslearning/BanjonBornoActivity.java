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

public class BanjonBornoActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image_1, image_2, image_3, image_4, image_5, image_6, image_7, image_8,
            image_9, image_10, image_11, image_12, image_13, image_14, image_15, image_16, image_17,
            image_18, image_19, image_20, image_21, image_22, image_23, image_24, image_25, image_26, image_27,
            image_28, image_29, image_30, image_31, image_32, image_33, image_34, image_35, image_36, image_37,
            image_38, image_39;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_banjon_borno);

        image_1 = (ImageView) findViewById(R.id.image_1);
        image_2 = (ImageView) findViewById(R.id.image_2);
        image_3 = (ImageView) findViewById(R.id.image_3);
        image_4 = (ImageView) findViewById(R.id.image_4);
        image_5 = (ImageView) findViewById(R.id.image_5);
        image_6 = (ImageView) findViewById(R.id.image_6);
        image_7 = (ImageView) findViewById(R.id.image_7);
        image_8 = (ImageView) findViewById(R.id.image_8);
        image_9 = (ImageView) findViewById(R.id.image_9);
        image_10 = (ImageView) findViewById(R.id.image_10);
        image_11 = (ImageView) findViewById(R.id.image_11);
        image_12 = (ImageView) findViewById(R.id.image_12);
        image_13 = (ImageView) findViewById(R.id.image_13);
        image_14 = (ImageView) findViewById(R.id.image_14);
        image_15 = (ImageView) findViewById(R.id.image_15);
        image_16 = (ImageView) findViewById(R.id.image_16);
        image_17 = (ImageView) findViewById(R.id.image_17);
        image_18 = (ImageView) findViewById(R.id.image_18);
        image_19 = (ImageView) findViewById(R.id.image_19);
        image_20 = (ImageView) findViewById(R.id.image_20);
        image_20 = (ImageView) findViewById(R.id.image_20);
        image_21 = (ImageView) findViewById(R.id.image_21);
        image_22 = (ImageView) findViewById(R.id.image_22);
        image_23 = (ImageView) findViewById(R.id.image_23);
        image_24 = (ImageView) findViewById(R.id.image_24);
        image_25 = (ImageView) findViewById(R.id.image_25);
        image_26 = (ImageView) findViewById(R.id.image_26);
        image_27 = (ImageView) findViewById(R.id.image_27);
        image_28 = (ImageView) findViewById(R.id.image_28);
        image_29 = (ImageView) findViewById(R.id.image_29);
        image_30 = (ImageView) findViewById(R.id.image_30);
        image_31 = (ImageView) findViewById(R.id.image_31);
        image_32 = (ImageView) findViewById(R.id.image_32);
        image_33 = (ImageView) findViewById(R.id.image_33);
        image_34 = (ImageView) findViewById(R.id.image_34);
        image_35 = (ImageView) findViewById(R.id.image_35);
        image_36 = (ImageView) findViewById(R.id.image_36);
        image_37 = (ImageView) findViewById(R.id.image_37);
        image_38 = (ImageView) findViewById(R.id.image_38);
        image_39 = (ImageView) findViewById(R.id.image_39);


        //set onclick listerner
        image_1.setOnClickListener(this);
        image_2.setOnClickListener(this);
        image_3.setOnClickListener(this);
        image_4.setOnClickListener(this);
        image_5.setOnClickListener(this);
        image_6.setOnClickListener(this);
        image_7.setOnClickListener(this);
        image_8.setOnClickListener(this);
        image_9.setOnClickListener(this);
        image_10.setOnClickListener(this);
        image_11.setOnClickListener(this);
        image_12.setOnClickListener(this);
        image_13.setOnClickListener(this);
        image_14.setOnClickListener(this);
        image_15.setOnClickListener(this);
        image_16.setOnClickListener(this);
        image_17.setOnClickListener(this);
        image_18.setOnClickListener(this);
        image_19.setOnClickListener(this);
        image_20.setOnClickListener(this);
        image_21.setOnClickListener(this);
        image_22.setOnClickListener(this);
        image_23.setOnClickListener(this);
        image_24.setOnClickListener(this);
        image_25.setOnClickListener(this);
        image_26.setOnClickListener(this);
        image_27.setOnClickListener(this);
        image_28.setOnClickListener(this);
        image_29.setOnClickListener(this);
        image_30.setOnClickListener(this);
        image_31.setOnClickListener(this);
        image_32.setOnClickListener(this);
        image_33.setOnClickListener(this);
        image_34.setOnClickListener(this);
        image_35.setOnClickListener(this);
        image_36.setOnClickListener(this);
        image_37.setOnClickListener(this);
        image_38.setOnClickListener(this);
        image_39.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.image_1) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
            image_1.startAnimation(animation1);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_1.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ka);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_2){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_2.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_2.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.kha);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_3){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_3.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_3.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ga);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_4){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_4.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_4.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.gha);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_5){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_5.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_5.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.umo);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_6){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_6.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_6.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ca);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_7){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_7.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_7.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cha);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_8){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_8.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_8.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.j1);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_9){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_9.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_9.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.jha);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_10){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_10.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_10.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording11);
            mediaPlayer.start();

        } else if(v.getId()==R.id.image_11){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_11.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_11.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording12);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_12){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_12.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_12.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording13);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_13){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_13.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_13.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording14);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_14){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_14.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_14.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording15);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_15){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_15.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_15.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording16);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_16){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_16.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_16.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording17);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_17){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_17.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_17.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording18);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_18){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_18.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_18.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording19);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_19){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_19.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_19.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording20);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_20){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_20.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_20.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording21);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_21){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_21.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_21.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording22);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_22){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_22.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_22.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording23);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_23){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_23.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_23.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording24);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_24){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_24.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_24.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording25);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_25){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_25.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_25.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording26);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_26){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_26.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_26.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording27);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_27){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_27.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_27.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording28);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_28){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_28.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_28.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording29);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_29){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_29.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_29.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording30);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_30){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_30.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_30.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording31);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_31){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_31.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_31.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording32);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_32){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_32.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_32.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.hhaa);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_33){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_33.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_33.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.rra);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_34){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_34.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_34.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording33);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_35){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_35.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_35.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording34);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_36){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_36.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_36.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording35);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_37){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_37.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_37.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording36);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_38){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_38.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_38.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording37);
            mediaPlayer.start();

        }else if(v.getId()==R.id.image_39){

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
            image_39.startAnimation(animation);

            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
            image_39.startAnimation(animation2);

            final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.recording38);
            mediaPlayer.start();

        }
    }


}
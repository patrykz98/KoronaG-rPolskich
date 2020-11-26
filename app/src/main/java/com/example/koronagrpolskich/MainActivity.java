package com.example.koronagrpolskich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    ImageView mainImage, backgroundWave;
    TextView mainText, description;
    Animation alphaToGo, alphaToGo2, alphaToGoBackground, alphaToButton2;
    Button startButton, infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainImage = findViewById(R.id.ivMainImage);
        mainText = findViewById(R.id.tvMainTitle);
        startButton = findViewById(R.id.btnStart);
        backgroundWave = findViewById(R.id.backgroundWave);
        infoButton = findViewById(R.id.btnInfo);
        description = findViewById(R.id.tvDescription);

        //animations
        alphaToGo = AnimationUtils.loadAnimation(this, R.anim.alpha_to_go);
        alphaToGo2 = AnimationUtils.loadAnimation(this, R.anim.alpha_to_go_2);
        alphaToGoBackground = AnimationUtils.loadAnimation(this, R.anim.alpha_to_go_background);
        alphaToButton2 = AnimationUtils.loadAnimation(this, R.anim.alpha_button_2);

        //starting main animations
        mainImage.startAnimation(alphaToGo);
        mainText.startAnimation(alphaToGo);
        description.startAnimation(alphaToGo);
        backgroundWave.startAnimation(alphaToGoBackground);
        startButton.startAnimation(alphaToGo2);
        infoButton.startAnimation(alphaToButton2);

        //Fade move to ExplanationActivity
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ExplanationActivity.class));
                Animatoo.animateFade(MainActivity.this);
            }
        });

        //Fade move to GoActivity
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GoActivity.class));
                Animatoo.animateFade(MainActivity.this);
            }
        });


    }
}
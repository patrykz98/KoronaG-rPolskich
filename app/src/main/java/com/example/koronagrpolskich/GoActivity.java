package com.example.koronagrpolskich;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class GoActivity extends AppCompatActivity {

    CardView cvDetails, cvMaps, cvWeather, cvAchievement, cvCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);

        cvDetails = findViewById(R.id.cvDetails);
        cvMaps = findViewById(R.id.cvMaps);
        cvWeather = findViewById(R.id.cvWeather);
        cvAchievement = findViewById(R.id.cvAchievement);
        cvCalendar = findViewById(R.id.cvCalendar);

        cvDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GoActivity.this, DetailsActivity.class));
                Animatoo.animateFade(GoActivity.this);
            }
        });

        cvMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GoActivity.this, MapsActivity.class));
                Animatoo.animateFade(GoActivity.this);
            }
        });

        cvWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GoActivity.this, WeatherActivity.class));
                Animatoo.animateFade(GoActivity.this);
            }
        });
        cvAchievement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GoActivity.this, AchievementActivity.class));
                Animatoo.animateFade(GoActivity.this);
            }
        });
        cvCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GoActivity.this, CalendarActivity.class));
                Animatoo.animateFade(GoActivity.this);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateFade(this);
    }
}
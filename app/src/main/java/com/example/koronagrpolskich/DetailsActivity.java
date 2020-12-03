package com.example.koronagrpolskich;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;
import android.transition.Slide;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class DetailsActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.lysicaok));
        sliderItems.add(new SliderItem(R.drawable.slezaok));
        sliderItems.add(new SliderItem(R.drawable.skopiec));
        sliderItems.add(new SliderItem(R.drawable.klodzkagoraok));
        sliderItems.add(new SliderItem(R.drawable.chelmiecok));
        sliderItems.add(new SliderItem(R.drawable.biskupiakopiaok));
        sliderItems.add(new SliderItem(R.drawable.lubomirok));
        sliderItems.add(new SliderItem(R.drawable.szczeliniecwlkok));
        sliderItems.add(new SliderItem(R.drawable.czupelok));
        sliderItems.add(new SliderItem(R.drawable.waligoraok));
        sliderItems.add(new SliderItem(R.drawable.skalnikok));
        sliderItems.add(new SliderItem(R.drawable.jagodnaok));
        sliderItems.add(new SliderItem(R.drawable.kowadlook));
        sliderItems.add(new SliderItem(R.drawable.lackowaok));
        sliderItems.add(new SliderItem(R.drawable.wielkasowaok));
        sliderItems.add(new SliderItem(R.drawable.wysokaok));
        sliderItems.add(new SliderItem(R.drawable.orlicaok));
        sliderItems.add(new SliderItem(R.drawable.rudawiecok));
        sliderItems.add(new SliderItem(R.drawable.wysokakopa));
        sliderItems.add(new SliderItem(R.drawable.mogielicaok));
        sliderItems.add(new SliderItem(R.drawable.skrzyczneok));
        sliderItems.add(new SliderItem(R.drawable.radziejowaok));
        sliderItems.add(new SliderItem(R.drawable.turbaczok));
        sliderItems.add(new SliderItem(R.drawable.tarnicaok));
        sliderItems.add(new SliderItem(R.drawable.snieznikok));
        sliderItems.add(new SliderItem(R.drawable.sniezkaok));
        sliderItems.add(new SliderItem(R.drawable.babiaok));
        sliderItems.add(new SliderItem(R.drawable.rysyok));
        
        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);


        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View view, float v) {
                float r = 1 - Math.abs(v);
                view.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 2500); //duration 2,5 sec
            }
        });
    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable, 3000);
    }
}
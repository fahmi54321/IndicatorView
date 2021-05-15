package com.android.a75indicatorview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import steelkiwi.com.library.view.IndicatorView;

public class MainActivity extends AppCompatActivity {

    List<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(R.drawable.fahmi);
        list.add(R.drawable.donnie);
        list.add(R.drawable.danny);

        ViewPager viewPagerAdapter = new ViewPager(list,this);
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);

        IndicatorView indicatorView = (IndicatorView) findViewById(R.id.indicatorView);
        indicatorView.attachViewPager(viewPager);
    }
}
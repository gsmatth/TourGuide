package com.example.android.tourguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the content of the activity to this layout
        setContentView(R.layout.activity_main);

        //locate the ViewPager that supports swiping between views and assign to variable
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //create an adapter that controls which fragment is currently shown
        TourFragmentPagerAdapter adapter = new TourFragmentPagerAdapter(getSupportFragmentManager(), this);

        //sets the adapter on the ViewPager
        viewPager.setAdapter(adapter);

        //Create a TabLayout on sliding_tabs element of xml
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}

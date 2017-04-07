package com.example.android.tourguide;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by djp on 4/6/17.
 */

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {
    public TourFragmentPagerAdapter(FragmentManager fm){super(fm);}

    @Override
    public Fragment getItem(int position){
        if(position == 0){
            return new DiningFragment();
        } else{
            return new DiningFragment();
        }
    }

    @Override
    public int getCount(){return 1;}

    @Override
    public CharSequence getPageTitle(int position){
        if(position == 0){
            return "dining";
        } else {
            return "dining";
        }
    }
}

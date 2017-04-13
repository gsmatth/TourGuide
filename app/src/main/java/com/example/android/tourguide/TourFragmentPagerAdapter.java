package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import static java.security.AccessController.getContext;

/**
 * Created by djp on 4/6/17.
 */

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TourFragmentPagerAdapter(FragmentManager fm, Context context){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position){
        if(position == 0){
            return new DiningFragment();
        } else if(position == 1){
            return new SiteFragment();
        }  else if(position == 2){
            return new SportsFragment();
        } else if(position == 3){
            return new ResortsFragment();
        } else {
            return new DiningFragment();
        }
    }

    @Override
    public int getCount(){return 4;}

    @Override
    public CharSequence getPageTitle(int position){
        if(position == 0){
            return mContext.getResources().getString(R.string.get_page_title_dining);
        } else if(position == 1){
            return mContext.getResources().getString(R.string.get_page_title_sites);
        } else if(position == 2){
            return mContext.getResources().getString(R.string.get_page_title_sports);
        } else if(position == 3){
            return mContext.getResources().getString(R.string.get_page_title_resorts);
        } else {
            return "dining";
        }
    }
}

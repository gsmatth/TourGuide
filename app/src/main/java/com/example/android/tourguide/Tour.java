package com.example.android.tourguide;

import android.util.Log;

import static android.R.attr.phoneNumber;

/**
 * Created by djp on 4/6/17.
 */

public class Tour {
    private int mName;
    private int mDescription;
    private int mAddress;
    private int mPhoneNumber;
    private int mImageSourceId;
    public int  mCostRange = 0;
    public int mStarRatingResourceId = 0;

    public Tour(int name, int description, int address, int  phoneNumber, int costRange,
                 int foodImageSourceId, int starRatingResourceId ) {

        mName = name;
        mDescription = description;
        mAddress= address;
        mPhoneNumber = phoneNumber;
        mCostRange = costRange;
        mImageSourceId = foodImageSourceId;
        mStarRatingResourceId = starRatingResourceId;
    }

    public Tour(int name, int description, int address, int  phoneNumber,
                int ImageSourceId ) {

        mName = name;
        mDescription = description;
        mAddress= address;
        mPhoneNumber = phoneNumber;
        mImageSourceId = ImageSourceId;
    }

    public int getName() {
        return mName;
    }

    public int getDescription() {
        return mDescription;
    }

    public int getCostRange() {
        return mCostRange;
    }

    public int getPhoneNumber() {
        return mPhoneNumber;
    }

    public int getImageSourceId() {
        return mImageSourceId;
    }

    public int getStarRatingResourceId() {
        return mStarRatingResourceId;
    }

    public int getCompleteAddress(){
        return mAddress;

    }

    @Override
    public String toString() {
        return "Tour{" +
                "mName=" + mName +
                ", mDescription = " + mDescription +
                ", mAddress = " + mAddress +
                ", mPhoneNumber = " +  mPhoneNumber +
                ", mCostRange = " +  mCostRange +
                ", mImageSourceId = " + mImageSourceId +
                ", mStarRatingResourceId = " + mStarRatingResourceId +
                '}';

    }}
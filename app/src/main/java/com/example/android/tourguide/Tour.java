package com.example.android.tourguide;

import android.util.Log;

/**
 * Created by djp on 4/6/17.
 */

public class Tour {
    private String mName;
    private String mDescription;
    private String mAddressStreet;
    private String mAddressCity;
    private String mAddressState;
    private String mAddressZipCode;
    private String mPhoneNumber;
    private String mCostRange;
    private int mFoodImageSourceId;
    private int mStarRatingResourceId;

    public Tour(String name, String description, String addressStreet, String addressCity,
                String addressState, String addressZipCode, String phoneNumber, String costRange,
                int foodImageSourceId, int starRatingResourceId ) {

        mName = name;
        mDescription = description;
        mAddressStreet = addressStreet;
        mAddressCity =  addressCity;
        mAddressState =  addressState;
        mAddressZipCode = addressZipCode;
        mPhoneNumber = phoneNumber;
        mCostRange = costRange;
        mFoodImageSourceId = foodImageSourceId;
        mStarRatingResourceId = starRatingResourceId;
    }


    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getAddressState() {
        return mAddressState;
    }

    public String getAddressStreet() {
        return mAddressStreet;
    }

    public String getAddressCity() {
        return mAddressCity;
    }

    public String getAddressZipCode() {
        return mAddressZipCode;
    }

    public String getCostRange() {
        return mCostRange;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public int getFoodImageSourceId() {
        return mFoodImageSourceId;
    }

    public int getStarRatingResourceId() {
        return mStarRatingResourceId;
    }

    public String getCompleteAddress(){
        return mAddressStreet + ", " + mAddressCity +
                ", " + mAddressState + ", " + mAddressZipCode ;
    }


    @Override
    public String toString() {
        return "Tour{" +
                "mName=" + mName +
                ", mDescription = " + mDescription +
                ", mAddressStreet = " + mAddressStreet +
                ", mAddressCity = " + mAddressCity +
                ", mAddressState = " +  mAddressState +
                ", mAddressZipCode = " + mAddressZipCode +
                ", mPhoneNumber = " +  mPhoneNumber +
                ", mCostRange = " +  mCostRange +
                ", mFoodImageSourceId = " + mFoodImageSourceId +
                ", mStarRatingResourceId = " + mStarRatingResourceId +
                '}';

    }}
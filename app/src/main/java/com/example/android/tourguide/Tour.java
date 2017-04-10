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
//    private int mAddressStreet;
//    private int mAddressCity;
//    private String mAddressState;
//    private String mAddressZipCode;
    private int mPhoneNumber;
    private int  mCostRange;
    private int mFoodImageSourceId;
    private int mStarRatingResourceId;

    public Tour(int name, int description, int address, int  phoneNumber, int costRange,
                int foodImageSourceId, int starRatingResourceId ) {

        mName = name;
        mDescription = description;
        mAddress= address;
//        mAddressStreet = addressStreet;
//        mAddressCity =  addressCity;
//        mAddressState =  addressState;
//        mAddressZipCode = addressZipCode;
        mPhoneNumber = phoneNumber;
        mCostRange = costRange;
        mFoodImageSourceId = foodImageSourceId;
        mStarRatingResourceId = starRatingResourceId;
    }


    public int getName() {
        return mName;
    }

    public int getDescription() {
        return mDescription;
    }

//    public int getAddressStreet() {
//        return mAddressStreet;
//    }
//
//    public int getAddressCity() {
//        return mAddressCity;
//    }
//
//    public String  getAddressState() {
//        return mAddressState;
//    }
//
//    public String getAddressZipCode() {
//        return mAddressZipCode;
//    }

    public int getCostRange() {
        return mCostRange;
    }

    public int getPhoneNumber() {
        return mPhoneNumber;
    }

    public int getFoodImageSourceId() {
        return mFoodImageSourceId;
    }

    public int getStarRatingResourceId() {
        return mStarRatingResourceId;
    }

    public int getCompleteAddress(){
        return mAddress;

    }

//    public String getCompleteAddress(){
//        return mAddressStreet + ", " + mAddressCity +
//                ", " + mAddressState + ", " + mAddressZipCode ;
//    }

    @Override
    public String toString() {
        return "Tour{" +
                "mName=" + mName +
                ", mDescription = " + mDescription +
                ", mAddress = " + mAddress +
//                ", mAddressStreet = " + mAddressStreet +
//                ", mAddressCity = " + mAddressCity +
//                ", mAddressState = " +  mAddressState +
//                ", mAddressZipCode = " + mAddressZipCode +
                ", mPhoneNumber = " +  mPhoneNumber +
                ", mCostRange = " +  mCostRange +
                ", mFoodImageSourceId = " + mFoodImageSourceId +
                ", mStarRatingResourceId = " + mStarRatingResourceId +
                '}';

    }}
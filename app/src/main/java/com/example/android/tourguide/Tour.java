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
    private int mImageSourceId;
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

    public int getImageSourceId() {
        return mImageSourceId;
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
                ", mImageSourceId = " + mImageSourceId +
                ", mStarRatingResourceId = " + mStarRatingResourceId +
                '}';

    }}
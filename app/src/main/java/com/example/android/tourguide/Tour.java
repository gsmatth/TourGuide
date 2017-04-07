package com.example.android.tourguide;

/**
 * Created by djp on 4/6/17.
 */

public class Tour {
    private String mName;
    private String mDescription;
    private String mAddressStreet;
    private String mAddressCity;
    private String mAddressState;
    private int mAddressZipCode;
    private String mPhoneNumber;
    private int mCostRange;
    private int mFoodImageSourceId;

    public Tour(String name, String description, String addressStreet, String addressCity,
                String addressState, int addressZipCode, String phoneNumber, int costRange,
                int foodImageSourceId ) {

        mName = name;
        mDescription = description;
        mAddressStreet = addressStreet;
        mAddressCity =  addressCity;
        mAddressState =  addressState;
        mAddressZipCode = addressZipCode;
        mPhoneNumber = phoneNumber;
        mCostRange = costRange;
        mFoodImageSourceId = foodImageSourceId;
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

    public int getAddressZipCode() {
        return mAddressZipCode;
    }

    public int getCostRange() {
        return mCostRange;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public int getFoodImageSourceId() {
        return mFoodImageSourceId;
    }

    public String getCompleteAddress(){
        return mAddressStreet + ", " + mAddressCity +
                ", " + mAddressState + ", " + mAddressZipCode ;
    }


    @Override
    public String toString() {
        return "Tour{" +
                "mName=" + mName +
                ", mDescription=" + mDescription +
                ", mAddressStreet=" + mAddressStreet +
                ", mAddressCity=" + mAddressCity +
                ", mAddressState=" +  mAddressState +
                ", mAddressZipCode=" + mAddressZipCode +
                ", mPhoneNumber=" +  mPhoneNumber +
                ", mCostRange=" +  mCostRange +
                ", mFoodImageSourceId=" + mFoodImageSourceId +
                '}';

    }}
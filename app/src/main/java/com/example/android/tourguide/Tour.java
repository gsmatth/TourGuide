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

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmAddressState() {
        return mAddressState;
    }

    public String getmAddressStreet() {
        return mAddressStreet;
    }

    public String getmAddressCity() {
        return mAddressCity;
    }

    public int getmAddressZipCode() {
        return mAddressZipCode;
    }

    public int getmCostRange() {
        return mCostRange;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public int getmFoodImageSourceId() {
        return mFoodImageSourceId;
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
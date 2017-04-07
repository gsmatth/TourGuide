package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by djp on 4/6/17.
 */

public class TourAdapter extends ArrayAdapter<Tour> {
    private int mColorResourceId;

    public TourAdapter(Context context, ArrayList<Tour> tours, int colorResourceId){
        super(context, 0, tours);
        Log.v("TourAdapter", "value of colorResosurceId parameter passed in: " + colorResourceId);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;

        //if a listItemView is not availale for reuse, inflate a new java object
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the current Tour object in the ArrayList
        Tour currentTourObject = getItem(position);
        Log.v("TourAdapter", "currentTourObject: " + currentTourObject);

        ImageView foodImage = (ImageView) listItemView.findViewById(R.id.food_image);
        foodImage.setImageResource(currentTourObject.getFoodImageSourceId());

        //set the tex
        TextView restaurantTitle = (TextView) listItemView.findViewById(R.id.restaurant_title);
        Log.v("TourAdapter", "restaurantTitle: "+ restaurantTitle.toString());
        restaurantTitle.setText(currentTourObject.getName());

        TextView restaurantDescription = (TextView) listItemView.findViewById(R.id.restaurant_description);
        Log.v("TourAdapter", "restaurantDesc: "+ restaurantDescription);
        restaurantDescription.setText(currentTourObject.getDescription());

        TextView restaurantAddress = (TextView) listItemView.findViewById(R.id.restaurant_address);
        Log.v("TourAdapter", "restaurantAddress: "+ restaurantAddress);
        restaurantAddress.setText(currentTourObject.getCompleteAddress());

        TextView restaurantPhoneNumber = (TextView) listItemView.findViewById(R.id.restaurant_phone_number);
        Log.v("TourAdapter", "restaurantPhoneNumber: "+ restaurantPhoneNumber);
        restaurantPhoneNumber.setText(currentTourObject.getPhoneNumber());

        TextView restaurantCostRange = (TextView) listItemView.findViewById(R.id.restaurant_cost);
        Log.v("TourAdapter", "restaurantCostRange: "+ restaurantCostRange);
        restaurantCostRange.setText(currentTourObject.getCostRange());

        ImageView starIcon = (ImageView) listItemView.findViewById(R.id.star_icon);
        starIcon.setImageResource(currentTourObject.getStarRatingResourceId());

        return listItemView;
    }

}

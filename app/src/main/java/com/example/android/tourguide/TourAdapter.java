package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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

        //set the tex
        TextView restaurantTitle = (TextView) listItemView.findViewById(R.id.restaurant_title);
        restaurantTitle.setText(currentTourObject.getName());

        TextView restaurantDescription = (TextView) listItemView.findViewById(R.id.restaurant_description);
        restaurantTitle.setText(currentTourObject.getDescription());

        TextView restaurantAddress = (TextView) listItemView.findViewById(R.id.restaurant_address);
        restaurantTitle.setText(currentTourObject.getCompleteAddress());

        TextView restaurantPhoneNumber = (TextView) listItemView.findViewById(R.id.restaurant_phone_number);
        restaurantTitle.setText(currentTourObject.getPhoneNumber());

        TextView restaurantCostRange = (TextView) listItemView.findViewById(R.id.restaurant_cost);
        restaurantTitle.setText(currentTourObject.getCostRange());

        return listItemView;
    }

}

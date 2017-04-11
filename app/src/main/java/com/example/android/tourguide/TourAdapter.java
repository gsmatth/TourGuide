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

        ImageView foodImage = (ImageView) listItemView.findViewById(R.id.site_image);
        foodImage.setImageResource(currentTourObject.getImageSourceId());

        //set the tex
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        Log.v("TourAdapter", "title: "+ title.toString());
        title.setText(currentTourObject.getName());

        TextView description = (TextView) listItemView.findViewById(R.id.description);
        Log.v("TourAdapter", "description: "+ description);
        description.setText(currentTourObject.getDescription());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        Log.v("TourAdapter", "address: "+ address);
        address.setText(currentTourObject.getCompleteAddress());

        TextView phoneNumber = (TextView) listItemView.findViewById(R.id.phone_number);
        Log.v("TourAdapter", "phoneNumber: "+ phoneNumber);
        phoneNumber.setText(currentTourObject.getPhoneNumber());

        if (currentTourObject.mCostRange == 0) {
            TextView costRange = (TextView) listItemView.findViewById(R.id.cost);
            costRange.setVisibility(View.GONE);

        } else {
            TextView costRange = (TextView) listItemView.findViewById(R.id.cost);
            Log.v("TourAdapter", "costRange: " + costRange);
            costRange.setText(currentTourObject.getCostRange());

        }

        if(currentTourObject.mStarRatingResourceId == 0){
            ImageView starRatingIcon = (ImageView) listItemView.findViewById(R.id.star_icon);
            starRatingIcon.setVisibility(View.GONE);
       } else {
            ImageView starIcon = (ImageView) listItemView.findViewById(R.id.star_icon);
            starIcon.setImageResource(currentTourObject.getStarRatingResourceId());
        }
        return listItemView;
    }

}

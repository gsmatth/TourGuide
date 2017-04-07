package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by djp on 4/6/17.
 */

public class TourAdapter extends ArrayAdapter<Tour> {
    private int mColorResourceId;

    public TourAdapter(Context context, ArrayList<Tour>, int colorResourceId){
        super(context, 0, tours);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Tour currentTourObject = getItem(position);


    }
}

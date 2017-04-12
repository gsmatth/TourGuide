package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResortsFragment extends Fragment {


    public ResortsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();

        tours.add(new Tour(R.string.sanctuary_title, R.string.sanctuary_description,
                R.string.sanctuary_address, R.string.sanctuary_phone_number,
                R.drawable.sanctuary));
        tours.add(new Tour(R.string.lauberge_title, R.string.lauberge_description,
                R.string.lauberge_address, R.string.lauberge_phone_number,
                R.drawable.lauberge));
        tours.add(new Tour(R.string.princess_title, R.string.princess_description,
                R.string.princess_address, R.string.princess_phone_number,
                R.drawable.princess));
        tours.add(new Tour(R.string.hyatt_title, R.string.hyatt_description,
                R.string.hyatt_address, R.string.hyatt_phone_number,
                R.drawable.hyatt));
        tours.add(new Tour(R.string.troon_title, R.string.troon_description,
                R.string.troon_address, R.string.troon_phone_number,
                R.drawable.troon));

        TourAdapter itemsAdapter = new TourAdapter((getActivity()), tours, R.color.colorPrimary);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



        return rootView;
    }

}

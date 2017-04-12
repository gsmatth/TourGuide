package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SiteFragment extends Fragment {


    public SiteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();

        tours.add(new Tour(R.string.dechelly_site_title, R.string.dechelley_site_description,
                R.string.dechelley_site_address, R.string.dechelley_site_phone_number,
                R.drawable.dechelly));
        tours.add(new Tour(R.string.davis_site_title, R.string.davis_site_description,
                R.string.davis_site_address, R.string.davis_site_phone_number,
                R.drawable.davis));
        tours.add(new Tour(R.string.grand_canyon_site_title, R.string.grand_canyon_site_description,
                R.string.grand_canyon_site_address, R.string.grand_canyon_site_phone_number,
                R.drawable.grandcanyon));
        tours.add(new Tour (R.string.flagstaff_site_title, R.string.flagstaff_site_description,
                R.string.flagstaff_site_address, R.string.flagstaff_site_phone_number,
                R.drawable.flagstaff));
        tours.add(new Tour(R.string.missle_site_title, R.string.missle_site_description,
                R.string.missle_site_address, R.string.missle_site_phone_number,
                R.drawable.missle));

        TourAdapter itemsAdapter = new TourAdapter((getActivity()), tours, R.color.colorPrimary);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

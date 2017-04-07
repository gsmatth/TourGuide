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
public class DiningFragment extends Fragment {


    public DiningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflate view using tour_list.xml
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //create a new ArrayList called "tours" which will contain Tour objects
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        //add Tour objects to "tours" ArrayList
        tours.add(new Tour("Kia", "only 4 star restuarant in Phoenix", "111 Apache Blvd", "Phoenix",
                "AZ", 88444, "(602) 555-5555", 1, R.drawable.kai180x116  ));
        tours.add(new Tour("EddieV", "only 4 star restuarant in Phoenix", "111 Apache Blvd", "Phoenix",
                "AZ", 88444, "(602) 555-5555", 1, R.drawable.kai180x116  ));
        tours.add(new Tour("Wrights", "only 4 star restuarant in Phoenix", "111 Apache Blvd", "Phoenix",
                "AZ", 88444, "(602) 555-5555", 1, R.drawable.kai180x116  ));

        //create a new TourAdapter
        TourAdapter itemsAdapter = new TourAdapter(getActivity(), tours, R.color.colorPrimary);

        //caste an element with android id "list" to a ListView
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set the TourAdapter created above on the ListView created above
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

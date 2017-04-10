package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        //inflate ListView using tour_list.xml
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //create a new ArrayList called "tours" which will contain Tour objects
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        //add Tour objects to "tours" ArrayList
        tours.add(new Tour(R.string.kia_restaurant_title, R.string.kia_restaurant_description,
                R.string.kai_address, R.string.kai_phone_number, R.string.kai_cost_range,
                R.drawable.kai, R.mipmap.ic_4star ));
        tours.add(new Tour(R.string.eddiev_restaurant_title, R.string.eddiev_restaurant_description,
                R.string.eddiev_address, R.string.eddiev_phone_number, R.string.eddiev_cost_range,
                R.drawable.eddiv, R.mipmap.ic_3star  ));
        tours.add(new Tour(R.string.wrights_restaurant_title, R.string.wrights_restaurant_description,
                R.string.wrights_address, R.string.wrights_phone_number, R.string.wrights_cost_range,
                R.drawable.wrights, R.mipmap.ic_3star  ));
        tours.add(new Tour(R.string.north_restaurant_title, R.string.north_restaurant_description,
                R.string.north_address, R.string.north_phone_number, R.string.north_cost_range,
                R.drawable.north, R.mipmap.ic_3star  ));
        tours.add(new Tour(R.string.firebird_restaurant_title, R.string.firebird_restaurant_description,
                R.string.firebird_address, R.string.firebird_phone_number, R.string.firebird_cost_range,
                R.drawable.firebird, R.mipmap.ic_3star  ));
        tours.add(new Tour(R.string.carolina_restaurant_title, R.string.carolina_restaurant_description,
                R.string.carolina_address, R.string.carolina_phone_number, R.string.carolina_cost_range,
                R.drawable.carolina, R.mipmap.ic_2star  ));
        tours.add(new Tour(R.string.kabuki_restaurant_title, R.string.kabuki_restaurant_description,
                R.string.kabuki_address, R.string.kabuki_phone_number, R.string.kabuki_cost_range,
                R.drawable.kabuki, R.mipmap.ic_2star  ));

        //create a new TourAdapter
        TourAdapter itemsAdapter = new TourAdapter(getActivity(), tours, R.color.colorPrimary);

        //caste an element with android id "list" to a ListView
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set the TourAdapter created above on the ListView created above
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

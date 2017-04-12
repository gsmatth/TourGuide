package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.tourguide.R.drawable.suns;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportsFragment extends Fragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();

        tours.add(new Tour(R.string.diamondback_title, R.string.diamondback_description,
                R.string.diamondback_address, R.string.diamondback_phone_number,
                R.drawable.diamondback));
        tours.add(new Tour(R.string.suns_title, R.string.suns_description,
                R.string.suns_address, R.string.suns_phone_number,
                R.drawable.suns));
        tours.add(new Tour(R.string.cardinals_title, R.string.cardinals_description,
                R.string.cardinals_address, R.string.cardinals_phone_number,
                R.drawable.cardinal));
        tours.add(new Tour(R.string.mercury_title, R.string.mercury_description,
                R.string.mercury_address, R.string.mercury_phone_number,
                R.drawable.mercury));
        tours.add(new Tour(R.string.coyotes_title, R.string.coyotes_description,
                R.string.coyotes_address, R.string.coyotes_phone_number,
                R.drawable.coyote));

        TourAdapter itemsAdapter = new TourAdapter((getActivity()), tours, R.color.colorPrimary);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        return rootView;
    }

}

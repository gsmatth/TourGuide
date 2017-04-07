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
        tours.add(new Tour("Kia", "Arizona’s only AAA Five-Diamond and Forbes Five-Star restaurant" +
                " .features a menu rich in creativity, history and Native American" +
                " culture.", "111 Apache Blvd", "Chandler",
                "AZ", "88444", "(602) 385-5726", "$$$$", R.drawable.kai, R.mipmap.ic_4star  ));
        tours.add(new Tour("EddieV", "Prime Seafood restaurant at the " +
                "Scottsdale Quarter. Happy hour, live jazz music, & valet parking.",
                "15323 N Scottsdale Rd", "Scottsdale",
                "AZ", "88254", "(480) 730-4800", "$$$", R.drawable.kai, R.mipmap.ic_3star  ));
        tours.add(new Tour("Wrights", "Contemporary restaurant dishing out high-end New American" +
                " fare inside the luxury Biltmore Hotel.", "2400 E Missouri Ave", "Phoenix",
                "AZ", "88016", "(855) 689-2878", "$$$", R.drawable.kai, R.mipmap.ic_3star  ));
        tours.add(new Tour("North at Arcadia", "Contemporary takes on Italian classics star" +
                " at this warehouse-chic trattoria with a lively bar.", "4925 N 40th St", "Phoenix",
                "AZ", "88018", "(602) 324-5600", "$$$", R.drawable.kai, R.mipmap.ic_3star  ));
        tours.add(new Tour("Firebird Grill", "Chain restaurant serving steaks, seafood & cocktails" +
                " in an upscale lodgelike setting", "3435 W Chandler Blvd", "Chandler",
                "AZ", "85226", "(480) 814-8003", "$$$", R.drawable.kai, R.mipmap.ic_3star  ));
        tours.add(new Tour("Carolina's", "Landmark Mexican joint turning out traditional dishes" +
                " in a basic, counter-serve setting.", "1202 E Mohave St", "Phoenix",
                "AZ", "85034", "(602) 666-6666", "$$$", R.drawable.kai, R.mipmap.ic_2star  ));
        tours.add(new Tour("Sizzle Korean BBQ", "classic Korean techniques at a fine dining level.",
                "21001 N Tatum Blvd #36", "Phoenix",
                "AZ", "85050", "(480) 265-9406", "$$$", R.drawable.kai, R.mipmap.ic_3star ));
        tours.add(new Tour("Kabuki", "Japanese chain with a clubby vibe offering sushi, entrees," +
                " lunch specials & happy hours.", "2000 E Rio Salado Pkwy", "Tempe",
                "AZ", "85281", "(480) 350-9160", "$$$", R.drawable.kai, R.mipmap.ic_2star  ));

        //create a new TourAdapter
        TourAdapter itemsAdapter = new TourAdapter(getActivity(), tours, R.color.colorPrimary);

        //caste an element with android id "list" to a ListView
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set the TourAdapter created above on the ListView created above
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

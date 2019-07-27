package android.example.dammamtourguide;


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
public class CultureFragment extends Fragment {


    public CultureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        // Create a list of tour
        ArrayList<TourGuide> tour = new ArrayList<TourGuide>();

        tour.add(new TourGuide("King Fahd Mosque","City Center, Dammam",R.drawable.kfm));
        tour.add(new TourGuide("Dammam Airport Mosque","Dammam Airport",R.drawable.dam));
        tour.add(new TourGuide("Khober Cornich Mosque","Cornich Road, Khober",R.drawable.kcm));
        tour.add(new TourGuide("KFUPM Mosque","KFUPM Campus, Dhahan",R.drawable.kfupmm));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single TourGuide.
        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(),tour);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // TourGuide_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each TourGuide in the list of tour.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }

}

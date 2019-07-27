package android.example.dammamtourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourGuideAdapter extends ArrayAdapter<TourGuide> {

    public TourGuideAdapter(Activity context, ArrayList<TourGuide> mTourAttraction) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, mTourAttraction);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link TourGuide} object located at this position in the list
        TourGuide currentTourGuide = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current TourGuide object and
        // set this text on the name TextView
        nameTextView.setText(currentTourGuide.getAttractionName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the version number from the current TourGuide object and
        // set this text on the number TextView
        numberTextView.setText(currentTourGuide.getLocation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView givenImageView = (ImageView) listItemView.findViewById(R.id.image);
        givenImageView.setImageResource(currentTourGuide.getAttractionImage());

       
        return listItemView;
    }
}

package android.example.dammamtourguide;

public class TourGuide {

    /* Name of the attraction */
    private String mAttractionName;
    /* Location of the attraction */
    private String mAttractionLocation;
    /* Image of the attraction */
    private int mAttractionImage;

    // default Constructure for the class
    public TourGuide(String attractionName, String attractionLocation, int attractionImage)
    {
        mAttractionName = attractionName;
        mAttractionLocation = attractionLocation;
        mAttractionImage = attractionImage;
    }

    /**
     * Get the attraction name.
     */
    public String getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the location.
     */
    public String getLocation() {
        return mAttractionLocation;
    }

    /**
     * Get the image.
     */
    public int getAttractionImage() {
        return mAttractionImage;
    }

}

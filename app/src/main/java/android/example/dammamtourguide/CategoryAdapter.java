package android.example.dammamtourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CultureFragment();
            case 1:
                return new ShoppingFragment();
            case 2:
                return new BeachFragment();
            case 3:
                return new RestaurantsFragment();
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_culture);
            case 1:
                return mContext.getString(R.string.category_shopping);
            case 2:
                return mContext.getString(R.string.category_beach);
            case 3:
                return mContext.getString(R.string.category_restaurants);
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 4;
    }
}


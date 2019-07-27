package android.example.dammamtourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this,getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
/*
        // Find the View that shows the culture category
        TextView culture = (TextView) findViewById(R.id.culture);

        // Set a click listener on that View
        culture.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the culture category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent cultureIntent = new Intent(MainActivity.this, Culture.class);

                // Start the new activity
                startActivity(cultureIntent);
            }
        });

        // Find the View that shows the shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set a click listener on that View
        shopping.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the shopping category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, Shopping.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

        // Find the View that shows the beach category
        TextView beach = (TextView) findViewById(R.id.beach);

        // Set a click listener on that View
        beach.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the beach category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link beachActivity}
                Intent beachIntent = new Intent(MainActivity.this, Beach.class);

                // Start the new activity
                startActivity(beachIntent);
            }
        });

        // Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link restaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });
*/
    }
}

package android.example.dammamtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestaurantsFragment()).commit();

    }
}


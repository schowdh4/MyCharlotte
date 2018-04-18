package com.example.ca.mycharlotte;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class HomeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_screen);
    }

    public void sendMap (View view)
    {
        Intent MapsActivity = new Intent(this,MapsActivity.class);
        startActivity(MapsActivity);
    }

    public void send_CityInfo (View view){

        Intent CityInfo = new Intent(this,CityInfo.class);
        startActivity(CityInfo);
    }
}

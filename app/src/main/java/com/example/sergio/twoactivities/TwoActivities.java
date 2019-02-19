package com.example.sergio.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TwoActivities extends AppCompatActivity {
    private static final String LOG_TAG=TwoActivities.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_activities);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked");
        Intent intent=new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}

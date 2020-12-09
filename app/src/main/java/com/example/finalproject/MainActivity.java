package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goToCovidActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToCovidActivity = findViewById(R.id.goToCovidActivity);



        //This creates a transition to load CovidQuery
        final Intent covidActivity = new Intent(this, MainActivity.class);

        //When you click the search button, start the next activity
        covidActivity.setOnClickListener( click ->
        {
            startActivity(covidActivity);
        });

    }
}
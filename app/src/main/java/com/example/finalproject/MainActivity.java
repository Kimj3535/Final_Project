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



        //This creates a transition to load Covid Activity
        Intent covidActivity = new Intent(this, MainActivity.class);
        goToCovidActivity.setOnClickListener(click -> {
            startActivity(covidActivity);
        });


    }
}
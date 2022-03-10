package com.example.request;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = (BottomNavigationView) findViewById(R.id.navigationView);
    }
}
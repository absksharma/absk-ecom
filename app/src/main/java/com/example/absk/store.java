package com.example.absk;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.absk.store_ui.home;
import com.example.absk.store_ui.market_place;
import com.example.absk.store_ui.profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class store extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {

    BottomNavigationView bottomNavigationView;
    FragmentManager fm;
    Fragment fragment;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.navigationHome);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.navigationHome) {
            fragment = new home();
        }
        if (id == R.id.navigationProfile) {
            fragment = new profile();
        }
        if (id == R.id.navigationNotification) {
            fragment = new market_place();
        }

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.host, fragment);
        ft.commit();
        return false;
    }
}
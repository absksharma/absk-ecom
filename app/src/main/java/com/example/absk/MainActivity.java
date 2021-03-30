package com.example.absk;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.absk.signup_login.login;
import com.example.absk.signup_login.signup;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    TabLayout tl;
    Fragment fragment;
    FragmentManager fm;
    FragmentTransaction ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tl = findViewById(R.id.tl);
        tl.addOnTabSelectedListener(this);


        fragment = new login();
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.fl, fragment);
        ft.commit();
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        int i = tab.getPosition();
        if (i == 0) {
            fragment = new login();
        }
        if (i == 1) {
            fragment = new signup();
        }
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.fl, fragment);
        ft.commit();
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

}
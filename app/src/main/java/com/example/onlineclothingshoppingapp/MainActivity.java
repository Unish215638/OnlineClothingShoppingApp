package com.example.onlineclothingshoppingapp;

import android.content.SharedPreferences;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);
        appBarLayout=findViewById(R.id.barlayout_id);



        ViewPageAdopter adopter=new ViewPageAdopter(getSupportFragmentManager());
        adopter.AddFragment(new FragmentLogin(),"Login");
        adopter.AddFragment(new FragmentRegister(),"Register");

        viewPager.setAdapter(adopter);
        tabLayout.setupWithViewPager(viewPager);

        viewPager=findViewById(R.id.viewpager_id);


    }
}

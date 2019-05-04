package com.example.onlineclothingshoppingapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashoardActivity extends AppCompatActivity implements View.OnClickListener {
  private Button btnFragmentAddItem,btnFragmentViewitem,btnhome;
  private boolean status=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashoard);
        btnFragmentAddItem=findViewById(R.id.btnFragmentAddItem);
        btnFragmentViewitem=findViewById(R.id.btnFragmentViewItem);
        btnhome=findViewById(R.id.btnHome);

        btnFragmentAddItem.setOnClickListener(this);
        btnFragmentViewitem.setOnClickListener(this);
        btnhome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if (status){
            FragmentAddItem fragmentAddItem=new FragmentAddItem();
            fragmentTransaction.add(R.id.fragmentContainer,fragmentAddItem);
            fragmentTransaction.commit();
            btnFragmentAddItem.setText("Add Items Here");
            status=false;

        }



    }
}

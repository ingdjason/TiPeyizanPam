package com.djamoli.tipeyizanpam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;



public class ActivityTwo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_two);
        //ImageView gif = (ImageView) findViewById(R.id.imageView15);
        //Ion.with(gif).load("R.drawable.slide");
        configureButton();
        configureBtnp();
        configureBtns();
        configureBtnh();

    }
    // search from database
    public void searchTpp() {

    }

    //Boutton fruits
    private void configureButton() {
        //ImageButton btn = (ImageButton) findViewById(R.id.ButtonA);
        Button btn = (Button) findViewById(R.id.fruitsBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTwo.this, "fwi ayiti", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), TabFruits.class);
                startActivity(intent);
            }
        });
    }

    //Boutton hotels
    private void configureBtnh() {
        Button btnh = (Button) findViewById(R.id.hotelsBtn);
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTwo.this, "otel ayiti", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), TabHotels.class);
                startActivity(intent);
            }
        });
    }
    // Bouttton plages
    private void configureBtnp() {
        //ImageButton btn = (ImageButton) findViewById(R.id.ButtonA);
        Button btn = (Button) findViewById(R.id.plagesBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTwo.this, "plaj ayiti", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), TabPlages.class);
                startActivity(intent);
            }
        });
    }

    //Boutton Sites
    private void  configureBtns() {
        //ImageButton btn = (ImageButton) findViewById(R.id.ButtonA);
        Button btn = (Button) findViewById(R.id.sitesBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTwo.this, "sit touristik ayiti", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), TabSites.class);
                startActivity(intent);
            }
        });
    }


}

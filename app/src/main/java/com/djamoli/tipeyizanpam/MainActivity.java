package com.djamoli.tipeyizanpam;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // getSupportActionBar().setDisplayShowHomeEnabled(true);
        // ().setLogo(R.mipmap.ic_logo);
        // getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_main);
        configureImageButton();

    }

    private void configureImageButton() {
        //ImageButton btn = (ImageButton) findViewById(R.id.ButtonA);
        ImageView btn = (ImageView) findViewById(R.id.iv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bienvini sou app la", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
                startActivity(intent);
            }
        });
    }


}

package com.djamoli.tipeyizanpam;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Context;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;



public class ActivityTwo extends ActionBarActivity {
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private ViewFlipper mViewFlipper;
    private Context mContext;
    private final GestureDetector detector = new GestureDetector(new SwipeGestureDetector());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_two);

        mContext = this;
        mViewFlipper = (ViewFlipper) this.findViewById(R.id.view_flipper);
        mViewFlipper.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
                detector.onTouchEvent(event);
                return true;
            }
        });

        ImageView imageView = new ImageView(this);
        //imageView.setImageResource(R.drawable.fakeslide);
        mViewFlipper.addView(imageView);

        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sets auto flipping
                mViewFlipper.setAutoStart(true);
                mViewFlipper.setFlipInterval(4000);
                mViewFlipper.startFlipping();
            }
        });

        findViewById(R.id.stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //stop auto flipping
                mViewFlipper.stopFlipping();
            }
        });

        class SwipeGestureDetector extends GestureDetector.SimpleOnGestureListener {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                try {
                    // right to left swipe
                    if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                        mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.left_in));
                        mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext, R.anim.left_out));
                        mViewFlipper.showNext();
                        return true;
                    } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                        mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.right_in));
                        mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext,R.anim.right_out));
                        mViewFlipper.showPrevious();
                        return true;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

                return false;
            }
        }
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

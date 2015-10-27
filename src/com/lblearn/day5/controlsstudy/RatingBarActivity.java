package com.lblearn.day5.controlsstudy;

import comlblearn.day3.controlsstudy.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class RatingBarActivity extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        RatingBar ratingbar = (RatingBar)findViewById(R.id.rating);
        final ImageView image = (ImageView)findViewById(R.id.imageinrating);
        ratingbar.setOnRatingBarChangeListener(new OnRatingBarChangeListener()
        {
            
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser)
            {
                // TODO Auto-generated method stub
                image.setAlpha((int)rating * 255 / 5);
            }
        });
    }
}

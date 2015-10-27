package com.lblearn.day4.controlsstudy;

import comlblearn.day3.controlsstudy.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Chronometer.OnChronometerTickListener;

public class DigitalClockActivity extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_clock);
        final Chronometer chronometer = (Chronometer)findViewById(R.id.chrontest);
        Button startbtn = (Button)findViewById(R.id.startbtn);
        startbtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
            }
        });
        chronometer.setOnChronometerTickListener(new OnChronometerTickListener()
        {
            
            @Override
            public void onChronometerTick(Chronometer chronometer)
            {
                // TODO Auto-generated method stub
                if (SystemClock.elapsedRealtime() - chronometer.getBase() > 20 * 1000)
                {
                    chronometer.stop();
                }
            }
        });
    }
}

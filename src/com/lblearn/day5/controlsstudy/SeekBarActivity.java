package com.lblearn.day5.controlsstudy;

import comlblearn.day3.controlsstudy.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class SeekBarActivity extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        SeekBar seek = (SeekBar)findViewById(R.id.seekBar);
        final ImageView image = (ImageView)findViewById(R.id.image);
        seek.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
        {
            
            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                // TODO Auto-generated method stub
                image.setAlpha(progress);
            }
        });
    }
}

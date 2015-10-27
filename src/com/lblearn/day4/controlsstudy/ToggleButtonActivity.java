package com.lblearn.day4.controlsstudy;

import comlblearn.day3.controlsstudy.R;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        ToggleButton togglebtn = (ToggleButton)findViewById(R.id.ToggleBtn);
        final LinearLayout togglelinear = (LinearLayout)findViewById(R.id.togglelinear);
        togglebtn.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                // TODO Auto-generated method stub
                if (isChecked)
                {
                    // 垂直布局
                    togglelinear.setOrientation(1);
                }
                else
                {
                    // 水平布局
                    togglelinear.setOrientation(0);
                }
            }
        });
    }
}

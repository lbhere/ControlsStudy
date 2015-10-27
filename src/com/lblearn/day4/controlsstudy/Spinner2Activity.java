package com.lblearn.day4.controlsstudy;

import comlblearn.day3.controlsstudy.R;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Spinner2Activity extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner2);
        BaseAdapter bd = new BaseAdapter()
        {
            
            @Override
            public View getView(int position, View convertView, ViewGroup parent)
            {
                // TextView tv= new TextView(Spinner2Activity.this);
                // tv.setText(position+"");
                // tv.setTextSize(10);
                // tv.setTextColor(ColorStateList.valueOf(R.color.color1));
                // return tv;
                // 自定义显示
                LinearLayout line = new LinearLayout(Spinner2Activity.this);
                line.setOrientation(0);
                ImageView img = new ImageView(Spinner2Activity.this);
                img.setImageResource(R.drawable.ic_launcher);
                TextView text = new TextView(Spinner2Activity.this);
                text.setText(position + "");
                text.setTextSize(20);
                text.setTextColor(ColorStateList.valueOf(R.color.color2));
                line.addView(img);
                line.addView(text);
                return line;
                
            }
            
            @Override
            public long getItemId(int position)
            {
                // TODO Auto-generated method stub
                return 0;
            }
            
            @Override
            public Object getItem(int position)
            {
                // TODO Auto-generated method stub
                return null;
            }
            
            @Override
            public int getCount()
            {
                // TODO Auto-generated method stub
                return 10;
            }
        };
        Spinner spin = (Spinner)findViewById(R.id.spintest2);
        spin.setAdapter(bd);
    }
}

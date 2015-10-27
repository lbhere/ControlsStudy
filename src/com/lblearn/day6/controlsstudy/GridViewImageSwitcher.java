package com.lblearn.day6.controlsstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.ViewSwitcher.ViewFactory;

import comlblearn.day3.controlsstudy.R;

public class GridViewImageSwitcher extends Activity
{
    private static final String TAG ="==GRIDVIEW && IMAGESWITCHER==";
    int[] imageIds = new int[]{R.drawable.img1,R.drawable.img2,
        R.drawable.img3,R.drawable.img4,R.drawable.img5,
        R.drawable.img6,R.drawable.img7,R.drawable.img8,
        R.drawable.img9,R.drawable.img10,R.drawable.img11};
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_image_switcher);
        List<Map<String,Object>> listitems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < imageIds.length; i++)
        {
            Map<String, Object> listitem = new HashMap<String, Object>();
            listitem.put("image", imageIds[i]);
            listitems.add(listitem);
        }
        final ImageSwitcher imageswitcher =(ImageSwitcher)findViewById(R.id.imageswicher);
        imageswitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageswitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        imageswitcher.setFactory(new ViewFactory()
        {
            
            @Override
            public View makeView()
            {
                // TODO Auto-generated method stub
                ImageView imageview = new ImageView(GridViewImageSwitcher.this);
                imageview.setBackgroundColor(0xff0000);
                imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageview.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
                return imageview;
            }
        });
        SimpleAdapter simpleAdapter = new SimpleAdapter(GridViewImageSwitcher.this,
            listitems, R.layout.cell, new String[]{"image"},new int[]{R.id.image3} );
        GridView grid = (GridView)findViewById(R.id.gridview);
        grid.setAdapter(simpleAdapter);
        grid.setOnItemClickListener(new OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                // TODO Auto-generated method stub
                imageswitcher.setImageResource(imageIds[position%imageIds.length]);
            }
        });
        grid.setOnItemSelectedListener(new OnItemSelectedListener()
        {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                // TODO Auto-generated method stub
                imageswitcher.setImageResource(imageIds[position%imageIds.length]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
                
            }
        });
        
    }
}

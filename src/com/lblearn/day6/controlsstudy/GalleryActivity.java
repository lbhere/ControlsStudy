package com.lblearn.day6.controlsstudy;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;
import comlblearn.day3.controlsstudy.R;

public class GalleryActivity extends Activity
{
    int[] imageIds = new int[]{R.drawable.img1,R.drawable.img2,
        R.drawable.img3,R.drawable.img4,R.drawable.img5,
        R.drawable.img6,R.drawable.img7,R.drawable.img8,
        R.drawable.img9,R.drawable.img10,R.drawable.img11};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        final Gallery gallery = (Gallery)findViewById(R.id.gallery);
        final ImageSwitcher imageswitcher = (ImageSwitcher)findViewById(R.id.switcheringallery);
        imageswitcher.setFactory(new ViewFactory()
        {
            
            @Override
            public View makeView()
            {
             // TODO Auto-generated method stub
                ImageView imageview = new ImageView(GalleryActivity.this);
                imageview.setBackgroundColor(0xff0000);
                imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageview.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
                return imageview;
            }
        });
        imageswitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageswitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        BaseAdapter adapt = new BaseAdapter()
        {
            
            @Override
            public View getView(int position, View convertView, ViewGroup parent)
            {
                // TODO Auto-generated method stub
                ImageView imageview = new ImageView(GalleryActivity.this);
                imageview.setImageResource(imageIds[position%imageIds.length]);
                imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageview.setLayoutParams(new Gallery.LayoutParams(200,200));
                TypedArray typedarray = obtainStyledAttributes(R.styleable.Gallery);
                imageview.setBackgroundResource(typedarray.getResourceId(R.styleable.Gallery_android_galleryItemBackground, 0));
                typedarray.recycle();
                return imageview;
            }
            
            @Override
            public long getItemId(int position)
            {
                // TODO Auto-generated method stub
                return position;
            }
            
            @Override
            public Object getItem(int position)
            {
                // TODO Auto-generated method stub
                return position;
            }
            
            @Override
            public int getCount()
            {
                // TODO Auto-generated method stub
                return imageIds.length;
            }
        };
        gallery.setAdapter(adapt);
        gallery.setOnItemSelectedListener(new OnItemSelectedListener()
        {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
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

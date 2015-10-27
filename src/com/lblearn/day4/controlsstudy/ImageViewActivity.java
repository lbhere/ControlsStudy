package com.lblearn.day4.controlsstudy;

import comlblearn.day3.controlsstudy.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewActivity extends Activity
{
    int[] images = new int[] {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5};
    
    int currentImg = 0;
    
    private int alpha = 255;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        final Button plus = (Button)findViewById(R.id.plus);
        final Button minus = (Button)findViewById(R.id.minus);
        final Button next = (Button)findViewById(R.id.next);
        final ImageView view1 = (ImageView)findViewById(R.id.image1);
        final ImageView view2 = (ImageView)findViewById(R.id.image2);
        
        next.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                if (currentImg >= 4)
                {
                    currentImg = 0;
                }
                BitmapDrawable bitmap = (BitmapDrawable)view1.getDrawable();
                if (!bitmap.getBitmap().isRecycled())
                {
                    bitmap.getBitmap().recycle();
                }
                view1.setImageBitmap(BitmapFactory.decodeResource(getResources(), images[currentImg++]));
            }
        });
        OnClickListener clicklistener = new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                if (v == plus)
                {
                    alpha += 20;
                }
                if (v == minus)
                {
                    alpha -= 20;
                }
                if (alpha >= 255)
                {
                    alpha = 255;
                }
                if (alpha <= 0)
                {
                    alpha = 0;
                }
                view1.setAlpha(alpha);
            }
        };
        plus.setOnClickListener(clicklistener);
        minus.setOnClickListener(clicklistener);
        view1.setOnTouchListener(new OnTouchListener()
        {
            
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                // TODO Auto-generated method stub
                BitmapDrawable bitmapdrawable = (BitmapDrawable)view1.getDrawable();
                Bitmap bitmap = bitmapdrawable.getBitmap();
                double scale = bitmap.getWidth() / 320.0;
                int x = (int)(event.getX() * scale);
                int y = (int)(event.getY() * scale);
                if (x + 120 > bitmap.getWidth())
                {
                    x = bitmap.getWidth() - 120;
                }
                if (y + 120 > bitmap.getHeight())
                {
                    y = bitmap.getHeight() - 120;
                }
                view2.setImageBitmap(Bitmap.createBitmap(bitmap, x, y, 120, 120));
                view2.setAlpha(alpha);
                return false;
            }
        });
        
    }
}

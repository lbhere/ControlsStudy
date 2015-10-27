package com.lblearn.day4.controlsstudy;

import comlblearn.day3.controlsstudy.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressActivity extends Activity
{
    private int[] data = new int[100];
    
    int hasdata = 0;
    
    int mProgressStatus = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_PROGRESS);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.activity_progress);
        
        final ProgressBar bar1 = (ProgressBar)findViewById(R.id.bar);
        final ProgressBar bar2 = (ProgressBar)findViewById(R.id.bar2);
        
        Button show = (Button)findViewById(R.id.showprogress);
        Button hide = (Button)findViewById(R.id.hideprogress);
        
        final Handler handle = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                if (msg.what == 0x111)
                {
                    bar1.setProgress(mProgressStatus);
                    bar2.setProgress(mProgressStatus);
                }
            }
        };
        new Thread()
        {
            @Override
            public void run()
            {
                while (mProgressStatus < 100)
                {
                    mProgressStatus = doWork();
                    Message m = new Message();
                    m.what = 0x111;
                    handle.sendMessage(m);
                }
            };
        }.start();
        
        show.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                setProgressBarIndeterminateVisibility(true);
                setProgressBarVisibility(true);
                setProgress(4500);
            }
        });
        hide.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                setProgressBarIndeterminateVisibility(false);
                setProgressBarIndeterminate(false);
                
            }
        });
        
    }
    
    public int doWork()
    {
        data[hasdata++] = (int)(Math.random() * 100);
        try
        {
            Thread.sleep(100);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return hasdata;
    }
    
}

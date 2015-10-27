package comlblearn.day3.controlsstudy;

import com.lblearn.day4.controlsstudy.CheckRadioActivity;
import com.lblearn.day4.controlsstudy.DigitalClockActivity;
import com.lblearn.day4.controlsstudy.ImageViewActivity;
import com.lblearn.day4.controlsstudy.ProgressActivity;
import com.lblearn.day4.controlsstudy.Spinner1Activity;
import com.lblearn.day4.controlsstudy.Spinner2Activity;
import com.lblearn.day4.controlsstudy.ToggleButtonActivity;
import com.lblearn.day5.controlsstudy.RatingBarActivity;
import com.lblearn.day5.controlsstudy.SeekBarActivity;
//import com.lblearn.fragmentdemo.FragmentMainActivity;

import com.lblearn.day6.controlsstudy.AlertDialogActivity;
import com.lblearn.day6.controlsstudy.ExpandedListView;
import com.lblearn.day6.controlsstudy.GalleryActivity;
import com.lblearn.day6.controlsstudy.GridViewImageSwitcher;
import com.lblearn.day6.controlsstudy.ListViewActivity;
import com.lblearn.day6.controlsstudy.SimpleAdapterTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainActivity extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button textbtn = (Button)findViewById(R.id.textbtn);
        Button buttonbtn = (Button)findViewById(R.id.buttonbtn);
        Button checkradiobtn = (Button)findViewById(R.id.checkraiodBtn);
        Button toggleBtn = (Button)findViewById(R.id.togglebtn);
        
        Button digitalClock = (Button)findViewById(R.id.digitalclockbtn);
        Button imageviewbtn = (Button)findViewById(R.id.imageviewbtn);
        
        final Button spinner1 = (Button)findViewById(R.id.spinner1);
        final Button spinner2 = (Button)findViewById(R.id.spinner2);
        
        final Button datetimepicker = (Button)findViewById(R.id.datetimepicker);
        
        Button progressbtn = (Button)findViewById(R.id.progressbtn);
        
        Button seekbtn = (Button)findViewById(R.id.seekbtn);
        Button ratingbtn = (Button)findViewById(R.id.ratingbtn);
        Button listviewbtn = (Button)findViewById(R.id.listviewbtn);
        Button simpleadapt = (Button)findViewById(R.id.simpleadapt);
        Button expandedlist = (Button)findViewById(R.id.expandlistviewbtn);
        Button gridviewimageswitcher = (Button)findViewById(R.id.gridviewimageswitcher);
        Button gallery = (Button)findViewById(R.id.gallerybtn);
        Button alert = (Button)findViewById(R.id.alertdialogbtn);
        textbtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, TextView.class);
                startActivity(it);
            }
        });
        buttonbtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(it);
            }
        });
        checkradiobtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, CheckRadioActivity.class);
                startActivity(it);
            }
        });
        toggleBtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, ToggleButtonActivity.class);
                startActivity(it);
            }
        });
        
        digitalClock.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, DigitalClockActivity.class);
                startActivity(it);
            }
        });
        imageviewbtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, ImageViewActivity.class);
                startActivity(it);
            }
        });
        spinner1.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, Spinner1Activity.class);
                startActivity(it);
            }
        });
        spinner2.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, Spinner2Activity.class);
                startActivity(it);
            }
        });
        datetimepicker.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, DateTimePickerActivity.class);
                startActivity(it);
            }
        });
        
        progressbtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, ProgressActivity.class);
                startActivity(it);
            }
        });
        seekbtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, SeekBarActivity.class);
                startActivity(it);
            }
        });
        ratingbtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, RatingBarActivity.class);
                startActivity(it);
            }
        });
        
        listviewbtn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(it);
            }
        });

        simpleadapt.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this, SimpleAdapterTest.class);
                startActivity(it);
            }
        });
        expandedlist.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this,ExpandedListView.class);
                startActivity(it);
            }
        });
        gridviewimageswitcher.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this,GridViewImageSwitcher.class);
                startActivity(it);
            }
        });
        gallery.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this,GalleryActivity.class);
                startActivity(it);
            }
        });
        alert.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent it = new Intent(MainActivity.this,AlertDialogActivity.class);
                startActivity(it);
            }
        });
    }
}

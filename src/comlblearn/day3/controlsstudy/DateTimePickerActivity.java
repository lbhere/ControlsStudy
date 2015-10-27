package comlblearn.day3.controlsstudy;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;

public class DateTimePickerActivity extends Activity
{
    private int year;
    
    private int mouth;
    
    private int day;
    
    private int hour;
    
    private int minute;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_picker);
        DatePicker date = (DatePicker)findViewById(R.id.datepicker);
        TimePicker time = (TimePicker)findViewById(R.id.timepicker);
        Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        mouth = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        hour = c.get(Calendar.HOUR);
        minute = c.get(Calendar.MINUTE);
        date.init(year, mouth, day, new OnDateChangedListener()
        {
            
            @Override
            public void onDateChanged(DatePicker view, int year, int mouth, int day)
            {
                // TODO Auto-generated method stub
                DateTimePickerActivity.this.year = year;
                DateTimePickerActivity.this.mouth = mouth;
                DateTimePickerActivity.this.day = day;
                showDate(year, mouth, day, hour, minute);
            }
        });
        time.setOnTimeChangedListener(new OnTimeChangedListener()
        {
            
            @Override
            public void onTimeChanged(TimePicker view, int hour, int minute)
            {
                // TODO Auto-generated method stub
                DateTimePickerActivity.this.hour = hour;
                DateTimePickerActivity.this.minute = minute;
                showDate(year, mouth, day, hour, minute);
            }
        });
    }
    
    private void showDate(int yeat, int mouth, int day, int hour, int minute)
    {
        EditText show = (EditText)findViewById(R.id.show);
        show.setText(year + "/" + mouth + "/" + day + "," + hour + ":" + minute);
    }
}

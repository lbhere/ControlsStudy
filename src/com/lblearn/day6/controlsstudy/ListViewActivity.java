package com.lblearn.day6.controlsstudy;

import android.app.Activity;
import android.os.Bundle;



import android.widget.ArrayAdapter;
import android.widget.ListView;
import comlblearn.day3.controlsstudy.R;

public class ListViewActivity extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView list2 = (ListView)findViewById(R.id.list2);
        String[] arr = {"str1","str2","str3"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);
        list2.setAdapter(arrayAdapter);
        
    }
}

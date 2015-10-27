package com.lblearn.day6.controlsstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import comlblearn.day3.controlsstudy.R;
import comlblearn.day3.controlsstudy.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class SimpleAdapterTest extends Activity
{
    private String[] names = new String[]{"txt1","txt2","txt3","txt4"};
    private int[] imageIds= new int[]{R.drawable.pic1,R.drawable.pic2,
        R.drawable.pic3,R.drawable.pic4};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter_test);
        List<Map<String,Object>> listitems = new ArrayList<Map<String,Object>>();
        for (int i = 0; i < names.length; i++)
        {
            Map<String, Object> listitem = new HashMap<String, Object>();
            listitem.put("header", imageIds[i]);
            listitem.put("personname", names[i]);
            listitems.add(listitem);
        }
        SimpleAdapter simpleAdapt = new SimpleAdapter(
            this, listitems, R.layout.activity_simple_adapter_test,
            new String[]{"personname","header"}, new int[]{R.id.name,R.id.header});
        ListView listview = (ListView)findViewById(R.id.mylist);
        listview.setAdapter(simpleAdapt);
    }
}

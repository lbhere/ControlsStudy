package com.lblearn.day6.controlsstudy;

import comlblearn.day3.controlsstudy.R;
import comlblearn.day3.controlsstudy.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExpandedListView extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expanded_list_view);
        ExpandableListAdapter adapter = new BaseExpandableListAdapter()
        {
            int[] logos= new int[]{R.drawable.pic1,R.drawable.pic2,R.drawable.pic3};
            private String[] armType = new String[]{
              "txt1","txt2","txt3"  
            };
            private String[][] arms = new String[][]
                {{"txt1_sub1","txt1_sub2","txt1_sub2"},
                {"txt2_sub1","txt2_sub2","txt3_sub3"},
                {"txt3_sub1","txt3_sub2","txt3_sub3"}};
                
            private TextView getTextView()
            {
                AbsListView.LayoutParams lp = new AbsListView.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,64);
                TextView text = new TextView(ExpandedListView.this);
                text.setLayoutParams(lp);
                text.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT);
                text.setPadding(36, 0, 0, 0);
                text.setTextSize(20);
                return text;
            }
            
            @Override
            public boolean isChildSelectable(int groupPosition, int childPosition)
            {
                // TODO Auto-generated method stub
                return true;
            }
            
            @Override
            public boolean hasStableIds()
            {
                // TODO Auto-generated method stub
                return true;
            }
            
            @Override
            public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
            {
                // TODO Auto-generated method stub
                LinearLayout li = new LinearLayout(ExpandedListView.this);
                li.setOrientation(0);
                ImageView logo = new ImageView(ExpandedListView.this);
                logo.setImageResource(logos[groupPosition]);
                logo.setLayoutParams(new LayoutParams(200, 200));
                li.addView(logo);
                TextView textView = getTextView();
                textView.setText(getGroup(groupPosition).toString());
                li.addView(textView);
                return li;
            }
            
            @Override
            public long getGroupId(int groupPosition)
            {
                // TODO Auto-generated method stub
                return groupPosition;
            }
            
            @Override
            public int getGroupCount()
            {
                // TODO Auto-generated method stub
                return armType.length;
            }
            
            @Override
            public Object getGroup(int groupPosition)
            {
                // TODO Auto-generated method stub
                return armType[groupPosition];
            }
            
            @Override
            public int getChildrenCount(int groupPosition)
            {
                // TODO Auto-generated method stub
                return arms[groupPosition].length;
            }
            
            @Override
            public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
            {
                TextView text = getTextView();
                text.setText(getChild(groupPosition, childPosition).toString());
                return text;
            }
            
            @Override
            public long getChildId(int groupPosition, int childPosition)
            {
                // TODO Auto-generated method stub
                return childPosition;
            }
            
            @Override
            public Object getChild(int groupPosition, int childPosition)
            {
                // TODO Auto-generated method stub
                return arms[groupPosition][childPosition];
            }
        };
        ExpandableListView expandListView = (ExpandableListView)findViewById(R.id.list);
        expandListView.setAdapter(adapter);
    }
}

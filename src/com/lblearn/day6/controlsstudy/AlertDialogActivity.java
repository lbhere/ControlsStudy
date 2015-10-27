package com.lblearn.day6.controlsstudy;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import comlblearn.day3.controlsstudy.R;

public class AlertDialogActivity extends Activity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        Button btn =(Button)findViewById(R.id.alertdialogbtn);
        final Builder builder = new AlertDialog.Builder(this);
        btn.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                builder.setIcon(R.drawable.img9);
                builder.setTitle("自定义普通对话框");
                builder.setMessage("一个简单的对话框");
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener()
                {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // TODO Auto-generated method stub
                        EditText edit = (EditText)findViewById(R.id.textview);
                        edit.setText("用户点击了”确定“按钮");
                    }

                   
                });
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener()
                {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // TODO Auto-generated method stub
                        EditText edit = (EditText)findViewById(R.id.textview);
                        edit.setText("用户点击了”取消“按钮");
                    }
                });
                builder.create().show();
            }
        });
    }
}

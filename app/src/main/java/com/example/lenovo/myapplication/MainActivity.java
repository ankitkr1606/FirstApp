package com.example.lenovo.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{
    Button b1,b2,b3,b4;
    LinearLayout l1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);

        l1=(LinearLayout)findViewById(R.id.linearlayout);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                l1.setBackgroundColor(Color.BLUE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                l1.setBackgroundColor(Color.BLACK);
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                l1.setBackgroundColor(Color.GREEN);
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                l1.setBackgroundColor(Color.GRAY);
            }
        });
    }
}

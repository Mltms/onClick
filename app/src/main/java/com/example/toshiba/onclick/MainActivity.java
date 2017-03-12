package com.example.toshiba.onclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView text;
    Button second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text = (TextView) findViewById(R.id.textView2);
        second = (Button) findViewById(R.id.setonclick);
        Button third = (Button) findViewById(R.id.button3);

        third.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                text.setText("My Text3");
            }

        });

        second.setOnClickListener(this);
    }

    public void onclick(View view) {
        text.setText("My Text1");

    }

    public void onClick(View v) {
        text.setText("My Text2");
    }


}

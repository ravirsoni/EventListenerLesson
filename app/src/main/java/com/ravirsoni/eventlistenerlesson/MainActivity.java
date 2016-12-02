package com.ravirsoni.eventlistenerlesson;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.bt_click_changecolor);
        button.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                RelativeLayout relative = (RelativeLayout) findViewById(R.id.activity_main) ;
                    relative.setBackgroundColor(Color.RED);
            }
        });


        Button btChangeText = (Button) findViewById(R.id.bt_clicktochange_change_text);

        btChangeText.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = (TextView) findViewById(R.id.tv_activity_main);
                tv.setText(R.string.tx_updated_Text);

            }
        });


    }





}






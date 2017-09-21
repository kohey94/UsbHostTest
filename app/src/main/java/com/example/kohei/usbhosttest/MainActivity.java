package com.example.kohei.usbhosttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNext = (Button)findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(buttonCL);
    }

    View.OnClickListener buttonCL = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), USB.class);
            startActivity(intent);
        }
    };
}

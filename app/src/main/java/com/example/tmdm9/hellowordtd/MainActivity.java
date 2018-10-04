package com.example.tmdm9.hellowordtd;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_start=(Button)findViewById(R.id.btn_splash); // Splashscreen button

        button_start.setOnClickListener(new MyListenerForEventHandling()); // prepares to send the user to the next screen


    }

    class MyListenerForEventHandling implements View.OnClickListener{
        @Override
        public void onClick(View v) {
           startActivity(new Intent(MainActivity.this, Main2Activity.class)); // to Main page
        }
    }


}

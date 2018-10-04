package com.example.tmdm9.hellowordtd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button button_reg;
    Button button_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button_reg=(Button)findViewById(R.id.btn_register); // Register button

        button_reg.setOnClickListener(new MyListenerForEventHandling()); // prepares the register button to move to the next screen

        button_log=(Button)findViewById(R.id.btn_login); // log in button



    }

    public void logIn(View view) {  //one way to move to another screen: Log In
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras(); // Get the info from the Registration page
        if (bundle == null) // if the user hasn't passed anything from Registration, do not allow them to log in
        {
            Toast.makeText(this, "Please register before attempting to log in.", Toast.LENGTH_SHORT).show();
            return;
        }
        String reg1 = bundle.getString("check1"); // put the info into strings for comparison
        String reg2 = bundle.getString("check2");
        String reg3 = bundle.getString("check3");
        String reg4 = bundle.getString("check4");
        String reg5 = bundle.getString("check5");

        Intent k = new Intent(Main2Activity.this, Main4Activity.class); // Prepare to send the info to the Login page
        k.putExtra("check1", reg1);
        k.putExtra("check2", reg2);
        k.putExtra("check3", reg3);
        k.putExtra("check4", reg4);
        k.putExtra("check5", reg5);

        startActivity(k); // to Login page

    }

    class MyListenerForEventHandling implements View.OnClickListener{//another way to move to another screen: Registration
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Main2Activity.this, Main3Activity.class)); // to Register page

        }
    }
}

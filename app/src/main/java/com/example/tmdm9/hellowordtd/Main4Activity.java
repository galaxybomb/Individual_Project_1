package com.example.tmdm9.hellowordtd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    EditText birthDate;
    EditText email;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void checkInfo(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.inputLayout);

        Bundle bundle = getIntent().getExtras(); // Get the info from the Registration page
        String reg1 = bundle.getString("check1"); // put the info into strings for comparison
        String reg2 = bundle.getString("check2");
        String reg3 = bundle.getString("check3");
        String reg4 = bundle.getString("check4");
        String reg5 = bundle.getString("check5");

        firstName=(EditText)findViewById(R.id.intxt_1);  // Validate First Name
        String nullcheck1 = firstName.getText().toString();
        if (nullcheck1.isEmpty()) {
            Toast.makeText(this, "You did not enter a First Name", Toast.LENGTH_SHORT).show();
            return;
        }
        if (nullcheck1.length() < 3)
        {
            Toast.makeText(this, "First Name should be at least 3 characters", Toast.LENGTH_SHORT).show();
            return;
        }
        if (nullcheck1.length() > 30)
        {
            Toast.makeText(this, "First Name should be at most 30 characters", Toast.LENGTH_SHORT).show();
            return;
        }
        // NEW CHECK- AGAINST REGISTERED INFORMATION
        if (!(nullcheck1.equals(reg1)))
        {
            Toast.makeText(this, "First Name does not match the registered information.", Toast.LENGTH_SHORT).show();
            return;
        }

        lastName=(EditText)findViewById(R.id.intxt_2); // Validate Last Name
        String nullcheck2 = lastName.getText().toString();
        if (nullcheck2.isEmpty()) {
            Toast.makeText(this, "You did not enter a Last Name", Toast.LENGTH_SHORT).show();
            return;
        }
// NEW CHECK- AGAINST REGISTERED INFORMATION
        if (!(nullcheck2.equals(reg2)))
        {
            Toast.makeText(this, "Last Name does not match the registered information.", Toast.LENGTH_SHORT).show();
            return;
        }

        birthDate=(EditText)findViewById(R.id.intxt_3); // Validate Birth Date
        String nullcheck3 = birthDate.getText().toString();
        if (nullcheck3.isEmpty()) {
            Toast.makeText(this, "You did not enter a Birth Date", Toast.LENGTH_SHORT).show();
            return;
        }
// NEW CHECK- AGAINST REGISTERED INFORMATION
        if (!(nullcheck3.equals(reg3)))
        {
            Toast.makeText(this, "Birth Date does not match the registered information.", Toast.LENGTH_SHORT).show();
            return;
        }

        email=(EditText)findViewById(R.id.intxt_4); // Validate Email
        String nullcheck4 = email.getText().toString();
        if (nullcheck4.isEmpty()) {
            Toast.makeText(this, "You did not enter an Email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!(nullcheck4.contains("@"))) {
            Toast.makeText(this, "Your email must have a valid format: x@y.z", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!(nullcheck4.contains("."))) {
            Toast.makeText(this, "Your email must have a valid format: x@y.z", Toast.LENGTH_SHORT).show();
            return;
        }
// NEW CHECK- AGAINST REGISTERED INFORMATION
        if (!(nullcheck4.equals(reg4)))
        {
            Toast.makeText(this, "Email does not match the registered information.", Toast.LENGTH_SHORT).show();
            return;
        }


        password=(EditText)findViewById(R.id.intxt_5); // Validate password
        String nullcheck5 = password.getText().toString();
        if (nullcheck5.isEmpty()) {
            Toast.makeText(this, "You did not enter a password", Toast.LENGTH_SHORT).show();
            return;
        }
// NEW CHECK- AGAINST REGISTERED INFORMATION
        if (!(nullcheck5.equals(reg5)))
        {
            Toast.makeText(this, "Password does not match the registered information.", Toast.LENGTH_SHORT).show();
            return;
        }



        Toast.makeText(this, "Validation Successful: You are now Logged in.", Toast.LENGTH_LONG).show();

        startActivity(new Intent(Main4Activity.this, MainActivity.class));


    }
}

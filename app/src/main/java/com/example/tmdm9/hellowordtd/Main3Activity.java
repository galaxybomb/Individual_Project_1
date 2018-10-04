package com.example.tmdm9.hellowordtd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
 EditText firstName;
    EditText lastName;
    EditText birthDate;
    EditText email;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void submitInfo(View view) {

       Intent i = new Intent(Main3Activity.this, Main2Activity.class);

        ScrollView layout = (ScrollView) findViewById(R.id.inputLayout);

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
        i.putExtra("check1", nullcheck1); // Sends the value of First Name into a bundle for comparison with login.

        lastName=(EditText)findViewById(R.id.intxt_2); // Validate Last Name
        String nullcheck2 = lastName.getText().toString();
        if (nullcheck2.isEmpty()) {
            Toast.makeText(this, "You did not enter a Last Name", Toast.LENGTH_SHORT).show();
            return;
        }

        i.putExtra("check2", nullcheck2); // Sends the value of Last Name into a bundle for comparison with login.

        birthDate=(EditText)findViewById(R.id.intxt_3); // Validate Birth Date
        String nullcheck3 = birthDate.getText().toString();
        if (nullcheck3.isEmpty()) {
            Toast.makeText(this, "You did not enter a Birth Date", Toast.LENGTH_SHORT).show();
            return;
        }
        i.putExtra("check3", nullcheck3); // Sends the value of Birth Date into a bundle for comparison with login.

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

        i.putExtra("check4", nullcheck4); // Sends the value of  Email into a bundle for comparison with login.

        password=(EditText)findViewById(R.id.intxt_5); // Validate password
        String nullcheck5 = password.getText().toString();
        if (nullcheck5.isEmpty()) {
            Toast.makeText(this, "You did not enter a password", Toast.LENGTH_SHORT).show();
            return;
        }
        i.putExtra("check5", nullcheck5); // Sends the value of password into a bundle for comparison with login.

        Toast.makeText(this, "Validation Successful: Please Log In.", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}

package com.niravmadariya.fullnavigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView btn = (TextView) findViewById(R.id.submitbtn);
        TextView btn2 = (TextView) findViewById(R.id.createac);
        EditText edtxt = (EditText) findViewById(R.id.usernm);
        EditText edtxt2 = (EditText) findViewById(R.id.usrpwd);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent i = new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(i);*/
                Toast.makeText(getApplicationContext(), "Sign Up", Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}

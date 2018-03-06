package com.srm.dixitsoham.testcases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginCheck(View view) {

        EditText username = findViewById(R.id.u_name);

        String name = username.getText().toString();
        String greeting = String.format("Hello "+name+" Login Successful !");

        TextView messageTextView = findViewById(R.id.text);
        messageTextView.setText(greeting);
    }
}

package com.example.nasaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private Button changeToFirstActivityBtn;
    private ImageButton backButton;
    private EditText mailText;
    private EditText passwordText;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        backButton = (ImageButton) findViewById(R.id.imageButton);
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Jawne przekazanie intentu - czyli co chcemy zrobic i jak chcemy zrobic
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        text = (TextView) findViewById(R.id.textView2);
        mailText = (EditText) findViewById(R.id.editTextTextPersonName);
        passwordText = (EditText) findViewById(R.id.editTextTextPersonName2);


        changeToFirstActivityBtn = (Button) findViewById(R.id.button3);
        changeToFirstActivityBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Jawne przekazanie intentu - czyli co chcemy zrobic i jak chcemy zrobic
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);

            }
        });

    }
}
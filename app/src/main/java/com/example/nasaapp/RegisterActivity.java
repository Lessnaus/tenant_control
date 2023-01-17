package com.example.nasaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private Button changeToFirstActivityBtn;
    private ImageButton backButton;
    private EditText mailText;
    private EditText passwordText;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        backButton = (ImageButton) findViewById(R.id.imageButton3);
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Jawne przekazanie intentu - czyli co chcemy zrobic i jak chcemy zrobic
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        text = (TextView) findViewById(R.id.textView5);
        mailText = (EditText) findViewById(R.id.editTextTextPersonName5);
        passwordText = (EditText) findViewById(R.id.editTextTextPersonName6);


        changeToFirstActivityBtn = (Button) findViewById(R.id.button7);
        changeToFirstActivityBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Jawne przekazanie intentu - czyli co chcemy zrobic i jak chcemy zrobic
                Intent intent = new Intent(RegisterActivity.this, TestActivity.class);
                startActivity(intent);

            }
        });

    }
}
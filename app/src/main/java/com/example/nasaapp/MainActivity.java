package com.example.nasaapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView startText;
    private Button changeTextBtn;
    private Button changeTextBtn2;
    private ImageView logoImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startText = (TextView) findViewById(R.id.textView4);
        startText.setText(R.string.hello_manual_fragment);

        logoImage = (ImageView) findViewById(R.id.imageView);

        changeTextBtn = (Button) findViewById(R.id.button1);
        changeTextBtn.setOnClickListener(this);

        changeTextBtn2 = (Button) findViewById(R.id.button2);
        changeTextBtn2.setOnClickListener(this);

        SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        String checkbox = preferences.getString("remember", "");

        if (checkbox.equals("true")) {
            Intent intent = new Intent(this, WelcomeActivity.class);
            startActivity(intent);
        }
        ;

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == changeTextBtn.getId()) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        } else if (v.getId() == changeTextBtn2.getId()) {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }
}
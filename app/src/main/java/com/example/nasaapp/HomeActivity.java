package com.example.nasaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button1 = (Button) findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Jawne przekazanie intentu - czyli co chcemy zrobic i jak chcemy zrobic
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        button2 = (Button) findViewById(R.id.button8);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Jawne przekazanie intentu - czyli co chcemy zrobic i jak chcemy zrobic
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        button3 = (Button) findViewById(R.id.button9);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Jawne przekazanie intentu - czyli co chcemy zrobic i jak chcemy zrobic
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        button4 = (Button) findViewById(R.id.button10);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Jawne przekazanie intentu - czyli co chcemy zrobic i jak chcemy zrobic
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}


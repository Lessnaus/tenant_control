package com.example.nasaapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {


    private Button buttonCalendar;
    private Button buttonDuties;
    private Button buttonBudget;
    private Button buttonComment;
    private Button buttonLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonCalendar = (Button) findViewById(R.id.btnCalendar);
        buttonCalendar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Not created", Toast.LENGTH_SHORT).show();

            }
        });
        buttonDuties = (Button) findViewById(R.id.btnDuties);
        buttonDuties.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Not created", Toast.LENGTH_SHORT).show();

            }
        });
        buttonBudget = (Button) findViewById(R.id.btnBudget);
        buttonBudget.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Not created", Toast.LENGTH_SHORT).show();

            }
        });
        buttonComment = (Button) findViewById(R.id.btnComments);
        buttonComment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Not created", Toast.LENGTH_SHORT).show();

            }
        });
        buttonLogOut = (Button) findViewById(R.id.btnLogOut2);
        buttonLogOut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("chechbox",MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("remember","false");
                editor.apply();
                finish();

            }
        });

    }
}


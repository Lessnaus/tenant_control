package com.example.nasaapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView welcomeText;
    private Button startBtn;
    private Button logOutBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeText = (TextView) findViewById(R.id.textWelcome);

        startBtn = (Button) findViewById(R.id.btnStart);
        startBtn.setOnClickListener(this);

        logOutBtn = (Button) findViewById(R.id.btnLogOut);
        logOutBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == startBtn.getId()) {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        } else if (v.getId() == logOutBtn.getId()) {
            SharedPreferences preferences = getSharedPreferences("checkbox",MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("remember","false");
            editor.apply();
            finish();

        }
    }
}


package com.example.marek.musicapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout_about);

        View backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(this);
    }
    public void onClick(View v){
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
    }
}

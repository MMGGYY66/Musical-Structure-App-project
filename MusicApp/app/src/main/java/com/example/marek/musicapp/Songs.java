package com.example.marek.musicapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Songs extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout_songs);

        View playbutton = findViewById(R.id.playbutton);
        playbutton.setOnClickListener(this);
        View artistbutton = findViewById(R.id.artistbutton);
        artistbutton.setOnClickListener(this);
        View song1 = findViewById(R.id.song1);
        song1.setOnClickListener(this);
        View song2 = findViewById(R.id.song2);
        song2.setOnClickListener(this);
        View song3 = findViewById(R.id.song3);
        song3.setOnClickListener(this);

        View backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent i;
        switch(v.getId()){
            case R.id.playbutton:
                i = new Intent(this, Playing.class);
                startActivity(i);
                break;
            case R.id.artistbutton:
                i = new Intent(this, Interprets.class);
                startActivity(i);
                break;
            case R.id.song1:
                i = new Intent(this, Playing.class);
                startActivity(i);
                break;
            case R.id.song2:
                i = new Intent(this, Playing.class);
                startActivity(i);
                break;
            case R.id.song3:
                i = new Intent(this, Playing.class);
                startActivity(i);
                break;

            case R.id.backbutton:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

        }

    }
}

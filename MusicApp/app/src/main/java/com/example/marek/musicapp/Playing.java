package com.example.marek.musicapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Playing extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout_playing);

        View songsbutton = findViewById(R.id.songsbutton);
        songsbutton.setOnClickListener(this);
        View artistbutton = findViewById(R.id.artistbutton);
        artistbutton.setOnClickListener(this);

        View backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent i;
        switch(v.getId()){
            case R.id.songsbutton:
                i = new Intent(this, Songs.class);
                startActivity(i);
                break;
            case R.id.artistbutton:
                i = new Intent(this, Interprets.class);
                startActivity(i);
                break;

            case R.id.backbutton:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

        }

    }
}

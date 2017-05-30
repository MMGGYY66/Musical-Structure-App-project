package com.example.marek.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout_main);

        View playbutton = findViewById(R.id.playbutton);
        playbutton.setOnClickListener(this);
        View artistbutton = findViewById(R.id.artistbutton);
        artistbutton.setOnClickListener(this);
        View songsbutton = findViewById(R.id.songsbutton);
        songsbutton.setOnClickListener(this);
        View aboutbutton = findViewById(R.id.aboutbutton);
        aboutbutton.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.playbutton:
                i = new Intent(this, Playing.class);
                startActivity(i);
                break;
            case R.id.artistbutton:
                i = new Intent(this, Interprets.class);
                startActivity(i);
                break;
            case R.id.songsbutton:
                i = new Intent(this, Songs.class);
                startActivity(i);
                break;
            case R.id.aboutbutton:
                i = new Intent(this, About.class);
                startActivity(i);
                break;

        }


    }
}

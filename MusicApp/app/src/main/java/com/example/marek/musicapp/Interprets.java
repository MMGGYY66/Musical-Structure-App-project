package com.example.marek.musicapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Interprets extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interprets);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout_interprets);

        View songsbutton = findViewById(R.id.songsbutton);
        songsbutton.setOnClickListener(this);
        View playbutton = findViewById(R.id.playbutton);
        playbutton.setOnClickListener(this);
        View interpret1 = findViewById(R.id.interpret1);
        interpret1.setOnClickListener(this);
        View interpret2 = findViewById(R.id.interpret2);
        interpret2.setOnClickListener(this);
        View interpret3 = findViewById(R.id.interpret3);
        interpret3.setOnClickListener(this);

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
            case R.id.playbutton:
                i = new Intent(this, Playing.class);
                startActivity(i);
                break;
            case R.id.interpret1:
                i = new Intent(this, Songs.class);
                startActivity(i);
                break;
            case R.id.interpret2:
                i = new Intent(this, Songs.class);
                startActivity(i);
                break;
            case R.id.interpret3:
                i = new Intent(this, Songs.class);
                startActivity(i);
                break;

            case R.id.backbutton:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

        }

    }
}

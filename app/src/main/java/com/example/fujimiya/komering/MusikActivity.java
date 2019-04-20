package com.example.fujimiya.komering;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MusikActivity extends AppCompatActivity {
    MediaPlayer play;
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musik);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("MUSIK DAN LAGU");

        play = MediaPlayer.create(MusikActivity.this, R.raw.bumi_oku_sel);
    }

    public void kotawisata(View view) {
        play.stop();
        play = MediaPlayer.create(MusikActivity.this, R.raw.kota_wisata);
        play.start();
    }

    public void bumuokusel(View view) {
        play.stop();
        play = MediaPlayer.create(MusikActivity.this, R.raw.bumi_oku_sel);
        play.start();
    }

    public void kederat(View view) {
        play.stop();
        play = MediaPlayer.create(MusikActivity.this, R.raw.kederat);
        play.start();
    }


    public void ombaiakas(View view) {
        play.stop();
        play = MediaPlayer.create(MusikActivity.this, R.raw.ombaiakas);
        play.start();
    }

    public void lagudaerahokusel(View view) {
        play.stop();
        play = MediaPlayer.create(MusikActivity.this, R.raw.lagudokusel);
        play.start();
    }

    public void muaradua(View view) {
        play.stop();
        play = MediaPlayer.create(MusikActivity.this, R.raw.muaradua);
        play.start();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            play.stop();
            finish(); // close this activity and return to preview activity (if there is any)
            startActivity(new Intent(getApplicationContext(), MenuSeniActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        play.stop();
        startActivity(new Intent(getApplicationContext(), MenuSeniActivity.class));
    }
}

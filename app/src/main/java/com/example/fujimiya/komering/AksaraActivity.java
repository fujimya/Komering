package com.example.fujimiya.komering;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class AksaraActivity extends AppCompatActivity {
    private ActionBar actionBar;
    MediaPlayer play1,play2,play3,play4,play5,play6,play7,play8,play9,play10,play11,play12,play13,play14,play15,play16,play17,play18,play19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksara);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("AKSARA SURAT UNGGAK");

        play1 = MediaPlayer.create(AksaraActivity.this, R.raw.ka);
        play2 = MediaPlayer.create(AksaraActivity.this, R.raw.ga);
        play3 = MediaPlayer.create(AksaraActivity.this, R.raw.nga);
        play4 = MediaPlayer.create(AksaraActivity.this, R.raw.pa);
        play5 = MediaPlayer.create(AksaraActivity.this, R.raw.ba);
        play6 = MediaPlayer.create(AksaraActivity.this, R.raw.ma);
        play7 = MediaPlayer.create(AksaraActivity.this, R.raw.ta);
        play8 = MediaPlayer.create(AksaraActivity.this, R.raw.da);
        play9 = MediaPlayer.create(AksaraActivity.this, R.raw.na);
        play10 = MediaPlayer.create(AksaraActivity.this, R.raw.ca);
        play11 = MediaPlayer.create(AksaraActivity.this, R.raw.ja);
        play12 = MediaPlayer.create(AksaraActivity.this, R.raw.nya);
        play13 = MediaPlayer.create(AksaraActivity.this, R.raw.ya);
        play14 = MediaPlayer.create(AksaraActivity.this, R.raw.wa);
        play15 = MediaPlayer.create(AksaraActivity.this, R.raw.gha);
        play16 = MediaPlayer.create(AksaraActivity.this, R.raw.la);
        play17 = MediaPlayer.create(AksaraActivity.this, R.raw.a);
        play18 = MediaPlayer.create(AksaraActivity.this, R.raw.sa);
        play19 = MediaPlayer.create(AksaraActivity.this, R.raw.ha);



    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
            startActivity(new Intent(getApplicationContext(), MenuUtamaActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        startActivity(new Intent(getApplicationContext(), MenuUtamaActivity.class));
    }

    public void ka(View view) {
        try {
            play1.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"ka",Toast.LENGTH_SHORT).show();
    }

    public void ga(View view) {
        try {
            play2.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"ga",Toast.LENGTH_SHORT).show();
    }

    public void nga(View view) {
        try {
            play3.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"nga",Toast.LENGTH_SHORT).show();
    }

    public void pa(View view) {
        try {
             play4.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"pa",Toast.LENGTH_SHORT).show();
    }

    public void ba(View view) {
        try {
            play5.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"ba",Toast.LENGTH_SHORT).show();
    }

    public void ma(View view) {
        try {
            play6.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"ma",Toast.LENGTH_SHORT).show();
    }

    public void ta(View view) {
        try {
            play7.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"taa",Toast.LENGTH_SHORT).show();
    }

    public void da(View view) {
       try {
            play8.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"da",Toast.LENGTH_SHORT).show();
    }

    public void na(View view) {
        try {
            play9.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"na",Toast.LENGTH_SHORT).show();
    }

    public void ca(View view) {
        try {
            play10.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"ca",Toast.LENGTH_SHORT).show();
    }

    public void ja(View view) {
        try {
            play11.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"ja",Toast.LENGTH_SHORT).show();
    }

    public void nya(View view) {
        try {
             play12.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"nya",Toast.LENGTH_SHORT).show();
    }

    public void ya(View view) {
        try {
            play13.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"ya",Toast.LENGTH_SHORT).show();
    }

    public void wa(View view) {
        try {
            play14.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"wa",Toast.LENGTH_SHORT).show();
    }

    public void gha(View view) {
        try {
            play15.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();

        }
        Toast.makeText(AksaraActivity.this,"gha",Toast.LENGTH_SHORT).show();
    }

    public void la(View view) {
        try {
            play16.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"la",Toast.LENGTH_SHORT).show();
    }

    public void a(View view) {
        try {
            play17.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"a",Toast.LENGTH_SHORT).show();
    }

    public void sa(View view) {
        try {
            play18.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"sa",Toast.LENGTH_SHORT).show();
    }

    public void ha(View view) {
        try {
            play19.start();
        }catch (Exception e){
            Toast.makeText(AksaraActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(AksaraActivity.this,"ha",Toast.LENGTH_SHORT).show();
    }


}

package com.example.fujimiya.komering;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class AdatIstiadatActivity extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adat_istiadat2_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("MENU ADAT ISTIADAT");
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

    public void bujang(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), BujangGadisActivity.class));
    }

    public void pernikahan(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), PernikahanActivity.class));
    }

    public void pakaian(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), PakaianAdatActivity.class));
    }

    public void kesenian(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), MenuSeniActivity.class));
    }
}

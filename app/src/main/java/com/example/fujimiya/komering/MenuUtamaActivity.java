package com.example.fujimiya.komering;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MenuUtamaActivity extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("MENU UTAMA");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void rumahadat(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), RumahAdatActivity.class));
    }

    public void aksara(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), AksaraActivity.class));
    }

    public void kuis(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), KuisActivity.class));
    }

    public void adatku(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), AdatIstiadatActivity.class));
    }

}

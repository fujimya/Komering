package com.example.fujimiya.komering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuSeniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_seni2);
    }

    public void musiklagu(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), MusikActivity.class));
    }

    public void alatmusik(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), AlatMusikActivity.class));
    }

    public void tarian(View view) {
        finish();
        startActivity(new Intent(getApplicationContext(), TarianActivity.class));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        startActivity(new Intent(getApplicationContext(), AdatIstiadatActivity.class));
    }
}

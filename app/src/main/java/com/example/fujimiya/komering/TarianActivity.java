package com.example.fujimiya.komering;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.Toast;

import com.github.rtoshiro.view.video.FullscreenVideoView;

public class TarianActivity extends AppCompatActivity {
    FullscreenVideoView videoView;
    MediaController mediaController;
    private ActionBar actionBar;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarian);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("TARIAN");

        videoView =(FullscreenVideoView)findViewById(R.id.videoview);
        mediaController= new MediaController(this);
        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tariansatu);
        try {
//            videoView.setMediaController(mediaController);
            videoView.setVideoURI(uri);
            videoView.start();

        }catch (Exception e){
            Toast.makeText(TarianActivity.this,""+e,Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
            startActivity(new Intent(getApplicationContext(), MenuSeniActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        startActivity(new Intent(getApplicationContext(), MenuSeniActivity.class));
    }

}

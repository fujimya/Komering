package com.example.fujimiya.komering;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.fujimiya.komering.Fragmen.BurdaFragment;
import com.example.fujimiya.komering.Fragmen.GongFragment;
import com.example.fujimiya.komering.Fragmen.KulintangFragment;

public class AlatMusikActivity extends AppCompatActivity {
    private ViewPager viewPages;
    private TabLayout tabLayout;
    private PagerAdapter pagerAdapter;
    private ActionBar actionBar;
    private String[] tabTitle = {"Bujang Gadis","Upacara","Pakaian"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alat_musik);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("ALAT MUSIK");

        viewPages =  (ViewPager) findViewById(R.id.view_pager);
        pagerAdapter = new AlatMusikActivity.FragmentAdapter(getSupportFragmentManager());
        viewPages.setAdapter(pagerAdapter);

        viewPages.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                actionBar.setTitle(tabTitle[position]);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPages);

        tabLayout.getTabAt(0).setText("BURDA");
        tabLayout.getTabAt(1).setText("GONG");
        tabLayout.getTabAt(2).setText("KULINTANG");
    }
    /*
    * Sync tab title with fragment
    */
    class FragmentAdapter extends FragmentPagerAdapter {

        public FragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        public Fragment getItem(int pos) {
            switch (pos) {
                case 0:
                    return new BurdaFragment();
                case 1:
                    return new GongFragment();
                case 2:
                    return new KulintangFragment();
            }
            return  null;
        }

        public int getCount() {
            return 3;
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

package com.example.android.totalitygolf;

import android.app.Activity;
import android.app.Application;
import android.support.design.widget.NavigationView;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.TypefaceCompatUtil;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;

import java.util.ArrayList;
import java.util.List;


public class TotalityGolf extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totality_golf);

        //add toolbar to main screen
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //set viewpager for each tab
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        //set tabs inside toolbar
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        //create navigation drawer and inflate layout
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        //adding menu icon to toolbar
       // ActionBar supportActionBar = getSupportActionBar();
       // if (supportActionBar != null){
         //   VectorDrawableCompat indicator
           //         = VectorDrawableCompat.create(getResources(), R.drawable.ic_more_vert_white, getTheme());
            //indicator.setTint(ResourcesCompat.getColor(getResources(), R.color.cardview_light_background, getTheme()));
            //supportActionBar.setHomeAsUpIndicator(indicator);
            //supportActionBar.setDisplayHomeAsUpEnabled(true);
        //}

        //set behavior of navigation drawer
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        //method triggers on item click of navigation menu
                        menuItem.setChecked(true);

                        //TO DO: Handle navigation - need other activities/content

                        //closing drawer on item click
                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                }
        );

        //set bottom navigation bar
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.training:
                                Intent intent1 = new Intent(TotalityGolf.this, TrainingActivity.class);
                                startActivity(intent1);
                                break;

                            case R.id.homeActivity:
                                Intent intent2 = new Intent(TotalityGolf.this, HomeActivity.class);
                                startActivity(intent2);
                                break;

                            case R.id.swingAnalyzer:
                                Intent intent3 = new Intent(TotalityGolf.this, SwingAnalyzerActivity.class);
                                startActivity(intent3);
                                break;

                        }
                        return true;
                    }
                }
        );

    }

    private void setupViewPager(ViewPager viewPager) {
        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new TrainingVideoFragment(), "Video Tutorials");
        adapter.addFragment(new TrainingLessonFragment(), "Lesson Plans");
        adapter.addFragment(new TrainingProductFragment(), "Training Aids");
        viewPager.setAdapter(adapter);
    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {

            // handle action bar item clicks here - action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as parent activity specified in manifest
            int id = item.getItemId();

            if (id == R.id.action_settings){
                return true;
            } else if (id == android.R.id.home) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
            return super.onOptionsItemSelected(item);
        }

}

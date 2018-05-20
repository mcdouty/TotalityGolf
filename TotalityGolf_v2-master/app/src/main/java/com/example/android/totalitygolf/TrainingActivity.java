package com.example.android.totalitygolf;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;


public class TrainingActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
    private DrawerLayout mDrawerLayout;
    private SectionsPageAdapter mSectionsAdapter;
    private ViewPager mViewPager;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        Log.d(TAG, "onCreate: Starting");

        mSectionsAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(mViewPager);

        //set tabs inside toolbar
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(mViewPager);

        //add toolbar to main screen
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*

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
*/
        //set bottom navigation bar
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.training:
                                Intent intent1 = new Intent(TrainingActivity.this, TrainingActivity.class);
                                startActivity(intent1);
                                break;

                            case R.id.homeActivity:
                                Intent intent2 = new Intent(TrainingActivity.this, TotalityGolf.class);
                                startActivity(intent2);
                                break;

                            case R.id.swingAnalyzer:
                                Intent intent3 = new Intent(TrainingActivity.this, SwingAnalyzerActivity.class);
                                startActivity(intent3);
                                break;

                        }
                        return true;
                    }
                }
        );

    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new TrainingProductFragment(), "Products");
        adapter.addFragment(new TrainingLessonFragment(), "Lessons");
        adapter.addFragment(new TrainingVideoFragment(), "Tutorials");
        viewPager.setAdapter(adapter);
    }
/*
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
*/
}

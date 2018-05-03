package com.example.android.totalitygolf;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


public class TrainingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

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
                                Intent intent2 = new Intent(TrainingActivity.this, HomeActivity.class);
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

    public void goToHomeActivity (View View){
        Intent intent = new Intent(TrainingActivity.this, HomeActivity.class);
        startActivity(intent);
}


}


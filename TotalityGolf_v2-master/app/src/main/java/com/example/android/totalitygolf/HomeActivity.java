package com.example.android.totalitygolf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goToTotalityActivity (View view){
        Intent intent = new Intent(this, TotalityGolf.class);
        startActivity(intent);
    }
}

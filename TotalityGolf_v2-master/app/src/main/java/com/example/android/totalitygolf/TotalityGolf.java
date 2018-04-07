package com.example.android.totalitygolf;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.graphics.TypefaceCompatUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Typeface.SERIF;


public class TotalityGolf extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totality_golf);
    }

    public void goToSwingAnalyzerActivity (View View){
        Intent intent = new Intent(TotalityGolf.this, SwingAnalyzerActivity.class);
        startActivity(intent);
    }

    public void goToHomeActivity (View View){
        Intent intent = new Intent(TotalityGolf.this, HomeActivity.class);
        startActivity(intent);
    }

    public void goToTrainingActivity (View view){
        Intent intent = new Intent(TotalityGolf.this, TrainingActivity.class);
        startActivity(intent);
    }


}

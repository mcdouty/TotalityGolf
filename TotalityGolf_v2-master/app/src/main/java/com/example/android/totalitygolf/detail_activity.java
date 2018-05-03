package com.example.android.totalitygolf;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_activity extends AppCompatActivity {

    public static final String EXTRA_POSITION = "position";

    //@Override
    public void onCreat(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Set collapsing toolbar layout
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout)
                findViewById(R.id.collapsing_toolbar);
        // TO DO: Set title of Detail page
        // collapsingToolbar.setTitle(getString(R.string.item_title));

        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] places = resources.getStringArray(R.array.places);
        collapsingToolbar.setTitle(places[postion % places.length]);

        //TO DO: Content creation - Detail
        String[] placeDetails = resources.getStringArray(R.array.place_details);
        TextView placeDetail = (TextView) findViewById(R.id.place_detail);
        placeDetail.setText(placeDetails[postion % placeDetails.length]);

        //TO DO: Content creation - may remove may keep depending on structure of content
        String[] placeLocations = resources.getStringArray(R.array.place_locations);
        TextView placeLocation =  (TextView) findViewById(R.id.place_location);
        placeLocation.setText(placeLocations[postion % placeLocations.length]);

        //TO DO: Content creation - pictures
        TypedArray placePictures = resources.obtainTypedArray(R.array.places_picture);
        ImageView placePicture = (ImageView) findViewById(R.id.image);
        placePicture.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));

        placePictures.recycle();
    }

}

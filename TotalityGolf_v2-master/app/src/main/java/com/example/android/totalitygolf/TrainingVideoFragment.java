package com.example.android.totalitygolf;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TrainingVideoFragment extends Fragment {
    public static final String TAG = "Training Video Fragment";

    String[] VideoTitle = {"Beginner","Intermediate","Advanced"};
    int[] VideoImageList = new int[]{R.drawable.starting_clock, R.drawable.driving_range, R.drawable.ball_pyramid};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_training_video, container, false);

        RecyclerView VideoRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        VideoRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        VideoCardViewAdapter VideoAdapter = new VideoCardViewAdapter(this.getActivity(), VideoTitle, VideoImageList);

        VideoRecyclerView.setAdapter(VideoAdapter);

        return view;



        /*
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(
                R.layout.recycler_view, container, false);
        ContentAdapter adapter = new ContentAdapter(recyclerView.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return recyclerView;
        */
    }
/*
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView picture;
        public TextView name;
        public TextView description;
        public ViewHolder (LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.fragment_training_lesson, parent, false));
            //TO DO: Fill in this next lines with Card images/content
            ImageView picture = (ImageView) itemView.findViewById(R.id.card_image);
            TextView name = (TextView) itemView.findViewById(R.id.card_text);
            //description = (TextView) itemView.findViewById(R.id.______);
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, detail_activity.class);
                    intent.putExtra(detail_activity.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }

    //adapter to display recyclerview
    public static class ContentAdapter extends RecyclerView.Adapter<ViewHolder> {
        //Set numbers of cards in recyclerview
        private static final int LENGTH = 18;

        private final String[] mPlaces;
        private final String[] mPlaceDesc;
        private final Drawable[] mPlacePictures;

        public ContentAdapter(Context context) {
            Resources resources = context.getResources();
            mPlaces = resources.getStringArray(R.array.places);
            mPlaceDesc = resources.getStringArray(R.array.place_desc);
            TypedArray a = resources.obtainTypedArray(R.array.places_picture);
            mPlacePictures = new Drawable[a.length()];
            for (int i = 0; i < mPlacePictures.length; i++) {
                mPlacePictures[i] = a.getDrawable(i);
            }
            a.recycle();
        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.picture.setImageDrawable(mPlacePictures[position % mPlacePictures.length]);
            holder.name.setText(mPlaces[position % mPlaces.length]);
            holder.description.setText(mPlaceDesc[position % mPlaceDesc.length]);
        }

        @Override
        public int getItemCount() {
            return LENGTH;
        }
    }*/
}

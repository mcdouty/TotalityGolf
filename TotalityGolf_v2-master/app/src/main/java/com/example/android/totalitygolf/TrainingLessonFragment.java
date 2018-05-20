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



public class TrainingLessonFragment extends Fragment {

    public static final String TAG = "Training Lesson Fragment";

    String[] LessonTitle = {"Beginner","Intermediate","Advanced"};
    int[] LessonImageList = new int[]{R.drawable.starting_clock, R.drawable.driving_range, R.drawable.ball_pyramid};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_training_lesson, container, false);

        RecyclerView LessonRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewLesson);

        LessonRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        VideoCardViewAdapter LessonAdapter = new VideoCardViewAdapter(this.getActivity(), LessonTitle, LessonImageList);

        LessonRecyclerView.setAdapter(LessonAdapter);

        return view;
    }
}
package com.example.android.totalitygolf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

    public class VideoCardViewAdapter extends RecyclerView.Adapter<VideoCardViewHolder> {

    //inflate layout
    Context mContext;

    //store products in list
    String[] VideoCardList;

    int[] videoCardImage;

    //getting context layout and cardview list
    public VideoCardViewAdapter(Context mContext, String[] VideoCardList, int[] videoCardImage) {
        this.mContext = mContext;
        this.VideoCardList = VideoCardList;
        this.videoCardImage = videoCardImage;
    }

    @Override
    public VideoCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model, parent, false);
        return new VideoCardViewHolder(view);

    }

    @Override
    public void onBindViewHolder(VideoCardViewHolder holder, int position) {
        holder.nametxt.setText(VideoCardList[position]);
        holder.cardImage.setImageResource(videoCardImage[position]);



    }

    @Override
    public int getItemCount(){
        return VideoCardList.length;
    }


}


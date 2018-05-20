package com.example.android.totalitygolf;

import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class VideoCardViewHolder extends RecyclerView.ViewHolder {

    TextView nametxt;
    ImageView cardImage;

    public VideoCardViewHolder(View itemView) {
        super(itemView);

        nametxt = (TextView) itemView.findViewById(R.id.nameTxt);
        cardImage = (ImageView) itemView.findViewById(R.id.videoCardImage);

    }
}
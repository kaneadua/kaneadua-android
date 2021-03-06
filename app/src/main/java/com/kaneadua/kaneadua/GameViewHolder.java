package com.kaneadua.kaneadua;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class GameViewHolder extends RecyclerView.ViewHolder {
    ImageView ivGame;
    CardView cardView;
    TextView tvTitle;
    TextView tvDescription;
    TextView tvTags;
    TextView tvPrice;

    public GameViewHolder(@NonNull View itemView) {
        super(itemView);
        ivGame = itemView.findViewById(R.id.ivgame);
        cardView = itemView.findViewById(R.id.cardview_game);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvDescription = itemView.findViewById(R.id.tvDescription);
        tvTags = itemView.findViewById(R.id.tvTags);
        tvPrice = itemView.findViewById(R.id.tvPrice);
    }
}

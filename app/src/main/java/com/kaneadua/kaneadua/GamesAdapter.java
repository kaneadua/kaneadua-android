package com.kaneadua.kaneadua;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GameViewHolder> {

    private Context context;
    private List<Game> games;

    public GamesAdapter(Context context, List<Game> games){
        this.context = context;
        this.games = games;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.game_layout, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        holder.tvTitle.setText(games.get(position).getTitle());
        holder.tvDescription.setText(games.get(position).getDescription());
        holder.tvTags.setText(games.get(position).getTags());
        holder.tvPrice.setText(games.get(position).getPrice() > 0 ?
                "Ghc " + String.format("%.2f", games.get(position).getPrice()) : "Free");

        Glide.with(context)
            .load(games.get(position).getImageUrl())
            .centerCrop()
            .into(holder.ivGame);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open a game viewer activity
            }
        });

    }

    @Override
    public int getItemCount() {
        return games.size();
    }
}

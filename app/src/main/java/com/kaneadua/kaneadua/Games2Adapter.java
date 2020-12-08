package com.kaneadua.kaneadua;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Games2Adapter extends RecyclerView.Adapter<Game2ViewHolder> {

    private Context context;
    private List<Game2> game2s;

    public Games2Adapter(Context context, List<Game2> games){
        this.context = context;
        this.game2s = games;
    }

    @NonNull
    @Override
    public Game2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.game_layout, parent, false);
        return new Game2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Game2ViewHolder holder, int position) {
        holder.tvTitle.setText(game2s.get(position).getTitle());
        holder.tvDescription.setText(game2s.get(position).getDescription());
        holder.tvTags.setText(game2s.get(position).getTags());

        Glide
                .with(context)
                .load(game2s.get(position).getImageurl())
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
        return game2s.size();
    }
}

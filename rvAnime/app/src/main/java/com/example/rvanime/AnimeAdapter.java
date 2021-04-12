package com.example.rvanime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder> {
    private Context context;
    private ArrayList<AnimeModel> animeModels;

    public AnimeAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<AnimeModel> getTankModels() {
        return animeModels;
    }

    public void setAnimeModels(ArrayList<AnimeModel> animeModels) {
        this.animeModels = animeModels;
    }

    @NonNull
    @Override
    public AnimeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime, parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getTankModels().get(position).getGambarAnime()).into(holder.gambar);
        holder.text.setText(getTankModels().get(position).getNamaAnime());
    }

    @Override
    public int getItemCount() {
        return getTankModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambar_anime);
            text = itemView.findViewById(R.id.text_anime);
        }
    }
}

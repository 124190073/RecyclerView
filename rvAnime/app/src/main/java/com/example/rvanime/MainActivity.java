package com.example.rvanime;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button tombol1, tombol2;
    private RecyclerView rvCetak;
    private ArrayList<AnimeModel> listAnime = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol1 = findViewById(R.id.BT_detail);
        tombol2 = findViewById(R.id.BT_tonton);
        rvCetak = findViewById(R.id.mainRV);
        rvCetak.setHasFixedSize(true);
        listAnime.addAll(AnimeData.getListData());

        showRecyclerList();

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                    startActivity(pindah);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "ERROR!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browser = new Intent(Intent.ACTION_VIEW,Uri.parse("http://t.me/AnimeMasterlist"));
                startActivity(browser);
            }
        });
    }

    private void showRecyclerList() {
        rvCetak.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        AnimeAdapter animeAdapter = new AnimeAdapter(this);
        animeAdapter.setAnimeModels(listAnime);
        rvCetak.setAdapter(animeAdapter);
    }



}
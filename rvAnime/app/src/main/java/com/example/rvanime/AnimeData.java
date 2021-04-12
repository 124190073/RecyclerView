package com.example.rvanime;

import java.util.ArrayList;

public class AnimeData {
    private static  String[] nama = new String[]{"Attack on Titan", "Tokyo Ghoul", "Inuyashiki", "Sword Art Online", "Kuroko No Basket", "Haikyuu", "God of Highschool", "Orange", "Hyouka"};

    private static int[] gambar = new int[]{R.drawable.aott, R.drawable.tg, R.drawable.inuyashiki, R.drawable.sao, R.drawable.kuroko, R.drawable.haikyu, R.drawable.goh, R.drawable.orange, R.drawable.hyouka};

    public static ArrayList<AnimeModel> getListData(){
        AnimeModel animeModel = null;
        ArrayList<AnimeModel> list = new ArrayList<AnimeModel>();
        for ( int i = 0; i < nama.length; i++){
            animeModel = new AnimeModel();
            animeModel.setGambarAnime(gambar[i]);
            animeModel.setNamaAnime(nama[i]);
            list.add(animeModel);
        }
        return list;
    }
}

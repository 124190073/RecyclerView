package com.example.rvanime;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView getJudul, getKeterangan;
    private ImageView getGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        getSupportActionBar().setTitle("Data Film");
        getGambar = findViewById(R.id.gambar_anime);
        getKeterangan = findViewById(R.id.keterangan);
        getJudul = findViewById(R.id.judul_anime);
        showData();
    }

    private void showData(){
        String judul = getIntent().getExtras().getString("JudulAnime");

        switch (judul){
            case "aot" :
                getJudul.setText("Attack on Titan");
                getGambar.setImageResource(R.drawable.aott);
                getKeterangan.setText("Attack on Titan, adalah sebuah seri manga shōnen asal Jepang yang ditulis dan diilustrasikan oleh Hajime Isayama. Ceritanya berlatar di dunia tempat umat manusia hidup di wilayah yang dikelilingi tiga lapis tembok besar, yang melindungi mereka dari makhluk pemakan manusia berukuran raksasa yang dikenal sebagai Titan. Manga ini telah diadaptasi menjadi sebuah seri anime yang diproduksi oleh Wit Studio (musim 1–3) dan MAPPA (musim 4). Musim pertama yang terdiri dari 25 episode ditayangkan sejak bulan April hingga September 2013, diikuti oleh musim kedua sebanyak 12 episode dari bulan April hingga Juni 2017. Musim ketiga yang terdiri dari 22 episode ditayangkan menjadi dua bagian. 12 episode pertama ditayangkan sejak bulan Juli hingga Oktober 2018 dan 10 episode tersisa ditayangkan sejak bulan April hingga Juli 2019. Musim keempat sekaligus terakhir ditayangkan sejak bulan Desember 2020.");
                break;

            case "tg" :
                getJudul.setText("Tokyo Ghoul");
                getGambar.setImageResource(R.drawable.tg);
                getKeterangan.setText("Tokyo Ghoul (bahasa Jepang: 東京喰種トーキョーグール Hepburn: Tōkyō Gūru) adalah sebuah seri manga seinen Jepang bergenre fantasi gelap yang ditulis dan diilustrasikan oleh Sui Ishida. Manga ini mulai dimuat dalam majalah Weekly Young Jump terbitan Shueisha sejak bulan September 2011 hingga September 2014, dan telah dibundel menjadi empat belas volume tankōbon hingga bulan Agustus 2014. Sebuah sekuel yang berjudul Tokyo Ghoul:re mulai dimuat di majalah yang sama antara bulan Oktober 2014 hingga Juli 2018, dan kemudian dibundel menjadi enam belas volume tankōbon. Sebuah cerita prekuel bertajuk Tokyo Ghoul [Jack] dirilis secara daring di Jump Live.\n" +
                        "\n" +
                        "Sebuah adaptasi anime sebanyak 12 episode yang diproduksi oleh studio Pierrot ditayangkan di saluran Tokyo MX sejak tanggal 4 Juli 2014 hingga 19 September 2014. Musim kedua dengan jumlah 12 episode—berjudul Tokyo Ghoul √A (dieja menjadi Tokyo Ghoul Root A)—yang mengadaptasi cerita orisinal, ditayangkan sejak tanggal 9 Januari hingga 27 Maret 2015. Di Amerika Utara, Viz Media menerbitkan manga-nya sedangkan Funimation telah melisensi anime-nya untuk ditayangkan secara streaming dan distribusi video rumahan.\n" +
                        "\n" +
                        "Sebuah film laga hidup (live-action) yang didasarkan dari manga ini, dirilis di Jepang pada tanggal 29 Juli 2017. Adaptasi anime yang didasarkan dari manga sekuel Tokyo Ghoul:re, ditayangkan sejak tanggal 3 April 2018 dan berakhir pada tanggal 25 Desember 2018, dan dibagi menjadi dua musim. ");
                break;

            case "inuyashiki" :
                getJudul.setText("Inuyashiki");
                getGambar.setImageResource(R.drawable.inuyashiki);
                getKeterangan.setText("Inuyashiki (いぬやしき) adalah seri manga fiksi ilmiah Jepang yang ditulis dan diilustrasikan oleh Hiroya Oku. Inuyashiki memulai debutnya pada edisi Januari 2014 dari majalah manga seinen Kōdansha, Evening dan tamat pada Juli 2017. Kesepuluh volume kompilasi telah diterbitkan");
                break;

            case "sao" :
                getJudul.setText("Sword Art Online");
                getGambar.setImageResource(R.drawable.sao);
                getKeterangan.setText("Sword Art Online (ソードアート・オンライン Sōdo Āto Onrain) adalah seri novel ringan Jepang yang ditulis oleh Reki Kawahara dan diilustrasikan oleh ABEC. Serial ini berlangsung pada masa depan yang dekat dan berfokus pada berbagai dunia permainan virtual reality MMORPG . Sword Art Online mulai diterbitkan pada label ASCII Media Works Dengeki Bunko sejak 10 April 2009, dengan peluncuran seri spin-off di bulan Oktober 2012. Serial ini telah melahirkan lima adaptasi manga. Sebuah anime yang diproduksi oleh A-1 Pictures ditayangkan di Jepang antara Juli dan Desember 2012. Anime ini telah dilisensi di Amerika Utara oleh Aniplex of America dan versi bahasa Inggris mulai ditayangkan pada Adult Swim 's Toonami sejak 27 Juli 2013. Sebuah video game berdasarkan seri dirilis pada PlayStation Portable pada Maret 2013. ");
                break;

            case "kuroku" :
                getJudul.setText("Kuroko No Basket");
                getGambar.setImageResource(R.drawable.kuroko);
                getKeterangan.setText("Kuroko no Basket (bahasa Jepang: 黒子のバスケ), yang diterbitkan di Indonesia dengan judul Kuroko's Basketball, adalah sebuah seri manga shōnen Jepang yang ditulis dan diilustrasikan oleh Tadatoshi Fujimaki. Manga ini mulai dimuat dalam majalah Weekly Shōnen Jump sejak bulan Desember 2008 hingga September 2014, dan bab-bab tunggalnya telah dibundel menjadi 30 volume tankōbon oleh Shueisha. Ceritanya mengisahkan tentang tim bola basket SMA yang mencoba untuk bermain pada turnamen tingkat nasional.");
                break;

            case "haikyu" :
                getJudul.setText("Haikyuu");
                getGambar.setImageResource(R.drawable.haikyu);
                getKeterangan.setText("Haikyu!! (bahasa Jepang: ハイキュー!! Hepburn: Haikyū!!, dari huruf kanji 排球 terj. har. \"bola voli\"), yang diterbitkan di Indonesia dengan judul Haikyu!! Fly High! Volleyball!, adalah sebuah seri manga shōnen asal Jepang yang ditulis dan diilustrasikan oleh Haruichi Furudate. Bab-bab tunggalnya telah dimuat dalam majalah Weekly Shōnen Jump sejak bulan Februari 2012 hingga Juli 2020. Manga ini pada awalnya dirilis sebagai cerita one shot dalam majalah musiman Jump NEXT! milik Shueisha sebelum dimuat berseri. Per bulan Juli 2020, empat puluh lima volume tankōbon telah diterbitkan oleh Shueisha.\n" +
                        "\n" +
                        "Manga ini diadaptasi menjadi seri anime yang diproduksi oleh Production I.G, dan ditayangkan sejak bulan April hingga September 2014. Musim keduanya ditayangkan sejak bulan Oktober 2015 hingga Maret 2016. Musim ketiga ditayangkan sejak bulan Oktober hingga Desember 2016. Musim keempat ditayangkan sejak bulan Januari hingga April 2020.");
                break;

            case "goh" :
                getJudul.setText("The God of Highschool");
                getGambar.setImageResource(R.drawable.goh);
                getKeterangan.setText("The God of High School (Hangul: 갓 오브 하이 스쿨; RR: Gat Obeu Hai Seukul) adalah sebuah manhwa web Korea Selatan yang ditulis dan diilustrasikan oleh Yongje Park. Webtoon ini dirilis berseri pada platform Naver Webtoon milik Naver sejak bulan April 2011, dan telah diterbitkan oleh Imageframe di bawah imprint Root milik mereka menjadi satu volume hingga bulan April 2020. The God of High School menerima terjemahan resmi dalam bahasa Inggris oleh LINE Webtoon pada tahun 2014.");
                break;

            case "orange" :
                getJudul.setText("Orange");
                getGambar.setImageResource(R.drawable.orange);
                getKeterangan.setText("Orange (stylized as orange) is a Japanese romance manga series written and illustrated by Ichigo Takano, aimed at the shōjo and seinen demographics.[2][3] It was first serialized in 2012 in Bessatsu Margaret manga magazine and later in Monthly Action.[3] It has been compiled into 6 volumes as of 2017. Its chapters are published online in English by Crunchyroll and in print by Seven Seas Entertainment.[3] It is also published in France by Akata,[2] in Poland by Waneko,[4] and in Spain by Ediciones Tomodomo.[5] A live action film adaptation of the same name was released on December 12, 2015.[6] An anime television adaptation started to air in July 2016.[7] A spin-off to the manga began serialization on March 25, 2016, in the Monthly Action magazine published by Futabasha.[8] An anime theatrical film, titled Orange: Future, premiered in Japan on November 18, 2016.");
                break;

            case "hyouka" :
                getJudul.setText("Hyouka");
                getGambar.setImageResource(R.drawable.hyouka);
                getKeterangan.setText("Hyōka (氷菓 Es krim) adalah sebuah novel misteri Jepang yang ditulis oleh Honobu Yonezawa. Hyōka merupakan judul volume pertama dari seri Classic Literature Club. Lima volume lanjutan telah dipublikasikan antara tahun 2002 hingga 2016. Sebuah adaptasi manga yang dibuat oleh Taskohna memulai serialisasi di majalah Shōnen Ace edisi januari 2012. Sebuah adaptasi anime dengan 22 episode diproduksi oleh Kyoto Animation dan didireksi oleh Yasuhiro Takemoto tayang sejak 22 April hingga 16 September 2012.");
                break;
        }
    }
}
package com.example.belajarbahasa.Hewan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.belajarbahasa.R;

public class HewanActivity extends AppCompatActivity {

    ListView list;

    String [] namaHewan = {
            "Ayam Jago | Rooster",
            "Beruang | Bear",
            "Domba | Sheep",
            "Gajah | Elephant",
            "Kucing | Cat",
            "Kuda | Horse",
            "Ular | Snake"
    };

    int[] gambarHewan = {
            R.drawable.ayam,
            R.drawable.beruang,
            R.drawable.domba,
            R.drawable.gajah,
            R.drawable.kucing,
            R.drawable.kuda,
            R.drawable.ular,
    };

    int[] suaraHewan = {
            R.raw.ayam,
            R.raw.beruang,
            R.raw.domba,
            R.raw.gajah,
            R.raw.kucing,
            R.raw.kuda,
            R.raw.ular,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        list = findViewById(R.id.list_view_hewan);
        CustomeListAdapterHewan adapterHewan = new CustomeListAdapterHewan(HewanActivity.this, namaHewan, gambarHewan);
        list.setAdapter(adapterHewan);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer.create(HewanActivity.this, suaraHewan[position]).start();

                Intent pindah =new Intent(HewanActivity.this, DetailActivityHewan.class);
                pindah.putExtra(Konstanta_Hewan.DATANAMAHEWAN, namaHewan[position]);
                pindah.putExtra(Konstanta_Hewan.DATAGAMBARHEWAN, gambarHewan[position]);
                startActivity(pindah);
            }
        });
    }
}
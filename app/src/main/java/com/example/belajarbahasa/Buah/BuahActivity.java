package com.example.belajarbahasa.Buah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.belajarbahasa.Hewan.CustomeListAdapterHewan;
import com.example.belajarbahasa.R;

public class BuahActivity extends AppCompatActivity {

    ListView list;

    String [] namaBuah = {
            "Alpukat | Avocado",
            "Anggur | Grape",
            "Jambu | Guava",
            "Jeruk | Orange",
            "Mangga | Mango",
            "Pisang | Banana",
            "Semangka | Watermelon"
    };

    int[] gambarBuah = {
            R.drawable.alpukad,
            R.drawable.anggur,
            R.drawable.jambu,
            R.drawable.jeruk,
            R.drawable.manga,
            R.drawable.pisang,
            R.drawable.semangka,
    };

    int[] suaraBuah = {
            R.raw.alpukad,
            R.raw.anggur,
            R.raw.jambu,
            R.raw.jeruk,
            R.raw.manga,
            R.raw.pisang,
            R.raw.semangka,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        list = findViewById(R.id.list_view_hewan);
        CustomeListAdapterBuah adapterBuah = new CustomeListAdapterBuah(BuahActivity.this, namaBuah, gambarBuah);
        list.setAdapter(adapterBuah);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer.create(BuahActivity.this, suaraBuah[position]).start();

                Intent pindah =new Intent(BuahActivity.this, DetailActivityBuah.class);
                pindah.putExtra(Konstanta_Buah.DATANAMABUAH, namaBuah[position]);
                pindah.putExtra(Konstanta_Buah.DATAGAMBARBUAH, gambarBuah[position]);
                startActivity(pindah);
            }
        });
    }
}
package com.example.belajarbahasa.Buah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.belajarbahasa.R;

public class DetailActivityBuah extends AppCompatActivity {

    private static final String TAG = "DetailActivityBuah";

    TextView tvnamaBuah;
    ImageView ivnamaBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buah);

        String namabuah = getIntent().getStringExtra(Konstanta_Buah.DATANAMABUAH);
        int gambarbuah  = getIntent().getIntExtra(Konstanta_Buah.DATAGAMBARBUAH, 0);

        //membuat log
        Log.d(TAG, "Nama" + namabuah);
        Log.d(TAG, "Gambar" + gambarbuah);

        tvnamaBuah = findViewById(R.id.tv_detail_nama_buah);
        ivnamaBuah = findViewById(R.id.iv_detail_gambar_buah);

        tvnamaBuah.setText(namabuah);
        ivnamaBuah.setImageResource(gambarbuah);
    }
}
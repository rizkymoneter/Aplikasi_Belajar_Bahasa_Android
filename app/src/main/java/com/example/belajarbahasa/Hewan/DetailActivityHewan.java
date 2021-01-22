package com.example.belajarbahasa.Hewan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.belajarbahasa.R;

public class DetailActivityHewan extends AppCompatActivity {


    private static final String TAG = "DetailActivityHewan";

    TextView    tvnamaHewan;
    ImageView   ivnamaHewan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hewan);

        String namahewan = getIntent().getStringExtra(Konstanta_Hewan.DATANAMAHEWAN);
        int gambarhewan  = getIntent().getIntExtra(Konstanta_Hewan.DATAGAMBARHEWAN, 0);

        //membuat log
        Log.d(TAG, "Nama" + namahewan);
        Log.d(TAG, "Gambar" + gambarhewan);

        tvnamaHewan = findViewById(R.id.tv_detail_nama_hewan);
        ivnamaHewan = findViewById(R.id.iv_detail_gambar_hewan);

        tvnamaHewan.setText(namahewan);
        ivnamaHewan.setImageResource(gambarhewan);
    }
}
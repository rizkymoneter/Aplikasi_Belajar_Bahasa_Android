package com.example.belajarbahasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.belajarbahasa.Buah.BuahActivity;
import com.example.belajarbahasa.Hewan.HewanActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton btnHewan, btnBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHewan    = findViewById(R.id.btn_hewan);
        btnBuah     = findViewById(R.id.btn_buah);

        btnHewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panggil = new Intent(MainActivity.this, HewanActivity.class);
                startActivity(panggil);
            }
        });

        btnBuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panggil = new Intent(MainActivity.this, BuahActivity.class);
                startActivity(panggil);
            }
        });

    }
}
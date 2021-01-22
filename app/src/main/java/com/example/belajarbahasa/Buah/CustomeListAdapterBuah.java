package com.example.belajarbahasa.Buah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.belajarbahasa.R;

public class CustomeListAdapterBuah extends ArrayAdapter {

    private Context context;
    private String[] namabuah;
    private int[] gambarbuah;

    public CustomeListAdapterBuah(@NonNull Context context, String[] namabuah, int[] gambarbuah) {
        super(context, R.layout.item_buah, namabuah);
        this.context = context;
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater;
        View view =LayoutInflater.from(context).inflate(R.layout.item_buah, parent, false);

        TextView tvNamaHewan    = view.findViewById(R.id.tv_detail_nama_buah);
        ImageView ivGambarHewan = view.findViewById(R.id.iv_detail_gambar_buah);

        tvNamaHewan.setText(namabuah[position]);
        ivGambarHewan.setImageResource(gambarbuah[position]);

        return view;
    }
}

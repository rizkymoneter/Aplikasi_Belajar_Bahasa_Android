package com.example.belajarbahasa.Hewan;

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

public class CustomeListAdapterHewan extends ArrayAdapter {

    private Context context;
    private String[] namahewan;
    private int[] gambarhewan;

    public CustomeListAdapterHewan(@NonNull Context context, String[] namahewan, int[] gambarhewan) {
        super(context, R.layout.item_hewan, namahewan);
        this.context = context;
        this.namahewan = namahewan;
        this.gambarhewan = gambarhewan;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater;
        View view =LayoutInflater.from(context).inflate(R.layout.item_hewan, parent, false);

        TextView tvNamaHewan    = view.findViewById(R.id.tv_detail_nama_hewan);
        ImageView ivGambarHewan = view.findViewById(R.id.iv_detail_gambar_hewan);

        tvNamaHewan.setText(namahewan[position]);
        ivGambarHewan.setImageResource(gambarhewan[position]);

        return view;
    }
}

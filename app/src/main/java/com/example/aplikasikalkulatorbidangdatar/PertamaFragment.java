 package com.example.aplikasikalkulatorbidangdatar;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class PertamaFragment extends Fragment {
    private Button btnHasil;
    private EditText txt_panjang, txt_lebar;
    private TextView hasil, hasil2;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pertama,container,false);
        btnHasil= v.findViewById(R.id.btnHasil);
        txt_panjang = v.findViewById(R.id.txt_panjang);
        txt_lebar = v.findViewById(R.id.txt_lebar);
        hasil = v.findViewById(R.id.hasil);
        hasil2 = v.findViewById(R.id.hasil2);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nilai1 = txt_panjang.getText().toString();
                String Nilai2 = txt_lebar.getText().toString();

                if (Nilai1.isEmpty()) {
                    txt_panjang.setError("Data tidak boleh kosng!");
                    txt_panjang.requestFocus();
                } else if (Nilai2.isEmpty()) {
                    txt_lebar.setError("Data tidak boleh kosng!");
                    txt_lebar.requestFocus();
                } else {
                    Integer panjang = Integer.parseInt(Nilai1);
                    Integer lebar = Integer.parseInt(Nilai2);

                    Integer luas = panjang * lebar;
                    Integer keliling = 2 * panjang + 2 * lebar;
                    hasil.setText(String.valueOf(luas));
                    hasil2.setText(String.valueOf(keliling));
                }
            }

        });
        return v;
    }
}
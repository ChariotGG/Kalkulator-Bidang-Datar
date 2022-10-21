package com.example.aplikasikalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class KeduaFragment extends Fragment {
    private EditText txt_alas,txt_tinggi;
    private Button btnHasil;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kedua, container, false);
        txt_alas = v.findViewById(R.id.txt_alas);
        txt_tinggi = v.findViewById(R.id.txt_tinggi);
        btnHasil = v.findViewById(R.id.btnHasil);
        hasil = v.findViewById(R.id.btnHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nilai1 = txt_alas.getText().toString();
                String Nilai2 = txt_tinggi.getText().toString();

                if (Nilai1.isEmpty()) {
                    txt_alas.setError("Data tidak boleh kosng!");
                    txt_alas.requestFocus();
                } else if (Nilai2.isEmpty()) {
                    txt_tinggi.setError("Data tidak boleh kosng!");
                    txt_tinggi.requestFocus();
                } else {
                    Double alas = Double.parseDouble(Nilai1);
                    Double tinggi = Double.parseDouble(Nilai2);

                    Double luas = 0.5 * alas * tinggi;
                    hasil.setText(String.format("%.2f", luas));
                }
            }

        });
        return v;
    }
}
package com.example.dimasdwicahya.uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HasilNomorDua extends AppCompatActivity {
    private TextView mNama, mPenumpang, mHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_nomor_dua);
        mNama = findViewById(R.id.nama);
        mPenumpang = findViewById(R.id.penumpang);
        mHarga = findViewById(R.id.harga);

        String a = getIntent().getExtras().getString("Nama");
        String b = getIntent().getExtras().getString("Penumpang");
        String c = getIntent().getExtras().getString("Harga");

        mNama.setText(a);
        mPenumpang.setText(b);
        mHarga.setText(c);

        Toast.makeText(this,"Jangan lupa bayar sebelum 30 Februari ya", Toast.LENGTH_LONG).show();



    }
}

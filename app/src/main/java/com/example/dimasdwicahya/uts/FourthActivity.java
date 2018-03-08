package com.example.dimasdwicahya.uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    private TextView mNama,mHarga;
    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //referensi
        mNama = findViewById(R.id.nama);
        mHarga = findViewById(R.id.harga);

        //mengambil dari intent sebelumnya
        a = getIntent().getExtras().getString("Nama");
        b = getIntent().getExtras().getString("Hitung");

        //menampilkan ke textview
        mNama.setText(a);
        mHarga.setText(b);



    }
}

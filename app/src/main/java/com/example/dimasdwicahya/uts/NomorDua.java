package com.example.dimasdwicahya.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NomorDua extends AppCompatActivity {
    private Button mPesawat,mKereta;
    private EditText mIsiNama, mJumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomor_dua);

        //referensi
        mPesawat = findViewById(R.id.btPesawat);
        mKereta = findViewById(R.id.btKereta);
        mIsiNama = findViewById(R.id.isiNama);
        mJumlah = findViewById(R.id.Jumlah);

        mPesawat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String x = mIsiNama.getText().toString();
                String y = mJumlah.getText().toString();
                Integer harga = 500000;
                Integer jml = Integer.parseInt(y);
                Integer hitung = harga * jml;
                String z = String.valueOf(hitung);

                //arahkan ke intent
                Intent i = new Intent(NomorDua.this, HasilNomorDua.class);
                i.putExtra("Nama", x);
                i.putExtra("Penumpang", y);
                i.putExtra("Harga", z);

                //memulai kirim data ke activity lain
                startActivity(i);
            }
        });

        mKereta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String x = mIsiNama.getText().toString();
                String y = mJumlah.getText().toString();
                Integer harga = 300000;
                Integer jml = Integer.parseInt(y);
                Integer hitung = harga * jml;
                String z = String.valueOf(hitung);

                //arahkan ke intent
                Intent i = new Intent(NomorDua.this, HasilNomorDua.class);
                i.putExtra("Nama", x);
                i.putExtra("Penumpang", y);
                i.putExtra("Harga", z);

                //memulai kirim data ke activity lain
                startActivity(i);
            }
        });
    }




}

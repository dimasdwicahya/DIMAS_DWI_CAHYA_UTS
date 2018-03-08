package com.example.dimasdwicahya.uts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NomorTiga extends Activity {
    private EditText mNama, mJumlah, mKode;
    private Button mbtNext;
    private Integer harga;
    private String rHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomor_tiga);
        //referensi
        mbtNext = findViewById(R.id.btNext);
        mNama = findViewById(R.id.inputNama);
        mJumlah = findViewById(R.id.inputJumlah);
        mKode = findViewById(R.id.inputKode);


        mbtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //inisiasi
                String rNama = mNama.getText().toString();
                String rJml = mJumlah.getText().toString();
                String rKode = mKode.getText().toString();

                Integer rJumlah = Integer.parseInt(rJml);

                //cek dulu
                if (rKode.isEmpty()) {
                    harga = 1000;
                    Integer rHitung = rJumlah * harga;
                    rHasil = String.valueOf(rHitung);
                } else if (rKode.equals("tanggaltua")) {
                    harga = 1000;
                    Integer rHitung = rJumlah * harga;
                    double c = rHitung-(rHitung * 0.7);
                    rHasil = String.valueOf(c);
                } else {
                    harga = 1000;
                    Integer rHitung = rJumlah * harga;
                    rHasil = String.valueOf(rHitung);
                }




                //kirim
                Intent pindah = new Intent(NomorTiga.this, HasilNomorTiga.class);
                pindah.putExtra("Nama", rNama);
                pindah.putExtra("Jumlah", rJml);
                pindah.putExtra("Hasil", rHasil);
                pindah.putExtra("Kode", rKode);

                //eksekusi pindah
                startActivity(pindah);
            }
        });


    }
}

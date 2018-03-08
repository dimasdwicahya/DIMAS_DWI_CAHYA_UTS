package com.example.dimasdwicahya.uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HasilNomorTiga extends AppCompatActivity {
    private TextView mHasilNama, mHasilJumlah, mHasilHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_nomor_tiga);
        mHasilNama = findViewById(R.id.hasilnama);
        mHasilJumlah = findViewById(R.id.hasiljumlah);
        mHasilHarga = findViewById(R.id.hasilharga);


        String aa = getIntent().getExtras().getString("Nama");
        String bb = getIntent().getExtras().getString("Jumlah");
        String cc = getIntent().getExtras().getString("Hasil");

        String dd = getIntent().getExtras().getString("Kode");

        mHasilNama.setText(aa);
        mHasilJumlah.setText(bb);
        mHasilHarga.setText(cc);

        if(!dd.isEmpty()){
            Toast.makeText(this,"Selamat anda mendapat potongan sebesar 70%",Toast.LENGTH_SHORT).show();
        }


    }
}

package com.example.dimasdwicahya.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    EditText rIsiNama, rJumlah;
    int harga, jml, hitung;
    String a,b,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        //referensi
        rIsiNama = findViewById(R.id.isiNama);
        rJumlah = findViewById(R.id.Jumlah);
    }


    public void submitAksi(View view) {
        harga = 5000;
        //get data
        a = rIsiNama.getText().toString();
        b = rJumlah.getText().toString();
        jml = Integer.parseInt(b);
        hitung = harga * jml;
        c = String.valueOf(hitung);

        //masukan ke intent
        Intent intent = new Intent(ThirdActivity.this,FourthActivity.class);
        intent.putExtra("Nama",a);
        intent.putExtra("Hitung",c);
        startActivity(intent);


    }

}

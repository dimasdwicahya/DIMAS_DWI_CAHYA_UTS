package com.example.dimasdwicahya.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {
    RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1 = findViewById(R.id.rbNo1);
        rb2 = findViewById(R.id.rbNo2);
        rb3 = findViewById(R.id.rbNo3);
        rb4 = findViewById(R.id.rbNo4);

    }

    public void rbAksi(View view) {
        if(rb1.isChecked()){
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent);
        }
        else if(rb2.isChecked()){
            Intent intent = new Intent(MainActivity.this, NomorDua.class);
            startActivity(intent);

        }else if(rb3.isChecked()){
            Intent intent = new Intent(MainActivity.this, NomorTiga.class);
            startActivity(intent);

        }else if(rb4.isChecked()){
            Intent intent = new Intent(MainActivity.this, NomorEmpat.class);
            startActivity(intent);

        }else {
            finish();
        }

//        boolean checked;
//        checked = ((RadioButton) view).isChecked();
//        switch (view.getId()){
//            case R.id.rbLanjutkan:
//                if(checked){
//                    Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
//                    startActivity(intent);
//                    break;
//                }
//            case R.id.rbTidak:
//                if(checked){
//                    finish();
//                    break;
//                }

//        }


    }
}

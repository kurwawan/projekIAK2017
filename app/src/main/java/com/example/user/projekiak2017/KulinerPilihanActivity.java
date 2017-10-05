package com.example.user.projekiak2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class KulinerPilihanActivity extends AppCompatActivity {
    LinearLayout zsoto;
    LinearLayout zsambel;
    LinearLayout zjenang;
    LinearLayout zdodolsusu;
    LinearLayout ztahususu;
    LinearLayout zmentho;
    LinearLayout zjadah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_pilihan);

        zsoto = (LinearLayout) findViewById(R.id.soto);
        zsoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KulinerActivity.class);
                startActivity(intent);
            }
        });

        zsambel = (LinearLayout) findViewById(R.id.sambel);
        zsambel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KulinerSambelActivity.class);
                startActivity(intent);
            }
        });

        zjenang = (LinearLayout) findViewById(R.id.jenang);
        zjenang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KulinerJenangActivity.class);
                startActivity(intent);
            }
        });

        zdodolsusu = (LinearLayout) findViewById(R.id.dodolsusu);
        zdodolsusu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KulinerDodolActivity.class);
                startActivity(intent);
            }
        });

        ztahususu = (LinearLayout) findViewById(R.id.tahususu);
        ztahususu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KulinerTahuActivity.class);
                startActivity(intent);
            }
        });

        zmentho = (LinearLayout) findViewById(R.id.mentho);
        zmentho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KulinerMenthoActivity.class);
                startActivity(intent);
            }
        });

        zjadah = (LinearLayout) findViewById(R.id.jadah);
        zjadah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KulinerJadahActivity.class);
                startActivity(intent);
            }
        });
    }
}

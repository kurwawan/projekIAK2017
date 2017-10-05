package com.example.user.projekiak2017;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.sax.EndElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.Closeable;

public class MainActivity extends AppCompatActivity {
    RelativeLayout zmenuDef;
    RelativeLayout zmenuKul;
    RelativeLayout zmenuAsal;
    RelativeLayout zmenuSoal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zmenuDef = (RelativeLayout) findViewById(R.id.menuDef);
        zmenuKul = (RelativeLayout) findViewById(R.id.menuKul);
        zmenuAsal = (RelativeLayout) findViewById(R.id.menuAs);
        zmenuSoal = (RelativeLayout) findViewById(R.id.menuSoal);

        zmenuDef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DefinisiActivity.class);
                //zmenuDef.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_change_color));
                startActivity(intent);
            }
        });

        zmenuAsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getApplicationContext(), AsalActivity.class);
                startActivity(intent);
            }
        });

        zmenuKul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KulinerPilihanActivity.class);
                startActivity(intent);
            }
        });

        zmenuSoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KuisPilihanGanda.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "TIDAK BISA KEMBALI", Toast.LENGTH_SHORT).show();
    }
}


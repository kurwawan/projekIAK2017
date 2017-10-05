package com.example.user.projekiak2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class KuisPilihanGanda extends AppCompatActivity {

    TextView ztvSkor, ztvSoal;
    RadioGroup zrgPilihanJawaban;
    RadioButton zrbPilihanJawaban1, zrbPilihanJawaban2, zrbPilihanJawaban3;
    Button zbtnSubmit;

    int skor = 0;
    int arr;
    int x;
    String jawaban;

    SoalPilihanGanda soalPG = new SoalPilihanGanda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_pilihan_ganda);

        ztvSkor = (TextView) findViewById(R.id.tvSkor);
        ztvSoal = (TextView) findViewById(R.id.tvSoal);
        zrgPilihanJawaban = (RadioGroup) findViewById(R.id.rgPilihanJawaban);
        zrbPilihanJawaban1 = (RadioButton) findViewById(R.id.rbPilihanJawaban1);
        zrbPilihanJawaban2 = (RadioButton) findViewById(R.id.rbPilihanJawaban2);
        zrbPilihanJawaban3 = (RadioButton) findViewById(R.id.rbPilihanJawaban3);
        zbtnSubmit = (Button) findViewById(R.id.btnSubmit);

        ztvSkor.setText(" "+skor);
        setKonten();

        zbtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }
        });
    }

    public void setKonten()
    {
        zrgPilihanJawaban.clearCheck();
        arr = soalPG.pertanyaan.length;

        if(x >= arr)
        {
            String jumlahSkor = String.valueOf(skor);
            Intent x = new Intent(KuisPilihanGanda.this, HasilSkoring.class);
            x.putExtra("skorAkhir",jumlahSkor);
            x.putExtra("activity","PilihanGanda");
            startActivity(x);
        }
        else
        {
            ztvSoal.setText(soalPG.getPertanyaan(x));
            zrbPilihanJawaban1.setText(soalPG.getPilihanJawaban1(x));
            zrbPilihanJawaban2.setText(soalPG.getPilihanJawaban2(x));
            zrbPilihanJawaban3.setText(soalPG.getPilihanJawaban3(x));
            jawaban = soalPG.getJawabanBenar(x);
        }
        x++;
    }

    public void cekJawaban()
    {
        if(zrbPilihanJawaban1.isChecked())
        {
            if(zrbPilihanJawaban1.getText().toString().equals(jawaban))
            {
                skor = skor+10;
                ztvSkor.setText(" "+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }
            else
            {
                ztvSkor.setText(" "+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }
        else if(zrbPilihanJawaban2.isChecked())
        {
            if(zrbPilihanJawaban2.getText().toString().equals(jawaban))
            {
                skor = skor+10;
                ztvSkor.setText(" "+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }
            else
            {
                ztvSkor.setText(" "+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }
        else if(zrbPilihanJawaban3.isChecked())
        {
            if(zrbPilihanJawaban3.getText().toString().equals(jawaban))
            {
                skor = skor+10;
                ztvSkor.setText(" "+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }
            else
            {
                ztvSkor.setText(" "+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }
        else
        {
            Toast.makeText(this, "Pilih Jawaban Terlebih Dahulu !", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan Soal Terlebih Dahulu !", Toast.LENGTH_SHORT).show();
    }
}

package com.example.user.projekiak2017;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KulinerSambelActivity extends AppCompatActivity {
    WebView zwvSam;
    ViewPager ViewPagerSam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_sambel);

        zwvSam = (WebView) findViewById(R.id.wvSam);
        String text = "Makanan ini yang dominan di Boyolali karena sambal tumpang hampir mirip dengan\n" +
                "sambal goreng, tetapi di Boyolali namanya sambal tumpang. Khas dari makanan ini\n" +
                "menggunakan bahan tempe semangit yaitu tempe yang sudah menjamur selama 1 hari,\n" +
                "tetapi jangan khawatir tempe tersebut tidak beracun. Dan ada juga tahu kulit.\n" +
                "Ada dua varian yaitu pedas dan tidak pedas. Kalau pedas sambel tumpang ini \n" +
                "berwarna merah, kalau tidak pedas berwarna hijau keputihan. Masyarakat biasa \n" +
                "menyaptapnya menggunakan lontong dan bubur sumsum.";
        zwvSam.loadData("<p style=\"text-align: justify\">"+ text +"</p>","text/html", "UTF-8");

        ViewPagerSam = (ViewPager) findViewById(R.id.viewPagerSam);
        ViewPagerAdapterSam viewPagerAdapterSam = new ViewPagerAdapterSam(this);
        ViewPagerSam.setAdapter(viewPagerAdapterSam);


    }
}

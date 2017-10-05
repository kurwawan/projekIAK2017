package com.example.user.projekiak2017;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KulinerJenangActivity extends AppCompatActivity {
    WebView zwvJen;
    ViewPager ViewPagerJen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_jenang);

        zwvJen = (WebView) findViewById(R.id.wvJen);
        String text = "Kalian pasti udah pada tahu nama makanan satu ini yang sudah tidak asing lagi. \n" +
                "Tetaapi di Boyolali pecel ini disantap tidak menggunakan nasi melainkan dengan \n" +
                "bubur. Sayur - sayurannya pun masih sama dengan pecel pada umumnya. Biasanya Jenang \n" +
                "Pecel ini ditaburi dengan kripik dan gorengan. Harnganya sangat murah meriah. \n" +
                "Aneh kan? Tapi dijamin enak!";
        zwvJen.loadData("<p style=\"text-align: justify\">"+ text +"</p>","text/html", "UTF-8");

        ViewPagerJen = (ViewPager) findViewById(R.id.viewPagerJen);
        ViewPagerAdapterJen viewPagerAdapterJen = new ViewPagerAdapterJen(this);
        ViewPagerJen.setAdapter(viewPagerAdapterJen);
    }
}

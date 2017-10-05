package com.example.user.projekiak2017;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class KulinerMenthoActivity extends AppCompatActivity {
    WebView zwvMentho;
    ViewPager ViewPagerMentho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_mentho);

        zwvMentho = (WebView) findViewById(R.id.wvMentho);
        String text = "Mentho atau sering jg disebut lentho merupakan jajanan tradisional yg tentunya jg sering dijual \n" +
                "di pasar tradisional tapi sekarang jg sudah banyak dijual di toko oleh-oleh di Boyolali. Bagi \n" +
                "orang boyolali makan ini tentunya tidak asing lagi. Camilan rakyat, enak, murah meriah. Mentho \n" +
                "terdiri dari mentho basah dan kering, jg ada 2 bahan dasar kacang tanah atau mentho kacang tholo \n" +
                "(bahasa indonesianya gak tau) emoticon-Hammer (S), Mentho jg ada yg berbentuk bulat dan ada yg gepeng. \n" +
                "Biasanya yg berbentuk bulat memakai kacang tholo.";
        zwvMentho.loadData("<p style=\"text-align: justify\">"+ text +"</p>","text/html", "UTF-8");

        ViewPagerMentho = (ViewPager) findViewById(R.id.viewPagerMentho);
        ViewPagerAdapterMentho viewPagerAdapterMentho = new ViewPagerAdapterMentho(this);
        ViewPagerMentho.setAdapter(viewPagerAdapterMentho);
    }
}

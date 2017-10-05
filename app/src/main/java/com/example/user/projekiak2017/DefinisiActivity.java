package com.example.user.projekiak2017;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DefinisiActivity extends AppCompatActivity {
    WebView zwvDef;
    ViewPager ViewPagerDef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definisi);

        zwvDef = (WebView) findViewById(R.id.wvDef);

        String text = "Kabupaten Boyolali adalah sebuah kabupaten di Provinsi Jawa Tengah. \n" +
                "Pusat administrasi berada di Kemiri Kecamatan Mojosongo, terletak \n" +
                "sekitar 25 km sebelah barat Kota Surakarta. Kabupaten ini berbatasan \n" +
                "dengan Kabupaten Semarang dan Kabupaten Grobogan di utara; Kabupaten \n" +
                "Sragen, Kabupaten Karanganyar, Kabupaten Sukoharjo, dan Kota \n" +
                "Surakarta (Solo) di timur; Kabupaten Klaten dan Daerah Istimewa \n" +
                "Yogyakarta di selatan; serta Kabupaten Magelang dan Kabupaten Semarang \n" +
                "di barat. Kabupaten ini termasuk kawasan Solo Raya.\n" +
                "Kabupaten boyolali juga memiliki ciri khas tempat yang bisa untuk di \n" +
                "jadikan wisata, kuliner, dll yaitu Alun Alun Kabupaten Boyolali. Di \n" +
                "tempat ini terdapat berbagai macam gedung yaitu mulai dari gedung \n" +
                "pemerintahan setempat serta tempat monumen ibadah dari masing - masing agama \n" +
                "yang ada di Indonesia.\n" +
                "\n";
        zwvDef.loadData("<p style=\"text-align: justify\">"+ text +"</p>","text/html", "UTF-8");

        ViewPagerDef = (ViewPager) findViewById(R.id.viewPagerDef);
        ViewPagerAdapterDef viewPagerAdapterDef = new ViewPagerAdapterDef(this);
        ViewPagerDef.setAdapter(viewPagerAdapterDef);

    }
}

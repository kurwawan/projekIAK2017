package com.example.user.projekiak2017;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KulinerJadahActivity extends AppCompatActivity {
    WebView zwvJadah;
    ViewPager ViewPagerJadah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_jadah);

        zwvJadah = (WebView) findViewById(R.id.wvJadah);
        String text = "Kuliner Boyolali yang satu ini sangat wajib kamu coba yakni Jadah bakar. Kuliner boyolali ini \n" +
                "terbuat dari beras ketan putih dan kelapa. Kuliner jadah bakar ini semakin populer sejak adanya \n" +
                "jalur Solo ke Borobudur, karena dengan adanya jalur tersebut banyak para wisatawan yang datang ke \n" +
                "tempat wisata kuliner Boyolali ini untuk menikmati hidangan lezatnya. Biasanya kuliner Boyolali \n" +
                "ini dibakar di atas tungku arang dan langsung dinikmati dalam keadaan masih panas, apalagi akan \n" +
                "terasa lebih niikmat jika ditemani dengan teh manis. Harga kuliner Boyolali yang satu ini memang \n" +
                "benar-benar terjangkau dan sangat murah, kamu bisa menikmati kuliner enak yang satu ini hanya dengan \n" +
                "harga Rp 1.500 per potongnya.";
        zwvJadah.loadData("<p style=\"text-align: justify\">"+ text +"</p>","text/html", "UTF-8");

        ViewPagerJadah = (ViewPager) findViewById(R.id.viewPagerJadah);
        ViewPagerAdapterJadah viewPagerAdapterJadah = new ViewPagerAdapterJadah(this);
        ViewPagerJadah.setAdapter(viewPagerAdapterJadah);
    }
}

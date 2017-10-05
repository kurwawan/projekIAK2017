package com.example.user.projekiak2017;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KulinerTahuActivity extends AppCompatActivity {
    WebView zwvTahu;
    ViewPager ViewPagerTahu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_tahu);

        zwvTahu = (WebView) findViewById(R.id.wvTahu);
        String text = "Tahu susu bukanlah makanan yang terbuat dari tahu yang dicampur susu sapi, atau tahu yang \n" +
                "bisa mengeluarkan susu. Namun, kuliner asli Boyolali ini terbuat dari susu sapi yang baru \n" +
                "melahirkan. Susu sapi yang baru melahirkan ini tidak laku dijual, selain berwarna kuning \n" +
                "juga baunya sangat amis. Tapi kandungan gizinya sangat tinggi. Sayangkan bila dibuang. \n" +
                "Masyarakat kemudian mengolahnya menjadi cemilan langka yang hanya didapat saat sapi melahirkan. \n" +
                "Cara membuatnya pun tidaklah sulit. Susu sapi yang baru melahirkan diperas, diberi bumbu \n" +
                "tradisional, seperti ketumbar, bawang putih, dan garam. Bumbu-bumbu tersebut dihaluskan dan \n" +
                "dicampur dengan susu sapi. Setelah itu dikukus hingga matang. Setelah matang, baru dipotong-potong \n" +
                "sesuai selera dan digoreng.";
        zwvTahu.loadData("<p style=\"text-align: justify\">"+ text +"</p>","text/html", "UTF-8");

        ViewPagerTahu = (ViewPager) findViewById(R.id.viewPagerTahu);
        ViewPagerAdapterTahu viewPagerAdapterTahu = new ViewPagerAdapterTahu(this);
        ViewPagerTahu.setAdapter(viewPagerAdapterTahu);
    }
}

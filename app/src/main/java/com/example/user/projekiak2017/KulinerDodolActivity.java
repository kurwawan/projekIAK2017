package com.example.user.projekiak2017;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KulinerDodolActivity extends AppCompatActivity {
    WebView zwvDodol;
    ViewPager ViewPagerDodol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_dodol);

        zwvDodol = (WebView) findViewById(R.id.wvDodol);
        String text = "Secara umum Dodol Susu Merapi khas Boyolali ini nggak jauh bedalah sama dodol lainnya, \n" +
                "tapi rasa dan bahan tambahan yang membedakannya. Dodol Susu Merapi ini menggunakan \n" +
                "susu sapi murni sebagai bahan tambahan. Seperti yang kita ketahui, susu sapi memiliki \n" +
                "banyak manfaat bagi tubuh. Selain banyak manfaatnya, susu sapi rasanya juga lezat gan! \n" +
                "Bagaimana rasa Dodol Susu Merapi khas Boyolali ini gan? Jangan ditanya gan, rasa Dodol \n" +
                "Susu Merapi buatan Selo – Boyolali ini mantap surantap!! Dodol Susu Merapi ini bentuknya \n" +
                "sama seperti dodol biasa dengan warna cokelat muda. Rasanya nikmat banget dan dapat \n" +
                "digambarkan dalam tiga kata: kenyal, manis, dan gurih! Bayangkan saja kenikmatan dodol \n" +
                "yang kenyal dan manis ini dipadukan dengan kelezatan dan gurihnya susu sapi murni \n" +
                "berkualitas…hmm… yummy banget pokoknya!";
        zwvDodol.loadData("<p style=\"text-align: justify\">"+ text +"</p>","text/html", "UTF-8");

        ViewPagerDodol = (ViewPager) findViewById(R.id.viewPagerDodol);
        ViewPagerAdapterDodol viewPagerAdapterDodol = new ViewPagerAdapterDodol(this);
        ViewPagerDodol.setAdapter(viewPagerAdapterDodol);
    }
}

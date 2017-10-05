package com.example.user.projekiak2017;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

///Soto Activity

public class KulinerActivity extends AppCompatActivity {

    ViewPager viewPager;
    WebView zwv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);

        zwv = (WebView) findViewById(R.id.wv);
        String text = "Soto ini khas milik daerah Boyolali yang memiliki kuah yang agak bening\n" +
                "dengan perpaduan pelengkap. Kuahnya dicampur dengan kaldu sapi dan kaldu ayam\n" +
                "sehingga rasa gurih dan nikmatnya sangat nikmat. Dengan potongan daging sapi/ayam\n" +
                "serta sumsum yang membuat soto ini semakin lexat untuk disantap. \n" +
                "Soto ini memiliki dua warna kaldu yaitu ada yang pucat dengan kaldu ayam \n" +
                "dan ada yang berwarna kecoklatan dengan kaldu sapi. Penyajian menggunakan mangkuk\n" +
                "ukuran sedang. Soto ini terdapat juga tauge, taburan daun sledri dan bawang goreng,\n" +
                "bihun, dan dagingnya. Terdapat juga yang khas menggunakan lauk tambahan seperti\n" +
                "sate ati, tahu goreng, dan mendoan.";
        zwv.loadData("<p style=\"text-align: justify\">"+ text +"</p>","text/html", "UTF-8");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
    }
}

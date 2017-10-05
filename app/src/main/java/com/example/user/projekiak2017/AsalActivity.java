package com.example.user.projekiak2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AsalActivity extends AppCompatActivity {
    WebView zwvAsal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asal);

        zwvAsal = (WebView) findViewById(R.id.wvAsal);

        String text = "Setelah melakukan kesalahan dan melanjutkan perjalanan ke timur, dijalan \n" +
                "sang Nyai Pandan Arang menyesali mengapa harus mebawa perhiasan yang banyak… \n" +
                "beliau ingin melupakan masalah perampokan yang terjadi disalatiga kemaren…. \n" +
                "Beliau pun berguman sepanjang jalan … MBOYOLALI YA MBOKYOLALI YA… (dalam \n" +
                "bahasa Indonesia semoga lupa. Semoga lupa) dan terdengar oleh Kyai Pandan Arang. \n" +
                "Maka berkatlah sang Kai pandan arang : mengko yen kene iki dadi rejo tak \n" +
                "jenengi kutha iki kutho mboyolali (dalam bahasa Indonesia kira kira begini: \n" +
                "nanti kalo daerah ini menjadi rame dan menjadi kota, diriku namakan kota ini \n" +
                "kota boyolali) Dan karena masih agak jengkel dengan Nyai Pandan Arang maka \n" +
                "sang Kyai Pandan Arang mepercepat langkahnya….. dan karena ketinggalan Nyai \n" +
                "pandan alas bertanya pada penduduk sekitar dimanakah Kyai Pndan Arang? Ooo teras… \n" +
                "kata penduduk sekitar… (teras adalah bahasa halus untuk terus dalam bahasa jawa?) \n" +
                "nah kalo itu menjadi nama kota kecamatan dimana diriku dilahirkan…. Dan akhirnya \n" +
                "rombongan Kyai pandan Arang akhirnya bermukin di klaten, dan tepatnya di Tembayat \n" +
                "terdapat makam Syech Domba yang kepalanya sudah berwujud manusia lagi… dah gitu deh critanya selesai deh!!";
        zwvAsal.loadData("<p style=\"text-align: justify\">"+ text +"</p>","text/html", "UTF-8");
    }
}

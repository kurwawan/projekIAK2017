package com.example.user.projekiak2017;

/**
 * Created by user on 28/08/2017.
 */

public class SoalPilihanGanda {

    public String pertanyaan[] =
    {
            "Kabupaten Boyolali berdekatan dengan kota?",
            "Asal usul Boyolali dikisahkan melalui tokoh ...",
            "Makanan yang menggunakan kuah bening dengan kaldu sapi/ayam adalah makanan ...",
            "Sambel Tumpang menggunakan bahan dasar ...",
            "Pecel khas Boyolali hidangan sampingannya menggunakan ...",
            "Makanan manisan khas Boyolali bernama ...",
            "Tahu khas dari Boyolali dicampur menggunakan ...",
            "Mentho khas Boyolali menggunakan bahan dasar ...",
            "Kuliner Jadah di Boyolali dimasak dengan cara di ...",
            "Kabupaten Boyolali terkenal dengan hewan ternak ...",
    };

    private String pilihanJawaban[][] = {
            {"Solo","Jakarta","Bandung"},
            {"Imam Bonjol","Nyai Pandan Arang","Jaka Tarub"},
            {"Ayam Goreng","Pizza Keju","Soto Daging Bening"},
            {"Kertas","Tempe","Bebek"},
            {"Jenang","Kayu Manis","Nasi Merah"},
            {"Sale Pisang","Dodol Jahe","Dodol Susu"},
            {"Susu Kedelai","Susu Sapi","Susu Kuda"},
            {"Kacang Tholo","Kacang Panjang","Kacang Mete"},
            {"Goreng","Rebus","Bakar"},
            {"Anjing","Anaconda","Sapi"},
    };

    private String jawabanBenar[] = {
            "Solo",
            "Nyai Pandan Arang",
            "Soto Daging Bening",
            "Tempe",
            "Jenang",
            "Dodol Susu",
            "Susu Sapi",
            "Kacang Tholo",
            "Bakar",
            "Sapi",
    };



    public String getPertanyaan(int x) {
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPilihanJawaban1(int x) {
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2(int x) {
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x) {
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }


    public String getJawabanBenar(int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}

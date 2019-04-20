package com.example.fujimiya.komering;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

import java.util.ArrayList;

public class KuisActivity extends AppCompatActivity {

    ArrayList<String> Soalisi = new ArrayList<String>();
    ArrayList<String> jwbA = new ArrayList<String>();
    ArrayList<String> jwbB = new ArrayList<String>();
    ArrayList<String> jwbC = new ArrayList<String>();
    ArrayList<String> jwbD = new ArrayList<String>();
    ArrayList<String> kunciJwb = new ArrayList<String>();

    int posisi = 0;
    int nilai = 0;

    private ActionBar actionBar;
    JustifiedTextView Soal;
    TextView a,b,c,d,ket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        actionBar = getSupportActionBar();


        Soal = findViewById(R.id.Soal);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        ket = findViewById(R.id.ket);
//
//        String isi = "<p style = \"text-align:justify;\">Apakah nama pakaian adat pengantin pria dan wanita yang sering dipakai suku Daya?</p>";
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            Soal.setText(Html.fromHtml(""+isi, Html.FROM_HTML_MODE_COMPACT));
//        } else {
//            Soal.setText(Html.fromHtml(""+isi));
//        }

//        Soal.setText("Apakah nama pakaian adat pengantin pria dan wanita yang sering dipakai suku Daya?");
////        Soal.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);

        Soalisi.add("Apakah nama pakaian adat pengantin pria dan wanita yang sering dipakai suku Daya?");
        Soalisi.add("Apakah yang dimaksud Siang-Siangan dengan bujang gadis komering suku daya?");
        Soalisi.add("Manakah bahan yang termasuk dalam rumah adat?");
        Soalisi.add("Apa saja yang termasuk dalam upacara adat pernikahan?");
        Soalisi.add("Apa saja huruf yang termasuk dalam aksara Komering Suku Daya?");
        Soalisi.add("Manakah yang termasuk dalam tarian tradisional Komering Suku Daya?");
        Soalisi.add("Manakah yang termasuk dalam alat musik tradisional Komering Suku Daya?");
        Soalisi.add("Manakah yang termasuk dalam musik daerah Komering Suku Daya ?");
        Soalisi.add("Apakah bahasa daya dari jalan-jalan?");
        Soalisi.add("Manakah yang termasuk dalam lagu daerah Komering Suku Daya?");

        jwbA.add("A. Aesen Gede");
        jwbA.add("A. Acara makan bersama");
        jwbA.add("A. Kayu/ papan");
        jwbA.add("A. Mempung, Akad Nikah, Arak-arakan");
        jwbA.add("A. Bi, Ho, Ta");
        jwbA.add("A. Tari Kecak");
        jwbA.add("A. Kelingtang, Gamolan, Gong(Gung)");
        jwbA.add("A. Canggot");
        jwbA.add("A. Lapah");
        jwbA.add("A. Umbay Akas");

        jwbB.add("B. Kain Songket");
        jwbB.add("B. Acara melepas masa bujang gadis");
        jwbB.add("B. Atap rumah dari genteng");
        jwbB.add("B. Akad Nikah");
        jwbB.add("B. Ka, Li, Bu");
        jwbB.add("B. Tari Sembah");
        jwbB.add("B. Gitar, Suling");
        jwbB.add("B. ADI-ADI");
        jwbB.add("B. Midoq-midoq");
        jwbB.add("B. Sang Bumi Ruwa Jurai");

        jwbC.add("C. Baju Kurung");
        jwbC.add("C. A dan B Benar");
        jwbC.add("C. Sambungan Kayu tidak menggunakan paku");
        jwbC.add("C. Mempung, arak-arakan");
        jwbC.add("C. Ka, Ga, Nga");
        jwbC.add("C. Tari Saman");
        jwbC.add("C. Piono, Angklung");
        jwbC.add("C. A dan B Benar");
        jwbC.add("C. Dehuma");
        jwbC.add("C. Bubuy Bulan");

        jwbD.add("D. Semua salah");
        jwbD.add("D. A dan B salah");
        jwbD.add("D. A, B, C Benar");
        jwbD.add("D. Arak-arakan");
        jwbD.add("D. A dan B benar");
        jwbD.add("D. Tari Tanggai");
        jwbD.add("D. Drum, Gong");
        jwbD.add("D. A dan B salah");
        jwbD.add("D. Mulang");
        jwbD.add("D. Anak Daro");


        kunciJwb.add("A. Aesen Gede");
        kunciJwb.add("C. A dan B Benar");
        kunciJwb.add("D. A, B, C Benar");
        kunciJwb.add("A. Mempung, Akad Nikah, Arak-arakan");
        kunciJwb.add("C. Ka, Ga, Nga");
        kunciJwb.add("D. Tari Tanggai");
        kunciJwb.add("A. Kelingtang, Gamolan, Gong(Gung)");
        kunciJwb.add("B. ADI-ADI");
        kunciJwb.add("B. Midoq-midoq");
        kunciJwb.add("A. Umbay Akas");


        actionBar.setTitle("KUIS - "+(posisi+1)+" dari "+ (Soalisi.size()));
        Soal.setText(""+Soalisi.get(posisi));
        a.setText(""+jwbA.get(posisi));
        b.setText(""+jwbB.get(posisi));
        c.setText(""+jwbC.get(posisi));
        d.setText(""+jwbD.get(posisi));



    }

    public void selanjutnya(View view) {
        posisi++;
        if((posisi) < Soalisi.size()){
            a.setVisibility(View.VISIBLE);
            b.setVisibility(View.VISIBLE);
            c.setVisibility(View.VISIBLE);
            d.setVisibility(View.VISIBLE);

            Soal.setText(""+Soalisi.get(posisi));
            actionBar.setTitle("KUIS - "+(posisi+1)+" dari "+ (Soalisi.size()));
            a.setText(""+jwbA.get(posisi));
            b.setText(""+jwbB.get(posisi));
            c.setText(""+jwbC.get(posisi));
            d.setText(""+jwbD.get(posisi));
            if(posisi == 9){
                ket.setText("Selesai");
            }
        }
//        if((posisi+1) == Soalisi.size()){
//
////            Soal.setText(""+Soalisi.get(posisi));
//            actionBar.setTitle("KUIS - "+(posisi+1)+" dari "+ (Soalisi.size()));
////            a.setText(""+jwbA.get(posisi));
////            b.setText(""+jwbB.get(posisi));
////            c.setText(""+jwbC.get(posisi));
////            d.setText(""+jwbD.get(posisi));
//        }
        if((posisi) == Soalisi.size()){
//            Toast.makeText(KuisActivity.this,""+nilai,Toast.LENGTH_SHORT).show();
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    this);

            // set title dialog
            alertDialogBuilder.setTitle("HASIL KUIS");

            // set pesan dari dialog
            alertDialogBuilder
                    .setMessage("Poin Kuis Anda : "+nilai)
                    .setIcon(R.drawable.logokuokus)
                    .setCancelable(false)
                    .setPositiveButton("OK",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            // jika tombol diklik, maka akan menutup activity ini
                            finish();
                            startActivity(new Intent(getApplicationContext(), MenuUtamaActivity.class));
                        }
                    });

            // membuat alert dialog dari builder
            AlertDialog alertDialog = alertDialogBuilder.create();

            // menampilkan alert dialog
            alertDialog.show();
        }



    }

    public void aklik(View view) {
        if(jwbA.get(posisi).equals(kunciJwb.get(posisi))){
            nilai+=10;
        }
        b.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        d.setVisibility(View.INVISIBLE);
    }

    public void bklik(View view) {
        if(jwbB.get(posisi).equals(kunciJwb.get(posisi))){
            nilai+=10;
        }
        a.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        d.setVisibility(View.INVISIBLE);
    }

    public void cklik(View view) {
        if(jwbC.get(posisi).equals(kunciJwb.get(posisi))){
            nilai+=10;
        }
        a.setVisibility(View.INVISIBLE);
        b.setVisibility(View.INVISIBLE);
        d.setVisibility(View.INVISIBLE);
    }

    public void dklik(View view) {
        if(jwbD.get(posisi).equals(kunciJwb.get(posisi))){
            nilai+=10;
        }
        a.setVisibility(View.INVISIBLE);
        b.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
            startActivity(new Intent(getApplicationContext(), MenuUtamaActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        startActivity(new Intent(getApplicationContext(), MenuUtamaActivity.class));
    }

}

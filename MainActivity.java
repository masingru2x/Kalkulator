package com.example.petera.kalkulator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //    Membuat variable Edit Text
    EditText enterAngka;

    //    Membuat variable Button, untuk kelompok operator
    Button buttonTambah, buttonKurang, buttonBagi, buttonKali, buttonSama;

    //    Membuat variable Button untuk membersihkan
    Button buttonClear;

    //    Membuat variable Button untuk input angka
    Button button1, button2, button3,button4,button5,button6,button7,button8,button9,button0;

    //    Membuat variable Button menuju ke aktivity tentang
    Button buttonTentang;

    //    Mendaftarkan variable double, nama : nilai untuk menyimpan nilai input angka dari user
    public static  double nilai = 0;

    //    Mendaftarkan variable String, nama : operasi untuk menyimpan pilihan
    public static String operasi = "";

    //    Mendaftarkan variable double, nama : hasil untuk hasil akhir
    public static double hasil=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Memanggil method operasihitung
        operasihitung();

//        Membuat variable buttonTentang agar memiliki fungsi sama dengan
//        id buttonTentang di activity_main.xml
        buttonTentang = findViewById(R.id.buttonTentang);

//        Membuat buttonTentang dapat dilik
        buttonTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Membuat intent agar buttonTentang jika di klik nanti menuju ke Tentang.class
                Intent i = new Intent(MainActivity.this, Tentang.class);
//                Menjalankan Intent
                startActivity(i);
            }
        });
    }

    //    Method dengan nama operasihitung yang akan dipanggil ke onCreate
    void operasihitung(){

//        Membuat variable enterAngka agar memiliki fungsi sama dengan
//        id editText2 di activity_main.xml
        enterAngka = findViewById(R.id.editText2);

//        Membuat variable button0 sampai button9 agar memiliki fungsi sama dengan
//        id button0 sampai button9 sesuai dengan yang dinginkan di activity_main.xml
//        dan dapat di klik
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);

//        Membuat variable operasi agar memiliki fungsi sama dengan
//        id Button operasi di activity_main.xml dan dapat di klik
        buttonTambah = findViewById(R.id.buttonTambah);
        buttonTambah.setOnClickListener(this);
        buttonKali= findViewById(R.id.buttonKali);
        buttonKali.setOnClickListener(this);
        buttonKurang = findViewById(R.id.buttonKurang);
        buttonKurang.setOnClickListener(this);
        buttonBagi= findViewById(R.id.buttonBagi);
        buttonBagi.setOnClickListener(this);
        buttonSama= findViewById(R.id.buttonSama);
        buttonSama.setOnClickListener(this);

//        Membuat variable buttonClear agar memiliki fungsi sama dengan
//        id buttonC di activity_main.xml dan dapat di klik
        buttonClear= findViewById(R.id.buttonC);
        buttonClear.setOnClickListener(this);

    }


    //    Method agar saat button diklik memiliki fungsi
    @Override
    public void onClick(View v) {

//        Fungsi pemilihan
        switch (v.getId()) {

//            Pemilihan button agar saat mengklik button memunculkan angka yang diinginkan
            case R.id.button0:
                enterAngka.setText(enterAngka.getText().toString().trim() + "0");
                break;
            case R.id.button1:
                enterAngka.setText(enterAngka.getText().toString().trim() + "1");
                break;
            case R.id.button2:
                enterAngka.setText(enterAngka.getText().toString().trim() + "2");
                break;
            case R.id.button3:
                enterAngka.setText(enterAngka.getText().toString().trim() + "3");
                break;
            case R.id.button4:
                enterAngka.setText(enterAngka.getText().toString().trim() + "4");
                break;
            case R.id.button5:
                enterAngka.setText(enterAngka.getText().toString().trim() + "5");
                break;
            case R.id.button6:
                enterAngka.setText(enterAngka.getText().toString().trim() + "6");
                break;
            case R.id.button7:
                enterAngka.setText(enterAngka.getText().toString().trim() + "7");
                break;
            case R.id.button8:
                enterAngka.setText(enterAngka.getText().toString().trim() + "8");
                break;
            case R.id.button9:
                enterAngka.setText(enterAngka.getText().toString().trim() + "9");
                break;

//                Pemilihan operasi yang ingin digunakan
            case R.id.buttonTambah:
//                Jika enterAngka tidak ada isinya (null) maka nanti akan memunculkan pesan
//                Jika tidak akan melakukan operasi
                if (enterAngka.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                }else {
                    nilai = Double.parseDouble(enterAngka.getText().toString().trim());
                    operasi = "tambah";
                    enterAngka.setText("");
                }
                break;
            case R.id.buttonKurang:
                if (enterAngka.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                }else {
                    nilai = Double.parseDouble(enterAngka.getText().toString().trim());
                    operasi = "kurang";
                    enterAngka.setText("");
                }
                break;
            case R.id.buttonBagi:
                if (enterAngka.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                }else {
                    nilai = Double.parseDouble(enterAngka.getText().toString().trim());
                    operasi = "bagi";
                    enterAngka.setText("");
                }
                break;
            case R.id.buttonKali:
                if (enterAngka.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                }else {
                    operasi = "kali";
                    nilai = Double.parseDouble(enterAngka.getText().toString().trim());
                    enterAngka.setText("");
                }
                break;

//                Agar enterAngka menjadi kosong
            case R.id.buttonC:
                nilai = 0;
                hasil = 0.0;
                enterAngka.setText("");
                break;

//                Untuk melakukan operasi akhir
            case R.id.buttonSama:

                if(operasi.equals("tambah")) {
                    if (enterAngka.getText().toString().isEmpty())
                    {
                        Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    }else {
                        hasil = nilai + Double.parseDouble(enterAngka.getText().toString().trim());
                    }
                }

                if(operasi.equals("kurang"))
                {
                    if (enterAngka.getText().toString().isEmpty())
                    {
                        Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    }else {
                        hasil = nilai - Double.parseDouble(enterAngka.getText().toString().trim());
                    }
                }
                if(operasi.equals("bagi"))
                {
                    if (enterAngka.getText().toString().isEmpty())
                    {
                        Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    }else {
                        hasil = nilai / Double.parseDouble(enterAngka.getText().toString().trim());
                    }
                }
                if(operasi.equals("kali"))
                {
                    if (enterAngka.getText().toString().isEmpty())
                    {
                        Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    }else {
                        hasil = nilai * Double.parseDouble(enterAngka.getText().toString().trim());
                    }
                }

                int total = (int) hasil;

                if (total == hasil){
                    enterAngka.setText(String.valueOf((int) hasil));
                }else {
                    enterAngka.setText(String.valueOf(hasil));
                }

                break;

        }
    }
}

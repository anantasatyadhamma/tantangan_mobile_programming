package com.ananta.tantanganmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val logic = Logic();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1 = edtNilai1.text;
        val n2 = edtNilai2.text;
        val n3 = edtNilai3.text;
        val n4 = edtNilai4.text;

        btnplus.setOnClickListener {
            if(edtNilai1.text.toString().trim()==""){
                edtNilai1.setError("Harus diisi!")
            }else if(edtNilai2.text.toString().trim()==""){
                edtNilai2.setError("Harus diisi!")
            }else if(edtNilai3.text.toString().trim()==""){
                edtNilai3.setError("Harus diisi!")
            }else if(edtNilai4.text.toString().trim()==""){
                edtNilai4.setError("Harus diisi!")
            }else {
                txthasil.text = "Hasil Pertambahan = " +
                        "${logic.tambah(
                            n1.toString().toDouble(),
                            n2.toString().toDouble(),
                            n3.toString().toDouble(),
                            n4.toString().toDouble()
                        )}"
            }

        }
        btnmin.setOnClickListener {
            if(edtNilai1.text.toString().trim()==""){
                edtNilai1.setError("Harus diisi!")
            }else if(edtNilai2.text.toString().trim()==""){
                edtNilai2.setError("Harus diisi!")
            }else if(edtNilai3.text.toString().trim()==""){
                edtNilai3.setError("Harus diisi!")
            }else if(edtNilai4.text.toString().trim()==""){
                edtNilai4.setError("Harus diisi!")
            }else {
                txthasil.text = "Hasil Pengurangan = " +
                        "${
                            logic.min(
                                n1.toString().toDouble(),
                                n2.toString().toDouble(),
                                n3.toString().toDouble(),
                                n4.toString().toDouble()
                            )
                        }"
            }
        }
        btnkali.setOnClickListener {
            if(edtNilai1.text.toString().trim()==""){
                edtNilai1.setError("Harus diisi!")
            }else if(edtNilai2.text.toString().trim()==""){
                edtNilai2.setError("Harus diisi!")
            }else if(edtNilai3.text.toString().trim()==""){
                edtNilai3.setError("Harus diisi!")
            }else if(edtNilai4.text.toString().trim()==""){
                edtNilai4.setError("Harus diisi!")
            }else {
                txthasil.text = "Hasil Perkalian = " +
                        "${
                            logic.kali(
                                n1.toString().toDouble(),
                                n2.toString().toDouble(),
                                n3.toString().toDouble(),
                                n4.toString().toDouble()
                            )
                        }"
            }
        }
        btnbagi.setOnClickListener {
            if(edtNilai1.text.toString().trim()==""){
                edtNilai1.setError("Harus diisi!")
            }else if(edtNilai2.text.toString().trim()==""){
                edtNilai2.setError("Harus diisi!")
            }else if(edtNilai3.text.toString().trim()==""){
                edtNilai3.setError("Harus diisi!")
            }else if(edtNilai4.text.toString().trim()==""){
                edtNilai4.setError("Harus diisi!")
            }else {
                txthasil.text = "Hasil Pembagian = " +
                        "${
                            logic.bagi(
                                n1.toString().toDouble(),
                                n2.toString().toDouble(),
                                n3.toString().toDouble(),
                                n4.toString().toDouble()
                            )
                        }"
            }
        }
        btnExit.setOnClickListener {
            finish()
            System.exit(0)
        }
    }
}
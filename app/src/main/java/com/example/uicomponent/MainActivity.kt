package com.example.uicomponent

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ToastSimpan(view: View) {

        // radio
        val radio = findViewById<RadioGroup>(R.id.radioGroup)
        val radiopil = radio.checkedRadioButtonId
        val radiobut = findViewById<RadioButton>(radiopil)
        val radioview = radiobut.text
        // edittext
        val nama = findViewById<EditText>(R.id.editNama)
        val namaview = nama.text
        val muncul = Toast.makeText(applicationContext,"nama :" + namaview + " Gender :" + radioview, Toast.LENGTH_SHORT)
        muncul.show()

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)


    }

    fun actcoding(view: View) {
        val cbcd = cbCoding.isChecked
        val isic = findViewById<CheckBox>(R.id.cbCoding)
        if (cbcd==true)
        {
            printHobi("cek","Hobi " + isic.text)
        }
        if (cbcd==false){
            printHobi("gacek","Hobi " + isic.text)
        }

    }

    fun actreading(view: View) {

        val cbr = cbReading.isChecked
        val isir = findViewById<CheckBox>(R.id.cbReading)
        if (cbr==true)
        {
            printHobi("cek","Hobi " + isir.text)
        }
        if (cbr==false){
            printHobi("gacek","Hobi " + isir.text)
    }
    }

    fun acttrav(view: View) {

        val cbt = cbTraveling.isChecked
        val isit = findViewById<CheckBox>(R.id.cbTraveling)
        if (cbt==true)
        {
            printHobi("cek","Hobi " + isit.text)
        }
        if (cbt==false){
            printHobi("gacek","Hobi " + isit.text)
        }
            }
    fun printHobi(hasil:String,isi:String){
        if (hasil=="cek"){
            Toast.makeText(this@MainActivity,"Anda memilih "+isi,Toast.LENGTH_SHORT).show()
        }
        else if (hasil=="gacek"){
            Toast.makeText(this@MainActivity,"Anda Membatalkan Pilihan "+isi,Toast.LENGTH_SHORT).show()
        }
    }

        fun Cancel(view: View) {

        editNama.text.clear()
        radioGroup.clearCheck()
    }
    }



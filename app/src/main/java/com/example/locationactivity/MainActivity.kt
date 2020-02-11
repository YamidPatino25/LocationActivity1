package com.example.locationactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun onClickMed(v: View?) {
        val i = Intent(this, medellin::class.java)
        startActivity(i)
    }
    fun onClickCar(v: View?) {
        val i = Intent(this, cartagena::class.java)
        startActivity(i)
    }
    fun onClickEsp(v: View?) {
        val i = Intent(this, espana::class.java)
        startActivity(i)
    }



}

package com.example.locationactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class espana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espana)
    }
    fun onClickInteres(v: View?) {
        val i = Intent(this, lug_int_esp::class.java)
        startActivity(i)
    }
    fun onClickBack(v: View?) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}

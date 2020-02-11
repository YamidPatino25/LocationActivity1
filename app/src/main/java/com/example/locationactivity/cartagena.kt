package com.example.locationactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cartagena : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartagena)
    }
    fun onClickBack(v: View?) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    fun onClickInteres(view: View) {
        val i = Intent(this, lug_int_car::class.java)
        startActivity(i)
    }
}

package com.example.locationactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

        var isFragmentCarLoaded = true;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Change = findViewById<Button>(R.id.btnCar)
        Change.setOnClickListener({})
    }
}

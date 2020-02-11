package com.example.locationactivity

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class lug_int_car : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lug_int_car)

        val webview = WebView(this)
        setContentView(webview)
        webview.loadUrl("https://enviajes.cl/colombia/cartagena-de-indias/sitios-turisticos-de-cartagena-de-indias/")
    }
}

package com.example.locationactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class lug_int_esp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lug_int_esp)
        val webview = WebView(this)
        setContentView(webview)
        webview.loadUrl("https://www.hola.com/viajes/2014062772184/top-10-Espana/")
    }
}

package com.example.locationactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class lug_int_med : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lug_int_med)
        val webview = WebView(this)
        setContentView(webview)
        webview.loadUrl("https://www.semana.com/cultura/articulo/que-hacer-en-medellin/521924")
    }
}

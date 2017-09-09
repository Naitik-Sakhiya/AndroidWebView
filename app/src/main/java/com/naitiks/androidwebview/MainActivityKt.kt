package com.naitiks.androidwebview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivityKt : AppCompatActivity() {

    private var webView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.my_webview) as WebView
        webView!!.setWebViewClient(WebViewClient())
        webView!!.loadUrl("https://google.com")

        // To Enable Java Script //
        webView!!.settings.javaScriptEnabled = true

        // Enable zoom Settings
        webView!!.settings.setSupportZoom(true)
        webView!!.settings.builtInZoomControls = true
        webView!!.settings.displayZoomControls = true
    }
}

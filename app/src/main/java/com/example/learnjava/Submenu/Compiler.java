package com.example.learnjava.Submenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.learnjava.R;

public class Compiler extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler);


        setContentView(R.layout.activity_compiler);
        webView = (WebView)findViewById(R.id.help_webview);
        webView.getSettings().getLoadsImagesAutomatically();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());
      // webView.loadUrl("https://www.tutorialspoint.com/compile_java_online.php");
        webView.loadUrl("https://rextester.com/l/java_online_compiler");
    }
}

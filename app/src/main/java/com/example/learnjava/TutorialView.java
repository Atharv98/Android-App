package com.example.learnjava;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class TutorialView extends AppCompatActivity {


    String[] urlString;
    int position;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_view);

        setWebView();
    }


    private void setWebView() {
        urlString = getResources().getStringArray(R.array.tuto_url_list_);

        SharedPreferences sharedPreferences = this.getSharedPreferences("detail", Context.MODE_PRIVATE);
        position = sharedPreferences.getInt("position", 0);
        System.out.println("postion :" + position);
        webView = findViewById(R.id.idweb);
        webView.loadUrl(urlString[position]);

    }

}




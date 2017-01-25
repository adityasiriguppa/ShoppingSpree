package com.shoppingspree.shoppingspree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by root on 21/1/17.
 */

public class FormActivity extends AppCompatActivity{
    private WebView browser;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formactivity);
        browser= (WebView) findViewById(R.id.activity_main_webview);
        browser.setFocusable(true);
        browser.setWebViewClient(new WebViewClient());
        browser.setFocusableInTouchMode(true);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        browser.getSettings().setDomStorageEnabled(true);
        browser.getSettings().setDatabaseEnabled(true);
        browser.getSettings().setAppCacheEnabled(true);
        browser.loadUrl("file:///android_asset/form.html");

    }

}

package com.shoppingspree.shoppingspree;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private String url;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String token = FirebaseInstanceId.getInstance().getToken();

        // Log and toast
        String msg = getString(R.string.msg_token_fmt, token);
        Log.d(TAG, msg);
    }

    public void onClickForm(View v) {
        Intent intent = new Intent(MainActivity.this, FormActivity.class);
        startActivity(intent);
    }

    public void onClickFlipkart(View v) {
        String urlAsString = "http://dl.flipkart.com/dl/?affid=adityasir";
        openWebPage(urlAsString);
    }

    public void onClickSnapdeal(View v) {
        String urlAsString = "http://www.snapdeal.com/?utm_source=aff_prog&utm_campaign=afts&offer_id=17&aff_id=70097";
        openWebPage(urlAsString);
    }

    public void onClickAmazon(View v) {
        String urlAsString = "http://aoebtech.blogspot.in/2016/12/cashback-for-amazon.html";
        openWebPage(urlAsString);
    }

    public void onClickPaytm(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=193&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickMobikwik(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=269&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickFreecharge(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=562&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickLenskart(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=32&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickMcd(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=512&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickKfc(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=466&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickMmthotel(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=677&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickMmtflight(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=906&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickVistaprint(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=124&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickTicketgoose(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=146&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickDominos(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=217&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickOyo(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=546&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickFaasos(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=987&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickJabong(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=62&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickTatacliq(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=1178&aff_id=17186";
        openWebPage(urlAsString);
    }
    private void openWebPage(String url) {

        Uri webpage = Uri.parse(url);

        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

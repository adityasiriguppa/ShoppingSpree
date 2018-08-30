package com.shoppingspree.shoppingspree;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Build;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.firebase.FirebaseApp;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

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
        FirebaseApp.initializeApp(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Create channel to show notifications.
            String channelId  = getString(R.string.default_notification_channel_id);
            String channelName = getString(R.string.default_notification_channel_name);
            NotificationManager notificationManager =
                    getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(new NotificationChannel(channelId,
                    channelName, NotificationManager.IMPORTANCE_LOW));
        }


        FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                    @Override
                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "getInstanceId failed", task.getException());
                            return;
                        }

                        // Get new Instance ID token
                        String token = task.getResult().getToken();

                        // Log and toast
                        String msg = getString(R.string.msg_token_fmt, token);
                        Log.d(TAG, msg);
//                        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });
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
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fwww.amazon.in%2F";
        openWebPage(urlAsString);
    }

    public void onClickPaytm(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fpaytm.com";
        openWebPage(urlAsString);
    }

    public void onClickMobikwik(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fwww.mobikwik.com%2F";
        openWebPage(urlAsString);
    }

    public void onClickPaytmMall(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fpaytmmall.com";
        openWebPage(urlAsString);
    }

    public void onClickLenskart(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fwww.lenskart.com%2Ftry-at-home%2F";
        openWebPage(urlAsString);
    }

    public void onClickMcd(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fwww.mcdelivery.co.in%2F";
        openWebPage(urlAsString);
    }

    public void onClickKfc(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fonline.kfc.co.in%2Foffer%2Flisting";
        openWebPage(urlAsString);
    }

    public void onClickMmtflight(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fwww.makemytrip.com%2Fflights";
        openWebPage(urlAsString);
    }

    public void onClickDominos(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fpizzaonline.dominos.co.in%2F";
        openWebPage(urlAsString);
    }

    public void onClickOyo(View v) {
        String urlAsString = "http://tracking.payoom.com/aff_c?offer_id=546&aff_id=17186";
        openWebPage(urlAsString);
    }

    public void onClickFaasos(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Forder.faasos.io%2F";
        openWebPage(urlAsString);
    }

    public void onClickJabong(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fwww.jabong.com%2F";
        openWebPage(urlAsString);
    }

    public void onClickTatacliq(View v) {
        String urlAsString = "https://linksredirect.com/?pub_id=38266CL34536&source=linkkit&url=https%3A%2F%2Fwww.tatacliq.com";
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

package com.example.android.alcphase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    private ImageView imageView;
    private  View horizantal_line;
    private TextView tv_2;
    private TextView tv_3;
    private TextView tv_4;
    private TextView tv_5;
    private TextView tv_6;
    private TextView tv_7;
    private TextView tv_8;
    private TextView tv_9;
    private TextView tv_10;
    private TextView tv_11;
    private TextView tv_12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        imageView = findViewById(R.id.imageView);
        tv_2 = findViewById(R.id.textView_2);
        tv_3 = findViewById(R.id.textView_3);
        horizantal_line = findViewById(R.id.horizantal_line);
        tv_4 = findViewById(R.id.textView_4);
       // tv_5 = findViewById(R.id.track_tv);
        tv_6 = findViewById(R.id.textView_5);
        //tv_7 = findViewById(R.id.country_tv);
        tv_8 = findViewById(R.id.textView_6);
        //tv_9 = findViewById(R.id.email_tv);
        //tv_10 = findViewById(R.id.phone_tv);
        tv_11 = findViewById(R.id.textView_7);
       // tv_12 = findViewById(R.id.slack_tv);


    }
}

package com.example.android.alcphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button aboutButton = (Button) findViewById(R.id.button_1);
        Button profileButton = (Button) findViewById(R.id.button_2);

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_a = new Intent(MainActivity.this, AboutALC.class);
                startActivity(intent_a);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_b = new Intent(MainActivity.this, MyProfile.class);
                startActivity(intent_b);
            }
        });

    }
}

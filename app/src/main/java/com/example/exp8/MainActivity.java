package com.example.exp8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onYT(View view){
       Intent i = new Intent(getApplicationContext(), YTActivity.class);
       startActivity(i);
    }

    public void onAmazon(View view){
        Intent i = new Intent(getApplicationContext(), AmazonActivity.class);
        startActivity(i);
    }

    public void onSnap (View view){
        Intent i = new Intent(getApplicationContext(), SnapActivity.class);
        startActivity(i);
    }

    public void onTwitter (View view){
        Intent i = new Intent(getApplicationContext(), TwitterActivity.class);
        startActivity(i);
    }
}
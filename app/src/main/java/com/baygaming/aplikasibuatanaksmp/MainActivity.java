package com.baygaming.aplikasibuatanaksmp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void facebook(View view){
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.facebook.com")));
    }
    public void line(View view){
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://line.me/en/")));
    }
    public void rabbaanii(View view){
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://rbs.sch.id/")));
    }
    public void instagram(View view){
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.instagram.com")));
    }
}

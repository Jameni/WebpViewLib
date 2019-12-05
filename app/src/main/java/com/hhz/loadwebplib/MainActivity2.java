package com.hhz.loadwebplib;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hhz.mywbplib.util.Putil;
import com.hhz.mywbplib.view.WebpView;

public class MainActivity2 extends AppCompatActivity {

    WebpView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        view = findViewById(R.id.webp);


    }

    @Override
    protected void onResume() {
        super.onResume();
        view.startPlay();
//
//        view.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//
//                view.destory();
//            }
//        }, 1500);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        view.destory();
        view = null;
    }
}

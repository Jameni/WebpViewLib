package com.hhz.loadwebplib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hhz.mywbplib.util.LoadUtil;
import com.hhz.mywbplib.util.Putil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Putil.print("dddddddddddd");
    }
}

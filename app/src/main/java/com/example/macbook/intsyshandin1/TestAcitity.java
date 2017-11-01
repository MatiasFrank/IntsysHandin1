package com.example.macbook.intsyshandin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TestAcitity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("onCreate", "TEST");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_acitity);
    }

    @Override
    protected void onStart() {
        Log.i("onStart", "TEST");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("onResume", "TEST");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("onPause", "TEST");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("onStop", "TEST");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("onDestroy", "TEST");
        super.onDestroy();
    }
}

package com.example.macbook.intsyshandin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "STARTED");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "RESUMED");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "PAUSED");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "STOPPED");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "DESTROYED");
    }
}

package com.example.macbook.intsyshandin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("onCreate", "MAIN");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.i("onStart", "MAIN");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("onResume", "MAIN");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("onPause", "MAIN");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("onStop", "MAIN");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("onDestroy", "MAIN");
        super.onDestroy();
    }

    public void changeActivity(View view) {
        Intent intent = new Intent(this, TestAcitity.class);
        startActivity(intent);
    }
}

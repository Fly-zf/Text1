package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String Ta="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Ta,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Ta,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Ta,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Ta,"onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Ta,"onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Ta,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Ta,"onDestroy");
    }
}

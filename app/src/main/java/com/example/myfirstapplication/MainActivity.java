package com.example.myfirstapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate function was called");
    }
    @Override
    protected void  onStart(){
        super.onStart();
        Log.d("MainActivity", "onStart function was called.");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity", "onPause function was called.");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MainActivity", "onStop function was called.");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity", "onDestroy function was called.");
    }

}
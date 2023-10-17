package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("MainActivity2","onCreate function was called");
    }
    @Override
    protected void  onStart(){
        super.onStart();
        Log.d("MainActivity2", "onStart function was called.");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity2", "onPause function was called.");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MainActivity2", "onStop function was called.");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity2", "onDestroy function was called.");
    }

}
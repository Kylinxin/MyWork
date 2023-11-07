package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fb","1:onPause...");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fb","1:onRestart...");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("fb","1:onPostResume...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("fb","1:onStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fb","1:onResume...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("fb","1:onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("fb","1:onDestroy...");
    }
}
package com.example.mywork;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fb","onCreate...");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Log.d("fb","onCreate...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fb","onRestart...");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("fb","onPostResume...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("fb","onStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fb","onResume...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("fb","onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("fb","onDestroy...");
    }
}
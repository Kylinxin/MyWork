package com.example.mywork;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fb","onCreate...");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView textView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = findViewById(R.id.textView_2);

        Log.d("fb","2:onCreate...");

        Intent intent = getIntent();
        String str = intent.getStringExtra("name") + "-"
                +intent.getIntExtra("age",1);

        textView.setText(str);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fb","2:onRestart...");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("fb","2:onPostResume...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("fb","2:onStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fb","2:onResume...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("fb","2:onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("fb","2:onDestroy...");
    }
}
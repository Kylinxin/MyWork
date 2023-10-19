package com.example.mywork;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView textView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = findViewById(R.id.textView_2);

        Log.d("fb","2:onCreate...");

        Intent intent = getIntent();
        String str1 = intent.getStringExtra("name") + "-"
                +intent.getIntExtra("age",1);

        String str2 = intent.getExtras().getString("name")
                + ":" + intent.getExtras().getInt("age");

        textView.setText(str2);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fb","2:onPause...");
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
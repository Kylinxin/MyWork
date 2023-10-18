package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    Button button1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                intent.putExtra("name","fb");
                intent.putExtra("age",20);
                startActivity(intent);
            }
        });
        Log.d("fb","1:onCreate...");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fb","1:onCreate...");
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
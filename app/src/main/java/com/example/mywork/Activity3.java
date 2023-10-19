package com.example.mywork;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    Button button3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("result","888");
                setResult(666,intent);
                finish();
            }
        });


        Log.d("fb","3:onCreate...");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fb","3:onPause...");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fb","3:onRestart...");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("fb","3:onPostResume...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("fb","3:onStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fb","3:onResume...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("fb","3:onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("fb","3:onDestroy...");
    }
}
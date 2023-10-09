package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Fragment fragment1,fragment2,fragment3,fragment4;
    FragmentManager fm;
    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fragment1 = new ltFragment();
        fragment2 = new txlFragment();
        fragment3 = new findFragment();
        fragment4 = new wdFragment();
        fm = getSupportFragmentManager();

        linearLayout1 = findViewById(R.id.id_tab_wx);
        linearLayout2 = findViewById(R.id.id_tab_friend);
        linearLayout3 = findViewById(R.id.id_tab_address);
        linearLayout4 = findViewById(R.id.id_tab_setting);

        inital();
        fragmenthide();
        fragmentshow(fragment1);
        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);
    }

    private void fragmenthide() {
        FragmentTransaction ft = fm.beginTransaction()
                .hide(fragment1)
                .hide(fragment2)
                .hide(fragment3)
                .hide(fragment4);
        ft.commit();
    }

    public void inital() {

        FragmentTransaction ft = fm.beginTransaction()
                .add(R.id.content,fragment1)
                .add(R.id.content,fragment2)
                .add(R.id.content,fragment3)
                .add(R.id.content,fragment4);
        ft.commit();

    }

    @Override
    public void onClick(View view) {
        fragmenthide();
        if (view.getId()==R.id.id_tab_wx){
            fragmentshow(fragment1);
        }else if (view.getId()==R.id.id_tab_friend){
            fragmentshow(fragment2);
        }else if (view.getId()==R.id.id_tab_address){
            fragmentshow(fragment3);
        }else if(view.getId()==R.id.id_tab_setting){
            fragmentshow(fragment4);
        }
    }

    private void fragmentshow(Fragment fragment) {
        FragmentTransaction transaction = fm.beginTransaction()
                .show(fragment);
        transaction.commit();
    }
}
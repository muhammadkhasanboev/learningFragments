package com.bignerdranch.android.test;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This layout must have two containers

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.left, new LeftFragment())
                    .replace(R.id.right, new RightFragment())
                    .commit();

        }
    }
}

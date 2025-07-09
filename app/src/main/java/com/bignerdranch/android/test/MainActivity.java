package com.bignerdranch.android.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity{
    private Button mChangeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This layout must have two containers

        mChangeButton = (Button) findViewById(R.id.start_button);
        mChangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(savedInstanceState==null){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.left, new LeftFragment())
                            .replace(R.id.right, new RightFragment())
                            .addToBackStack(null)
                            .commit();
                }
            }
        });
    }
}

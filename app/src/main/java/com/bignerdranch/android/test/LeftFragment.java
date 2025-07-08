package com.bignerdranch.android.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LeftFragment extends Fragment {
    private Button mLeftButton;
    public LeftFragment(){
        super(R.layout.fragment_left);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mLeftButton = (Button) view.findViewById(R.id.left_button);
        mLeftButton.setOnClickListener(v -> {
            Toast.makeText(getActivity(),"Left button", Toast.LENGTH_SHORT).show();
            new RightFragment();
        });

    }
}

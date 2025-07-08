package com.bignerdranch.android.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RightFragment extends Fragment {
    public RightFragment(){
        super(R.layout.fragment__right);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button mRightButton = (Button) view.findViewById(R.id.right_button);
        mRightButton.setOnClickListener(v->{
            Toast.makeText(getActivity(), "right button",Toast.LENGTH_SHORT).show();
        });
    }
}

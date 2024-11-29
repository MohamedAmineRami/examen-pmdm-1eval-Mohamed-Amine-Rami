package com.exam.MohamedAmineRami;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        TextView textView = view.findViewById(R.id.usernameText);
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("ExamPrefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        textView.setText("Welcome, " + username + "!");

        return view;
    }
}

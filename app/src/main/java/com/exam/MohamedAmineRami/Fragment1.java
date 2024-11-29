package com.exam.MohamedAmineRami;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Fragment1 extends Fragment {

    TextView textView;
    Button button;
    private int clickCount = 0;
    private List<String> names = Arrays.asList("Hania", "Sinwar", "Abu Oubaida", "Yassin", "Rami");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        textView = textView.findViewById(R.id.randomNameText);
        button = button.findViewById(R.id.generateButton);

        button.setOnClickListener(v -> {
            clickCount++;
            String randomName = names.get(new Random().nextInt(names.size()));
            textView.setText("Nombre: " + randomName + "\nClicks: " + clickCount);
        });

        return view;
    }
}

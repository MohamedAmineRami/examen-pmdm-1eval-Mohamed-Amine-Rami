package com.exam.MohamedAmineRami;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        container.findViewById(R.id.showDialogButton).setOnClickListener(v -> new AlertDialog.Builder(requireContext())
                .setTitle("Mohamed Amine Rami")
                .setMessage("¡Hola profesor! #Free Palestine")
                .setPositiveButton("Aprobar", (dialog, which) -> dialog.dismiss())
                .setNegativeButton("Suspender", (dialog, which) -> dialog.dismiss())
                .show());

        return view;
    }
}

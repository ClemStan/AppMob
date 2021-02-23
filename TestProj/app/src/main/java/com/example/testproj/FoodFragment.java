package com.example.testproj;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FoodFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        //return inflater.inflate(R.layout.fragment_food, container, false);






        Button btnAides = (Button)view.findViewById(R.id.aide_ali);
        btnAides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new AideAli());
                fr.commit();
            }
        });

        Button btnBonplans = (Button)view.findViewById(R.id.bon_plans);
        btnBonplans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new BonPlans());
                fr.commit();
            }
        });

        Button btnRecettes = (Button)view.findViewById(R.id.recettes);
        btnRecettes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new Recettes());
                fr.commit();
            }
        });

        Button btnTips = (Button)view.findViewById(R.id.tips);
        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new Tips());
                fr.commit();
            }
        });


        return view;
    }
}

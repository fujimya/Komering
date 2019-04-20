package com.example.fujimiya.komering.Fragmen;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fujimiya.komering.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KulintangFragment extends Fragment {

    View view;
    MediaPlayer play1,play2,play3,play4,play5,play6;
    public KulintangFragment() {
        // Required empty public constructor
    }

    CardView ksatu,kdua,ktiga,kempat,klima,kenam;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_kulintang, container, false);
        play1 = MediaPlayer.create(view.getContext(), R.raw.ksatu);
        ksatu = view.findViewById(R.id.ksatu);
        kdua = view.findViewById(R.id.kdua);
        ktiga = view.findViewById(R.id.ktiga);
        kempat = view.findViewById(R.id.kempat);
        klima = view.findViewById(R.id.klima);
        kenam = view.findViewById(R.id.kenam);

        play1 = MediaPlayer.create(view.getContext(), R.raw.ksatu);
        play2 = MediaPlayer.create(view.getContext(), R.raw.kdua);
        play3 = MediaPlayer.create(view.getContext(), R.raw.ktiga);
        play4 = MediaPlayer.create(view.getContext(), R.raw.kempat);
        play5 = MediaPlayer.create(view.getContext(), R.raw.klima);
        play6 = MediaPlayer.create(view.getContext(), R.raw.kenam);


        ksatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play1.start();
            }
        });
        kdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play2.start();
            }
        });

        ktiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play3.start();
            }
        });

        kempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play4.start();
            }
        });

        klima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play5.start();
            }
        });

        kenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play6.start();
            }
        });
        return view;
    }

}

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
public class BurdaFragment extends Fragment {

    View view;
    CardView burda;
    MediaPlayer playBurda;

    public BurdaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_burda, container, false);
        burda = view.findViewById(R.id.burda);
        playBurda = MediaPlayer.create(view.getContext(), R.raw.burda);
        burda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBurda.start();
            }
        });

        return view;
    }

}

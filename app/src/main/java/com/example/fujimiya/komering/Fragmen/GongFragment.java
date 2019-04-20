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
public class GongFragment extends Fragment {
    View view;
    CardView gong;
    MediaPlayer playg;

    public GongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view = inflater.inflate(R.layout.fragment_gong, container, false);
        playg = MediaPlayer.create(view.getContext(), R.raw.gong);
        gong = view.findViewById(R.id.gong);
        gong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playg.start();
            }
        });
       return view;
    }

}

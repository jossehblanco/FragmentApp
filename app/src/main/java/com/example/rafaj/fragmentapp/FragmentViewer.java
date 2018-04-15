package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text,text2;
    ImageView img;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        text = view.findViewById(R.id.textId);
        text2 = view.findViewById(R.id.textId2);
        img = view.findViewById(R.id.planetIMG);
        Bundle bundle = this.getArguments();


        if(bundle != null){

            text.setText(bundle.getString("KEY"));
            text2.setText(bundle.getInt("info"));
            img.setImageResource(bundle.getInt("imgRes"));

        }

        return view;
    }
}
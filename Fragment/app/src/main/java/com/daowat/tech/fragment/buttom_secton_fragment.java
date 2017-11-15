package com.daowat.tech.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class buttom_secton_fragment extends Fragment {

    private static TextView topText;
    private static TextView bottomText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buttom_section_fragment, container, false);
        topText = (TextView) view.findViewById(R.id.topText);
        bottomText = (TextView) view.findViewById(R.id.bottomText);
        return view;
    }

    public void setTopText(String top, String bottom) {
        topText.setText(top);
        bottomText.setText(bottom);
    }


}
